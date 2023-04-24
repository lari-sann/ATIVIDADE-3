<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <style>

        form {
            width: 300px;
            display: flex;
            flex-direction: column;
            gap: 25px;
        }

    </style>
</head>
<body>

<form action="processa_vaga" method="post">

    <label>
        nome:
        <input type="text" name="field_nome" value="???">
    </label>

    <label>
        data de nascimento:
        <input type="text" name="field_data_nascimento">
    </label>

    <div>
        <div>idioma nativo:</div>
        <input type="radio" name="field_idioma" value="PORTUGUES" checked> Português
        <input type="radio" name="field_idioma" value="INGLES"> Inglês
        <input type="radio" name="field_idioma" value="ESPANHOL"> Espanhol
    </div>

    <div>
        <div>habilidade:</div>
        <input type="checkbox" name="field_habilidades" value="JAVA" checked> Java
        <input type="checkbox" name="field_habilidades" value="JAVASCRIPT"> JavaScript
        <input type="checkbox" name="field_habilidades" value="HTML"> HTML
        <input type="checkbox" name="field_habilidades" value="CSS"> CSS
    </div>

    <input type="submit" value="aplicar">
    <input type="reset">

</form>

</body>
</html>