
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) xio.name 2006</p>
 * @author xio
 */
function TreeItem(nodeObj,uiNode) {
    this.base = Component;
    this.base(Toolkit.newTable());
	//
	this.nodeObj = nodeObj;
	this.treeNode = uiNode;
	
    //
    
    this.ui.cellPadding = 0;
    this.ui.cellSpacing = 0;
    this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_TREE");
	
    //
    var row = this.ui.insertRow(-1);
//this.ui.insertRow
    //
    if(this.nodeObj.isCheckbox){
    	this.checkBox = new CheckBox();
    	if(this.nodeObj.id)
    		this.checkBox.ui.id = this.nodeObj.id;
    	this.checkBox.addMouseListener(new checkBoxListenner(this));
    	this.ckbCell = row.insertCell(-1);
        this.ckbCell.appendChild(this.checkBox.ui);
        this.ckbCell.valign = "middle";
        this.ckbCell.align = "center";
    }
    
    if (this.nodeObj.img) {
        var imageIcon = Toolkit.newImage();
        imageIcon.src = XiorkFlowWorkSpace.XIORK_FLOW_PATH + this.nodeObj.img;
        imageIcon.className = "NAME_XIO_UI_BUTTON_IMGCELL";
        this.imgCell = row.insertCell(-1);
        this.imgCell.appendChild(imageIcon);
        this.imgCell.valign = "middle";
        this.imgCell.align = "center";
    } else {
        this.imgCell = null;
        if (!this.nodeObj.title) {
            this.nodeObj.title = "&nbsp;";
        }
    }

    //
    if (this.nodeObj.title) {
        this.txtCell = row.insertCell(-1);
        this.txtCell.innerHTML = this.nodeObj.title;
        this.txtCell.valign = "middle";
        this.txtCell.align = "center";
        this.txtCell.className = "NAME_XIO_UI_BUTTON_TXTCELL";
        if (!this.nodeObj.img) {
            this.txtCell.style.paddingLeft = "5px";
            this.txtCell.style.paddingRight = "5px";
        }
    } else {
        this.txtCell = null;
    }


    //为按钮增加鼠标方法，默认为按钮的鼠标方法，通过重写方法来写事件代码
    this.addMouseListener(new ButtonMouseListener(this));

    //
    this.setModel(new ButtonModel());

    //
    this.actionListeners = new Array();
}
TreeItem.prototype = new Component();
TreeItem.prototype.toString = function () {
    return "[Component,TreeItem]";
};
TreeItem.prototype.setModel = function (model) {
    if (!model) {
        return;
    }
    this.model = model;
    this.model.addObserver(this);
};
TreeItem.prototype.getModel = function () {
    return this.model;
};
TreeItem.prototype.getText = function () {
    if (this.txtCell) {
        return this.txtCell.innerHTML;
    } else {
        return null;
    }
};
TreeItem.prototype.setText = function (text) {
    if (this.txtCell) {
        this.txtCell.innerHTML = text;
    }
};
TreeItem.prototype.doClick = function () {
    this.model.setPressed(true);
    for (var i = 0; i < this.actionListeners.size(); i++) {
        this.actionListeners.get(i).actionPerformed(this);
    }
    this.model.setPressed(false);
};

//
TreeItem.prototype.addActionListener = function (actionListener) {
    this.actionListeners.add(actionListener);
};
TreeItem.prototype.removeActionListener = function (actionListener) {
    this.actionListeners.remove(actionListener);
};
TreeItem.prototype.clearActionListeners = function (actionListener) {
    this.actionListeners.clear();
};
TreeItem.prototype.getActionListeners = function () {
    return this.actionListeners;
};

//
TreeItem.prototype.update = function (observable, arg) {
//    this._update();
};
//TreeItem.prototype._update = function () {
//    if (this.model.isPressed()) {
//        if (this.model.isEnabled()) {
//            this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_BUTTON NAME_XIO_UI_BUTTON_PRESSED");
//        } else {
//            this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_BUTTON NAME_XIO_UI_BUTTON_PRESSED NAME_XIO_UI_DISENABLED");
//        }
//    } else {
//        if (this.model.isEnabled()) {
//            this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_BUTTON");
//        } else {
//            this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_BUTTON NAME_XIO_UI_DISENABLED");
//        }
//    }
//};

//
/**
 *
 */
function ButtonMouseListener(button) {
    this.button = button;
}
ButtonMouseListener.prototype = new MouseListener();
ButtonMouseListener.prototype.onClick = function () {
    if (!this.button.getModel().isEnabled()) {
        return;
    }
    this.button.doClick();
};
ButtonMouseListener.prototype.onMouseOver = function () {
//    if (!this.button.getModel().isEnabled()) {
//        return;
//    }
//	alert("aaa");
    this.button.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_BUTTON NAME_XIO_UI_TREE_OVER");
};
ButtonMouseListener.prototype.onMouseOut = function () {
//    if (!this.button.getModel().isEnabled()) {
//        return;
//    }
    this.button.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_TREE");
};
function checkBoxListenner(treeItem){
	this.treeItem = treeItem;
}
checkBoxListenner.prototype = new MouseListener();
checkBoxListenner.prototype.onClick = function(){
	doCheck(this.treeItem.treeNode);
//	alert(this.treeItem.treeNode.childs.length);
}
function doCheck(treeNode){
	
	var childs = treeNode.childs;
	for(var i = 0;i < childs.length;i++){
			if(childs[i].childs.length == 0){
				if(childs[i].saveButton.checkBox)
					childs[i].saveButton.checkBox.ui.checked = treeNode.saveButton.checkBox.ui.checked;
			}else{
				if(childs[i].saveButton.checkBox)
					childs[i].saveButton.checkBox.ui.checked = treeNode.saveButton.checkBox.ui.checked;
				doCheck(childs[i]);
			}
	}
}
