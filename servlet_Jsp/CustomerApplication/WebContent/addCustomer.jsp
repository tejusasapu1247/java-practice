<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="AddCustomer" id="customerId" action="#" method="POST"  >
        <table align="center">
            <tr>
                <td>
                    <label>
                        Enter Name:
                     </label>
                </td>
                <td>
                    <input type="text" name="name" id="nameId"/> 
                </td>
            </tr>

            <tr>
                <td>
                    <label>
                        Enter Email:
                    </label>
                </td>
                <td>
                    <input type="email" name="email" id="emailId"/> 
                </td>
            </tr>

            <tr>
                <td>
                    <label>
                        Enter address:
                     </label>
                </td>
               
                <td>
                    <textarea id="addressId" name="address" rows="5" cols="20"></textarea>
                </td>
            </tr>

            <tr>
                <td>
                    <label>
                        Enter Dob:
                     </label>
                </td>
               
                <td>
                    <input type="date" name="No.ofCopies" id="No.ofCopiesId"/>
                </td>
            </tr>

            <tr>
                <td>
                    <label>
                        Enter Name of the publisher:
                     </label>
                </td>
               
                <td>
                    <input type="text" name="publisher" id="publisherId"/> 
                </td>
            </tr>

            
            <tr>
                <td>
                    <label>
                        Enter Name of the Author:
                     </label>
                </td>
               
                <td>
                    <input type="text" name="Author" id="AuthorId"/> 
                </td>
            </tr>

            <tr>
                <td>
                    <label>
                        Enter address of the Author:
                     </label>
                </td>
                
                <td>
                    <textarea id="addressAuthorId" name="addressAuthor" rows="5" cols="20"></textarea>
                </td>
            </tr>
            <tr >
                <td> 
                    <input type="reset" value="clear the from" class="resetButton" name="reset" id="resetId"><br>
                    <input id="submitId" name="submit" type="submit" value="Submit the form">
                    
                </td>
            </tr>
        </table>
    </form>

</body>
</html>