/**
*/
function CheckBox(){

	
	this.base = Component;
	this.base(Toolkit.newElement("input"));
	
    //
    this.ui.type = "checkbox";
    this.ui.cellPadding = 0;
    this.ui.cellSpacing = 0;
    this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_CHECKBOX");
    
    //
}
CheckBox.prototype = new Component();
CheckBox.prototype.toString = function () {
    return "[Component,CheckBox]";
};