import re
import os

chapter_files = [
    r"F:\1.Java Practice\Java\slips\chapter1\index.html",
    r"F:\1.Java Practice\Java\slips\chapter2\index.html",
    r"F:\1.Java Practice\Java\slips\chapter3\index.html",
    r"F:\1.Java Practice\Java\slips\chapter6\index.html",
    r"F:\1.Java Practice\Java\slips\chapter7\index.html",
    r"F:\1.Java Practice\Java\slips\chapter8\index.html"
]

all_programs = []

for file in chapter_files:
    if os.path.exists(file):
        with open(file, 'r', encoding='utf-8') as f:
            content = f.read()
            # Extract program containers
            # A program container has <div class="program-container"> ... </div>
            # We'll split by <div class="program-container">
            parts = content.split('<div class="program-container">')
            for part in parts[1:]:
                # find the end of the div
                # A naive approach is just to take everything until the next </div> that closes it,
                # but since there are nested divs, we can extract pieces using regex.
                
                # Question text
                q_match = re.search(r'class="question-highlight">.*?</strong>(.*?)</div>', part, re.DOTALL | re.IGNORECASE)
                if not q_match:
                    continue
                q_text = q_match.group(1).strip()
                
                # Code blocks (there might be multiple, e.g. java and html)
                code_blocks = re.findall(r'(<pre><code.*?>.*?</code></pre>)', part, re.DOTALL | re.IGNORECASE)
                code_str = "\n".join(code_blocks)
                
                # Output block
                output_match = re.search(r'(<h4>Output:</h4>\s*<pre>.*?</pre>)', part, re.DOTALL | re.IGNORECASE)
                out_str = output_match.group(1) if output_match else ""
                
                all_programs.append({
                    "q_text": q_text.replace('&nbsp;', ' ').replace('&ldquo;', '"').replace('&rdquo;', '"'),
                    "code": code_str,
                    "output": out_str
                })

def normalize(text):
    text = re.sub(r'<[^>]+>', '', text) # remove html tags
    return re.sub(r'\W+', '', text).lower()

def find_code(question_text):
    norm_q = normalize(question_text)
    for p in all_programs:
        if normalize(p['q_text']) in norm_q or norm_q in normalize(p['q_text']):
            return p['code'] + "\n" + p['output']
    return None

# Now we read the original selected_slips.html structure
with open("generate_answers.py", "r", encoding="utf-8") as f:
    gen_script = f.read()

# Extract the hardcoded HTML from generate_answers.py
html_content = re.search(r'html_content = """(.*?)"""', gen_script, re.DOTALL).group(1)

# Now we parse the html_content, find each question card, and replace its <pre><code> block if we find a match
# Split by <div class="question-card">
new_html = []
parts = html_content.split('<div class="question-card">')
new_html.append(parts[0])

for part in parts[1:]:
    # extract question text inside <p>
    p_match = re.search(r'<p>(.*?)</p>', part, re.DOTALL)
    if p_match:
        q_text = p_match.group(1).strip()
        local_code = find_code(q_text)
        if local_code:
            # Replace everything after </p> and before </div> with local_code
            # Wait, there might be nested lists <ol> in the question
            # So let's split by <pre><code> and replace it
            part = re.sub(r'<pre><code>.*?</code></pre>', lambda m: local_code, part, flags=re.DOTALL)
    new_html.append('<div class="question-card">' + part)

final_html = "".join(new_html)

# Also remove the <style> block as requested earlier
final_html = re.sub(r'<style>.*?</style>', '', final_html, flags=re.DOTALL)

with open(r"F:\1.Java Practice\Java\selected_slips.html", "w", encoding="utf-8") as f:
    f.write(final_html)

print("Updated selected_slips.html with local code!")
