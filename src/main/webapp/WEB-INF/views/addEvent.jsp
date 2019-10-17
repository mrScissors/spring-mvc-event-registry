<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
   <head>
   </head>
   <body>
       <h3>Welcome, Enter event details to register:</h3>
       <form:form method="POST"
         action="/springMvcEvent/submitEvent" modelAttribute="eventForm">
            <table>
               <tr>
                   <td><form:label path="eventTitle">Event Title</form:label></td>
                   <td><form:input path="eventTitle"/></td>
               </tr>
               <tr>
                   <td><form:label path="city">City</form:label></td>
                   <td><form:input path="city"/></td>
               </tr>
               <tr>
                   <td><form:label path="ticketPrice">
                     Ticket Price</form:label></td>
                   <td><form:input path="ticketPrice"/></td>
               </tr>
               <tr>
                    <td><form:label path="eventList1">Event Type</form:label></td>
                    <td><form:checkboxes path="eventList1" items="${eventList1}"/></td>
                </tr>
               <tr>
                   <td><input type="submit" value="Submit"/></td>
               </tr>
           </table>
       </form:form>
   </body>
</html>