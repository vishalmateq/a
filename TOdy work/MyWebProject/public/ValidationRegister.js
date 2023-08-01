/**
 
Enter email	
Enter birthdate	
Enter username	
Enter password

*/



function Validation()
{ 
	var useremail = document.getElementById('uemail').value;
	var udob = document.getElementById('udob').value;
	var uname = document.getElementById('uname').value;
	var upass = document.getElementById('upass').value;
	
	if(useremail == ""){
		alert("sdfer");
		return false;
	}
	return true;
	
}







 function checkEmptyField(fieldId) {

	alert('checkEmptyField ' + fieldId);
}

function clearTheForm() {
	
	document.getElementById('uemail').value = "";
	document.getElementById('udob').value = "";
	document.getElementById('uname').value = "";
	document.getElementById('upass').value = "";

}