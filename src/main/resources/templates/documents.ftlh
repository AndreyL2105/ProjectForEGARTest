<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>Автоматизация документооборота</h1><hr>
<h4>Документы компании</h4>
<table>
    <thead>
    <tr>
        <th>Номер документа</th>
        <th>Название документа</th>
        <th>Дата создания</th>

    </tr>
    </thead>
</table>
<#list documents as document>
    <div>
        <p><b>${document.number}</b> ${document.name} ${document.dateOfCreation} <a href="/page-update/${document.id}">Обновить</a></p>
    </div>
</#list>
<hr>
<form>
    <button formaction="/page-create">Создать новый документ</button>
</form>
</body>
</html>