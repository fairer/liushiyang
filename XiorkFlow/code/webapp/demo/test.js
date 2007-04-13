
//
XiorkFlowWorkSpace.build();

//
function init() {
    

    //
    var designerDiv = Toolkit.getElementByID("designer");

    var treeNode = new TreeNode(designerDiv,"根节点","");
    createTree(3,treeNode);
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

function createTree(count,treeNode){
	var n = 1;
	for(var i = 1;i <= count ;i++){
		var level1Node = new TreeNode(Toolkit.newLayer(),"1层"+i+"个",""); 
		treeNode.add(level1Node);
		for(var j = 1;j <= count;j++){
			var level2Node = new TreeNode(Toolkit.newLayer(),"2层"+j+"个",""); 
			level1Node.add(level2Node);
			for(var k = 1;k <= count;k++){
				var level3Node = new TreeNode(Toolkit.newLayer(),"3层"+k+"个",""); 
				level2Node.add(level3Node);
				for(var h = 1;h <= count;h++){
					var level4Node = new TreeNode(Toolkit.newLayer(),"4层"+(n++)+"个",""); 
					level3Node.add(level4Node);
				
				}
			}
		}
	}
}