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
   var district = document.getElementById("district").value;
   document.userform.action="district/"+district;
   return true;
}
</script>

<h2>Search By District</h2>

<form name="userform" method="get" onsubmit="return OnSubmitForm();">         
          Enter Your District: <input type="text" id="district" name="district">                        
         <input type="submit" value="Submit">
</form>

</body>
</html>