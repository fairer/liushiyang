function checkSelect(){
	var elm = event.srcElement;
	checkChildrenRecurve(elm);
	checkRootRecurve(document.getElementById("root"));
}
function checkChildrenRecurve(elm){
	var li = elm.parentNode;
	var ul = li.lastChild;
	if (ul.tagName != "UL") return;
	var lis = ul.children;
	for (var i=0;i<lis.length;i++){
		lis[i].firstChild.checked=elm.checked;
		checkChildrenRecurve(lis[i].firstChild)
	}
}
function checkRootRecurve(ul){
	if (ul.tagName != "UL") {
		ul.parentNode.firstChild.allChecked = ul.parentNode.firstChild.checked;
		ul.parentNode.firstChild.allUnChecked = !ul.parentNode.firstChild.checked;
		return;
	}
	var lis = ul.children;
	var allChecked = true;
	var allUnChecked = true;
	for (var i=0;i<lis.length;i++){
		checkRootRecurve(lis[i].lastChild)
		allChecked = allChecked && lis[i].firstChild.checked && lis[i].firstChild.allChecked;
		allUnChecked = allUnChecked && !lis[i].firstChild.checked && lis[i].firstChild.allUnChecked;
	}
	ul.parentNode.firstChild.allChecked=allChecked;
	ul.parentNode.firstChild.allUnChecked=allUnChecked;
	if (allChecked || allUnChecked){
		ul.parentNode.firstChild.checked=allChecked;
		ul.parentNode.firstChild.indeterminate=false;
	}else{
		ul.parentNode.firstChild.indeterminate=true;
		ul.parentNode.firstChild.checked=true;

	}
}

function init(){
	var elms = document.getElementsByTagName("INPUT");
	for (var i=0;i<elms.length;i++)
		elms[i].onclick=checkSelect;
}
//-->