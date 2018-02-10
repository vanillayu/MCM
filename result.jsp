<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "model.MorseLetters" %>
<%@ page import = "model.MorseAudios" %>
<%@ page import = "model.MorsePics" %>

<%
//get the requested object from the Servlet
MorsePics mP = (MorsePics) session.getAttribute("mP");
MorseAudios mA= (MorseAudios) session.getAttribute("mA");
int counter = (Integer) session.getAttribute("counter");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Your Morse Code Visualization</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
</head>
<body>
    <h1> Check your Morse Code Visualization here! </h1>
    <p> Click "previous" or "next" to look at the visualization for each letter of your word! </p>
    <p> Click "Try again" to start a new visualization! </p>
    
    <!-- Get the picture for the morse code -->
    <img src='MorseCode/pics/"+mP+".png'>
    
    <!-- Get the audio for the morse code -->
    

</body>
</html>
