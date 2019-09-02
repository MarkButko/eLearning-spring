<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}!</title>
</head>
<body>
   <h2>${title}!</h2>
   <br>
   <#list users as user>
       <li>${user.id}</li>
       <li>${user.name}</li>
   </#list>
</body>
</html>