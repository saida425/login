<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form method="post" action="registration.jsp">
<center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>name</td>
                        <td><input type="text" name="name" id="name" /></td>
                    </tr>
                    <tr>
                        <td>address</td>
                        <td><input type="text" name="address" id="address" /></td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td><input type="text" name="email" id="email" /></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="password" id="" /></td>
                    </tr>
                    <tr>
   					 <td>gender</td>
   					 <td><input type="radio" value="male" name="gender">Male</td>
   					 <td><input type="radio" value="female" name="gender">Female</td>
					</tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
