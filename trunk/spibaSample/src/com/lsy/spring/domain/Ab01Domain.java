/**
* 文件：Ab01Domain.java   
* 版本：1.0.0
* 日期：2006-09-04 19:54:44
* Copyright &reg; 2005 YINHAI Software Co. Ltd.
* All right reserved.
*/

package com.lsy.spring.domain;

import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * <p>Title: </p>
 * <p>Description: ab01 劳动就业单位信息 领域对象 </p>
 * <p>Copyright: Copyright &reg; 2005 YINHAI Software Co. Ltd.</p>
 * <p>Company: 四川银海软件有限责任公司</p>
 * @author 银海LEMIS开发项目组 jiangbo
 * @version 1.0
 */

public class Ab01Domain
	implements java.io.Serializable{

	public Ab01Domain(){
	}
	
	 /** 
	  *单位编号 
	 **/ 
	 private java.lang.String      aab001;    
	
	 /** 
	  *工作单位编号 
	 **/ 
	 private java.lang.String      yab400;    
	
	 /** 
	  *社保保险登记证编码 
	 **/ 
	 private java.lang.String      aab002;    
	
	 /** 
	  *组织机构代码 
	 **/ 
	 private java.lang.String      aab003;    
	
	 /** 
	  *单位名称 
	 **/ 
	 private java.lang.String      aab004;    
	
	 /** 
	  *单位英文名称 
	 **/ 
	 private java.lang.String      aab041;    
	
	 /** 
	  *单位简称 
	 **/ 
	 private java.lang.String      aab042;    
	
	 /** 
	  *单位拼音码 
	 **/ 
	 private java.lang.String      aab043;    
	
	 /** 
	  *单位电话 
	 **/ 
	 private java.lang.String      aab005;    
	
	 /** 
	  *所属劳保所 
	 **/ 
	 private java.lang.String      yae422;    
	
	 /** 
	  *地址 
	 **/ 
	 private java.lang.String      aae006;    
	
	 /** 
	  *邮政编码 
	 **/ 
	 private java.lang.String      aae007;    
	
	 /** 
	  *行政区划名称 
	 **/ 
	 private java.lang.String      aaa021;    
	
	 /** 
	  *所在地行政区划代码 
	 **/ 
	 private java.lang.String      aab301;    
	
	 /** 
	  *工商登记执照种类 
	 **/ 
	 private java.lang.String      aab006;    
	
	 /** 
	  *工商登记执照号码 
	 **/ 
	 private java.lang.String      aab007;    
	
	 /** 
	  *工商登记发照日期 
	 **/ 
	 private java.sql.Timestamp    aab008;    
	
	 /** 
	  *工商登记有效期限(年) 
	 **/ 
	 private java.lang.Integer     aab009;    
	
	 /** 
	  *批准成立单位 
	 **/ 
	 private java.lang.String      aab010;    
	
	 /** 
	  *批准日期 
	 **/ 
	 private java.sql.Timestamp    aab011;    
	
	 /** 
	  *批准文号 
	 **/ 
	 private java.lang.String      aab012;    
	
	 /** 
	  *法定代表人 
	 **/ 
	 private java.lang.String      aab013;    
	
	 /** 
	  *法定代表人公民身份号码 
	 **/ 
	 private java.lang.String      aab014;    
	
	 /** 
	  *法定代表人电话 
	 **/ 
	 private java.lang.String      aab015;    
	
	 /** 
	  *单位类型 
	 **/ 
	 private java.lang.String      aab019;    
	
	 /** 
	  *经济类型 
	 **/ 
	 private java.lang.String      aab020;    
	
	 /** 
	  *国别代码 
	 **/ 
	 private java.lang.String      aaa130;    
	
	 /** 
	  *隶属关系 
	 **/ 
	 private java.lang.String      aab021;    
	
	 /** 
	  *行业大类代码 
	 **/ 
	 private java.lang.String      yab401;    
	
	 /** 
	  *行业小类代码 
	 **/ 
	 private java.lang.String      aab022;    
	
	 /** 
	  *主管部门 
	 **/ 
	 private java.lang.String      aab023;    
	
	 /** 
	  *支付开户银行行号 
	 **/ 
	 private java.lang.String      aab027;    
	
	 /** 
	  *支付银行户名 
	 **/ 
	 private java.lang.String      aab028;    
	
	 /** 
	  *支付银行基本帐号 
	 **/ 
	 private java.lang.String      aab029;    
	
	 /** 
	  *地税号 
	 **/ 
	 private java.lang.String      aab030;    
	
	 /** 
	  *地税机构编号 
	 **/ 
	 private java.lang.String      aab031;    
	
	 /** 
	  *地税发证机关 
	 **/ 
	 private java.lang.String      aab032;    
	
	 /** 
	  *地区代码 
	 **/ 
	 private java.lang.String      yab002;    
	
	 /** 
	  *改制企业标志 
	 **/ 
	 private java.lang.String      yab074;    
	
	 /** 
	  *改制时间 
	 **/ 
	 private java.sql.Timestamp    yab075;    
	
	 /** 
	  *联系人 
	 **/ 
	 private java.lang.String      aae004;    
	
	 /** 
	  *联系电话 
	 **/ 
	 private java.lang.String      aae005;    
	
	 /** 
	  *传真 
	 **/ 
	 private java.lang.String      aae014;    
	
	 /** 
	  *电子信箱 
	 **/ 
	 private java.lang.String      aae015;    
	
	 /** 
	  *网址 
	 **/ 
	 private java.lang.String      aae016;    
	
	 /** 
	  *用工登记证号 
	 **/ 
	 private java.lang.String      aab039;    
	
	 /** 
	  *事业单位类型 
	 **/ 
	 private java.lang.String      aab057;    
	
	 /** 
	  *主办部门 
	 **/ 
	 private java.lang.String      aab045;    
	
	 /** 
	  *产业类别 
	 **/ 
	 private java.lang.String      aab054;    
	
	 /** 
	  *注册资金 
	 **/ 
	 private java.lang.String      aab049;    
	
	 /** 
	  *经营方式（正规五类企业） 
	 **/ 
	 private java.lang.String      aab048;    
	
	 /** 
	  *主营范围（正规五类企业） 
	 **/ 
	 private java.lang.String      aab052;    
	
	 /** 
	  *兼营范围（正规五类企业） 
	 **/ 
	 private java.lang.String      aab053;    
	
	 /** 
	  *银行代码 
	 **/ 
	 private java.lang.String      aae008;    
	
	 /** 
	  *银行户名 
	 **/ 
	 private java.lang.String      aae009;    
	
	 /** 
	  *银行帐号 
	 **/ 
	 private java.lang.String      aae010;    
	
	 /** 
	  *经办人 
	 **/ 
	 private java.lang.String      aae011;    
	
	 /** 
	  *操作人员号（经办人） 
	 **/ 
	 private java.lang.String      yae116;    
	
	 /** 
	  *经办机构 
	 **/ 
	 private java.lang.String      aae017;    
	
	 /** 
	  *经办日期 
	 **/ 
	 private java.sql.Timestamp    aae036;    
	
	 /** 
	  *备注 
	 **/ 
	 private java.lang.String      aae013;    
	
	 /** 
	  *审批人 
	 **/ 
	 private java.lang.String      aae012;    
	
	 /** 
	  *操作人员号（审批人） 
	 **/ 
	 private java.lang.String      yae405;    
	
	 /** 
	  *审定机构 
	 **/ 
	 private java.lang.String      yae401;    
	
	 /** 
	  *审定日期 
	 **/ 
	 private java.sql.Timestamp    aae034;    
	
	 /** 
	  *审定状态 
	 **/ 
	 private java.lang.String      yae420;    
	
	 /** 
	  *时间戳 
	 **/ 
	 private java.sql.Timestamp    aae163;    
	
	 /** 
	  *单位状态 
	 **/ 
	 private java.lang.String      aae119;    
	
	 /** 
	  *注销人 
	 **/ 
	 private java.lang.String      yae430;    
	
	 /** 
	  *操作人员号（注销人） 
	 **/ 
	 private java.lang.String      yae435;    
	
	 /** 
	  *注销时间 
	 **/ 
	 private java.sql.Timestamp    yae431;    
	
	 /** 
	  *注销就业机构 
	 **/ 
	 private java.lang.String      yae432;    
	
	 /** 
	  *注销原因 
	 **/ 
	 private java.lang.String      yae433;    
	
	 /** 
	  *最后修改人 
	 **/ 
	 private java.lang.String      yae437;    
	
	 /** 
	  *最后修改人编号 
	 **/ 
	 private java.lang.String      yae439;    
	
	 /** 
	  *最后修改人机构 
	 **/ 
	 private java.lang.String      yae441;    
	
	 /** 
	  *最后修改时间 
	 **/ 
	 private java.sql.Timestamp    yae442;    
	
	 /** 
	  *国税号 
	 **/ 
	 private java.lang.String      yab403;    
	
	 /** 
	  *国税机构编号 
	 **/ 
	 private java.lang.String      yab404;    
	
	 /** 
	  *国税发证机关 
	 **/ 
	 private java.lang.String      yab405;    
	
	 /** 
	  *人员规模 
	 **/ 
	 private java.lang.String      aab056;    
	
	 /** 
	  *劳动保障业务联系部门 
	 **/ 
	 private java.lang.String      yab01c;    
	
	 /** 
	  *劳动保障业务联系人姓名 
	 **/ 
	 private java.lang.String      yab01d;    
	
	 /** 
	  *劳动保障业务联系人职务 
	 **/ 
	 private java.lang.String      yab01e;    
	
	 /** 
	  *劳动保障业务联系电话 
	 **/ 
	 private java.lang.String      yab01f;    
	
	 /** 
	  *登记机关 
	 **/ 
	 private java.lang.String      yab01h;    
	
	 /** 
	  *登记发照日期 
	 **/ 
	 private java.sql.Timestamp    yab01i;    
	
	 /** 
	  *登记有效日期 
	 **/ 
	 private java.sql.Timestamp    yab01j;    
	
	 /** 
	  *行业准入批准单位 
	 **/ 
	 private java.lang.String      yab01k;    
	
	 /** 
	  *行业准入批准级别 
	 **/ 
	 private java.lang.String      yab01l;    
	
	 /** 
	  *发证日期 
	 **/ 
	 private java.sql.Timestamp    yab01m;    
	
	 /** 
	  *批准日期 
	 **/ 
	 private java.sql.Timestamp    yab01o;    
	
	 /** 
	  *有效日期 
	 **/ 
	 private java.sql.Timestamp    yab01p;    
	
	 /** 
	  *税务计算机代码 
	 **/ 
	 private java.lang.String      yab015;    
	
	 /** 
	  *社保保险登记证发证日期 
	 **/ 
	 private java.sql.Timestamp    aab036;    
	
	 /** 
	  *养老工伤生育单位编号 
	 **/ 
	 private java.lang.String      yab011;    
	
	 /** 
	  *医保单位编号 
	 **/ 
	 private java.lang.String      yab012;    
	
	 /** 
	  *保险专管员姓名 
	 **/ 
	 private java.lang.String      aab016;    
	
	 /** 
	  *保险专管员所在部门 
	 **/ 
	 private java.lang.String      aab017;    
	
	 /** 
	  *保险专管员联系电话 
	 **/ 
	 private java.lang.String      aab018;    
	
	 /** 
	  *劳动保障执法年审编号 
	 **/ 
	 private java.lang.String      yab019;    

	 private java.lang.String      aab008_start; //工商登记发照日期 开始日期aab008
	 private java.lang.String      aab008_end; //工商登记发照日期 结束日期aab008
	 private java.lang.String      aab011_start; //批准日期 开始日期aab011
	 private java.lang.String      aab011_end; //批准日期 结束日期aab011
	 private java.lang.String      yab075_start; //改制时间 开始日期yab075
	 private java.lang.String      yab075_end; //改制时间 结束日期yab075
	 private java.lang.String      aae036_start; //经办日期 开始日期aae036
	 private java.lang.String      aae036_end; //经办日期 结束日期aae036
	 private java.lang.String      aae034_start; //审定日期 开始日期aae034
	 private java.lang.String      aae034_end; //审定日期 结束日期aae034
	 private java.lang.String      yae431_start; //注销时间 开始日期yae431
	 private java.lang.String      yae431_end; //注销时间 结束日期yae431
	 private java.lang.String      yae442_start; //最后修改时间 开始日期yae442
	 private java.lang.String      yae442_end; //最后修改时间 结束日期yae442
	 private java.lang.String      yab01i_start; //登记发照日期 开始日期yab01i
	 private java.lang.String      yab01i_end; //登记发照日期 结束日期yab01i
	 private java.lang.String      yab01j_start; //登记有效日期 开始日期yab01j
	 private java.lang.String      yab01j_end; //登记有效日期 结束日期yab01j
	 private java.lang.String      yab01m_start; //发证日期 开始日期yab01m
	 private java.lang.String      yab01m_end; //发证日期 结束日期yab01m
	 private java.lang.String      yab01o_start; //批准日期 开始日期yab01o
	 private java.lang.String      yab01o_end; //批准日期 结束日期yab01o
	 private java.lang.String      yab01p_start; //有效日期 开始日期yab01p
	 private java.lang.String      yab01p_end; //有效日期 结束日期yab01p
	 private java.lang.String      aab036_start; //社保保险登记证发证日期 开始日期aab036
	 private java.lang.String      aab036_end; //社保保险登记证发证日期 结束日期aab036


	

	
	/**
	 * @param aab001 单位编号
	 */
	public void setAab001(java.lang.String aab001){
		this.aab001=aab001;
	}
	
	/**
	 * @return 单位编号
	 */
	public java.lang.String getAab001(){
		return this.aab001;
	}
	
	/**
	 * @param yab400 工作单位编号
	 */
	public void setYab400(java.lang.String yab400){
		this.yab400=yab400;
	}
	
	/**
	 * @return 工作单位编号
	 */
	public java.lang.String getYab400(){
		return this.yab400;
	}
	
	/**
	 * @param aab002 社保保险登记证编码
	 */
	public void setAab002(java.lang.String aab002){
		this.aab002=aab002;
	}
	
	/**
	 * @return 社保保险登记证编码
	 */
	public java.lang.String getAab002(){
		return this.aab002;
	}
	
	/**
	 * @param aab003 组织机构代码
	 */
	public void setAab003(java.lang.String aab003){
		this.aab003=aab003;
	}
	
	/**
	 * @return 组织机构代码
	 */
	public java.lang.String getAab003(){
		return this.aab003;
	}
	
	/**
	 * @param aab004 单位名称
	 */
	public void setAab004(java.lang.String aab004){
		this.aab004=aab004;
	}
	
	/**
	 * @return 单位名称
	 */
	public java.lang.String getAab004(){
		return this.aab004;
	}
	
	/**
	 * @param aab041 单位英文名称
	 */
	public void setAab041(java.lang.String aab041){
		this.aab041=aab041;
	}
	
	/**
	 * @return 单位英文名称
	 */
	public java.lang.String getAab041(){
		return this.aab041;
	}
	
	/**
	 * @param aab042 单位简称
	 */
	public void setAab042(java.lang.String aab042){
		this.aab042=aab042;
	}
	
	/**
	 * @return 单位简称
	 */
	public java.lang.String getAab042(){
		return this.aab042;
	}
	
	/**
	 * @param aab043 单位拼音码
	 */
	public void setAab043(java.lang.String aab043){
		this.aab043=aab043;
	}
	
	/**
	 * @return 单位拼音码
	 */
	public java.lang.String getAab043(){
		return this.aab043;
	}
	
	/**
	 * @param aab005 单位电话
	 */
	public void setAab005(java.lang.String aab005){
		this.aab005=aab005;
	}
	
	/**
	 * @return 单位电话
	 */
	public java.lang.String getAab005(){
		return this.aab005;
	}
	
	/**
	 * @param yae422 所属劳保所
	 */
	public void setYae422(java.lang.String yae422){
		this.yae422=yae422;
	}
	
	/**
	 * @return 所属劳保所
	 */
	public java.lang.String getYae422(){
		return this.yae422;
	}
	
	/**
	 * @param aae006 地址
	 */
	public void setAae006(java.lang.String aae006){
		this.aae006=aae006;
	}
	
	/**
	 * @return 地址
	 */
	public java.lang.String getAae006(){
		return this.aae006;
	}
	
	/**
	 * @param aae007 邮政编码
	 */
	public void setAae007(java.lang.String aae007){
		this.aae007=aae007;
	}
	
	/**
	 * @return 邮政编码
	 */
	public java.lang.String getAae007(){
		return this.aae007;
	}
	
	/**
	 * @param aaa021 行政区划名称
	 */
	public void setAaa021(java.lang.String aaa021){
		this.aaa021=aaa021;
	}
	
	/**
	 * @return 行政区划名称
	 */
	public java.lang.String getAaa021(){
		return this.aaa021;
	}
	
	/**
	 * @param aab301 所在地行政区划代码
	 */
	public void setAab301(java.lang.String aab301){
		this.aab301=aab301;
	}
	
	/**
	 * @return 所在地行政区划代码
	 */
	public java.lang.String getAab301(){
		return this.aab301;
	}
	
	/**
	 * @param aab006 工商登记执照种类
	 */
	public void setAab006(java.lang.String aab006){
		this.aab006=aab006;
	}
	
	/**
	 * @return 工商登记执照种类
	 */
	public java.lang.String getAab006(){
		return this.aab006;
	}
	
	/**
	 * @param aab007 工商登记执照号码
	 */
	public void setAab007(java.lang.String aab007){
		this.aab007=aab007;
	}
	
	/**
	 * @return 工商登记执照号码
	 */
	public java.lang.String getAab007(){
		return this.aab007;
	}
	
	/**
	 * @param aab008 工商登记发照日期
	 */
	public void setAab008(java.sql.Timestamp aab008){
		this.aab008=aab008;
	}
	
	/**
	 * @return 工商登记发照日期
	 */
	public java.sql.Timestamp getAab008(){
		return this.aab008;
	}
	
	/**
	 * @param aab009 工商登记有效期限(年)
	 */
	public void setAab009(java.lang.Integer aab009){
		this.aab009=aab009;
	}
	
	/**
	 * @return 工商登记有效期限(年)
	 */
	public java.lang.Integer getAab009(){
		return this.aab009;
	}
	
	/**
	 * @param aab010 批准成立单位
	 */
	public void setAab010(java.lang.String aab010){
		this.aab010=aab010;
	}
	
	/**
	 * @return 批准成立单位
	 */
	public java.lang.String getAab010(){
		return this.aab010;
	}
	
	/**
	 * @param aab011 批准日期
	 */
	public void setAab011(java.sql.Timestamp aab011){
		this.aab011=aab011;
	}
	
	/**
	 * @return 批准日期
	 */
	public java.sql.Timestamp getAab011(){
		return this.aab011;
	}
	
	/**
	 * @param aab012 批准文号
	 */
	public void setAab012(java.lang.String aab012){
		this.aab012=aab012;
	}
	
	/**
	 * @return 批准文号
	 */
	public java.lang.String getAab012(){
		return this.aab012;
	}
	
	/**
	 * @param aab013 法定代表人
	 */
	public void setAab013(java.lang.String aab013){
		this.aab013=aab013;
	}
	
	/**
	 * @return 法定代表人
	 */
	public java.lang.String getAab013(){
		return this.aab013;
	}
	
	/**
	 * @param aab014 法定代表人公民身份号码
	 */
	public void setAab014(java.lang.String aab014){
		this.aab014=aab014;
	}
	
	/**
	 * @return 法定代表人公民身份号码
	 */
	public java.lang.String getAab014(){
		return this.aab014;
	}
	
	/**
	 * @param aab015 法定代表人电话
	 */
	public void setAab015(java.lang.String aab015){
		this.aab015=aab015;
	}
	
	/**
	 * @return 法定代表人电话
	 */
	public java.lang.String getAab015(){
		return this.aab015;
	}
	
	/**
	 * @param aab019 单位类型
	 */
	public void setAab019(java.lang.String aab019){
		this.aab019=aab019;
	}
	
	/**
	 * @return 单位类型
	 */
	public java.lang.String getAab019(){
		return this.aab019;
	}
	
	/**
	 * @param aab020 经济类型
	 */
	public void setAab020(java.lang.String aab020){
		this.aab020=aab020;
	}
	
	/**
	 * @return 经济类型
	 */
	public java.lang.String getAab020(){
		return this.aab020;
	}
	
	/**
	 * @param aaa130 国别代码
	 */
	public void setAaa130(java.lang.String aaa130){
		this.aaa130=aaa130;
	}
	
	/**
	 * @return 国别代码
	 */
	public java.lang.String getAaa130(){
		return this.aaa130;
	}
	
	/**
	 * @param aab021 隶属关系
	 */
	public void setAab021(java.lang.String aab021){
		this.aab021=aab021;
	}
	
	/**
	 * @return 隶属关系
	 */
	public java.lang.String getAab021(){
		return this.aab021;
	}
	
	/**
	 * @param yab401 行业大类代码
	 */
	public void setYab401(java.lang.String yab401){
		this.yab401=yab401;
	}
	
	/**
	 * @return 行业大类代码
	 */
	public java.lang.String getYab401(){
		return this.yab401;
	}
	
	/**
	 * @param aab022 行业小类代码
	 */
	public void setAab022(java.lang.String aab022){
		this.aab022=aab022;
	}
	
	/**
	 * @return 行业小类代码
	 */
	public java.lang.String getAab022(){
		return this.aab022;
	}
	
	/**
	 * @param aab023 主管部门
	 */
	public void setAab023(java.lang.String aab023){
		this.aab023=aab023;
	}
	
	/**
	 * @return 主管部门
	 */
	public java.lang.String getAab023(){
		return this.aab023;
	}
	
	/**
	 * @param aab027 支付开户银行行号
	 */
	public void setAab027(java.lang.String aab027){
		this.aab027=aab027;
	}
	
	/**
	 * @return 支付开户银行行号
	 */
	public java.lang.String getAab027(){
		return this.aab027;
	}
	
	/**
	 * @param aab028 支付银行户名
	 */
	public void setAab028(java.lang.String aab028){
		this.aab028=aab028;
	}
	
	/**
	 * @return 支付银行户名
	 */
	public java.lang.String getAab028(){
		return this.aab028;
	}
	
	/**
	 * @param aab029 支付银行基本帐号
	 */
	public void setAab029(java.lang.String aab029){
		this.aab029=aab029;
	}
	
	/**
	 * @return 支付银行基本帐号
	 */
	public java.lang.String getAab029(){
		return this.aab029;
	}
	
	/**
	 * @param aab030 地税号
	 */
	public void setAab030(java.lang.String aab030){
		this.aab030=aab030;
	}
	
	/**
	 * @return 地税号
	 */
	public java.lang.String getAab030(){
		return this.aab030;
	}
	
	/**
	 * @param aab031 地税机构编号
	 */
	public void setAab031(java.lang.String aab031){
		this.aab031=aab031;
	}
	
	/**
	 * @return 地税机构编号
	 */
	public java.lang.String getAab031(){
		return this.aab031;
	}
	
	/**
	 * @param aab032 地税发证机关
	 */
	public void setAab032(java.lang.String aab032){
		this.aab032=aab032;
	}
	
	/**
	 * @return 地税发证机关
	 */
	public java.lang.String getAab032(){
		return this.aab032;
	}
	
	/**
	 * @param yab002 地区代码
	 */
	public void setYab002(java.lang.String yab002){
		this.yab002=yab002;
	}
	
	/**
	 * @return 地区代码
	 */
	public java.lang.String getYab002(){
		return this.yab002;
	}
	
	/**
	 * @param yab074 改制企业标志
	 */
	public void setYab074(java.lang.String yab074){
		this.yab074=yab074;
	}
	
	/**
	 * @return 改制企业标志
	 */
	public java.lang.String getYab074(){
		return this.yab074;
	}
	
	/**
	 * @param yab075 改制时间
	 */
	public void setYab075(java.sql.Timestamp yab075){
		this.yab075=yab075;
	}
	
	/**
	 * @return 改制时间
	 */
	public java.sql.Timestamp getYab075(){
		return this.yab075;
	}
	
	/**
	 * @param aae004 联系人
	 */
	public void setAae004(java.lang.String aae004){
		this.aae004=aae004;
	}
	
	/**
	 * @return 联系人
	 */
	public java.lang.String getAae004(){
		return this.aae004;
	}
	
	/**
	 * @param aae005 联系电话
	 */
	public void setAae005(java.lang.String aae005){
		this.aae005=aae005;
	}
	
	/**
	 * @return 联系电话
	 */
	public java.lang.String getAae005(){
		return this.aae005;
	}
	
	/**
	 * @param aae014 传真
	 */
	public void setAae014(java.lang.String aae014){
		this.aae014=aae014;
	}
	
	/**
	 * @return 传真
	 */
	public java.lang.String getAae014(){
		return this.aae014;
	}
	
	/**
	 * @param aae015 电子信箱
	 */
	public void setAae015(java.lang.String aae015){
		this.aae015=aae015;
	}
	
	/**
	 * @return 电子信箱
	 */
	public java.lang.String getAae015(){
		return this.aae015;
	}
	
	/**
	 * @param aae016 网址
	 */
	public void setAae016(java.lang.String aae016){
		this.aae016=aae016;
	}
	
	/**
	 * @return 网址
	 */
	public java.lang.String getAae016(){
		return this.aae016;
	}
	
	/**
	 * @param aab039 用工登记证号
	 */
	public void setAab039(java.lang.String aab039){
		this.aab039=aab039;
	}
	
	/**
	 * @return 用工登记证号
	 */
	public java.lang.String getAab039(){
		return this.aab039;
	}
	
	/**
	 * @param aab057 事业单位类型
	 */
	public void setAab057(java.lang.String aab057){
		this.aab057=aab057;
	}
	
	/**
	 * @return 事业单位类型
	 */
	public java.lang.String getAab057(){
		return this.aab057;
	}
	
	/**
	 * @param aab045 主办部门
	 */
	public void setAab045(java.lang.String aab045){
		this.aab045=aab045;
	}
	
	/**
	 * @return 主办部门
	 */
	public java.lang.String getAab045(){
		return this.aab045;
	}
	
	/**
	 * @param aab054 产业类别
	 */
	public void setAab054(java.lang.String aab054){
		this.aab054=aab054;
	}
	
	/**
	 * @return 产业类别
	 */
	public java.lang.String getAab054(){
		return this.aab054;
	}
	
	/**
	 * @param aab049 注册资金
	 */
	public void setAab049(java.lang.String aab049){
		this.aab049=aab049;
	}
	
	/**
	 * @return 注册资金
	 */
	public java.lang.String getAab049(){
		return this.aab049;
	}
	
	/**
	 * @param aab048 经营方式（正规五类企业）
	 */
	public void setAab048(java.lang.String aab048){
		this.aab048=aab048;
	}
	
	/**
	 * @return 经营方式（正规五类企业）
	 */
	public java.lang.String getAab048(){
		return this.aab048;
	}
	
	/**
	 * @param aab052 主营范围（正规五类企业）
	 */
	public void setAab052(java.lang.String aab052){
		this.aab052=aab052;
	}
	
	/**
	 * @return 主营范围（正规五类企业）
	 */
	public java.lang.String getAab052(){
		return this.aab052;
	}
	
	/**
	 * @param aab053 兼营范围（正规五类企业）
	 */
	public void setAab053(java.lang.String aab053){
		this.aab053=aab053;
	}
	
	/**
	 * @return 兼营范围（正规五类企业）
	 */
	public java.lang.String getAab053(){
		return this.aab053;
	}
	
	/**
	 * @param aae008 银行代码
	 */
	public void setAae008(java.lang.String aae008){
		this.aae008=aae008;
	}
	
	/**
	 * @return 银行代码
	 */
	public java.lang.String getAae008(){
		return this.aae008;
	}
	
	/**
	 * @param aae009 银行户名
	 */
	public void setAae009(java.lang.String aae009){
		this.aae009=aae009;
	}
	
	/**
	 * @return 银行户名
	 */
	public java.lang.String getAae009(){
		return this.aae009;
	}
	
	/**
	 * @param aae010 银行帐号
	 */
	public void setAae010(java.lang.String aae010){
		this.aae010=aae010;
	}
	
	/**
	 * @return 银行帐号
	 */
	public java.lang.String getAae010(){
		return this.aae010;
	}
	
	/**
	 * @param aae011 经办人
	 */
	public void setAae011(java.lang.String aae011){
		this.aae011=aae011;
	}
	
	/**
	 * @return 经办人
	 */
	public java.lang.String getAae011(){
		return this.aae011;
	}
	
	/**
	 * @param yae116 操作人员号（经办人）
	 */
	public void setYae116(java.lang.String yae116){
		this.yae116=yae116;
	}
	
	/**
	 * @return 操作人员号（经办人）
	 */
	public java.lang.String getYae116(){
		return this.yae116;
	}
	
	/**
	 * @param aae017 经办机构
	 */
	public void setAae017(java.lang.String aae017){
		this.aae017=aae017;
	}
	
	/**
	 * @return 经办机构
	 */
	public java.lang.String getAae017(){
		return this.aae017;
	}
	
	/**
	 * @param aae036 经办日期
	 */
	public void setAae036(java.sql.Timestamp aae036){
		this.aae036=aae036;
	}
	
	/**
	 * @return 经办日期
	 */
	public java.sql.Timestamp getAae036(){
		return this.aae036;
	}
	
	/**
	 * @param aae013 备注
	 */
	public void setAae013(java.lang.String aae013){
		this.aae013=aae013;
	}
	
	/**
	 * @return 备注
	 */
	public java.lang.String getAae013(){
		return this.aae013;
	}
	
	/**
	 * @param aae012 审批人
	 */
	public void setAae012(java.lang.String aae012){
		this.aae012=aae012;
	}
	
	/**
	 * @return 审批人
	 */
	public java.lang.String getAae012(){
		return this.aae012;
	}
	
	/**
	 * @param yae405 操作人员号（审批人）
	 */
	public void setYae405(java.lang.String yae405){
		this.yae405=yae405;
	}
	
	/**
	 * @return 操作人员号（审批人）
	 */
	public java.lang.String getYae405(){
		return this.yae405;
	}
	
	/**
	 * @param yae401 审定机构
	 */
	public void setYae401(java.lang.String yae401){
		this.yae401=yae401;
	}
	
	/**
	 * @return 审定机构
	 */
	public java.lang.String getYae401(){
		return this.yae401;
	}
	
	/**
	 * @param aae034 审定日期
	 */
	public void setAae034(java.sql.Timestamp aae034){
		this.aae034=aae034;
	}
	
	/**
	 * @return 审定日期
	 */
	public java.sql.Timestamp getAae034(){
		return this.aae034;
	}
	
	/**
	 * @param yae420 审定状态
	 */
	public void setYae420(java.lang.String yae420){
		this.yae420=yae420;
	}
	
	/**
	 * @return 审定状态
	 */
	public java.lang.String getYae420(){
		return this.yae420;
	}
	
	/**
	 * @param aae163 时间戳
	 */
	public void setAae163(java.sql.Timestamp aae163){
		this.aae163=aae163;
	}
	
	/**
	 * @return 时间戳
	 */
	public java.sql.Timestamp getAae163(){
		return this.aae163;
	}
	
	/**
	 * @param aae119 单位状态
	 */
	public void setAae119(java.lang.String aae119){
		this.aae119=aae119;
	}
	
	/**
	 * @return 单位状态
	 */
	public java.lang.String getAae119(){
		return this.aae119;
	}
	
	/**
	 * @param yae430 注销人
	 */
	public void setYae430(java.lang.String yae430){
		this.yae430=yae430;
	}
	
	/**
	 * @return 注销人
	 */
	public java.lang.String getYae430(){
		return this.yae430;
	}
	
	/**
	 * @param yae435 操作人员号（注销人）
	 */
	public void setYae435(java.lang.String yae435){
		this.yae435=yae435;
	}
	
	/**
	 * @return 操作人员号（注销人）
	 */
	public java.lang.String getYae435(){
		return this.yae435;
	}
	
	/**
	 * @param yae431 注销时间
	 */
	public void setYae431(java.sql.Timestamp yae431){
		this.yae431=yae431;
	}
	
	/**
	 * @return 注销时间
	 */
	public java.sql.Timestamp getYae431(){
		return this.yae431;
	}
	
	/**
	 * @param yae432 注销就业机构
	 */
	public void setYae432(java.lang.String yae432){
		this.yae432=yae432;
	}
	
	/**
	 * @return 注销就业机构
	 */
	public java.lang.String getYae432(){
		return this.yae432;
	}
	
	/**
	 * @param yae433 注销原因
	 */
	public void setYae433(java.lang.String yae433){
		this.yae433=yae433;
	}
	
	/**
	 * @return 注销原因
	 */
	public java.lang.String getYae433(){
		return this.yae433;
	}
	
	/**
	 * @param yae437 最后修改人
	 */
	public void setYae437(java.lang.String yae437){
		this.yae437=yae437;
	}
	
	/**
	 * @return 最后修改人
	 */
	public java.lang.String getYae437(){
		return this.yae437;
	}
	
	/**
	 * @param yae439 最后修改人编号
	 */
	public void setYae439(java.lang.String yae439){
		this.yae439=yae439;
	}
	
	/**
	 * @return 最后修改人编号
	 */
	public java.lang.String getYae439(){
		return this.yae439;
	}
	
	/**
	 * @param yae441 最后修改人机构
	 */
	public void setYae441(java.lang.String yae441){
		this.yae441=yae441;
	}
	
	/**
	 * @return 最后修改人机构
	 */
	public java.lang.String getYae441(){
		return this.yae441;
	}
	
	/**
	 * @param yae442 最后修改时间
	 */
	public void setYae442(java.sql.Timestamp yae442){
		this.yae442=yae442;
	}
	
	/**
	 * @return 最后修改时间
	 */
	public java.sql.Timestamp getYae442(){
		return this.yae442;
	}
	
	/**
	 * @param yab403 国税号
	 */
	public void setYab403(java.lang.String yab403){
		this.yab403=yab403;
	}
	
	/**
	 * @return 国税号
	 */
	public java.lang.String getYab403(){
		return this.yab403;
	}
	
	/**
	 * @param yab404 国税机构编号
	 */
	public void setYab404(java.lang.String yab404){
		this.yab404=yab404;
	}
	
	/**
	 * @return 国税机构编号
	 */
	public java.lang.String getYab404(){
		return this.yab404;
	}
	
	/**
	 * @param yab405 国税发证机关
	 */
	public void setYab405(java.lang.String yab405){
		this.yab405=yab405;
	}
	
	/**
	 * @return 国税发证机关
	 */
	public java.lang.String getYab405(){
		return this.yab405;
	}
	
	/**
	 * @param aab056 人员规模
	 */
	public void setAab056(java.lang.String aab056){
		this.aab056=aab056;
	}
	
	/**
	 * @return 人员规模
	 */
	public java.lang.String getAab056(){
		return this.aab056;
	}
	
	/**
	 * @param yab01c 劳动保障业务联系部门
	 */
	public void setYab01c(java.lang.String yab01c){
		this.yab01c=yab01c;
	}
	
	/**
	 * @return 劳动保障业务联系部门
	 */
	public java.lang.String getYab01c(){
		return this.yab01c;
	}
	
	/**
	 * @param yab01d 劳动保障业务联系人姓名
	 */
	public void setYab01d(java.lang.String yab01d){
		this.yab01d=yab01d;
	}
	
	/**
	 * @return 劳动保障业务联系人姓名
	 */
	public java.lang.String getYab01d(){
		return this.yab01d;
	}
	
	/**
	 * @param yab01e 劳动保障业务联系人职务
	 */
	public void setYab01e(java.lang.String yab01e){
		this.yab01e=yab01e;
	}
	
	/**
	 * @return 劳动保障业务联系人职务
	 */
	public java.lang.String getYab01e(){
		return this.yab01e;
	}
	
	/**
	 * @param yab01f 劳动保障业务联系电话
	 */
	public void setYab01f(java.lang.String yab01f){
		this.yab01f=yab01f;
	}
	
	/**
	 * @return 劳动保障业务联系电话
	 */
	public java.lang.String getYab01f(){
		return this.yab01f;
	}
	
	/**
	 * @param yab01h 登记机关
	 */
	public void setYab01h(java.lang.String yab01h){
		this.yab01h=yab01h;
	}
	
	/**
	 * @return 登记机关
	 */
	public java.lang.String getYab01h(){
		return this.yab01h;
	}
	
	/**
	 * @param yab01i 登记发照日期
	 */
	public void setYab01i(java.sql.Timestamp yab01i){
		this.yab01i=yab01i;
	}
	
	/**
	 * @return 登记发照日期
	 */
	public java.sql.Timestamp getYab01i(){
		return this.yab01i;
	}
	
	/**
	 * @param yab01j 登记有效日期
	 */
	public void setYab01j(java.sql.Timestamp yab01j){
		this.yab01j=yab01j;
	}
	
	/**
	 * @return 登记有效日期
	 */
	public java.sql.Timestamp getYab01j(){
		return this.yab01j;
	}
	
	/**
	 * @param yab01k 行业准入批准单位
	 */
	public void setYab01k(java.lang.String yab01k){
		this.yab01k=yab01k;
	}
	
	/**
	 * @return 行业准入批准单位
	 */
	public java.lang.String getYab01k(){
		return this.yab01k;
	}
	
	/**
	 * @param yab01l 行业准入批准级别
	 */
	public void setYab01l(java.lang.String yab01l){
		this.yab01l=yab01l;
	}
	
	/**
	 * @return 行业准入批准级别
	 */
	public java.lang.String getYab01l(){
		return this.yab01l;
	}
	
	/**
	 * @param yab01m 发证日期
	 */
	public void setYab01m(java.sql.Timestamp yab01m){
		this.yab01m=yab01m;
	}
	
	/**
	 * @return 发证日期
	 */
	public java.sql.Timestamp getYab01m(){
		return this.yab01m;
	}
	
	/**
	 * @param yab01o 批准日期
	 */
	public void setYab01o(java.sql.Timestamp yab01o){
		this.yab01o=yab01o;
	}
	
	/**
	 * @return 批准日期
	 */
	public java.sql.Timestamp getYab01o(){
		return this.yab01o;
	}
	
	/**
	 * @param yab01p 有效日期
	 */
	public void setYab01p(java.sql.Timestamp yab01p){
		this.yab01p=yab01p;
	}
	
	/**
	 * @return 有效日期
	 */
	public java.sql.Timestamp getYab01p(){
		return this.yab01p;
	}
	
	/**
	 * @param yab015 税务计算机代码
	 */
	public void setYab015(java.lang.String yab015){
		this.yab015=yab015;
	}
	
	/**
	 * @return 税务计算机代码
	 */
	public java.lang.String getYab015(){
		return this.yab015;
	}
	
	/**
	 * @param aab036 社保保险登记证发证日期
	 */
	public void setAab036(java.sql.Timestamp aab036){
		this.aab036=aab036;
	}
	
	/**
	 * @return 社保保险登记证发证日期
	 */
	public java.sql.Timestamp getAab036(){
		return this.aab036;
	}
	
	/**
	 * @param yab011 养老工伤生育单位编号
	 */
	public void setYab011(java.lang.String yab011){
		this.yab011=yab011;
	}
	
	/**
	 * @return 养老工伤生育单位编号
	 */
	public java.lang.String getYab011(){
		return this.yab011;
	}
	
	/**
	 * @param yab012 医保单位编号
	 */
	public void setYab012(java.lang.String yab012){
		this.yab012=yab012;
	}
	
	/**
	 * @return 医保单位编号
	 */
	public java.lang.String getYab012(){
		return this.yab012;
	}
	
	/**
	 * @param aab016 保险专管员姓名
	 */
	public void setAab016(java.lang.String aab016){
		this.aab016=aab016;
	}
	
	/**
	 * @return 保险专管员姓名
	 */
	public java.lang.String getAab016(){
		return this.aab016;
	}
	
	/**
	 * @param aab017 保险专管员所在部门
	 */
	public void setAab017(java.lang.String aab017){
		this.aab017=aab017;
	}
	
	/**
	 * @return 保险专管员所在部门
	 */
	public java.lang.String getAab017(){
		return this.aab017;
	}
	
	/**
	 * @param aab018 保险专管员联系电话
	 */
	public void setAab018(java.lang.String aab018){
		this.aab018=aab018;
	}
	
	/**
	 * @return 保险专管员联系电话
	 */
	public java.lang.String getAab018(){
		return this.aab018;
	}
	
	/**
	 * @param yab019 劳动保障执法年审编号
	 */
	public void setYab019(java.lang.String yab019){
		this.yab019=yab019;
	}
	
	/**
	 * @return 劳动保障执法年审编号
	 */
	public java.lang.String getYab019(){
		return this.yab019;
	}
	public void setAab008_start(String aab008_start){
		this.aab008_start=aab008_start;
	}
	public String getAab008_start(){
		return this.aab008_start;
	}
	public void setAab008_end(String aab008_end){
		this.aab008_end=aab008_end;
	}
	public String getAab008_end(){
		return this.aab008_end;
	}
	public void setAab011_start(String aab011_start){
		this.aab011_start=aab011_start;
	}
	public String getAab011_start(){
		return this.aab011_start;
	}
	public void setAab011_end(String aab011_end){
		this.aab011_end=aab011_end;
	}
	public String getAab011_end(){
		return this.aab011_end;
	}
	public void setYab075_start(String yab075_start){
		this.yab075_start=yab075_start;
	}
	public String getYab075_start(){
		return this.yab075_start;
	}
	public void setYab075_end(String yab075_end){
		this.yab075_end=yab075_end;
	}
	public String getYab075_end(){
		return this.yab075_end;
	}
	public void setAae036_start(String aae036_start){
		this.aae036_start=aae036_start;
	}
	public String getAae036_start(){
		return this.aae036_start;
	}
	public void setAae036_end(String aae036_end){
		this.aae036_end=aae036_end;
	}
	public String getAae036_end(){
		return this.aae036_end;
	}
	public void setAae034_start(String aae034_start){
		this.aae034_start=aae034_start;
	}
	public String getAae034_start(){
		return this.aae034_start;
	}
	public void setAae034_end(String aae034_end){
		this.aae034_end=aae034_end;
	}
	public String getAae034_end(){
		return this.aae034_end;
	}
	public void setYae431_start(String yae431_start){
		this.yae431_start=yae431_start;
	}
	public String getYae431_start(){
		return this.yae431_start;
	}
	public void setYae431_end(String yae431_end){
		this.yae431_end=yae431_end;
	}
	public String getYae431_end(){
		return this.yae431_end;
	}
	public void setYae442_start(String yae442_start){
		this.yae442_start=yae442_start;
	}
	public String getYae442_start(){
		return this.yae442_start;
	}
	public void setYae442_end(String yae442_end){
		this.yae442_end=yae442_end;
	}
	public String getYae442_end(){
		return this.yae442_end;
	}
	public void setYab01i_start(String yab01i_start){
		this.yab01i_start=yab01i_start;
	}
	public String getYab01i_start(){
		return this.yab01i_start;
	}
	public void setYab01i_end(String yab01i_end){
		this.yab01i_end=yab01i_end;
	}
	public String getYab01i_end(){
		return this.yab01i_end;
	}
	public void setYab01j_start(String yab01j_start){
		this.yab01j_start=yab01j_start;
	}
	public String getYab01j_start(){
		return this.yab01j_start;
	}
	public void setYab01j_end(String yab01j_end){
		this.yab01j_end=yab01j_end;
	}
	public String getYab01j_end(){
		return this.yab01j_end;
	}
	public void setYab01m_start(String yab01m_start){
		this.yab01m_start=yab01m_start;
	}
	public String getYab01m_start(){
		return this.yab01m_start;
	}
	public void setYab01m_end(String yab01m_end){
		this.yab01m_end=yab01m_end;
	}
	public String getYab01m_end(){
		return this.yab01m_end;
	}
	public void setYab01o_start(String yab01o_start){
		this.yab01o_start=yab01o_start;
	}
	public String getYab01o_start(){
		return this.yab01o_start;
	}
	public void setYab01o_end(String yab01o_end){
		this.yab01o_end=yab01o_end;
	}
	public String getYab01o_end(){
		return this.yab01o_end;
	}
	public void setYab01p_start(String yab01p_start){
		this.yab01p_start=yab01p_start;
	}
	public String getYab01p_start(){
		return this.yab01p_start;
	}
	public void setYab01p_end(String yab01p_end){
		this.yab01p_end=yab01p_end;
	}
	public String getYab01p_end(){
		return this.yab01p_end;
	}
	public void setAab036_start(String aab036_start){
		this.aab036_start=aab036_start;
	}
	public String getAab036_start(){
		return this.aab036_start;
	}
	public void setAab036_end(String aab036_end){
		this.aab036_end=aab036_end;
	}
	public String getAab036_end(){
		return this.aab036_end;
	}

	/**
	* 打印本对象
	*/
	public String toString(){
		return new ToStringBuilder(this)
			.append("单位编号(aab001):",getAab001()+"\n")
			.append("工作单位编号(yab400):",getYab400()+"\n")
			.append("社保保险登记证编码(aab002):",getAab002()+"\n")
			.append("组织机构代码(aab003):",getAab003()+"\n")
			.append("单位名称(aab004):",getAab004()+"\n")
			.append("单位英文名称(aab041):",getAab041()+"\n")
			.append("单位简称(aab042):",getAab042()+"\n")
			.append("单位拼音码(aab043):",getAab043()+"\n")
			.append("单位电话(aab005):",getAab005()+"\n")
			.append("所属劳保所(yae422):",getYae422()+"\n")
			.append("地址(aae006):",getAae006()+"\n")
			.append("邮政编码(aae007):",getAae007()+"\n")
			.append("行政区划名称(aaa021):",getAaa021()+"\n")
			.append("所在地行政区划代码(aab301):",getAab301()+"\n")
			.append("工商登记执照种类(aab006):",getAab006()+"\n")
			.append("工商登记执照号码(aab007):",getAab007()+"\n")
			.append("工商登记发照日期(aab008):",getAab008()+"\n")
			.append("工商登记有效期限(年)(aab009):",getAab009()+"\n")
			.append("批准成立单位(aab010):",getAab010()+"\n")
			.append("批准日期(aab011):",getAab011()+"\n")
			.append("批准文号(aab012):",getAab012()+"\n")
			.append("法定代表人(aab013):",getAab013()+"\n")
			.append("法定代表人公民身份号码(aab014):",getAab014()+"\n")
			.append("法定代表人电话(aab015):",getAab015()+"\n")
			.append("单位类型(aab019):",getAab019()+"\n")
			.append("经济类型(aab020):",getAab020()+"\n")
			.append("国别代码(aaa130):",getAaa130()+"\n")
			.append("隶属关系(aab021):",getAab021()+"\n")
			.append("行业大类代码(yab401):",getYab401()+"\n")
			.append("行业小类代码(aab022):",getAab022()+"\n")
			.append("主管部门(aab023):",getAab023()+"\n")
			.append("支付开户银行行号(aab027):",getAab027()+"\n")
			.append("支付银行户名(aab028):",getAab028()+"\n")
			.append("支付银行基本帐号(aab029):",getAab029()+"\n")
			.append("地税号(aab030):",getAab030()+"\n")
			.append("地税机构编号(aab031):",getAab031()+"\n")
			.append("地税发证机关(aab032):",getAab032()+"\n")
			.append("地区代码(yab002):",getYab002()+"\n")
			.append("改制企业标志(yab074):",getYab074()+"\n")
			.append("改制时间(yab075):",getYab075()+"\n")
			.append("联系人(aae004):",getAae004()+"\n")
			.append("联系电话(aae005):",getAae005()+"\n")
			.append("传真(aae014):",getAae014()+"\n")
			.append("电子信箱(aae015):",getAae015()+"\n")
			.append("网址(aae016):",getAae016()+"\n")
			.append("用工登记证号(aab039):",getAab039()+"\n")
			.append("事业单位类型(aab057):",getAab057()+"\n")
			.append("主办部门(aab045):",getAab045()+"\n")
			.append("产业类别(aab054):",getAab054()+"\n")
			.append("注册资金(aab049):",getAab049()+"\n")
			.append("经营方式（正规五类企业）(aab048):",getAab048()+"\n")
			.append("主营范围（正规五类企业）(aab052):",getAab052()+"\n")
			.append("兼营范围（正规五类企业）(aab053):",getAab053()+"\n")
			.append("银行代码(aae008):",getAae008()+"\n")
			.append("银行户名(aae009):",getAae009()+"\n")
			.append("银行帐号(aae010):",getAae010()+"\n")
			.append("经办人(aae011):",getAae011()+"\n")
			.append("操作人员号（经办人）(yae116):",getYae116()+"\n")
			.append("经办机构(aae017):",getAae017()+"\n")
			.append("经办日期(aae036):",getAae036()+"\n")
			.append("备注(aae013):",getAae013()+"\n")
			.append("审批人(aae012):",getAae012()+"\n")
			.append("操作人员号（审批人）(yae405):",getYae405()+"\n")
			.append("审定机构(yae401):",getYae401()+"\n")
			.append("审定日期(aae034):",getAae034()+"\n")
			.append("审定状态(yae420):",getYae420()+"\n")
			.append("时间戳(aae163):",getAae163()+"\n")
			.append("单位状态(aae119):",getAae119()+"\n")
			.append("注销人(yae430):",getYae430()+"\n")
			.append("操作人员号（注销人）(yae435):",getYae435()+"\n")
			.append("注销时间(yae431):",getYae431()+"\n")
			.append("注销就业机构(yae432):",getYae432()+"\n")
			.append("注销原因(yae433):",getYae433()+"\n")
			.append("最后修改人(yae437):",getYae437()+"\n")
			.append("最后修改人编号(yae439):",getYae439()+"\n")
			.append("最后修改人机构(yae441):",getYae441()+"\n")
			.append("最后修改时间(yae442):",getYae442()+"\n")
			.append("国税号(yab403):",getYab403()+"\n")
			.append("国税机构编号(yab404):",getYab404()+"\n")
			.append("国税发证机关(yab405):",getYab405()+"\n")
			.append("人员规模(aab056):",getAab056()+"\n")
			.append("劳动保障业务联系部门(yab01c):",getYab01c()+"\n")
			.append("劳动保障业务联系人姓名(yab01d):",getYab01d()+"\n")
			.append("劳动保障业务联系人职务(yab01e):",getYab01e()+"\n")
			.append("劳动保障业务联系电话(yab01f):",getYab01f()+"\n")
			.append("登记机关(yab01h):",getYab01h()+"\n")
			.append("登记发照日期(yab01i):",getYab01i()+"\n")
			.append("登记有效日期(yab01j):",getYab01j()+"\n")
			.append("行业准入批准单位(yab01k):",getYab01k()+"\n")
			.append("行业准入批准级别(yab01l):",getYab01l()+"\n")
			.append("发证日期(yab01m):",getYab01m()+"\n")
			.append("批准日期(yab01o):",getYab01o()+"\n")
			.append("有效日期(yab01p):",getYab01p()+"\n")
			.append("税务计算机代码(yab015):",getYab015()+"\n")
			.append("社保保险登记证发证日期(aab036):",getAab036()+"\n")
			.append("养老工伤生育单位编号(yab011):",getYab011()+"\n")
			.append("医保单位编号(yab012):",getYab012()+"\n")
			.append("保险专管员姓名(aab016):",getAab016()+"\n")
			.append("保险专管员所在部门(aab017):",getAab017()+"\n")
			.append("保险专管员联系电话(aab018):",getAab018()+"\n")
			.append("劳动保障执法年审编号(yab019):",getYab019()+"\n")
			.toString();
	}

	/**
	 * 转换为map对象
	 * @return Map
	 */
	public java.util.Map toMap(){
	  java.util.Map map = new java.util.HashMap();
	  map.put("aab001", getAab001());    //单位编号
	  map.put("yab400", getYab400());    //工作单位编号
	  map.put("aab002", getAab002());    //社保保险登记证编码
	  map.put("aab003", getAab003());    //组织机构代码
	  map.put("aab004", getAab004());    //单位名称
	  map.put("aab041", getAab041());    //单位英文名称
	  map.put("aab042", getAab042());    //单位简称
	  map.put("aab043", getAab043());    //单位拼音码
	  map.put("aab005", getAab005());    //单位电话
	  map.put("yae422", getYae422());    //所属劳保所
	  map.put("aae006", getAae006());    //地址
	  map.put("aae007", getAae007());    //邮政编码
	  map.put("aaa021", getAaa021());    //行政区划名称
	  map.put("aab301", getAab301());    //所在地行政区划代码
	  map.put("aab006", getAab006());    //工商登记执照种类
	  map.put("aab007", getAab007());    //工商登记执照号码
	  map.put("aab008", getAab008());    //工商登记发照日期
	  map.put("aab009", getAab009());    //工商登记有效期限(年)
	  map.put("aab010", getAab010());    //批准成立单位
	  map.put("aab011", getAab011());    //批准日期
	  map.put("aab012", getAab012());    //批准文号
	  map.put("aab013", getAab013());    //法定代表人
	  map.put("aab014", getAab014());    //法定代表人公民身份号码
	  map.put("aab015", getAab015());    //法定代表人电话
	  map.put("aab019", getAab019());    //单位类型
	  map.put("aab020", getAab020());    //经济类型
	  map.put("aaa130", getAaa130());    //国别代码
	  map.put("aab021", getAab021());    //隶属关系
	  map.put("yab401", getYab401());    //行业大类代码
	  map.put("aab022", getAab022());    //行业小类代码
	  map.put("aab023", getAab023());    //主管部门
	  map.put("aab027", getAab027());    //支付开户银行行号
	  map.put("aab028", getAab028());    //支付银行户名
	  map.put("aab029", getAab029());    //支付银行基本帐号
	  map.put("aab030", getAab030());    //地税号
	  map.put("aab031", getAab031());    //地税机构编号
	  map.put("aab032", getAab032());    //地税发证机关
	  map.put("yab002", getYab002());    //地区代码
	  map.put("yab074", getYab074());    //改制企业标志
	  map.put("yab075", getYab075());    //改制时间
	  map.put("aae004", getAae004());    //联系人
	  map.put("aae005", getAae005());    //联系电话
	  map.put("aae014", getAae014());    //传真
	  map.put("aae015", getAae015());    //电子信箱
	  map.put("aae016", getAae016());    //网址
	  map.put("aab039", getAab039());    //用工登记证号
	  map.put("aab057", getAab057());    //事业单位类型
	  map.put("aab045", getAab045());    //主办部门
	  map.put("aab054", getAab054());    //产业类别
	  map.put("aab049", getAab049());    //注册资金
	  map.put("aab048", getAab048());    //经营方式（正规五类企业）
	  map.put("aab052", getAab052());    //主营范围（正规五类企业）
	  map.put("aab053", getAab053());    //兼营范围（正规五类企业）
	  map.put("aae008", getAae008());    //银行代码
	  map.put("aae009", getAae009());    //银行户名
	  map.put("aae010", getAae010());    //银行帐号
	  map.put("aae011", getAae011());    //经办人
	  map.put("yae116", getYae116());    //操作人员号（经办人）
	  map.put("aae017", getAae017());    //经办机构
	  map.put("aae036", getAae036());    //经办日期
	  map.put("aae013", getAae013());    //备注
	  map.put("aae012", getAae012());    //审批人
	  map.put("yae405", getYae405());    //操作人员号（审批人）
	  map.put("yae401", getYae401());    //审定机构
	  map.put("aae034", getAae034());    //审定日期
	  map.put("yae420", getYae420());    //审定状态
	  map.put("aae163", getAae163());    //时间戳
	  map.put("aae119", getAae119());    //单位状态
	  map.put("yae430", getYae430());    //注销人
	  map.put("yae435", getYae435());    //操作人员号（注销人）
	  map.put("yae431", getYae431());    //注销时间
	  map.put("yae432", getYae432());    //注销就业机构
	  map.put("yae433", getYae433());    //注销原因
	  map.put("yae437", getYae437());    //最后修改人
	  map.put("yae439", getYae439());    //最后修改人编号
	  map.put("yae441", getYae441());    //最后修改人机构
	  map.put("yae442", getYae442());    //最后修改时间
	  map.put("yab403", getYab403());    //国税号
	  map.put("yab404", getYab404());    //国税机构编号
	  map.put("yab405", getYab405());    //国税发证机关
	  map.put("aab056", getAab056());    //人员规模
	  map.put("yab01c", getYab01c());    //劳动保障业务联系部门
	  map.put("yab01d", getYab01d());    //劳动保障业务联系人姓名
	  map.put("yab01e", getYab01e());    //劳动保障业务联系人职务
	  map.put("yab01f", getYab01f());    //劳动保障业务联系电话
	  map.put("yab01h", getYab01h());    //登记机关
	  map.put("yab01i", getYab01i());    //登记发照日期
	  map.put("yab01j", getYab01j());    //登记有效日期
	  map.put("yab01k", getYab01k());    //行业准入批准单位
	  map.put("yab01l", getYab01l());    //行业准入批准级别
	  map.put("yab01m", getYab01m());    //发证日期
	  map.put("yab01o", getYab01o());    //批准日期
	  map.put("yab01p", getYab01p());    //有效日期
	  map.put("yab015", getYab015());    //税务计算机代码
	  map.put("aab036", getAab036());    //社保保险登记证发证日期
	  map.put("yab011", getYab011());    //养老工伤生育单位编号
	  map.put("yab012", getYab012());    //医保单位编号
	  map.put("aab016", getAab016());    //保险专管员姓名
	  map.put("aab017", getAab017());    //保险专管员所在部门
	  map.put("aab018", getAab018());    //保险专管员联系电话
	  map.put("yab019", getYab019());    //劳动保障执法年审编号
	
	  return map;
	}

	
}