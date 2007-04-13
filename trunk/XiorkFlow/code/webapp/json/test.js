jsonurl = "../JSON-RPC";
jsonrpc = null;
//
XiorkFlowWorkSpace.build();

//
function init() {
    
	 try {
		jsonrpc = new JSONRpcClient(jsonurl);
    } catch(e) {
		if(e.message) alert(e.message);
		else alert(e);
    }
    //
    var designerDiv = Toolkit.getElementByID("designer");
	var rootNodeObj = {title:"根节点",img:"images/xiorkflow/help.gif",id:"0",isCheckbox:false};
    var treeNode = new TreeNode(designerDiv,rootNodeObj);
//    createTree(3,treeNode);
//    var childTree1 = new TreeNode(Toolkit.newLayer(),"第2个节点22222222222222","");
//    var childTree2 = new TreeNode(Toolkit.newLayer(),"第3个节点33333333333333","");
//    var childTree3 = new TreeNode(Toolkit.newLayer(),"第4个节点44444444444444","");
//    var childTree4 = new TreeNode(Toolkit.newLayer(),"第5个节点55555555555555","");
//    var childTree5 = new TreeNode(Toolkit.newLayer(),"第6个节点66666666666666","");
//    var childTree6 = new TreeNode(Toolkit.newLayer(),"第7个节点77777777777777","");
//    treeNode.childs.add(childTree1);
//    treeNode.childs.add(childTree2);
//	treeNode.childs.add(childTree3);
//	childTree2.childs.add(childTree4);
//	childTree2.childs.add(childTree5);
//	childTree5.childs.add(childTree6);
//	alert(document.body.innerHTML);
}
