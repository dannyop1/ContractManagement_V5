<%-- 
    Document   : CreditDetail
    Created on : Mar 31, 2023, 3:24:58 AM
    Author     : mical
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Credit Info</title>
    </head>
    <body>
        <h1>${sessionScope.user.getFullName()}!</h1>
        <p>Your credit: ${sessionScope.user.getCredit()}</p>

        <form action="MainController" method="post">
            <table> 
                <tr>
                    <td>Money: </td>
                    <td><input type="text" name="money" value="10" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Checkout" name="action"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
