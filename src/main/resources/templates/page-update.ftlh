<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>Автоматизация документооборота</h1><hr>
<h4>Создание документа</h4>
<h3>В случае если введенный номер будет соответствовать номеру уже созданного документа, создание будет остановлено.<br>Введите уникальный номер.</h3>
<form action="/document/update/${updateDoc.id}" method="post">
    Номер документа <input size="100" type="text" name="number" value="${updateDoc.number}"/><br><br>
    Название документа <input size="100" type="text" name="name" value="${updateDoc.name}"/><br><br>
    <input type="submit" value="Обновить документ"/>
</form>
<hr>
</body>
</html>