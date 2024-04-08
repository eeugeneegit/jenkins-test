<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <div>
        <h1>Laboratory work #1</h1>
    </div>
    <div style="align-content: center">
        <form name="form1" method="post" action="task1" target="_blank">
            <p style="font-weight: bolder">Task 1</p>
            <label>
                Enter the word:
                <input type="text" name="find-word" size="20" maxlength="20">
            </label>
            <input type="submit" name="button" value="Find">
        </form>
        <form name="form2" method="post" action="task2" target="_blank">
            <p style="font-weight: bolder">Task 2</p>
            <label>
                Enter the key:
                <input type="text" name="key" size="20" maxlength="20">
            </label>
            <input type="submit" name="button" value="Find">
        </form>
        <form name="form3" method="post" action="task3" target="_blank">
            <p style="font-weight: bolder">Task 3</p>
            <label>
                Enter the number of lines:
                <input type="text" name="lines-number" size="20" maxlength="20">
            </label>
            <label>
                Enter the font size:
                <input type="text" name="font-size" size="20" maxlength="20">
            </label>
            <input type="submit" name="button" value="Perform">
        </form>
    </div>
</body>
</html>
