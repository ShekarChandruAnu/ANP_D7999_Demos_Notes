//reserve.js
addEvent(window,'load',initialize);
//Data variables
var pnrName,pnrAddress,pnrPhone,pnrOccu,pnrGender;
var pnrSource,pnrDest,pnrDOJ,pnrMail,noOfTick;
var preference;
//Controls
var nameTxt,addrTxt,phnTxt;
var radOc1,radOc2,radOc3,radOc4;
var radG1,radG2;
var srcCombo;
var srccmbval;
var destCombo;
var dstcmbval;

var dojDt,mailTxt;
var nofTktNum;

var chek1,chek2,chek3,chek4;

function initialize()
{

//Retrieving The Controls
var mySub = document.getElementById('s1');

nameTxt = document.getElementById('t1');
addrTxt = document.getElementById('ta1');
phnTxt = document.getElementById('tele');

radOc1=document.getElementById('r1');
radOc2=document.getElementById('r2');
radOc3=document.getElementById('r3');
radOc4=document.getElementById('r4');

radG1=document.getElementById('g1');
radG2=document.getElementById('g2');

nofTktNum = document.getElementById('noft');

dojDt=document.getElementById('doj');
mailTxt=document.getElementById('mail1');

srcCombo = document.getElementById('source');
destCombo = document.getElementById('dest');

chek1 = document.getElementById('chk1');
chek2 = document.getElementById('chk2');
chek3 = document.getElementById('chk3');
chek4 = document.getElementById('chk4');


//Binding The Events

addEvent(mySub,'click',process);
addEvent(srcCombo,'change',sourceSelect);
addEvent(destCombo,'change',destSelect);

}

function sourceSelect()
{
	
	srccmbval = srcCombo.options[srcCombo.selectedIndex].value;
	switch(srccmbval)
	{
		case "bg":
		{
			pnrSource = "Bangalore";
			break;
		}
		case "nd":
		{
			pnrSource = "New Delhi";
			break;
		}
		case "ch":
		{
			pnrSource = "Chennai";
			break;
		}
		case "mu":
		{
			pnrSource = "Mumbai";
			break;
		}
		case "hy":
		{
			pnrSource = "Hyderabad";
			break;
		}
		case "ng":
		{
			pnrSource = "Nagpur";
			break;
		}
		case "gz":
		{
			pnrSource = "Ghaziabad";
			break;
		}
		case "kn":
		{
			pnrSource = "Kanpur";
			break;
		}
		default:
		{
			pnrSource = "Not Selected";
			break;
		}
	}
	//alert(pnrSource);
	
}
function destSelect()
{
	
	dstcmbval = destCombo.options[destCombo.selectedIndex].value;
	switch(dstcmbval)
	{
		case "bg":
		{
			pnrDest = "Bangalore";
			break;
		}
		case "nd":
		{
			pnrDest = "New Delhi";
			break;
		}
		case "ch":
		{
			pnrDest = "Chennai";
			break;
		}
		case "mu":
		{
			pnrDest = "Mumbai";
			break;
		}
		case "hy":
		{
			pnrDest = "Hyderabad";
			break;
		}
		case "ng":
		{
			pnrDest = "Nagpur";
			break;
		}
		case "gz":
		{
			pnrDest = "Ghaziabad";
			break;
		}
		case "kn":
		{
			pnrDest = "Kanpur";
			break;
		}
		default:
		{
			pnrDest = "Not Selected";
			break;
		}
	}
	//alert(pnrDest);
	
}
function process()
{
//DataVariables
pnrName = nameTxt.value;
pnrAddress = addrTxt.value;
pnrPhone=phnTxt.value;

pnrDOJ = dojDt.value;
pnrMail = mailTxt.value;
noOfTick = nofTktNum.value;

//Occupation Selection Processed
if(radOc1.checked == true)
{
	pnrOccu = "Govt Employee";
}
else if(radOc2.checked == true)
{
	pnrOccu = "Pvt Employee";
}
else if(radOc3.checked == true)
{
	pnrOccu = "Self Employed";
}
else if(radOc4.checked == true)
{
	pnrOccu = "Freelancer";
}
else
{
	pnrOccu = "Not Selected";
}
//Gender Selection Processed
if(radG1.checked == true)
{
	pnrGender = "Male";
}
else if(radG2.checked == true)
{
	pnrGender = "Female";
}
else
{
	pnrGender = "Not Selected";
}


if((chek1.checked == true) && (chek3.checked == true))
{
	preference= "Preferred Smoking & Vegetarian";
}
else if((chek2.checked == true) && (chek4.checked == true))
{
	preference = "Preferred Non Smoking & Non Vegetarian";
}
else
{
	preference = "Not Selected";
}



alert("Your Reservation Details are As Follows \n PassengerName :"+pnrName+" Passenger Address "+pnrAddress+"\n"+" Phone "+pnrPhone+"\n"+"Occupation :"+pnrOccu+" Gender :"+pnrGender+"\n"+"Source :"+pnrSource+" Destination :"+pnrDest+" eMail :"+pnrMail+"\n"+" Number Of Tickets :"+noOfTick+" Preferences Are "+preference);





}