const fs = require('fs');
const path = require('path');

const chapters = [
    'chapter1', 'chapter2', 'chapter3', 'Chapter4', 
    'chapter6', 'chapter7', 'chapter8'
];

let finalHtml = `<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Assignments</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/themes/prism.min.css" rel="stylesheet" />
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            padding: 20px;
            max-width: 1000px;
            margin: 0 auto;
        }
        .program-container {
            background: #fff;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        .question-highlight, .program-container > div:nth-child(2) {
            color: rgb(7, 7, 7);
            background-color: rgb(227, 207, 27);
            border-radius: 2px;
            padding: 8px;
            margin-bottom: 15px;
        }
        pre[class*="language-"], code[class*="language-"], pre code {
            background: transparent !important;
            padding: 10px;
            border-radius: 4px;
            display: block;
            overflow-x: auto;
        }
        /* Override Prism.js grey background */
        pre[class*="language-"],
        code[class*="language-"] {
            background: #f5f2f0 !important;
        }
    
        /* Make code comments italic and distinct */
        .token.comment,
        .token.block-comment,
        .token.prolog,
        .token.doctype,
        .token.cdata {
            font-style: italic !important;
            color: #7a7a7a !important;
        }
    </style>
</head>
<body>
    <h1 style="text-align:center; font-size: 3em; color: #d84315;">All Assignments Master File</h1>
`;

let questionCounter = 1;

for (const chapter of chapters) {
    const filePath = path.join(__dirname, chapter, 'index.html');
    if (fs.existsSync(filePath)) {
        const content = fs.readFileSync(filePath, 'utf-8');
        // Extract content inside body
        const bodyMatch = content.match(/<body[^>]*>([\s\S]*?)<\/body>/i);
        if (bodyMatch) {
            let bodyContent = bodyMatch[1];
            
            // Fix image src to include the chapter folder
            bodyContent = bodyContent.replace(/src="([^"]+)"/g, (match, p1) => {
                if (!p1.startsWith('http') && !p1.startsWith('data:')) {
                    return `src="${chapter}/${p1}"`;
                }
                return match;
            });

            // Remove any <h1> tags from the individual chapter files (so there's no chapter separation)
            bodyContent = bodyContent.replace(/<h1[^>]*>[\s\S]*?<\/h1>/gi, '');
            
            // Remove Note <p> tags 
            bodyContent = bodyContent.replace(/<p[^>]*>[\s\S]*?<\/p>/gi, '');

            // Replace "Question X:" with continuous "Question N:" across all chapters
            bodyContent = bodyContent.replace(/<strong>Question\s+\d+:<\/strong>/gi, () => {
                return `<strong>Question ${questionCounter++}:</strong>`;
            });
            
            finalHtml += bodyContent;
        }
    }
}

finalHtml += `
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/prism.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-java.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-javascript.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-markup.min.js"></script>
</body>
</html>`;

fs.writeFileSync(path.join(__dirname, 'index.html'), finalHtml);
console.log('Successfully combined all files into index.html');
