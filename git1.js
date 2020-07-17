function validateFullName(){
    var fname=document.getElementById("fullname").value;
	var re=/^[a-zA-Z\s\'\-]{2,5}$/;
	if(re.test(fname)){
	   document.getElementById("fullNamePrompt").style.color="Green";
	   document.getElementById("fullNamePrompt").innerHTML="<strong>Valid</strong>";
	   return true;
	}
	else{
	    document.getElementById("fullNamePrompt").style.color="Red";
	    document.getElementById("fullNamePrompt").innerHTML="<strong>Enter 2 to 80 characters</strong>";
	    return false;
    }
}

function validatePhoneNumber(){
    var phoneNumber=document.getElementById("phone").value;	
	var re2=/^\d{3}-\d{4}-\d{4}$/;
	if(re2.test(phoneNumber)){
		document.getElementById("phonePrompt").style.color="Green";
	    document.getElementById("phonePrompt").innerHTML="<strong>Valid</strong>";
	    return true;
	}
	else{
		document.getElementById("phonePrompt").style.color="Red";
	    document.getElementById("phonePrompt").innerHTML="<strong>Invalid Phone Number</strong>";
	    return false;
	}
}

function orderSummary(){
    var fn=	document.getElementById("fullname").value;
	var ad=document.getElementById("address").value;
	var ph=document.getElementById("phone").value;
	document.getElementById("order").innerHTML="<h2>Order Details:</h2>";
	document.getElementById("order").innerHTML+="<p>"+fn+"</br>"+ad+"</br>"+ph+"</p>";
}