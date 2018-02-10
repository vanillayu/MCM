<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "model.MorseLetters" %>
<%@ page import = "model.MorseAudios" %>
<%@ page import = "model.MorsePics" %>

<%
//get the requested object from the Servlet
String mP = (String) session.getAttribute("mP");
String mA= (String) session.getAttribute("mA");
int counter = (Integer) session.getAttribute("counter");
int total = (Integer) session.getAttribute("total");
String word = (String) session.getAttribute("word");
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
    
    <h2> Test Section </h2>
    <p> <%=mP %>  </p>
    <p> <%=mA %> </p>
    <p> <%=counter %> </p>
    <p> <%=total %> </p>
    <p> <%=word %> </p>
    
    <!-- Get the picture for the morse code -->
    <img src='MorsePics/<%=mP %>' />
    
    
    <!-- previous button -->
    <form name=changePic action=verify method=post>
        <% if(counter==0) { %>
        	<input type="submit" name="previous" value="previous" disabled/>
        <% }
        else { %>
        <input type="submit" name="previous" value="previous"/>
        <input type="hidden" name="counter" value="<%=counter-1 %>" />
        <input type="hidden" name="word" value="<%=word %>" />
        <% } %>
    </form>   
    
    <!-- next button -->
    <form name=changePic action=verify method=post>
        <% if(counter==total) { %>
        	<input type="submit" name="next" value="next" disabled/>
        <% }
        else { %>
        <input type="submit" name="next" value="next"/>
        <input type="hidden" name="counter" value="<%=counter+1 %>" />
        <input type="hidden" name="word" value="<%=word %>" />
        <% } %>
    </form>
    
    
    </br>
    <!-- Get the audio for the morse code -->
    <button> Play the audio </button>
    
    </br>
    <a href="index.jsp"> Play again </a>
    
</body>
</html>
