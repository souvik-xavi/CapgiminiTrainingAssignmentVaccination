<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function OnSubmitForm()
{
   var pincode = document.getElementById("pincode").value;
   document.userform.action="pincode/"+pincode;
   return true;
}
</script>

<h2>Search By Pinode</h2>
<form name="userform" method="get" onsubmit="return OnSubmitForm();">         
          Enter Your Pincode: <input type="text" id="pincode" name="pincode">                        
         <input type="submit" value="Submit">
</form>
</body>
</html>