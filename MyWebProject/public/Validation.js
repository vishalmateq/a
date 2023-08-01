/**
 * 
 */

	
	function validate(){
		var x = document.getElementById('uname').value;
		var y = document.getElementById('upass').value;
		    
		console.log("Value of x is "+x);
		console.log("Value of y is "+y);
		
		if( x =="")
		{
			//alert("Username cannot be Blank..");
			document.getElementById("nameErr").innerHTML="Username cannot be Blank..";
			return false;
		}
		if(y == "")
		{
			//alert("Password cannot be blank..");
			document.getElementById("passErr").innerHTML="Password cannot be Blank..";

			return false;
		}
			
		return true;
	} 
	
	
    function clearForm()
	{
		document.getElementById('uname').value ="";
		document.getElementById('upass').value ="";
	}
	
	function claerNameErrMsg()
	{
	document.getElementById('nameErr').innerHTML ="";

	}
	
	function claerPassErrMsg()
	{
		document.getElementById('passErr').innerHTML ="";
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////

function checkEmptyField() {
 	
 	var email = document.getElementById('uemail').value;
 	var dob = document.getElementById('udob').value;
 	var name = document.getElementById('uname').value;
 	var password = document.getElementById('upass').value;
 	
 	if( email ==""){
		document.getElementById("emailErr").innerHTML="email cannot be Blank..";
		return false;
	}
	if( dob ==""){
		document.getElementById("dobErr").innerHTML="dob cannot be Blank..";
		return false;
	}
	if( name ==""){
		document.getElementById("nameErr").innerHTML="name cannot be Blank..";
		return false;
	}
	if( password ==""){
		document.getElementById("passErr").innerHTML="password cannot be Blank..";
		return false;
	}
	
	return true;
 }


function claerEmailErrMsg()
{
	document.getElementById("emailErr").innerHTML="";
}
function claerDobErrMsg()
{
	document.getElementById("dobErr").innerHTML="";
}
function claerNameErrMsg()
{
	document.getElementById("nameErr").innerHTML="";
}
function claerPassErrMsg()
{
	document.getElementById("passErr").innerHTML="";
}


function validateData()
{
//Email Valivation
	var email    = document.getElementById('uemail').value;
	var emailchk    = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	
	
	
//BirthDate Validation 	
	var birthdate = document.getElementById('udob').value;
	
	var dob = new Date(birthdate);
	var today = new Date();
	
	var age = today.getFullYear() - dob.getFullYear();
	console.log(age);
	
	
	
//Name Validation
	var name     = document.getElementById('uname').value;
	var namechk     = /^[A-Za-z. ]{3,20}$/;
	
	
	
//Password Validation 
	var password = document.getElementById('upass').value;
	const uppercaseRegex = /[A-Z]/;
    const lowercaseRegex = /[a-z]/;
    const digitRegex     = /\d/;
    const specialCharRegex = /[!@#$%^&*()_+[\]{};':"\\|,.<>/?]/;
	var passwordchk = /[!@#$%^&*()_+[\]{};':"\\|,.<>/?]/;
	

//conditions ..................................................
	if(!emailchk.test(email))
	{
		alert(" plaese enter proper email...");
		return false;
	}
	
	if(age<=18)
	{
		alert("age must be greater than 18...");
		return false;
	}
	
	if(!namechk.test(name))
	{
		alert("Username is not valid , please enter only alphabate .. ");
		return false;
	}
	
	if(!passwordchk.test(password) || 
	!uppercaseRegex.test(password) || 
	!lowercaseRegex.test(password) || 
	!digitRegex.test(password))
	{
		alert(" Password must contain uppercase, lowercase, digit, and special character");
		return false;
	}
	return true;
}


function clearTheForm()
	{   
		document.getElementById('uemail').value ="";
		document.getElementById('udob').value ="";
		document.getElementById('uname').value ="";
		document.getElementById('upass').value ="";
		return false;
	}























	
	
	
	
	
	