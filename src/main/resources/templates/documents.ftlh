<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>Автоматизация документооборота</h1><hr>
<h4>Документы компании</h4>
<#list documents as document>
    <div>
        <p><b>${document.number}</b> ${document.name} ${document.dateOfCreation} | <a href="/document/">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать документ</h3>
<form action="/document/create" method="post">
    Номер документа <input size="100" type="text" name="number"/><br><br>
    Название документа <input size="100" type="text" name="name"/><br><br>
    <input type="submit" value="Добавить документ"/>
</form>
</body>
</html>