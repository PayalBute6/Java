import re

with open(r"F:\1.Java Practice\Java\selected_slips.html", "r", encoding="utf-8") as f:
    content = f.read()

# First, process Java programs
# We look for <h4>Output:</h4>\s*<pre>&gt; javac (.*?)\.java\n&gt; java (.*?)\n
def java_replacer(match):
    filename = match.group(1)
    class_name = match.group(2)
    output_text = match.group(3)
    
    return f"""<h4>Steps and Output:</h4>
        <pre>Save &gt; {filename}.java
Compile &gt; javac {filename}.java
Run &gt; java {class_name}

Output:
{output_text}"""

# Some Java programs might not have this exact format. Let's see what they have.
content = re.sub(r'<h4>Output:</h4>\s*<pre>&gt; javac (.*?)\.java\n&gt; java (.*?)\n(.*?)(?=</pre>)', java_replacer, content, flags=re.DOTALL)

# Let's process Node programs
# <h4>Output:</h4>\s*<pre>&gt; node (.*?\.js)\n
def node_replacer(match):
    filename = match.group(1)
    output_text = match.group(2)
    
    return f"""<h4>Steps and Output:</h4>
        <pre>Save &gt; {filename}
Run &gt; node {filename}

Output:
{output_text}"""

content = re.sub(r'<h4>Output:</h4>\s*<pre>&gt; node (.*?\.js)\n(.*?)(?=</pre>)', node_replacer, content, flags=re.DOTALL)

# For Question 3 Java (StringOperation), there is no <h4>Output:</h4>
# Let's add it manually since I replaced it entirely recently.
q3_java_target = r'(sc\.close\(\);\n    }\n}</code></pre>)'
q3_java_replacement = r"""\1
<h4>Steps and Output:</h4>
        <pre>1. Create a folder named "string_operation".
2. Save > string_operation/Con.java and string_operation/Comp.java
3. Save > StringOperationDemo.java (outside the folder)
4. Compile > javac string_operation/Con.java string_operation/Comp.java StringOperationDemo.java
5. Run > java StringOperationDemo

Output:
Enter the first string: Java
Enter the second string: Programming

--- String Operations ---
Concatenated String: JavaProgramming
Comparison Result: The strings are not equal.</pre>"""
content = re.sub(q3_java_target, q3_java_replacement, content)

# For HTML programs, there are no outputs. 
# They are under <h1>HTML Programs</h1> until <h1>Node JS Programs</h1>
# We can find all <div class="question-card"> inside this section and append the HTML steps.
html_section_match = re.search(r'<h1>HTML Programs</h1>(.*?)<h1>Node JS Programs</h1>', content, re.DOTALL)
if html_section_match:
    html_section = html_section_match.group(1)
    # find all </code></pre>\n    </div>
    # and replace with </code></pre>\n<h4>Steps and Output:</h4>\n        <pre>Save &gt; index.html\nRun &gt; Double-click index.html to open it in any Web Browser.</pre>\n    </div>
    new_html_section = re.sub(r'</code></pre>\s*</div>', r'</code></pre>\n<h4>Steps and Output:</h4>\n        <pre>Save &gt; index.html\nRun &gt; Double-click index.html to open it in any Web Browser.</pre>\n    </div>', html_section)
    content = content.replace(html_section, new_html_section)

# Finally, write it back
with open(r"F:\1.Java Practice\Java\selected_slips.html", "w", encoding="utf-8") as f:
    f.write(content)

print("Applied steps formatting!")
