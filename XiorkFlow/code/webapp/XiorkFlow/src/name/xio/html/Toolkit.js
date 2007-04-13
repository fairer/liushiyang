
/**
 * html元素工具箱
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) xio.name 2006</p>
 * @author xio
 */
function Toolkit() {
}

//static function
Toolkit.newLayer = function () {
	return document.createElement("div");
};
Toolkit.newImage = function () {
	return document.createElement("img");
};
Toolkit.newTable = function () {
	return document.createElement("table");
};
Toolkit.newElement = function (tagName) {
	return document.createElement(tagName);
	input.createElement("checkbox");
};
Toolkit.getElementByID = function (id) {
	return document.getElementById(id);
};
Toolkit.getElementByName = function (name) {
	return document.getElementsByName(name);
};
//转化为整数
Toolkit.safeParseInt = function (val) {
	return Math.round(parseFloat(val));
};
//取得当前鼠标所在控件的中心坐标？？？
Toolkit.getContainerCoord = function (e, container) {
	container = container.getUI ? container.getUI() : container;
	//e.offsetX,e.offsetY 是???，
	if (typeof e.offsetX != "undefined") {
		var srcObj = e.target || e.srcElement;
		var x = 0, y = 0;
		while (srcObj && srcObj != container) {
			x += srcObj.offsetLeft;
			y += srcObj.offsetTop;
			srcObj = srcObj.offsetParent;
		}
		return new Point(e.offsetX + x, e.offsetY + y);
	} else {
		if (typeof e.pageX != "undefined") {
			var x = 0, y = 0;
			while (container) {
				x += container.offsetLeft;
				y += container.offsetTop;
				container = container.offsetParent;
			}
			return new Point(e.pageX - x, e.pageY - y);
		} else {
			return null;
		}
	}
};
//删除一个控件，包括与之有联系的控件
Toolkit.clearElement = function (element) {
	if (!element) {
		return;
	}
	var node = element.getUI ? element.getUI() : element;
	if (!node) {
		return;
	}
	while (node.firstChild) {
		node.removeChild(node.firstChild);
	}
};

