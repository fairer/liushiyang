function TreeNode(ui,nodeObj){
//	ui,title,link
	this.base = Component;
    if (ui) {
        this.base(ui);
    } else {
        this.base(Toolkit.newLayer());
    }
    //
    this.nodeObj = nodeObj;
//    this.title = nodeObj.title;
//    this.link = nodeObj.link;
//    this.isCheckbox = nodeObj.isCheckbox;
//    this.id = nodeObj.id;
//    this.img = nodeObj.img;
    //
    this.childs = new Array();
	this.isopen = false;
	//是否被加载
	this.isload = false;    
    //
    this.contentTableUI = Toolkit.newTable();
    this.ui.appendChild(this.contentTableUI);
    this.contentTableUI.cellPadding = 0;
    this.contentTableUI.cellSpacing = 0;
    this.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_TreeNode");
    this.contentTableUI.className = "NAME_XIO_UI_FONT NAME_XIO_UI_TreeNode";
  	var row = this.contentTableUI.insertRow(-1);
    var cell = row.insertCell(-1);
    
//    this.saveButton = new TreeItem(XiorkFlowWorkSpace.XIORK_FLOW_PATH + (this.img)?this.img:"images/xiorkflow/home.gif", this.title,"checkbox",this);
	this.saveButton = new TreeItem(this.nodeObj,this);
	this.saveButton.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_TREE");
	this.saveButton.addMouseListener(new ChooseListenner(this));
    cell.appendChild(this.saveButton.ui);
    
}
TreeNode.prototype = new Component();
TreeNode.prototype.toString = function () {
    return "[Component,TreeNode]";
};
TreeNode.prototype.open = function(){
	//已经被加载过
	if(this.isload){
		for (i=0;i<this.childs.length;i++){
			var treeNode = this.childs.get(i);
			treeNode.ui.parentNode.parentNode.style.display = "block";
		}
	}else{
//		alert("第一次加载"+this.title)
//		var currentNode = {title:this.title,link:this.link};
		try{
			var recObj	= jsonrpc.test.load(this.nodeObj);
			for(var i=0;i<recObj.list.length;i++){
				var node = new TreeNode(Toolkit.newLayer(),recObj.list[i]);
				this.add(node);
			}
		} catch(e) {
			alert(" Exception: \n\n" + e);
    	}
//		for (i=0;i<this.childs.length;i++){
//			var treeNode = this.childs.get(i);
//			this.add(treeNode);
//			treeNode.ui.parentNode.parentNode.style.display = "block";
//		}
		this.isload = true;
	}
};
TreeNode.prototype.close = function(){
	//已经被加载过
	if(this.childs.length > 0){
		for (i=0;i<this.childs.length;i++){
			var treeNode = this.childs.get(i);
			treeNode.ui.parentNode.parentNode.style.display = "none";
		}
	}
};
TreeNode.prototype.add = function(treeNode){
	 var treeNodeUI = treeNode.getUI ? treeNode.getUI() : treeNode;
	 var height = treeNodeUI.height ? treeNodeUI.height : treeNodeUI.style.height;
    var row = this.contentTableUI.insertRow(-1);
    ////////////
    var cell = row.insertCell(-1);
    var tempTableUI = Toolkit.newTable();
    cell.appendChild(tempTableUI);
    tempTableUI.cellPadding = 0;
    tempTableUI.cellSpacing = 0;
    var row = tempTableUI.insertRow(-1);
    var cell = row.insertCell(-1);
	var component = new Component(Toolkit.newLayer());
    var kongge ="        ";	
    component.setInnerText(kongge);
    cell.appendChild(component.getUI());
    ///////
    var cell = row.insertCell(-1);
    cell.appendChild(treeNodeUI);
    
    if(this.childs.indexOf(treeNode) < 0){
    	this.childs.add(treeNode);
    }
    return row;
};

function ChooseListenner(treeNode){
	this.treeNode = treeNode;

}
ChooseListenner.prototype = new MouseListener();
ChooseListenner.prototype.onDblClick = function(){
	if(this.treeNode.isopen){
		this.treeNode.close();
		this.treeNode.isopen = false;
	}else{
		this.treeNode.open();
		this.treeNode.isopen = true;
	}
};
//ChooseListenner.prototype.onMouseOut = function(){
//	if (!this.treeNode.saveButton.getModel().isEnabled()) {
//        return;
//    }
//	this.treeNode.saveButton.setClassName("NAME_XIO_UI_FONT NAME_XIO_UI_TREE");
//};
