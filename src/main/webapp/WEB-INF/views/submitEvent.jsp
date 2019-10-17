<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submitted event</title>
</head>
<body>
    <h3>Submitted!</h3>
    <c:forEach var = "item" items = "${events}">
        Event Name: ${item.eventTitle}
        <br>
        City: ${item.city}
        <br>
        Ticket Price: ${item.ticketPrice}
        <br>
        Event Type: <c:forEach var="event" items="${item.eventList1}">
                    <li>${event}</li>
                    </c:forEach>
        <br>
                 _________________________________________________________________
        <br>
        </c:forEach>

      <button onclick="window.location.href='http://localhost:9090/springMvcEvent/addEvent'">Click here to book more!</button>
</body>