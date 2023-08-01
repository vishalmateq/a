/**
 * 
 */

 function validateEmail() {
  const res = /^[\w-\.]+@([\w-]+\.)+[\w-]$/;
  if(res.test(document.getElementById('uemail').value.toLowerCase())==false){
	  
	alert('Invalid Email Address');
  }
  
  return res.test(document.getElementById('uemail').value.toLowerCase());
 }
 
 function nameCheck()
 {
	 
	 var name = document.getElementById('uname').value;
	 var namechk = /^[A-Za-z. ]{3,20}$/ ;
	 
	 if(nameCheck.test(name))
	 {
		  return true;
	 }
	 alert("Name is not valid ");
	 
 }

 
 
     
 function passwordCheck()
 {   
	 var passs = document.getElementById('upass').value;
	 
	// var passCheck = /^(?=.*[0,9])(?=.*[!@#$%^&*]) 
	// [a-zA-Z0-9]{8,16}$/ ; 
 }     
     
function validateAge() {
	
            var dobInput = document.getElementById('udob').value;
            var dob = new Date(dobInput);
            var today = new Date();

            var age = today.getFullYear() - dob.getFullYear();

            if (today.getMonth() < dob.getMonth() || (today.getMonth() === dob.getMonth() && today.getDate() < dob.getDate())) {
                age--;
            }

            document.getElementById('age').textContent = "Age: " + age;

            if (age > 18) {
                return true;
            } else {
                alert('You must be 18+');
                return false;
            }
  }
  
  
  
  