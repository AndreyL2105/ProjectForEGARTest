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
        <p><b>${document.number}</b> ${document.name} ${document.dateOfCreation}</p>
    </div>
</#list>
<hr>
<form>
    <button formaction="/document/">Создать новый документ</button>
</form>
</body>
</html>