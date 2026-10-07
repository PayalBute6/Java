import re

with open(r"F:\1.Java Practice\Java\selected_slips.html", "r", encoding="utf-8") as f:
    content = f.read()

# Replace <div class="slip-title">...</div>\n<p>...</p> 
# with <p><strong class="slip-title">...:</strong> ...</p>
content = re.sub(
    r'<div class="slip-title">\s*(.*?)\s*</div>\s*<p>\s*(.*?)\s*</p>',
    r'<p><strong class="slip-title">\1:</strong> \2</p>',
    content
)

# And for Question 4 where the <p> is followed by an <ol>
# If it has other things, the regex above will just match the <p> part, which is fine!
# e.g. <div class="slip-title">Question 4</div>\n<p>Write a menu...</p>
# It will become <p><strong class="slip-title">Question 4:</strong> Write a menu...</p>

with open(r"F:\1.Java Practice\Java\selected_slips.html", "w", encoding="utf-8") as f:
    f.write(content)

print("Applied title formatting!")
