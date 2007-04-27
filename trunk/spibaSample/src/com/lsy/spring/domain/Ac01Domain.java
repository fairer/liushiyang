/**
* 文件：Ac01Domain.java   
* 版本：1.0.0
* 日期：2006-09-04 19:59:24
* Copyright &reg; 2005 YINHAI Software Co. Ltd.
* All right reserved.
*/

package com.lsy.spring.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * <p>Title: </p>
 * <p>Description: ac01 个人基本信息表 领域对象 </p>
 * <p>Copyright: Copyright &reg; 2005 YINHAI Software Co. Ltd.</p>
 * <p>Company: 四川银海软件有限责任公司</p>
 * @author 银海LEMIS开发项目组 江波
 * @version 1.0
 */

public class Ac01Domain
	implements java.io.Serializable{

	public Ac01Domain(){
	}
	
	 /** 
	  *个人编号 
	 **/ 
	 private java.lang.String      aac001;    
	 
	 /** 
	  *失业编号 
	 **/ 
	 private java.lang.String      ycc0r0; 
	
	 /** 
	  *公民身份号码 
	 **/ 
	 private java.lang.String      aac002;    
	
	 /** 
	  *姓名 
	 **/ 
	 private java.lang.String      aac003;    
	
	 /** 
	  *个人拼音码 
	 **/ 
	 private java.lang.String      aac022;    
	
	 /** 
	  *个人英文名称 
	 **/ 
	 private java.lang.String      aac023;    
	
	 /** 
	  *性别 
	 **/ 
	 private java.lang.String      aac004;    
	
	 /** 
	  *民族 
	 **/ 
	 private java.lang.String      aac005;    
	
	 /** 
	  *政治面貌 
	 **/ 
	 private java.lang.String      aac024;    
	
	 /** 
	  *出生日期 
	 **/ 
	 private java.sql.Timestamp    aac006;    
	
	 /** 
	  *参加工作日期 
	 **/ 
	 private java.sql.Timestamp    aac007;    
	
	 /** 
	  *所属劳保所 
	 **/ 
	 private java.lang.String      yae422;    
	
	 /** 
	  *户口性质 
	 **/ 
	 private java.lang.String      aac009;    
	
	 /** 
	  *户口所在地 
	 **/ 
	 private java.lang.String      aac010;    
	
	 /** 
	  *所在地行政区划代码 
	 **/ 
	 private java.lang.String      aab301;    
	
	 /** 
	  *出生地 
	 **/ 
	 private java.lang.String      aac025;    
	
	 /** 
	  *文化程度 
	 **/ 
	 private java.lang.String      aac011;    
	
	 /** 
	  *个人身份 
	 **/ 
	 private java.lang.String      aac012;    
	
	 /** 
	  *联系电话 
	 **/ 
	 private java.lang.String      aae005;    
	
	 /** 
	  *行政职务 
	 **/ 
	 private java.lang.String      aac020;    
	
	 /** 
	  *地址 
	 **/ 
	 private java.lang.String      aae006;    
	
	 /** 
	  *家庭住址 
	 **/ 
	 private java.lang.String      aac026;    
	
	 /** 
	  *邮政编码 
	 **/ 
	 private java.lang.String      aae007;    
	
	 /** 
	  *血型 
	 **/ 
	 private java.lang.String      aac032;    
	
	 /** 
	  *婚姻状况 
	 **/ 
	 private java.lang.String      aac017;    
	
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
	  *备注 
	 **/ 
	 private java.lang.String      aae013;    
	
	 /** 
	  *时间戳 
	 **/ 
	 private java.sql.Timestamp    aae163;    
	
	 /** 
	  *审定状态 
	 **/ 
	 private java.lang.String      yae420;    
	
	 /** 
	  *单位编号 
	 **/ 
	 private java.lang.String      aab001;    
	
	 /** 
	  *单位名称 
	 **/ 
	 private java.lang.String      aab004;    
	
	 /** 
	  *就业状态 
	 **/ 
	 private java.lang.String      aac016;    
	
	 /** 
	  *是否农转非人员 
	 **/ 
	 private java.lang.String      yac400;    
	
	 /** 
	  *就业方式 
	 **/ 
	 private java.lang.String      acc032;   
	 
	 /** 
	  *失业方式 
	 **/ 
	 private java.lang.String      acc033;
	
	 /** 
	  *人员类别 
	 **/ 
	 private java.lang.String      aac027;    
	
	 /** 
	  *再就业优惠证编号 
	 **/ 
	 private java.lang.String      acc101;    
	
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
	  *就失业变更流水号 
	 **/ 
	 private java.lang.String      yae436;    
	
	 /** 
	  *灵活就业方式 
	 **/ 
	 private java.lang.String      yac402;    
	
	 /** 
	  *公益性岗位类别 
	 **/ 
	 private java.lang.String      yac403;    
	
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
	  *单位所在地行政区划名称 
	 **/ 
	 private java.lang.String      aaa021;    
	
	 /** 
	  *专业技术职称 
	 **/ 
	 private java.lang.String      aac014;    
	
	 /** 
	  *职业资格登记 
	 **/ 
	 private java.lang.String      aac015;    
	
	 /** 
	  *用工形式 
	 **/ 
	 private java.lang.String      aac013;    
	
	 /** 
	  *农民工身份标识 
	 **/ 
	 private java.lang.String      aac028;    
	
	 /** 
	  *电子信箱 
	 **/ 
	 private java.lang.String      aae015;    
	
	 /** 
	  *身高 
	 **/ 
	 private java.math.BigDecimal  aac034;    
	
	 /** 
	  *体重 
	 **/ 
	 private java.math.BigDecimal  aac035;    
	
	 /** 
	  *视力 
	 **/ 
	 private java.lang.String      aac036;    
	
	 /** 
	  *家庭联系人 
	 **/ 
	 private java.lang.String      aae004;    
	
	 /** 
	  *家庭人口数 
	 **/ 
	 private java.lang.Integer     yac019;    
	
	 /** 
	  *家庭已就业人数 
	 **/ 
	 private java.lang.Integer     yac01a;    
	
	 /** 
	  *是否残疾人 
	 **/ 
	 private java.lang.String      yac01b;    
	
	 /** 
	  *是否复转军人 
	 **/ 
	 private java.lang.String      yac01c;    
	
	 /** 
	  *劳模级别 
	 **/ 
	 private java.lang.String      yac01d;    
	
	 /** 
	  *是否服刑人员 
	 **/ 
	 private java.lang.String      yac01e;    
	
	 /** 
	  *是否华侨 
	 **/ 
	 private java.lang.String      yac01f;    
	
	 /** 
	  *是否台胞 
	 **/ 
	 private java.lang.String      yac01g;    
	
	 /** 
	  *个人养老工伤生育编号 
	 **/ 
	 private java.lang.String      yac014;    
	
	 /** 
	  *个人医保编号 
	 **/ 
	 private java.lang.String      yac015;    
	
	 /** 
	  *社会保障卡号 
	 **/ 
	 private java.lang.String      yac01i;    
	
	 /** 
	  *个人诚信度 
	 **/ 
	 private java.lang.String      yac01h;    

	 private java.lang.String      aac006_start; //出生日期 开始日期aac006
	 private java.lang.String      aac006_end; //出生日期 结束日期aac006
	 private java.lang.String      aac007_start; //参加工作日期 开始日期aac007
	 private java.lang.String      aac007_end; //参加工作日期 结束日期aac007
	 private java.lang.String      aae036_start; //经办日期 开始日期aae036
	 private java.lang.String      aae036_end; //经办日期 结束日期aae036
	 private java.lang.String      aae034_start; //审定日期 开始日期aae034
	 private java.lang.String      aae034_end; //审定日期 结束日期aae034
	 private java.lang.String      yae431_start; //注销时间 开始日期yae431
	 private java.lang.String      yae431_end; //注销时间 结束日期yae431
	 private java.lang.String      yae442_start; //最后修改时间 开始日期yae442
	 private java.lang.String      yae442_end; //最后修改时间 结束日期yae442


	

	
	/**
	 * @param aac001 个人编号
	 */
	public void setAac001(java.lang.String aac001){
		this.aac001=aac001;
	}
	
	/**
	 * @return 个人编号
	 */
	public java.lang.String getAac001(){
		return this.aac001;
	}
	
	/**
	 * @param aac002 公民身份号码
	 */
	public void setAac002(java.lang.String aac002){
		this.aac002=aac002;
	}
	
	/**
	 * @return 公民身份号码
	 */
	public java.lang.String getAac002(){
		return this.aac002;
	}
	
	/**
	 * @param aac003 姓名
	 */
	public void setAac003(java.lang.String aac003){
		this.aac003=aac003;
	}
	
	/**
	 * @return 姓名
	 */
	public java.lang.String getAac003(){
		return this.aac003;
	}
	
	/**
	 * @param aac022 个人拼音码
	 */
	public void setAac022(java.lang.String aac022){
		this.aac022=aac022;
	}
	
	/**
	 * @return 个人拼音码
	 */
	public java.lang.String getAac022(){
		return this.aac022;
	}
	
	/**
	 * @param aac023 个人英文名称
	 */
	public void setAac023(java.lang.String aac023){
		this.aac023=aac023;
	}
	
	/**
	 * @return 个人英文名称
	 */
	public java.lang.String getAac023(){
		return this.aac023;
	}
	
	/**
	 * @param aac004 性别
	 */
	public void setAac004(java.lang.String aac004){
		this.aac004=aac004;
	}
	
	/**
	 * @return 性别
	 */
	public java.lang.String getAac004(){
		return this.aac004;
	}
	
	/**
	 * @param aac005 民族
	 */
	public void setAac005(java.lang.String aac005){
		this.aac005=aac005;
	}
	
	/**
	 * @return 民族
	 */
	public java.lang.String getAac005(){
		return this.aac005;
	}
	
	/**
	 * @param aac024 政治面貌
	 */
	public void setAac024(java.lang.String aac024){
		this.aac024=aac024;
	}
	
	/**
	 * @return 政治面貌
	 */
	public java.lang.String getAac024(){
		return this.aac024;
	}
	
	/**
	 * @param aac006 出生日期
	 */
	public void setAac006(java.sql.Timestamp aac006){
		this.aac006=aac006;
	}
	
	/**
	 * @return 出生日期
	 */
	public java.sql.Timestamp getAac006(){
		return this.aac006;
	}
	
	/**
	 * @param aac007 参加工作日期
	 */
	public void setAac007(java.sql.Timestamp aac007){
		this.aac007=aac007;
	}
	
	/**
	 * @return 参加工作日期
	 */
	public java.sql.Timestamp getAac007(){
		return this.aac007;
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
	 * @param aac009 户口性质
	 */
	public void setAac009(java.lang.String aac009){
		this.aac009=aac009;
	}
	
	/**
	 * @return 户口性质
	 */
	public java.lang.String getAac009(){
		return this.aac009;
	}
	
	/**
	 * @param aac010 户口所在地
	 */
	public void setAac010(java.lang.String aac010){
		this.aac010=aac010;
	}
	
	/**
	 * @return 户口所在地
	 */
	public java.lang.String getAac010(){
		return this.aac010;
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
	 * @param aac025 出生地
	 */
	public void setAac025(java.lang.String aac025){
		this.aac025=aac025;
	}
	
	/**
	 * @return 出生地
	 */
	public java.lang.String getAac025(){
		return this.aac025;
	}
	
	/**
	 * @param aac011 文化程度
	 */
	public void setAac011(java.lang.String aac011){
		this.aac011=aac011;
	}
	
	/**
	 * @return 文化程度
	 */
	public java.lang.String getAac011(){
		return this.aac011;
	}
	
	/**
	 * @param aac012 个人身份
	 */
	public void setAac012(java.lang.String aac012){
		this.aac012=aac012;
	}
	
	/**
	 * @return 个人身份
	 */
	public java.lang.String getAac012(){
		return this.aac012;
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
	 * @param aac020 行政职务
	 */
	public void setAac020(java.lang.String aac020){
		this.aac020=aac020;
	}
	
	/**
	 * @return 行政职务
	 */
	public java.lang.String getAac020(){
		return this.aac020;
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
	 * @param aac026 家庭住址
	 */
	public void setAac026(java.lang.String aac026){
		this.aac026=aac026;
	}
	
	/**
	 * @return 家庭住址
	 */
	public java.lang.String getAac026(){
		return this.aac026;
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
	 * @param aac032 血型
	 */
	public void setAac032(java.lang.String aac032){
		this.aac032=aac032;
	}
	
	/**
	 * @return 血型
	 */
	public java.lang.String getAac032(){
		return this.aac032;
	}
	
	/**
	 * @param aac017 婚姻状况
	 */
	public void setAac017(java.lang.String aac017){
		this.aac017=aac017;
	}
	
	/**
	 * @return 婚姻状况
	 */
	public java.lang.String getAac017(){
		return this.aac017;
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
	 * @param aac016 就业状态
	 */
	public void setAac016(java.lang.String aac016){
		this.aac016=aac016;
	}
	
	/**
	 * @return 就业状态
	 */
	public java.lang.String getAac016(){
		return this.aac016;
	}
	
	/**
	 * @param yac400 是否农转非人员
	 */
	public void setYac400(java.lang.String yac400){
		this.yac400=yac400;
	}
	
	/**
	 * @return 是否农转非人员
	 */
	public java.lang.String getYac400(){
		return this.yac400;
	}
	
	/**
	 * @param acc032 就业方式
	 */
	public void setAcc032(java.lang.String acc032){
		this.acc032=acc032;
	}
	
	/**
	 * @return 就业方式
	 */
	public java.lang.String getAcc032(){
		return this.acc032;
	}
	
	/**
	 * @param aac027 人员类别
	 */
	public void setAac027(java.lang.String aac027){
		this.aac027=aac027;
	}
	
	/**
	 * @return 人员类别
	 */
	public java.lang.String getAac027(){
		return this.aac027;
	}
	
	/**
	 * @param acc101 再就业优惠证编号
	 */
	public void setAcc101(java.lang.String acc101){
		this.acc101=acc101;
	}
	
	/**
	 * @return 再就业优惠证编号
	 */
	public java.lang.String getAcc101(){
		return this.acc101;
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
	 * @param yae436 就失业变更流水号
	 */
	public void setYae436(java.lang.String yae436){
		this.yae436=yae436;
	}
	
	/**
	 * @return 就失业变更流水号
	 */
	public java.lang.String getYae436(){
		return this.yae436;
	}
	
	/**
	 * @param yac402 灵活就业方式
	 */
	public void setYac402(java.lang.String yac402){
		this.yac402=yac402;
	}
	
	/**
	 * @return 灵活就业方式
	 */
	public java.lang.String getYac402(){
		return this.yac402;
	}
	
	/**
	 * @param yac403 公益性岗位类别
	 */
	public void setYac403(java.lang.String yac403){
		this.yac403=yac403;
	}
	
	/**
	 * @return 公益性岗位类别
	 */
	public java.lang.String getYac403(){
		return this.yac403;
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
	 * @param aaa021 单位所在地行政区划名称
	 */
	public void setAaa021(java.lang.String aaa021){
		this.aaa021=aaa021;
	}
	
	/**
	 * @return 单位所在地行政区划名称
	 */
	public java.lang.String getAaa021(){
		return this.aaa021;
	}
	
	/**
	 * @param aac014 专业技术职称
	 */
	public void setAac014(java.lang.String aac014){
		this.aac014=aac014;
	}
	
	/**
	 * @return 专业技术职称
	 */
	public java.lang.String getAac014(){
		return this.aac014;
	}
	
	/**
	 * @param aac015 职业资格登记
	 */
	public void setAac015(java.lang.String aac015){
		this.aac015=aac015;
	}
	
	/**
	 * @return 职业资格登记
	 */
	public java.lang.String getAac015(){
		return this.aac015;
	}
	
	/**
	 * @param aac013 用工形式
	 */
	public void setAac013(java.lang.String aac013){
		this.aac013=aac013;
	}
	
	/**
	 * @return 用工形式
	 */
	public java.lang.String getAac013(){
		return this.aac013;
	}
	
	/**
	 * @param aac028 农民工身份标识
	 */
	public void setAac028(java.lang.String aac028){
		this.aac028=aac028;
	}
	
	/**
	 * @return 农民工身份标识
	 */
	public java.lang.String getAac028(){
		return this.aac028;
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
	 * @param aac034 身高
	 */
	public void setAac034(java.math.BigDecimal aac034){
		this.aac034=aac034;
	}
	
	/**
	 * @return 身高
	 */
	public java.math.BigDecimal getAac034(){
		return this.aac034;
	}
	
	/**
	 * @param aac035 体重
	 */
	public void setAac035(java.math.BigDecimal aac035){
		this.aac035=aac035;
	}
	
	/**
	 * @return 体重
	 */
	public java.math.BigDecimal getAac035(){
		return this.aac035;
	}
	
	/**
	 * @param aac036 视力
	 */
	public void setAac036(java.lang.String aac036){
		this.aac036=aac036;
	}
	
	/**
	 * @return 视力
	 */
	public java.lang.String getAac036(){
		return this.aac036;
	}
	
	/**
	 * @param aae004 家庭联系人
	 */
	public void setAae004(java.lang.String aae004){
		this.aae004=aae004;
	}
	
	/**
	 * @return 家庭联系人
	 */
	public java.lang.String getAae004(){
		return this.aae004;
	}
	

	


	public void setYac019(java.lang.Integer yac019) {
		this.yac019 = yac019;
	}


	/**
	 * @return 家庭人口数
	 */
	public java.lang.Integer getYac019(){
		return this.yac019;
	}
	
	/**
	 * @param yac01a 家庭已就业人数
	 */
	public void setYac01a(java.lang.Integer yac01a){
		this.yac01a=yac01a;
	}
	
	/**
	 * @return 家庭已就业人数
	 */
	public java.lang.Integer getYac01a(){
		return this.yac01a;
	}
	
	/**
	 * @param yac01b 是否残疾人
	 */
	public void setYac01b(java.lang.String yac01b){
		this.yac01b=yac01b;
	}
	
	/**
	 * @return 是否残疾人
	 */
	public java.lang.String getYac01b(){
		return this.yac01b;
	}
	
	/**
	 * @param yac01c 是否复转军人
	 */
	public void setYac01c(java.lang.String yac01c){
		this.yac01c=yac01c;
	}
	
	/**
	 * @return 是否复转军人
	 */
	public java.lang.String getYac01c(){
		return this.yac01c;
	}
	
	/**
	 * @param yac01d 劳模级别
	 */
	public void setYac01d(java.lang.String yac01d){
		this.yac01d=yac01d;
	}
	
	/**
	 * @return 劳模级别
	 */
	public java.lang.String getYac01d(){
		return this.yac01d;
	}
	
	/**
	 * @param yac01e 是否服刑人员
	 */
	public void setYac01e(java.lang.String yac01e){
		this.yac01e=yac01e;
	}
	
	/**
	 * @return 是否服刑人员
	 */
	public java.lang.String getYac01e(){
		return this.yac01e;
	}
	
	/**
	 * @param yac01f 是否华侨
	 */
	public void setYac01f(java.lang.String yac01f){
		this.yac01f=yac01f;
	}
	
	/**
	 * @return 是否华侨
	 */
	public java.lang.String getYac01f(){
		return this.yac01f;
	}
	
	/**
	 * @param yac01g 是否台胞
	 */
	public void setYac01g(java.lang.String yac01g){
		this.yac01g=yac01g;
	}
	
	/**
	 * @return 是否台胞
	 */
	public java.lang.String getYac01g(){
		return this.yac01g;
	}
	
	/**
	 * @param yac014 个人养老工伤生育编号
	 */
	public void setYac014(java.lang.String yac014){
		this.yac014=yac014;
	}
	
	/**
	 * @return 个人养老工伤生育编号
	 */
	public java.lang.String getYac014(){
		return this.yac014;
	}
	
	/**
	 * @param yac015 个人医保编号
	 */
	public void setYac015(java.lang.String yac015){
		this.yac015=yac015;
	}
	
	/**
	 * @return 个人医保编号
	 */
	public java.lang.String getYac015(){
		return this.yac015;
	}
	
	/**
	 * @param yac01i 社会保障卡号
	 */
	public void setYac01i(java.lang.String yac01i){
		this.yac01i=yac01i;
	}
	
	/**
	 * @return 社会保障卡号
	 */
	public java.lang.String getYac01i(){
		return this.yac01i;
	}
	
	/**
	 * @param yac01h 个人诚信度
	 */
	public void setYac01h(java.lang.String yac01h){
		this.yac01h=yac01h;
	}
	
	/**
	 * @return 个人诚信度
	 */
	public java.lang.String getYac01h(){
		return this.yac01h;
	}
	public void setAac006_start(String aac006_start){
		this.aac006_start=aac006_start;
	}
	public String getAac006_start(){
		return this.aac006_start;
	}
	public void setAac006_end(String aac006_end){
		this.aac006_end=aac006_end;
	}
	public String getAac006_end(){
		return this.aac006_end;
	}
	public void setAac007_start(String aac007_start){
		this.aac007_start=aac007_start;
	}
	public String getAac007_start(){
		return this.aac007_start;
	}
	public void setAac007_end(String aac007_end){
		this.aac007_end=aac007_end;
	}
	public String getAac007_end(){
		return this.aac007_end;
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

	/**
	* 打印本对象
	*/
	public String toString(){
		return new ToStringBuilder(this)
			.append("个人编号(aac001):",getAac001()+"\n")
			.append("公民身份号码(aac002):",getAac002()+"\n")
			.append("姓名(aac003):",getAac003()+"\n")
			.append("个人拼音码(aac022):",getAac022()+"\n")
			.append("个人英文名称(aac023):",getAac023()+"\n")
			.append("性别(aac004):",getAac004()+"\n")
			.append("民族(aac005):",getAac005()+"\n")
			.append("政治面貌(aac024):",getAac024()+"\n")
			.append("出生日期(aac006):",getAac006()+"\n")
			.append("参加工作日期(aac007):",getAac007()+"\n")
			.append("所属劳保所(yae422):",getYae422()+"\n")
			.append("户口性质(aac009):",getAac009()+"\n")
			.append("户口所在地(aac010):",getAac010()+"\n")
			.append("所在地行政区划代码(aab301):",getAab301()+"\n")
			.append("出生地(aac025):",getAac025()+"\n")
			.append("文化程度(aac011):",getAac011()+"\n")
			.append("个人身份(aac012):",getAac012()+"\n")
			.append("联系电话(aae005):",getAae005()+"\n")
			.append("行政职务(aac020):",getAac020()+"\n")
			.append("地址(aae006):",getAae006()+"\n")
			.append("家庭住址(aac026):",getAac026()+"\n")
			.append("邮政编码(aae007):",getAae007()+"\n")
			.append("血型(aac032):",getAac032()+"\n")
			.append("婚姻状况(aac017):",getAac017()+"\n")
			.append("经办人(aae011):",getAae011()+"\n")
			.append("操作人员号（经办人）(yae116):",getYae116()+"\n")
			.append("经办机构(aae017):",getAae017()+"\n")
			.append("经办日期(aae036):",getAae036()+"\n")
			.append("审批人(aae012):",getAae012()+"\n")
			.append("操作人员号（审批人）(yae405):",getYae405()+"\n")
			.append("审定机构(yae401):",getYae401()+"\n")
			.append("审定日期(aae034):",getAae034()+"\n")
			.append("备注(aae013):",getAae013()+"\n")
			.append("时间戳(aae163):",getAae163()+"\n")
			.append("审定状态(yae420):",getYae420()+"\n")
			.append("单位编号(aab001):",getAab001()+"\n")
			.append("单位名称(aab004):",getAab004()+"\n")
			.append("就业状态(aac016):",getAac016()+"\n")
			.append("是否农转非人员(yac400):",getYac400()+"\n")
			.append("就业方式(acc032):",getAcc032()+"\n")
			.append("人员类别(aac027):",getAac027()+"\n")
			.append("再就业优惠证编号(acc101):",getAcc101()+"\n")
			.append("注销人(yae430):",getYae430()+"\n")
			.append("操作人员号（注销人）(yae435):",getYae435()+"\n")
			.append("注销时间(yae431):",getYae431()+"\n")
			.append("注销就业机构(yae432):",getYae432()+"\n")
			.append("注销原因(yae433):",getYae433()+"\n")
			.append("就失业变更流水号(yae436):",getYae436()+"\n")
			.append("灵活就业方式(yac402):",getYac402()+"\n")
			.append("公益性岗位类别(yac403):",getYac403()+"\n")
			.append("最后修改人(yae437):",getYae437()+"\n")
			.append("最后修改人编号(yae439):",getYae439()+"\n")
			.append("最后修改人机构(yae441):",getYae441()+"\n")
			.append("最后修改时间(yae442):",getYae442()+"\n")
			.append("单位所在地行政区划名称(aaa021):",getAaa021()+"\n")
			.append("专业技术职称(aac014):",getAac014()+"\n")
			.append("职业资格登记(aac015):",getAac015()+"\n")
			.append("用工形式(aac013):",getAac013()+"\n")
			.append("农民工身份标识(aac028):",getAac028()+"\n")
			.append("电子信箱(aae015):",getAae015()+"\n")
			.append("身高(aac034):",getAac034()+"\n")
			.append("体重(aac035):",getAac035()+"\n")
			.append("视力(aac036):",getAac036()+"\n")
			.append("家庭联系人(aae004):",getAae004()+"\n")
			.append("家庭人口数(yac019):",getYac019()+"\n")
			.append("家庭已就业人数(yac01a):",getYac01a()+"\n")
			.append("是否残疾人(yac01b):",getYac01b()+"\n")
			.append("是否复转军人(yac01c):",getYac01c()+"\n")
			.append("劳模级别(yac01d):",getYac01d()+"\n")
			.append("是否服刑人员(yac01e):",getYac01e()+"\n")
			.append("是否华侨(yac01f):",getYac01f()+"\n")
			.append("是否台胞(yac01g):",getYac01g()+"\n")
			.append("个人养老工伤生育编号(yac014):",getYac014()+"\n")
			.append("个人医保编号(yac015):",getYac015()+"\n")
			.append("社会保障卡号(yac01i):",getYac01i()+"\n")
			.append("个人诚信度(yac01h):",getYac01h()+"\n")
			.toString();
	}

	/**
	 * 转换为map对象
	 * @return Map
	 */
	public java.util.Map toMap(){
	  java.util.Map map = new java.util.HashMap();
	  map.put("aac001", getAac001());    //个人编号
	  map.put("aac002", getAac002());    //公民身份号码
	  map.put("aac003", getAac003());    //姓名
	  map.put("aac022", getAac022());    //个人拼音码
	  map.put("aac023", getAac023());    //个人英文名称
	  map.put("aac004", getAac004());    //性别
	  map.put("aac005", getAac005());    //民族
	  map.put("aac024", getAac024());    //政治面貌
	  map.put("aac006", getAac006());    //出生日期
	  map.put("aac007", getAac007());    //参加工作日期
	  map.put("yae422", getYae422());    //所属劳保所
	  map.put("aac009", getAac009());    //户口性质
	  map.put("aac010", getAac010());    //户口所在地
	  map.put("aab301", getAab301());    //所在地行政区划代码
	  map.put("aac025", getAac025());    //出生地
	  map.put("aac011", getAac011());    //文化程度
	  map.put("aac012", getAac012());    //个人身份
	  map.put("aae005", getAae005());    //联系电话
	  map.put("aac020", getAac020());    //行政职务
	  map.put("aae006", getAae006());    //地址
	  map.put("aac026", getAac026());    //家庭住址
	  map.put("aae007", getAae007());    //邮政编码
	  map.put("aac032", getAac032());    //血型
	  map.put("aac017", getAac017());    //婚姻状况
	  map.put("aae011", getAae011());    //经办人
	  map.put("yae116", getYae116());    //操作人员号（经办人）
	  map.put("aae017", getAae017());    //经办机构
	  map.put("aae036", getAae036());    //经办日期
	  map.put("aae012", getAae012());    //审批人
	  map.put("yae405", getYae405());    //操作人员号（审批人）
	  map.put("yae401", getYae401());    //审定机构
	  map.put("aae034", getAae034());    //审定日期
	  map.put("aae013", getAae013());    //备注
	  map.put("aae163", getAae163());    //时间戳
	  map.put("yae420", getYae420());    //审定状态
	  map.put("aab001", getAab001());    //单位编号
	  map.put("aab004", getAab004());    //单位名称
	  map.put("aac016", getAac016());    //就业状态
	  map.put("yac400", getYac400());    //是否农转非人员
	  map.put("acc032", getAcc032());    //就业方式
	  map.put("aac027", getAac027());    //人员类别
	  map.put("acc101", getAcc101());    //再就业优惠证编号
	  map.put("yae430", getYae430());    //注销人
	  map.put("yae435", getYae435());    //操作人员号（注销人）
	  map.put("yae431", getYae431());    //注销时间
	  map.put("yae432", getYae432());    //注销就业机构
	  map.put("yae433", getYae433());    //注销原因
	  map.put("yae436", getYae436());    //就失业变更流水号
	  map.put("yac402", getYac402());    //灵活就业方式
	  map.put("yac403", getYac403());    //公益性岗位类别
	  map.put("yae437", getYae437());    //最后修改人
	  map.put("yae439", getYae439());    //最后修改人编号
	  map.put("yae441", getYae441());    //最后修改人机构
	  map.put("yae442", getYae442());    //最后修改时间
	  map.put("aaa021", getAaa021());    //单位所在地行政区划名称
	  map.put("aac014", getAac014());    //专业技术职称
	  map.put("aac015", getAac015());    //职业资格登记
	  map.put("aac013", getAac013());    //用工形式
	  map.put("aac028", getAac028());    //农民工身份标识
	  map.put("aae015", getAae015());    //电子信箱
	  map.put("aac034", getAac034());    //身高
	  map.put("aac035", getAac035());    //体重
	  map.put("aac036", getAac036());    //视力
	  map.put("aae004", getAae004());    //家庭联系人
	  map.put("yac019", getYac019());    //家庭人口数
	  map.put("yac01a", getYac01a());    //家庭已就业人数
	  map.put("yac01b", getYac01b());    //是否残疾人
	  map.put("yac01c", getYac01c());    //是否复转军人
	  map.put("yac01d", getYac01d());    //劳模级别
	  map.put("yac01e", getYac01e());    //是否服刑人员
	  map.put("yac01f", getYac01f());    //是否华侨
	  map.put("yac01g", getYac01g());    //是否台胞
	  map.put("yac014", getYac014());    //个人养老工伤生育编号
	  map.put("yac015", getYac015());    //个人医保编号
	  map.put("yac01i", getYac01i());    //社会保障卡号
	  map.put("yac01h", getYac01h());    //个人诚信度
	
	  return map;
	}

	


	public java.lang.String getAcc033() {
		return acc033;
	}


	public void setAcc033(java.lang.String acc033) {
		this.acc033 = acc033;
	}


	public java.lang.String getYcc0r0() {
		return ycc0r0;
	}


	public void setYcc0r0(java.lang.String ycc0r0) {
		this.ycc0r0 = ycc0r0;
	}


}