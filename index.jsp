<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Morse Code Mechanism - MCM</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
</head>
<body>
    <h1> Welcome to Morse Code Mechanism! </h1>
    <p> Please type a word or phrase less than 15 characters here! </p>
    <p> Click "submit" to get your word in a beautiful visualized Morse Code format. Turn on your sound! </p>
    
    <form name="MCM" action="" method="post">
        <input type="text" name="word" value="put your word or phrase here" />
        </br>
        </br>
        <input type="submit" name="submit" value="Get your visualized morse code!" />
    </form>
</body>
</html>
