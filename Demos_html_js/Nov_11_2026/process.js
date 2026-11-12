//process.js
/*
int x = Integer.parseInt("100")
*/
addEvent(window,'load',initialize);
function initialize()
{
//alert("Window loaded");
var btn = document.getElementById('calci');
addEvent(btn,'click',calculate);
}
function calculate()
{
var n1 = document.getElementById('num1').value;
var n2 = document.getElementById('num2').value;
var sum = parseInt(n1) + parseInt(n2);
alert("The Sum is "+sum);
}