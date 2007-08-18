/**
*
* <p>Title:  支付申请对象</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2007</p>
* <p>Company: icitic</p>
* @author lsy
* @version 1.0
*/
public class Gk_PayDomain extends BaseDomain{

		/**
	 * 财政局编号	
	 */
	private Integer cz_id;
	/**
	 * 财政局编号
	 * @return the cz_id
	 */
	public Integer getCz_id() {
		return cz_id;
	}
	/**
	 * 财政局编号
	 * @param 财政局编号
	 */
	public void setCz_id(Integer cz_id) {
		this.cz_id = cz_id;
	}
	/**
	 * 申请表主键	
	 */
	private String pay_id;
	/**
	 * 申请表主键
	 * @return the pay_id
	 */
	public String getPay_id() {
		return pay_id;
	}
	/**
	 * 申请表主键
	 * @param 申请表主键
	 */
	public void setPay_id(String pay_id) {
		this.pay_id = pay_id;
	}
	/**
	 * 到账通知单单号	
	 */
	private String voucher_no;
	/**
	 * 到账通知单单号
	 * @return the voucher_no
	 */
	public String getVoucher_no() {
		return voucher_no;
	}
	/**
	 * 到账通知单单号
	 * @param 到账通知单单号
	 */
	public void setVoucher_no(String voucher_no) {
		this.voucher_no = voucher_no;
	}
	/**
	 * 指标额度主键	
	 */
	private String budget_id;
	/**
	 * 指标额度主键
	 * @return the budget_id
	 */
	public String getBudget_id() {
		return budget_id;
	}
	/**
	 * 指标额度主键
	 * @param 指标额度主键
	 */
	public void setBudget_id(String budget_id) {
		this.budget_id = budget_id;
	}
	/**
	 * 计划额度主键	
	 */
	private String plan_id;
	/**
	 * 计划额度主键
	 * @return the plan_id
	 */
	public String getPlan_id() {
		return plan_id;
	}
	/**
	 * 计划额度主键
	 * @param 计划额度主键
	 */
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	/**
	 * 对应支付凭证合单主键	
	 */
	private String pay_bill_id;
	/**
	 * 对应支付凭证合单主键
	 * @return the pay_bill_id
	 */
	public String getPay_bill_id() {
		return pay_bill_id;
	}
	/**
	 * 对应支付凭证合单主键
	 * @param 对应支付凭证合单主键
	 */
	public void setPay_bill_id(String pay_bill_id) {
		this.pay_bill_id = pay_bill_id;
	}
	/**
	 * 划款单申请主键	
	 */
	private String pay_bank_bill_id;
	/**
	 * 划款单申请主键
	 * @return the pay_bank_bill_id
	 */
	public String getPay_bank_bill_id() {
		return pay_bank_bill_id;
	}
	/**
	 * 划款单申请主键
	 * @param 划款单申请主键
	 */
	public void setPay_bank_bill_id(String pay_bank_bill_id) {
		this.pay_bank_bill_id = pay_bank_bill_id;
	}
	/**
	 * 汇总清算单主键	
	 */
	private String pay_center_bill_id;
	/**
	 * 汇总清算单主键
	 * @return the pay_center_bill_id
	 */
	public String getPay_center_bill_id() {
		return pay_center_bill_id;
	}
	/**
	 * 汇总清算单主键
	 * @param 汇总清算单主键
	 */
	public void setPay_center_bill_id(String pay_center_bill_id) {
		this.pay_center_bill_id = pay_center_bill_id;
	}
	/**
	 * 入账通知书单主键	
	 */
	private String pay_acc_bill_id;
	/**
	 * 入账通知书单主键
	 * @return the pay_acc_bill_id
	 */
	public String getPay_acc_bill_id() {
		return pay_acc_bill_id;
	}
	/**
	 * 入账通知书单主键
	 * @param 入账通知书单主键
	 */
	public void setPay_acc_bill_id(String pay_acc_bill_id) {
		this.pay_acc_bill_id = pay_acc_bill_id;
	}
	/**
	 * 日报单主键	
	 */
	private String pay_day_bill_id;
	/**
	 * 日报单主键
	 * @return the pay_day_bill_id
	 */
	public String getPay_day_bill_id() {
		return pay_day_bill_id;
	}
	/**
	 * 日报单主键
	 * @param 日报单主键
	 */
	public void setPay_day_bill_id(String pay_day_bill_id) {
		this.pay_day_bill_id = pay_day_bill_id;
	}
	/**
	 * 凭证明细记录主键	
	 */
	private String pay_detail_bill_id;
	/**
	 * 凭证明细记录主键
	 * @return the pay_detail_bill_id
	 */
	public String getPay_detail_bill_id() {
		return pay_detail_bill_id;
	}
	/**
	 * 凭证明细记录主键
	 * @param 凭证明细记录主键
	 */
	public void setPay_detail_bill_id(String pay_detail_bill_id) {
		this.pay_detail_bill_id = pay_detail_bill_id;
	}
	/**
	 * 原支付申请主键	
	 */
	private String old_pay_id;
	/**
	 * 原支付申请主键
	 * @return the old_pay_id
	 */
	public String getOld_pay_id() {
		return old_pay_id;
	}
	/**
	 * 原支付申请主键
	 * @param 原支付申请主键
	 */
	public void setOld_pay_id(String old_pay_id) {
		this.old_pay_id = old_pay_id;
	}
	/**
	 * 业务年度	
	 */
	private Integer set_year;
	/**
	 * 业务年度
	 * @return the set_year
	 */
	public Integer getSet_year() {
		return set_year;
	}
	/**
	 * 业务年度
	 * @param 业务年度
	 */
	public void setSet_year(Integer set_year) {
		this.set_year = set_year;
	}
	/**
	 * 预算单位外码	
	 */
	private String en_disp_code;
	/**
	 * 预算单位外码
	 * @return the en_disp_code
	 */
	public String getEn_disp_code() {
		return en_disp_code;
	}
	/**
	 * 预算单位外码
	 * @param 预算单位外码
	 */
	public void setEn_disp_code(String en_disp_code) {
		this.en_disp_code = en_disp_code;
	}
	/**
	 * 功能分类外码	
	 */
	private String bs_disp_code;
	/**
	 * 功能分类外码
	 * @return the bs_disp_code
	 */
	public String getBs_disp_code() {
		return bs_disp_code;
	}
	/**
	 * 功能分类外码
	 * @param 功能分类外码
	 */
	public void setBs_disp_code(String bs_disp_code) {
		this.bs_disp_code = bs_disp_code;
	}
	/**
	 * 经济分类外码	
	 */
	private String bsi_disp_code;
	/**
	 * 经济分类外码
	 * @return the bsi_disp_code
	 */
	public String getBsi_disp_code() {
		return bsi_disp_code;
	}
	/**
	 * 经济分类外码
	 * @param 经济分类外码
	 */
	public void setBsi_disp_code(String bsi_disp_code) {
		this.bsi_disp_code = bsi_disp_code;
	}
	/**
	 * 预算项目外码	
	 */
	private String bis_disp_code;
	/**
	 * 预算项目外码
	 * @return the bis_disp_code
	 */
	public String getBis_disp_code() {
		return bis_disp_code;
	}
	/**
	 * 预算项目外码
	 * @param 预算项目外码
	 */
	public void setBis_disp_code(String bis_disp_code) {
		this.bis_disp_code = bis_disp_code;
	}
	/**
	 * 项目分类外码	
	 */
	private String bi_disp_code;
	/**
	 * 项目分类外码
	 * @return the bi_disp_code
	 */
	public String getBi_disp_code() {
		return bi_disp_code;
	}
	/**
	 * 项目分类外码
	 * @param 项目分类外码
	 */
	public void setBi_disp_code(String bi_disp_code) {
		this.bi_disp_code = bi_disp_code;
	}
	/**
	 * 指标类型外码	
	 */
	private String bp_disp_code;
	/**
	 * 指标类型外码
	 * @return the bp_disp_code
	 */
	public String getBp_disp_code() {
		return bp_disp_code;
	}
	/**
	 * 指标类型外码
	 * @param 指标类型外码
	 */
	public void setBp_disp_code(String bp_disp_code) {
		this.bp_disp_code = bp_disp_code;
	}
	/**
	 * 指标来源外码	
	 */
	private String bo_disp_code;
	/**
	 * 指标来源外码
	 * @return the bo_disp_code
	 */
	public String getBo_disp_code() {
		return bo_disp_code;
	}
	/**
	 * 指标来源外码
	 * @param 指标来源外码
	 */
	public void setBo_disp_code(String bo_disp_code) {
		this.bo_disp_code = bo_disp_code;
	}
	/**
	 * 支付类型外码	
	 */
	private String pk_disp_code;
	/**
	 * 支付类型外码
	 * @return the pk_disp_code
	 */
	public String getPk_disp_code() {
		return pk_disp_code;
	}
	/**
	 * 支付类型外码
	 * @param 支付类型外码
	 */
	public void setPk_disp_code(String pk_disp_code) {
		this.pk_disp_code = pk_disp_code;
	}
	/**
	 * 资金性质外码	
	 */
	private String mk_disp_code;
	/**
	 * 资金性质外码
	 * @return the mk_disp_code
	 */
	public String getMk_disp_code() {
		return mk_disp_code;
	}
	/**
	 * 资金性质外码
	 * @param 资金性质外码
	 */
	public void setMk_disp_code(String mk_disp_code) {
		this.mk_disp_code = mk_disp_code;
	}
	/**
	 * 业务处室外码	
	 */
	private String mb_disp_code;
	/**
	 * 业务处室外码
	 * @return the mb_disp_code
	 */
	public String getMb_disp_code() {
		return mb_disp_code;
	}
	/**
	 * 业务处室外码
	 * @param 业务处室外码
	 */
	public void setMb_disp_code(String mb_disp_code) {
		this.mb_disp_code = mb_disp_code;
	}
	/**
	 * 指标流向类型外码	
	 */
	private String bt_disp_code;
	/**
	 * 指标流向类型外码
	 * @return the bt_disp_code
	 */
	public String getBt_disp_code() {
		return bt_disp_code;
	}
	/**
	 * 指标流向类型外码
	 * @param 指标流向类型外码
	 */
	public void setBt_disp_code(String bt_disp_code) {
		this.bt_disp_code = bt_disp_code;
	}
	/**
	 * 文号外码	
	 */
	private String file_disp_code;
	/**
	 * 文号外码
	 * @return the file_disp_code
	 */
	public String getFile_disp_code() {
		return file_disp_code;
	}
	/**
	 * 文号外码
	 * @param 文号外码
	 */
	public void setFile_disp_code(String file_disp_code) {
		this.file_disp_code = file_disp_code;
	}
	/**
	 * 支付账户外码	
	 */
	private String pay_account_disp_code;
	/**
	 * 支付账户外码
	 * @return the pay_account_disp_code
	 */
	public String getPay_account_disp_code() {
		return pay_account_disp_code;
	}
	/**
	 * 支付账户外码
	 * @param 支付账户外码
	 */
	public void setPay_account_disp_code(String pay_account_disp_code) {
		this.pay_account_disp_code = pay_account_disp_code;
	}
	/**
	 * 国库清算账户外码	
	 */
	private String clear_account_disp_code;
	/**
	 * 国库清算账户外码
	 * @return the clear_account_disp_code
	 */
	public String getClear_account_disp_code() {
		return clear_account_disp_code;
	}
	/**
	 * 国库清算账户外码
	 * @param 国库清算账户外码
	 */
	public void setClear_account_disp_code(String clear_account_disp_code) {
		this.clear_account_disp_code = clear_account_disp_code;
	}
	/**
	 * 备用1外码	
	 */
	private String hold1_disp_code;
	/**
	 * 备用1外码
	 * @return the hold1_disp_code
	 */
	public String getHold1_disp_code() {
		return hold1_disp_code;
	}
	/**
	 * 备用1外码
	 * @param 备用1外码
	 */
	public void setHold1_disp_code(String hold1_disp_code) {
		this.hold1_disp_code = hold1_disp_code;
	}
	/**
	 * 备用2外码	
	 */
	private String hold2_disp_code;
	/**
	 * 备用2外码
	 * @return the hold2_disp_code
	 */
	public String getHold2_disp_code() {
		return hold2_disp_code;
	}
	/**
	 * 备用2外码
	 * @param 备用2外码
	 */
	public void setHold2_disp_code(String hold2_disp_code) {
		this.hold2_disp_code = hold2_disp_code;
	}
	/**
	 * 备用3外码	
	 */
	private String hold3_disp_code;
	/**
	 * 备用3外码
	 * @return the hold3_disp_code
	 */
	public String getHold3_disp_code() {
		return hold3_disp_code;
	}
	/**
	 * 备用3外码
	 * @param 备用3外码
	 */
	public void setHold3_disp_code(String hold3_disp_code) {
		this.hold3_disp_code = hold3_disp_code;
	}
	/**
	 * 预算单位名称	
	 */
	private String en_name;
	/**
	 * 预算单位名称
	 * @return the en_name
	 */
	public String getEn_name() {
		return en_name;
	}
	/**
	 * 预算单位名称
	 * @param 预算单位名称
	 */
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	/**
	 * 功能分类名称	
	 */
	private String bs_name;
	/**
	 * 功能分类名称
	 * @return the bs_name
	 */
	public String getBs_name() {
		return bs_name;
	}
	/**
	 * 功能分类名称
	 * @param 功能分类名称
	 */
	public void setBs_name(String bs_name) {
		this.bs_name = bs_name;
	}
	/**
	 * 经济分类名称	
	 */
	private String bsi_name;
	/**
	 * 经济分类名称
	 * @return the bsi_name
	 */
	public String getBsi_name() {
		return bsi_name;
	}
	/**
	 * 经济分类名称
	 * @param 经济分类名称
	 */
	public void setBsi_name(String bsi_name) {
		this.bsi_name = bsi_name;
	}
	/**
	 * 预算项目名称	
	 */
	private String bis_name;
	/**
	 * 预算项目名称
	 * @return the bis_name
	 */
	public String getBis_name() {
		return bis_name;
	}
	/**
	 * 预算项目名称
	 * @param 预算项目名称
	 */
	public void setBis_name(String bis_name) {
		this.bis_name = bis_name;
	}
	/**
	 * 项目类别名称	
	 */
	private String bi_name;
	/**
	 * 项目类别名称
	 * @return the bi_name
	 */
	public String getBi_name() {
		return bi_name;
	}
	/**
	 * 项目类别名称
	 * @param 项目类别名称
	 */
	public void setBi_name(String bi_name) {
		this.bi_name = bi_name;
	}
	/**
	 * 指标类型名称	
	 */
	private String bp_name;
	/**
	 * 指标类型名称
	 * @return the bp_name
	 */
	public String getBp_name() {
		return bp_name;
	}
	/**
	 * 指标类型名称
	 * @param 指标类型名称
	 */
	public void setBp_name(String bp_name) {
		this.bp_name = bp_name;
	}
	/**
	 * 指标来源名称	
	 */
	private String bo_name;
	/**
	 * 指标来源名称
	 * @return the bo_name
	 */
	public String getBo_name() {
		return bo_name;
	}
	/**
	 * 指标来源名称
	 * @param 指标来源名称
	 */
	public void setBo_name(String bo_name) {
		this.bo_name = bo_name;
	}
	/**
	 * 支付类型名称	
	 */
	private String pk_name;
	/**
	 * 支付类型名称
	 * @return the pk_name
	 */
	public String getPk_name() {
		return pk_name;
	}
	/**
	 * 支付类型名称
	 * @param 支付类型名称
	 */
	public void setPk_name(String pk_name) {
		this.pk_name = pk_name;
	}
	/**
	 * 资金性质名称	
	 */
	private String mk_name;
	/**
	 * 资金性质名称
	 * @return the mk_name
	 */
	public String getMk_name() {
		return mk_name;
	}
	/**
	 * 资金性质名称
	 * @param 资金性质名称
	 */
	public void setMk_name(String mk_name) {
		this.mk_name = mk_name;
	}
	/**
	 * 业务处室名称	
	 */
	private String mb_name;
	/**
	 * 业务处室名称
	 * @return the mb_name
	 */
	public String getMb_name() {
		return mb_name;
	}
	/**
	 * 业务处室名称
	 * @param 业务处室名称
	 */
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	/**
	 * 指标流向类型名称	
	 */
	private String bt_name;
	/**
	 * 指标流向类型名称
	 * @return the bt_name
	 */
	public String getBt_name() {
		return bt_name;
	}
	/**
	 * 指标流向类型名称
	 * @param 指标流向类型名称
	 */
	public void setBt_name(String bt_name) {
		this.bt_name = bt_name;
	}
	/**
	 * 新字段40	
	 */
	private String file_name;
	/**
	 * 新字段40
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * 新字段40
	 * @param 新字段40
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	/**
	 * 支付账户名称（实拨为预算单位收款账户）	
	 */
	private String pay_account_name;
	/**
	 * 支付账户名称（实拨为预算单位收款账户）
	 * @return the pay_account_name
	 */
	public String getPay_account_name() {
		return pay_account_name;
	}
	/**
	 * 支付账户名称（实拨为预算单位收款账户）
	 * @param 支付账户名称（实拨为预算单位收款账户）
	 */
	public void setPay_account_name(String pay_account_name) {
		this.pay_account_name = pay_account_name;
	}
	/**
	 * 备用1名称	
	 */
	private String hold1_name;
	/**
	 * 备用1名称
	 * @return the hold1_name
	 */
	public String getHold1_name() {
		return hold1_name;
	}
	/**
	 * 备用1名称
	 * @param 备用1名称
	 */
	public void setHold1_name(String hold1_name) {
		this.hold1_name = hold1_name;
	}
	/**
	 * 备用2名称	
	 */
	private String hold2_name;
	/**
	 * 备用2名称
	 * @return the hold2_name
	 */
	public String getHold2_name() {
		return hold2_name;
	}
	/**
	 * 备用2名称
	 * @param 备用2名称
	 */
	public void setHold2_name(String hold2_name) {
		this.hold2_name = hold2_name;
	}
	/**
	 * 国库清算账户名称（实拨为国库拨款账户）	
	 */
	private String clear_account_name;
	/**
	 * 国库清算账户名称（实拨为国库拨款账户）
	 * @return the clear_account_name
	 */
	public String getClear_account_name() {
		return clear_account_name;
	}
	/**
	 * 国库清算账户名称（实拨为国库拨款账户）
	 * @param 国库清算账户名称（实拨为国库拨款账户）
	 */
	public void setClear_account_name(String clear_account_name) {
		this.clear_account_name = clear_account_name;
	}
	/**
	 * 备用3名称	
	 */
	private String hold3_name;
	/**
	 * 备用3名称
	 * @return the hold3_name
	 */
	public String getHold3_name() {
		return hold3_name;
	}
	/**
	 * 备用3名称
	 * @param 备用3名称
	 */
	public void setHold3_name(String hold3_name) {
		this.hold3_name = hold3_name;
	}
	/**
	 * 清算账户银行外码	
	 */
	private String clear_bank_disp_code;
	/**
	 * 清算账户银行外码
	 * @return the clear_bank_disp_code
	 */
	public String getClear_bank_disp_code() {
		return clear_bank_disp_code;
	}
	/**
	 * 清算账户银行外码
	 * @param 清算账户银行外码
	 */
	public void setClear_bank_disp_code(String clear_bank_disp_code) {
		this.clear_bank_disp_code = clear_bank_disp_code;
	}
	/**
	 * 清算账户银行名称	
	 */
	private String clear_bank_name;
	/**
	 * 清算账户银行名称
	 * @return the clear_bank_name
	 */
	public String getClear_bank_name() {
		return clear_bank_name;
	}
	/**
	 * 清算账户银行名称
	 * @param 清算账户银行名称
	 */
	public void setClear_bank_name(String clear_bank_name) {
		this.clear_bank_name = clear_bank_name;
	}
	/**
	 * 支付账户银行外码	
	 */
	private String pay_bank_disp_code;
	/**
	 * 支付账户银行外码
	 * @return the pay_bank_disp_code
	 */
	public String getPay_bank_disp_code() {
		return pay_bank_disp_code;
	}
	/**
	 * 支付账户银行外码
	 * @param 支付账户银行外码
	 */
	public void setPay_bank_disp_code(String pay_bank_disp_code) {
		this.pay_bank_disp_code = pay_bank_disp_code;
	}
	/**
	 * 支付账户银行名称	
	 */
	private String pay_bank_name;
	/**
	 * 支付账户银行名称
	 * @return the pay_bank_name
	 */
	public String getPay_bank_name() {
		return pay_bank_name;
	}
	/**
	 * 支付账户银行名称
	 * @param 支付账户银行名称
	 */
	public void setPay_bank_name(String pay_bank_name) {
		this.pay_bank_name = pay_bank_name;
	}
	/**
	 * 备注信息	
	 */
	private String remark;
	/**
	 * 备注信息
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 备注信息
	 * @param 备注信息
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 申请金额	
	 */
	private BigDecimal pay_money;
	/**
	 * 申请金额
	 * @return the pay_money
	 */
	public BigDecimal getPay_money() {
		return pay_money;
	}
	/**
	 * 申请金额
	 * @param 申请金额
	 */
	public void setPay_money(BigDecimal pay_money) {
		this.pay_money = pay_money;
	}
	/**
	 * 结算方式外码	
	 */
	private String pay_mode_disp_code;
	/**
	 * 结算方式外码
	 * @return the pay_mode_disp_code
	 */
	public String getPay_mode_disp_code() {
		return pay_mode_disp_code;
	}
	/**
	 * 结算方式外码
	 * @param 结算方式外码
	 */
	public void setPay_mode_disp_code(String pay_mode_disp_code) {
		this.pay_mode_disp_code = pay_mode_disp_code;
	}
	/**
	 * 结算名称	
	 */
	private String pay_mode_name;
	/**
	 * 结算名称
	 * @return the pay_mode_name
	 */
	public String getPay_mode_name() {
		return pay_mode_name;
	}
	/**
	 * 结算名称
	 * @param 结算名称
	 */
	public void setPay_mode_name(String pay_mode_name) {
		this.pay_mode_name = pay_mode_name;
	}
	/**
	 * 支付调整类型外码	
	 */
	private String pa_disp_code;
	/**
	 * 支付调整类型外码
	 * @return the pa_disp_code
	 */
	public String getPa_disp_code() {
		return pa_disp_code;
	}
	/**
	 * 支付调整类型外码
	 * @param 支付调整类型外码
	 */
	public void setPa_disp_code(String pa_disp_code) {
		this.pa_disp_code = pa_disp_code;
	}
	/**
	 * 支付调整类型名	
	 */
	private String pa_name;
	/**
	 * 支付调整类型名
	 * @return the pa_name
	 */
	public String getPa_name() {
		return pa_name;
	}
	/**
	 * 支付调整类型名
	 * @param 支付调整类型名
	 */
	public void setPa_name(String pa_name) {
		this.pa_name = pa_name;
	}
	/**
	 * 录入日期	
	 */
	private String input_date;
	/**
	 * 录入日期
	 * @return the input_date
	 */
	public String getInput_date() {
		return input_date;
	}
	/**
	 * 录入日期
	 * @param 录入日期
	 */
	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}
	/**
	 * 支付确认日期	
	 */
	private String pay_date;
	/**
	 * 支付确认日期
	 * @return the pay_date
	 */
	public String getPay_date() {
		return pay_date;
	}
	/**
	 * 支付确认日期
	 * @param 支付确认日期
	 */
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	/**
	 * 附件张数	
	 */
	private Integer accessory_number;
	/**
	 * 附件张数
	 * @return the accessory_number
	 */
	public Integer getAccessory_number() {
		return accessory_number;
	}
	/**
	 * 附件张数
	 * @param 附件张数
	 */
	public void setAccessory_number(Integer accessory_number) {
		this.accessory_number = accessory_number;
	}
	/**
	 * 摘要外码	
	 */
	private String summary_disp_code;
	/**
	 * 摘要外码
	 * @return the summary_disp_code
	 */
	public String getSummary_disp_code() {
		return summary_disp_code;
	}
	/**
	 * 摘要外码
	 * @param 摘要外码
	 */
	public void setSummary_disp_code(String summary_disp_code) {
		this.summary_disp_code = summary_disp_code;
	}
	/**
	 * 摘要名称	
	 */
	private String summary_name;
	/**
	 * 摘要名称
	 * @return the summary_name
	 */
	public String getSummary_name() {
		return summary_name;
	}
	/**
	 * 摘要名称
	 * @param 摘要名称
	 */
	public void setSummary_name(String summary_name) {
		this.summary_name = summary_name;
	}
	/**
	 * 收款人银行	
	 */
	private String payee_bank;
	/**
	 * 收款人银行
	 * @return the payee_bank
	 */
	public String getPayee_bank() {
		return payee_bank;
	}
	/**
	 * 收款人银行
	 * @param 收款人银行
	 */
	public void setPayee_bank(String payee_bank) {
		this.payee_bank = payee_bank;
	}
	/**
	 * 收款人银行账号	
	 */
	private String payee_account;
	/**
	 * 收款人银行账号
	 * @return the payee_account
	 */
	public String getPayee_account() {
		return payee_account;
	}
	/**
	 * 收款人银行账号
	 * @param 收款人银行账号
	 */
	public void setPayee_account(String payee_account) {
		this.payee_account = payee_account;
	}
	/**
	 * 收款人名称	
	 */
	private String payee_name;
	/**
	 * 收款人名称
	 * @return the payee_name
	 */
	public String getPayee_name() {
		return payee_name;
	}
	/**
	 * 收款人名称
	 * @param 收款人名称
	 */
	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}
	/**
	 * 是否接受凭证回单	
	 */
	private String is_end;
	/**
	 * 是否接受凭证回单
	 * @return the is_end
	 */
	public String getIs_end() {
		return is_end;
	}
	/**
	 * 是否接受凭证回单
	 * @param 是否接受凭证回单
	 */
	public void setIs_end(String is_end) {
		this.is_end = is_end;
	}
	/**
	 * 是否有效	
	 */
	private String is_valid;
	/**
	 * 是否有效
	 * @return the is_valid
	 */
	public String getIs_valid() {
		return is_valid;
	}
	/**
	 * 是否有效
	 * @param 是否有效
	 */
	public void setIs_valid(String is_valid) {
		this.is_valid = is_valid;
	}
	/**
	 * 审批单位	
	 */
	private String confirm_en_code;
	/**
	 * 审批单位
	 * @return the confirm_en_code
	 */
	public String getConfirm_en_code() {
		return confirm_en_code;
	}
	/**
	 * 审批单位
	 * @param 审批单位
	 */
	public void setConfirm_en_code(String confirm_en_code) {
		this.confirm_en_code = confirm_en_code;
	}
	/**
	 * 单位发送授权支付凭证	
	 */
	private String pay_en_acc_bill_id;
	/**
	 * 单位发送授权支付凭证
	 * @return the pay_en_acc_bill_id
	 */
	public String getPay_en_acc_bill_id() {
		return pay_en_acc_bill_id;
	}
	/**
	 * 单位发送授权支付凭证
	 * @param 单位发送授权支付凭证
	 */
	public void setPay_en_acc_bill_id(String pay_en_acc_bill_id) {
		this.pay_en_acc_bill_id = pay_en_acc_bill_id;
	}
	/**
	 * 支付管理类型	
	 */
	private String pf_name;
	/**
	 * 支付管理类型
	 * @return the pf_name
	 */
	public String getPf_name() {
		return pf_name;
	}
	/**
	 * 支付管理类型
	 * @param 支付管理类型
	 */
	public void setPf_name(String pf_name) {
		this.pf_name = pf_name;
	}
	/**
	 * 支付管理类型编码	
	 */
	private String pf_disp_code;
	/**
	 * 支付管理类型编码
	 * @return the pf_disp_code
	 */
	public String getPf_disp_code() {
		return pf_disp_code;
	}
	/**
	 * 支付管理类型编码
	 * @param 支付管理类型编码
	 */
	public void setPf_disp_code(String pf_disp_code) {
		this.pf_disp_code = pf_disp_code;
	}
	/**
	 * 用途（指标摘要）外码	
	 */
	private String sm_disp_code;
	/**
	 * 用途（指标摘要）外码
	 * @return the sm_disp_code
	 */
	public String getSm_disp_code() {
		return sm_disp_code;
	}
	/**
	 * 用途（指标摘要）外码
	 * @param 用途（指标摘要）外码
	 */
	public void setSm_disp_code(String sm_disp_code) {
		this.sm_disp_code = sm_disp_code;
	}
	/**
	 * 用途（指标摘要）名称	
	 */
	private String sm_name;
	/**
	 * 用途（指标摘要）名称
	 * @return the sm_name
	 */
	public String getSm_name() {
		return sm_name;
	}
	/**
	 * 用途（指标摘要）名称
	 * @param 用途（指标摘要）名称
	 */
	public void setSm_name(String sm_name) {
		this.sm_name = sm_name;
	}
	/**
	 * 政府采购标志外码	
	 */
	private String gb_disp_code;
	/**
	 * 政府采购标志外码
	 * @return the gb_disp_code
	 */
	public String getGb_disp_code() {
		return gb_disp_code;
	}
	/**
	 * 政府采购标志外码
	 * @param 政府采购标志外码
	 */
	public void setGb_disp_code(String gb_disp_code) {
		this.gb_disp_code = gb_disp_code;
	}
	/**
	 * 政府采购标志名称	
	 */
	private String gb_name;
	/**
	 * 政府采购标志名称
	 * @return the gb_name
	 */
	public String getGb_name() {
		return gb_name;
	}
	/**
	 * 政府采购标志名称
	 * @param 政府采购标志名称
	 */
	public void setGb_name(String gb_name) {
		this.gb_name = gb_name;
	}
	/**
	 * 工资标志外码	
	 */
	private String saltag_disp_code;
	/**
	 * 工资标志外码
	 * @return the saltag_disp_code
	 */
	public String getSaltag_disp_code() {
		return saltag_disp_code;
	}
	/**
	 * 工资标志外码
	 * @param 工资标志外码
	 */
	public void setSaltag_disp_code(String saltag_disp_code) {
		this.saltag_disp_code = saltag_disp_code;
	}
	/**
	 * 工资标志名称	
	 */
	private String saltag_name;
	/**
	 * 工资标志名称
	 * @return the saltag_name
	 */
	public String getSaltag_name() {
		return saltag_name;
	}
	/**
	 * 工资标志名称
	 * @param 工资标志名称
	 */
	public void setSaltag_name(String saltag_name) {
		this.saltag_name = saltag_name;
	}
	/**
	 * 支出类型外码	
	 */
	private String bk_disp_code;
	/**
	 * 支出类型外码
	 * @return the bk_disp_code
	 */
	public String getBk_disp_code() {
		return bk_disp_code;
	}
	/**
	 * 支出类型外码
	 * @param 支出类型外码
	 */
	public void setBk_disp_code(String bk_disp_code) {
		this.bk_disp_code = bk_disp_code;
	}
	/**
	 * 支出类型名称	
	 */
	private String bk_name;
	/**
	 * 支出类型名称
	 * @return the bk_name
	 */
	public String getBk_name() {
		return bk_name;
	}
	/**
	 * 支出类型名称
	 * @param 支出类型名称
	 */
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	/**
	 * 收支管理外码	
	 */
	private String inpm_disp_code;
	/**
	 * 收支管理外码
	 * @return the inpm_disp_code
	 */
	public String getInpm_disp_code() {
		return inpm_disp_code;
	}
	/**
	 * 收支管理外码
	 * @param 收支管理外码
	 */
	public void setInpm_disp_code(String inpm_disp_code) {
		this.inpm_disp_code = inpm_disp_code;
	}
	/**
	 * 收支管理名称	
	 */
	private String inpm_name;
	/**
	 * 收支管理名称
	 * @return the inpm_name
	 */
	public String getInpm_name() {
		return inpm_name;
	}
	/**
	 * 收支管理名称
	 * @param 收支管理名称
	 */
	public void setInpm_name(String inpm_name) {
		this.inpm_name = inpm_name;
	}
	/**
	 * 专项资金表外码	
	 */
	private String ff_disp_code;
	/**
	 * 专项资金表外码
	 * @return the ff_disp_code
	 */
	public String getFf_disp_code() {
		return ff_disp_code;
	}
	/**
	 * 专项资金表外码
	 * @param 专项资金表外码
	 */
	public void setFf_disp_code(String ff_disp_code) {
		this.ff_disp_code = ff_disp_code;
	}
	/**
	 * 专项资金表名称	
	 */
	private String ff_name;
	/**
	 * 专项资金表名称
	 * @return the ff_name
	 */
	public String getFf_name() {
		return ff_name;
	}
	/**
	 * 专项资金表名称
	 * @param 专项资金表名称
	 */
	public void setFf_name(String ff_name) {
		this.ff_name = ff_name;
	}
	/**
	 * 分组号外码	
	 */
	private String groupid_disp_code;
	/**
	 * 分组号外码
	 * @return the groupid_disp_code
	 */
	public String getGroupid_disp_code() {
		return groupid_disp_code;
	}
	/**
	 * 分组号外码
	 * @param 分组号外码
	 */
	public void setGroupid_disp_code(String groupid_disp_code) {
		this.groupid_disp_code = groupid_disp_code;
	}
	/**
	 * 分组号名称	
	 */
	private String groupid_name;
	/**
	 * 分组号名称
	 * @return the groupid_name
	 */
	public String getGroupid_name() {
		return groupid_name;
	}
	/**
	 * 分组号名称
	 * @param 分组号名称
	 */
	public void setGroupid_name(String groupid_name) {
		this.groupid_name = groupid_name;
	}
	/**
	 * 支票号	
	 */
	private String check_no;
	/**
	 * 支票号
	 * @return the check_no
	 */
	public String getCheck_no() {
		return check_no;
	}
	/**
	 * 支票号
	 * @param 支票号
	 */
	public void setCheck_no(String check_no) {
		this.check_no = check_no;
	}
	/**
	 * 支票密码	
	 */
	private String check_password;
	/**
	 * 支票密码
	 * @return the check_password
	 */
	public String getCheck_password() {
		return check_password;
	}
	/**
	 * 支票密码
	 * @param 支票密码
	 */
	public void setCheck_password(String check_password) {
		this.check_password = check_password;
	}
	/**
	 * 清算日期	
	 */
	private String clear_date;
	/**
	 * 清算日期
	 * @return the clear_date
	 */
	public String getClear_date() {
		return clear_date;
	}
	/**
	 * 清算日期
	 * @param 清算日期
	 */
	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}
	/**
	 * 支付令类型	
	 */
	private String pay_type;
	/**
	 * 支付令类型
	 * @return the pay_type
	 */
	public String getPay_type() {
		return pay_type;
	}
	/**
	 * 支付令类型
	 * @param 支付令类型
	 */
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	/**
	 * 支付令日期	
	 */
	private String inputdate;
	/**
	 * 支付令日期
	 * @return the inputdate
	 */
	public String getInputdate() {
		return inputdate;
	}
	/**
	 * 支付令日期
	 * @param 支付令日期
	 */
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	/**
	 * 代理银行编码	
	 */
	private String bank_id;
	/**
	 * 代理银行编码
	 * @return the bank_id
	 */
	public String getBank_id() {
		return bank_id;
	}
	/**
	 * 代理银行编码
	 * @param 代理银行编码
	 */
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	/**
	 * 结算方式编码	
	 */
	private Integer settle_type;
	/**
	 * 结算方式编码
	 * @return the settle_type
	 */
	public Integer getSettle_type() {
		return settle_type;
	}
	/**
	 * 结算方式编码
	 * @param 结算方式编码
	 */
	public void setSettle_type(Integer settle_type) {
		this.settle_type = settle_type;
	}
	/**
	 * 原始编号	
	 */
	private String iniaid;
	/**
	 * 原始编号
	 * @return the iniaid
	 */
	public String getIniaid() {
		return iniaid;
	}
	/**
	 * 原始编号
	 * @param 原始编号
	 */
	public void setIniaid(String iniaid) {
		this.iniaid = iniaid;
	}
	/**
	 * 紧急支出标志	
	 */
	private Integer isexigence;
	/**
	 * 紧急支出标志
	 * @return the isexigence
	 */
	public Integer getIsexigence() {
		return isexigence;
	}
	/**
	 * 紧急支出标志
	 * @param 紧急支出标志
	 */
	public void setIsexigence(Integer isexigence) {
		this.isexigence = isexigence;
	}
	/**
	 * 国库代码	
	 */
	private String gkdm;
	/**
	 * 国库代码
	 * @return the gkdm
	 */
	public String getGkdm() {
		return gkdm;
	}
	/**
	 * 国库代码
	 * @param 国库代码
	 */
	public void setGkdm(String gkdm) {
		this.gkdm = gkdm;
	}
	/**
	 * 代理银行支付系统行号	
	 */
	private String bank_num;
	/**
	 * 代理银行支付系统行号
	 * @return the bank_num
	 */
	public String getBank_num() {
		return bank_num;
	}
	/**
	 * 代理银行支付系统行号
	 * @param 代理银行支付系统行号
	 */
	public void setBank_num(String bank_num) {
		this.bank_num = bank_num;
	}
	/**
	 * 授权支付类型	
	 */
	private Integer acct_type;
	/**
	 * 授权支付类型
	 * @return the acct_type
	 */
	public Integer getAcct_type() {
		return acct_type;
	}
	/**
	 * 授权支付类型
	 * @param 授权支付类型
	 */
	public void setAcct_type(Integer acct_type) {
		this.acct_type = acct_type;
	}
	/**
	 * 退回标志	
	 */
	private String payback_flag;
	/**
	 * 退回标志
	 * @return the payback_flag
	 */
	public String getPayback_flag() {
		return payback_flag;
	}
	/**
	 * 退回标志
	 * @param 退回标志
	 */
	public void setPayback_flag(String payback_flag) {
		this.payback_flag = payback_flag;
	}
	/**
	 * 指标来源	
	 */
	private String budget_srcid;
	/**
	 * 指标来源
	 * @return the budget_srcid
	 */
	public String getBudget_srcid() {
		return budget_srcid;
	}
	/**
	 * 指标来源
	 * @param 指标来源
	 */
	public void setBudget_srcid(String budget_srcid) {
		this.budget_srcid = budget_srcid;
	}
	/**
	 * 指标类型	
	 */
	private String btype_id;
	/**
	 * 指标类型
	 * @return the btype_id
	 */
	public String getBtype_id() {
		return btype_id;
	}
	/**
	 * 指标类型
	 * @param 指标类型
	 */
	public void setBtype_id(String btype_id) {
		this.btype_id = btype_id;
	}
	/**
	 * 支付标志	
	 */
	private String is_pay;
	/**
	 * 支付标志
	 * @return the is_pay
	 */
	public String getIs_pay() {
		return is_pay;
	}
	/**
	 * 支付标志
	 * @param 支付标志
	 */
	public void setIs_pay(String is_pay) {
		this.is_pay = is_pay;
	}
	/**
	 * 与财政清算状态	
	 */
	private Integer liq_status;
	/**
	 * 与财政清算状态
	 * @return the liq_status
	 */
	public Integer getLiq_status() {
		return liq_status;
	}
	/**
	 * 与财政清算状态
	 * @param 与财政清算状态
	 */
	public void setLiq_status(Integer liq_status) {
		this.liq_status = liq_status;
	}
	/**
	 * 与人行清算日期	
	 */
	private String liq_date;
	/**
	 * 与人行清算日期
	 * @return the liq_date
	 */
	public String getLiq_date() {
		return liq_date;
	}
	/**
	 * 与人行清算日期
	 * @param 与人行清算日期
	 */
	public void setLiq_date(String liq_date) {
		this.liq_date = liq_date;
	}
	/**
	 * 与人行清算标志	
	 */
	private Integer liq_flag;
	/**
	 * 与人行清算标志
	 * @return the liq_flag
	 */
	public Integer getLiq_flag() {
		return liq_flag;
	}
	/**
	 * 与人行清算标志
	 * @param 与人行清算标志
	 */
	public void setLiq_flag(Integer liq_flag) {
		this.liq_flag = liq_flag;
	}
	/**
	 * 中间业务平台流水号	
	 */
	private Integer ag_serial;
	/**
	 * 中间业务平台流水号
	 * @return the ag_serial
	 */
	public Integer getAg_serial() {
		return ag_serial;
	}
	/**
	 * 中间业务平台流水号
	 * @param 中间业务平台流水号
	 */
	public void setAg_serial(Integer ag_serial) {
		this.ag_serial = ag_serial;
	}
	/**
	 * 交易代码	
	 */
	private String tx_code;
	/**
	 * 交易代码
	 * @return the tx_code
	 */
	public String getTx_code() {
		return tx_code;
	}
	/**
	 * 交易代码
	 * @param 交易代码
	 */
	public void setTx_code(String tx_code) {
		this.tx_code = tx_code;
	}
	/**
	 * 交易日期	
	 */
	private String tx_date;
	/**
	 * 交易日期
	 * @return the tx_date
	 */
	public String getTx_date() {
		return tx_date;
	}
	/**
	 * 交易日期
	 * @param 交易日期
	 */
	public void setTx_date(String tx_date) {
		this.tx_date = tx_date;
	}
	/**
	 * 交易时间	
	 */
	private String tx_time;
	/**
	 * 交易时间
	 * @return the tx_time
	 */
	public String getTx_time() {
		return tx_time;
	}
	/**
	 * 交易时间
	 * @param 交易时间
	 */
	public void setTx_time(String tx_time) {
		this.tx_time = tx_time;
	}
	/**
	 * 交易柜员	
	 */
	private String tx_teller;
	/**
	 * 交易柜员
	 * @return the tx_teller
	 */
	public String getTx_teller() {
		return tx_teller;
	}
	/**
	 * 交易柜员
	 * @param 交易柜员
	 */
	public void setTx_teller(String tx_teller) {
		this.tx_teller = tx_teller;
	}
	/**
	 * 复核员	
	 */
	private String tx_checker;
	/**
	 * 复核员
	 * @return the tx_checker
	 */
	public String getTx_checker() {
		return tx_checker;
	}
	/**
	 * 复核员
	 * @param 复核员
	 */
	public void setTx_checker(String tx_checker) {
		this.tx_checker = tx_checker;
	}
	/**
	 * 凭证打印次数	
	 */
	private Integer prt_times;
	/**
	 * 凭证打印次数
	 * @return the prt_times
	 */
	public Integer getPrt_times() {
		return prt_times;
	}
	/**
	 * 凭证打印次数
	 * @param 凭证打印次数
	 */
	public void setPrt_times(Integer prt_times) {
		this.prt_times = prt_times;
	}
	/**
	 * 上传标志	
	 */
	private String send_flag;
	/**
	 * 上传标志
	 * @return the send_flag
	 */
	public String getSend_flag() {
		return send_flag;
	}
	/**
	 * 上传标志
	 * @param 上传标志
	 */
	public void setSend_flag(String send_flag) {
		this.send_flag = send_flag;
	}
	/**
	 * 说明	
	 */
	private String note;
	/**
	 * 说明
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * 说明
	 * @param 说明
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 报表记录生成标志	
	 */
	private Integer report_flag;
	/**
	 * 报表记录生成标志
	 * @return the report_flag
	 */
	public Integer getReport_flag() {
		return report_flag;
	}
	/**
	 * 报表记录生成标志
	 * @param 报表记录生成标志
	 */
	public void setReport_flag(Integer report_flag) {
		this.report_flag = report_flag;
	}

	
	public String validate(){
		String recstr = "";
		
			    if(this.pay_id == null)
		     recstr = recstr + "pay_id(申请表主键)不能为空!\n";
	    if(this.voucher_no == null)
		     recstr = recstr + "voucher_no(到账通知单单号)不能为空!\n";
	    if(this.budget_id == null)
		     recstr = recstr + "budget_id(指标额度主键)不能为空!\n";
	    if(this.plan_id == null)
		     recstr = recstr + "plan_id(计划额度主键)不能为空!\n";
	    if(this.pay_bill_id == null)
		     recstr = recstr + "pay_bill_id(对应支付凭证合单主键)不能为空!\n";
	    if(this.pay_bank_bill_id == null)
		     recstr = recstr + "pay_bank_bill_id(划款单申请主键)不能为空!\n";
	    if(this.pay_center_bill_id == null)
		     recstr = recstr + "pay_center_bill_id(汇总清算单主键)不能为空!\n";
	    if(this.pay_acc_bill_id == null)
		     recstr = recstr + "pay_acc_bill_id(入账通知书单主键)不能为空!\n";
	    if(this.pay_day_bill_id == null)
		     recstr = recstr + "pay_day_bill_id(日报单主键)不能为空!\n";
	    if(this.pay_detail_bill_id == null)
		     recstr = recstr + "pay_detail_bill_id(凭证明细记录主键)不能为空!\n";
	    if(this.is_valid == null)
		     recstr = recstr + "is_valid(是否有效)不能为空!\n";
	    if(this.pay_type == null)
		     recstr = recstr + "pay_type(支付令类型)不能为空!\n";

		
		if(recstr.equals(""))
			recstr = "OK";	
		return recstr;	
	}
	public void gBKToISO(){
		try {
					if(this.pay_id != null)	
			this.pay_id = new String(this.pay_id.getBytes("GBK"),"ISO8859-1");
		if(this.voucher_no != null)	
			this.voucher_no = new String(this.voucher_no.getBytes("GBK"),"ISO8859-1");
		if(this.budget_id != null)	
			this.budget_id = new String(this.budget_id.getBytes("GBK"),"ISO8859-1");
		if(this.plan_id != null)	
			this.plan_id = new String(this.plan_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_bill_id != null)	
			this.pay_bill_id = new String(this.pay_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_bank_bill_id != null)	
			this.pay_bank_bill_id = new String(this.pay_bank_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_center_bill_id != null)	
			this.pay_center_bill_id = new String(this.pay_center_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_acc_bill_id != null)	
			this.pay_acc_bill_id = new String(this.pay_acc_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_day_bill_id != null)	
			this.pay_day_bill_id = new String(this.pay_day_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pay_detail_bill_id != null)	
			this.pay_detail_bill_id = new String(this.pay_detail_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.old_pay_id != null)	
			this.old_pay_id = new String(this.old_pay_id.getBytes("GBK"),"ISO8859-1");
		if(this.en_disp_code != null)	
			this.en_disp_code = new String(this.en_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bs_disp_code != null)	
			this.bs_disp_code = new String(this.bs_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bsi_disp_code != null)	
			this.bsi_disp_code = new String(this.bsi_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bis_disp_code != null)	
			this.bis_disp_code = new String(this.bis_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bi_disp_code != null)	
			this.bi_disp_code = new String(this.bi_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bp_disp_code != null)	
			this.bp_disp_code = new String(this.bp_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bo_disp_code != null)	
			this.bo_disp_code = new String(this.bo_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.pk_disp_code != null)	
			this.pk_disp_code = new String(this.pk_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.mk_disp_code != null)	
			this.mk_disp_code = new String(this.mk_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.mb_disp_code != null)	
			this.mb_disp_code = new String(this.mb_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bt_disp_code != null)	
			this.bt_disp_code = new String(this.bt_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.file_disp_code != null)	
			this.file_disp_code = new String(this.file_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.pay_account_disp_code != null)	
			this.pay_account_disp_code = new String(this.pay_account_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.clear_account_disp_code != null)	
			this.clear_account_disp_code = new String(this.clear_account_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.hold1_disp_code != null)	
			this.hold1_disp_code = new String(this.hold1_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.hold2_disp_code != null)	
			this.hold2_disp_code = new String(this.hold2_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.hold3_disp_code != null)	
			this.hold3_disp_code = new String(this.hold3_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.en_name != null)	
			this.en_name = new String(this.en_name.getBytes("GBK"),"ISO8859-1");
		if(this.bs_name != null)	
			this.bs_name = new String(this.bs_name.getBytes("GBK"),"ISO8859-1");
		if(this.bsi_name != null)	
			this.bsi_name = new String(this.bsi_name.getBytes("GBK"),"ISO8859-1");
		if(this.bis_name != null)	
			this.bis_name = new String(this.bis_name.getBytes("GBK"),"ISO8859-1");
		if(this.bi_name != null)	
			this.bi_name = new String(this.bi_name.getBytes("GBK"),"ISO8859-1");
		if(this.bp_name != null)	
			this.bp_name = new String(this.bp_name.getBytes("GBK"),"ISO8859-1");
		if(this.bo_name != null)	
			this.bo_name = new String(this.bo_name.getBytes("GBK"),"ISO8859-1");
		if(this.pk_name != null)	
			this.pk_name = new String(this.pk_name.getBytes("GBK"),"ISO8859-1");
		if(this.mk_name != null)	
			this.mk_name = new String(this.mk_name.getBytes("GBK"),"ISO8859-1");
		if(this.mb_name != null)	
			this.mb_name = new String(this.mb_name.getBytes("GBK"),"ISO8859-1");
		if(this.bt_name != null)	
			this.bt_name = new String(this.bt_name.getBytes("GBK"),"ISO8859-1");
		if(this.file_name != null)	
			this.file_name = new String(this.file_name.getBytes("GBK"),"ISO8859-1");
		if(this.pay_account_name != null)	
			this.pay_account_name = new String(this.pay_account_name.getBytes("GBK"),"ISO8859-1");
		if(this.hold1_name != null)	
			this.hold1_name = new String(this.hold1_name.getBytes("GBK"),"ISO8859-1");
		if(this.hold2_name != null)	
			this.hold2_name = new String(this.hold2_name.getBytes("GBK"),"ISO8859-1");
		if(this.clear_account_name != null)	
			this.clear_account_name = new String(this.clear_account_name.getBytes("GBK"),"ISO8859-1");
		if(this.hold3_name != null)	
			this.hold3_name = new String(this.hold3_name.getBytes("GBK"),"ISO8859-1");
		if(this.clear_bank_disp_code != null)	
			this.clear_bank_disp_code = new String(this.clear_bank_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.clear_bank_name != null)	
			this.clear_bank_name = new String(this.clear_bank_name.getBytes("GBK"),"ISO8859-1");
		if(this.pay_bank_disp_code != null)	
			this.pay_bank_disp_code = new String(this.pay_bank_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.pay_bank_name != null)	
			this.pay_bank_name = new String(this.pay_bank_name.getBytes("GBK"),"ISO8859-1");
		if(this.remark != null)	
			this.remark = new String(this.remark.getBytes("GBK"),"ISO8859-1");
		if(this.pay_mode_disp_code != null)	
			this.pay_mode_disp_code = new String(this.pay_mode_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.pay_mode_name != null)	
			this.pay_mode_name = new String(this.pay_mode_name.getBytes("GBK"),"ISO8859-1");
		if(this.pa_disp_code != null)	
			this.pa_disp_code = new String(this.pa_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.pa_name != null)	
			this.pa_name = new String(this.pa_name.getBytes("GBK"),"ISO8859-1");
		if(this.input_date != null)	
			this.input_date = new String(this.input_date.getBytes("GBK"),"ISO8859-1");
		if(this.pay_date != null)	
			this.pay_date = new String(this.pay_date.getBytes("GBK"),"ISO8859-1");
		if(this.summary_disp_code != null)	
			this.summary_disp_code = new String(this.summary_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.summary_name != null)	
			this.summary_name = new String(this.summary_name.getBytes("GBK"),"ISO8859-1");
		if(this.payee_bank != null)	
			this.payee_bank = new String(this.payee_bank.getBytes("GBK"),"ISO8859-1");
		if(this.payee_account != null)	
			this.payee_account = new String(this.payee_account.getBytes("GBK"),"ISO8859-1");
		if(this.payee_name != null)	
			this.payee_name = new String(this.payee_name.getBytes("GBK"),"ISO8859-1");
		if(this.is_end != null)	
			this.is_end = new String(this.is_end.getBytes("GBK"),"ISO8859-1");
		if(this.is_valid != null)	
			this.is_valid = new String(this.is_valid.getBytes("GBK"),"ISO8859-1");
		if(this.confirm_en_code != null)	
			this.confirm_en_code = new String(this.confirm_en_code.getBytes("GBK"),"ISO8859-1");
		if(this.pay_en_acc_bill_id != null)	
			this.pay_en_acc_bill_id = new String(this.pay_en_acc_bill_id.getBytes("GBK"),"ISO8859-1");
		if(this.pf_name != null)	
			this.pf_name = new String(this.pf_name.getBytes("GBK"),"ISO8859-1");
		if(this.pf_disp_code != null)	
			this.pf_disp_code = new String(this.pf_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.sm_disp_code != null)	
			this.sm_disp_code = new String(this.sm_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.sm_name != null)	
			this.sm_name = new String(this.sm_name.getBytes("GBK"),"ISO8859-1");
		if(this.gb_disp_code != null)	
			this.gb_disp_code = new String(this.gb_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.gb_name != null)	
			this.gb_name = new String(this.gb_name.getBytes("GBK"),"ISO8859-1");
		if(this.saltag_disp_code != null)	
			this.saltag_disp_code = new String(this.saltag_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.saltag_name != null)	
			this.saltag_name = new String(this.saltag_name.getBytes("GBK"),"ISO8859-1");
		if(this.bk_disp_code != null)	
			this.bk_disp_code = new String(this.bk_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.bk_name != null)	
			this.bk_name = new String(this.bk_name.getBytes("GBK"),"ISO8859-1");
		if(this.inpm_disp_code != null)	
			this.inpm_disp_code = new String(this.inpm_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.inpm_name != null)	
			this.inpm_name = new String(this.inpm_name.getBytes("GBK"),"ISO8859-1");
		if(this.ff_disp_code != null)	
			this.ff_disp_code = new String(this.ff_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.ff_name != null)	
			this.ff_name = new String(this.ff_name.getBytes("GBK"),"ISO8859-1");
		if(this.groupid_disp_code != null)	
			this.groupid_disp_code = new String(this.groupid_disp_code.getBytes("GBK"),"ISO8859-1");
		if(this.groupid_name != null)	
			this.groupid_name = new String(this.groupid_name.getBytes("GBK"),"ISO8859-1");
		if(this.check_no != null)	
			this.check_no = new String(this.check_no.getBytes("GBK"),"ISO8859-1");
		if(this.check_password != null)	
			this.check_password = new String(this.check_password.getBytes("GBK"),"ISO8859-1");
		if(this.clear_date != null)	
			this.clear_date = new String(this.clear_date.getBytes("GBK"),"ISO8859-1");
		if(this.pay_type != null)	
			this.pay_type = new String(this.pay_type.getBytes("GBK"),"ISO8859-1");
		if(this.inputdate != null)	
			this.inputdate = new String(this.inputdate.getBytes("GBK"),"ISO8859-1");
		if(this.bank_id != null)	
			this.bank_id = new String(this.bank_id.getBytes("GBK"),"ISO8859-1");
		if(this.iniaid != null)	
			this.iniaid = new String(this.iniaid.getBytes("GBK"),"ISO8859-1");
		if(this.gkdm != null)	
			this.gkdm = new String(this.gkdm.getBytes("GBK"),"ISO8859-1");
		if(this.bank_num != null)	
			this.bank_num = new String(this.bank_num.getBytes("GBK"),"ISO8859-1");
		if(this.payback_flag != null)	
			this.payback_flag = new String(this.payback_flag.getBytes("GBK"),"ISO8859-1");
		if(this.budget_srcid != null)	
			this.budget_srcid = new String(this.budget_srcid.getBytes("GBK"),"ISO8859-1");
		if(this.btype_id != null)	
			this.btype_id = new String(this.btype_id.getBytes("GBK"),"ISO8859-1");
		if(this.is_pay != null)	
			this.is_pay = new String(this.is_pay.getBytes("GBK"),"ISO8859-1");
		if(this.liq_date != null)	
			this.liq_date = new String(this.liq_date.getBytes("GBK"),"ISO8859-1");
		if(this.tx_code != null)	
			this.tx_code = new String(this.tx_code.getBytes("GBK"),"ISO8859-1");
		if(this.tx_date != null)	
			this.tx_date = new String(this.tx_date.getBytes("GBK"),"ISO8859-1");
		if(this.tx_time != null)	
			this.tx_time = new String(this.tx_time.getBytes("GBK"),"ISO8859-1");
		if(this.tx_teller != null)	
			this.tx_teller = new String(this.tx_teller.getBytes("GBK"),"ISO8859-1");
		if(this.tx_checker != null)	
			this.tx_checker = new String(this.tx_checker.getBytes("GBK"),"ISO8859-1");
		if(this.send_flag != null)	
			this.send_flag = new String(this.send_flag.getBytes("GBK"),"ISO8859-1");
		if(this.note != null)	
			this.note = new String(this.note.getBytes("GBK"),"ISO8859-1");

			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	public void iSOToGBK(){
		try {
					if(this.pay_id != null)		
			this.pay_id = new String(this.pay_id.getBytes("ISO8859-1"),"GBK");
		if(this.voucher_no != null)		
			this.voucher_no = new String(this.voucher_no.getBytes("ISO8859-1"),"GBK");
		if(this.budget_id != null)		
			this.budget_id = new String(this.budget_id.getBytes("ISO8859-1"),"GBK");
		if(this.plan_id != null)		
			this.plan_id = new String(this.plan_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_bill_id != null)		
			this.pay_bill_id = new String(this.pay_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_bank_bill_id != null)		
			this.pay_bank_bill_id = new String(this.pay_bank_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_center_bill_id != null)		
			this.pay_center_bill_id = new String(this.pay_center_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_acc_bill_id != null)		
			this.pay_acc_bill_id = new String(this.pay_acc_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_day_bill_id != null)		
			this.pay_day_bill_id = new String(this.pay_day_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pay_detail_bill_id != null)		
			this.pay_detail_bill_id = new String(this.pay_detail_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.old_pay_id != null)		
			this.old_pay_id = new String(this.old_pay_id.getBytes("ISO8859-1"),"GBK");
		if(this.en_disp_code != null)		
			this.en_disp_code = new String(this.en_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bs_disp_code != null)		
			this.bs_disp_code = new String(this.bs_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bsi_disp_code != null)		
			this.bsi_disp_code = new String(this.bsi_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bis_disp_code != null)		
			this.bis_disp_code = new String(this.bis_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bi_disp_code != null)		
			this.bi_disp_code = new String(this.bi_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bp_disp_code != null)		
			this.bp_disp_code = new String(this.bp_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bo_disp_code != null)		
			this.bo_disp_code = new String(this.bo_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.pk_disp_code != null)		
			this.pk_disp_code = new String(this.pk_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.mk_disp_code != null)		
			this.mk_disp_code = new String(this.mk_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.mb_disp_code != null)		
			this.mb_disp_code = new String(this.mb_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bt_disp_code != null)		
			this.bt_disp_code = new String(this.bt_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.file_disp_code != null)		
			this.file_disp_code = new String(this.file_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.pay_account_disp_code != null)		
			this.pay_account_disp_code = new String(this.pay_account_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.clear_account_disp_code != null)		
			this.clear_account_disp_code = new String(this.clear_account_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.hold1_disp_code != null)		
			this.hold1_disp_code = new String(this.hold1_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.hold2_disp_code != null)		
			this.hold2_disp_code = new String(this.hold2_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.hold3_disp_code != null)		
			this.hold3_disp_code = new String(this.hold3_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.en_name != null)		
			this.en_name = new String(this.en_name.getBytes("ISO8859-1"),"GBK");
		if(this.bs_name != null)		
			this.bs_name = new String(this.bs_name.getBytes("ISO8859-1"),"GBK");
		if(this.bsi_name != null)		
			this.bsi_name = new String(this.bsi_name.getBytes("ISO8859-1"),"GBK");
		if(this.bis_name != null)		
			this.bis_name = new String(this.bis_name.getBytes("ISO8859-1"),"GBK");
		if(this.bi_name != null)		
			this.bi_name = new String(this.bi_name.getBytes("ISO8859-1"),"GBK");
		if(this.bp_name != null)		
			this.bp_name = new String(this.bp_name.getBytes("ISO8859-1"),"GBK");
		if(this.bo_name != null)		
			this.bo_name = new String(this.bo_name.getBytes("ISO8859-1"),"GBK");
		if(this.pk_name != null)		
			this.pk_name = new String(this.pk_name.getBytes("ISO8859-1"),"GBK");
		if(this.mk_name != null)		
			this.mk_name = new String(this.mk_name.getBytes("ISO8859-1"),"GBK");
		if(this.mb_name != null)		
			this.mb_name = new String(this.mb_name.getBytes("ISO8859-1"),"GBK");
		if(this.bt_name != null)		
			this.bt_name = new String(this.bt_name.getBytes("ISO8859-1"),"GBK");
		if(this.file_name != null)		
			this.file_name = new String(this.file_name.getBytes("ISO8859-1"),"GBK");
		if(this.pay_account_name != null)		
			this.pay_account_name = new String(this.pay_account_name.getBytes("ISO8859-1"),"GBK");
		if(this.hold1_name != null)		
			this.hold1_name = new String(this.hold1_name.getBytes("ISO8859-1"),"GBK");
		if(this.hold2_name != null)		
			this.hold2_name = new String(this.hold2_name.getBytes("ISO8859-1"),"GBK");
		if(this.clear_account_name != null)		
			this.clear_account_name = new String(this.clear_account_name.getBytes("ISO8859-1"),"GBK");
		if(this.hold3_name != null)		
			this.hold3_name = new String(this.hold3_name.getBytes("ISO8859-1"),"GBK");
		if(this.clear_bank_disp_code != null)		
			this.clear_bank_disp_code = new String(this.clear_bank_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.clear_bank_name != null)		
			this.clear_bank_name = new String(this.clear_bank_name.getBytes("ISO8859-1"),"GBK");
		if(this.pay_bank_disp_code != null)		
			this.pay_bank_disp_code = new String(this.pay_bank_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.pay_bank_name != null)		
			this.pay_bank_name = new String(this.pay_bank_name.getBytes("ISO8859-1"),"GBK");
		if(this.remark != null)		
			this.remark = new String(this.remark.getBytes("ISO8859-1"),"GBK");
		if(this.pay_mode_disp_code != null)		
			this.pay_mode_disp_code = new String(this.pay_mode_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.pay_mode_name != null)		
			this.pay_mode_name = new String(this.pay_mode_name.getBytes("ISO8859-1"),"GBK");
		if(this.pa_disp_code != null)		
			this.pa_disp_code = new String(this.pa_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.pa_name != null)		
			this.pa_name = new String(this.pa_name.getBytes("ISO8859-1"),"GBK");
		if(this.input_date != null)		
			this.input_date = new String(this.input_date.getBytes("ISO8859-1"),"GBK");
		if(this.pay_date != null)		
			this.pay_date = new String(this.pay_date.getBytes("ISO8859-1"),"GBK");
		if(this.summary_disp_code != null)		
			this.summary_disp_code = new String(this.summary_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.summary_name != null)		
			this.summary_name = new String(this.summary_name.getBytes("ISO8859-1"),"GBK");
		if(this.payee_bank != null)		
			this.payee_bank = new String(this.payee_bank.getBytes("ISO8859-1"),"GBK");
		if(this.payee_account != null)		
			this.payee_account = new String(this.payee_account.getBytes("ISO8859-1"),"GBK");
		if(this.payee_name != null)		
			this.payee_name = new String(this.payee_name.getBytes("ISO8859-1"),"GBK");
		if(this.is_end != null)		
			this.is_end = new String(this.is_end.getBytes("ISO8859-1"),"GBK");
		if(this.is_valid != null)		
			this.is_valid = new String(this.is_valid.getBytes("ISO8859-1"),"GBK");
		if(this.confirm_en_code != null)		
			this.confirm_en_code = new String(this.confirm_en_code.getBytes("ISO8859-1"),"GBK");
		if(this.pay_en_acc_bill_id != null)		
			this.pay_en_acc_bill_id = new String(this.pay_en_acc_bill_id.getBytes("ISO8859-1"),"GBK");
		if(this.pf_name != null)		
			this.pf_name = new String(this.pf_name.getBytes("ISO8859-1"),"GBK");
		if(this.pf_disp_code != null)		
			this.pf_disp_code = new String(this.pf_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.sm_disp_code != null)		
			this.sm_disp_code = new String(this.sm_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.sm_name != null)		
			this.sm_name = new String(this.sm_name.getBytes("ISO8859-1"),"GBK");
		if(this.gb_disp_code != null)		
			this.gb_disp_code = new String(this.gb_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.gb_name != null)		
			this.gb_name = new String(this.gb_name.getBytes("ISO8859-1"),"GBK");
		if(this.saltag_disp_code != null)		
			this.saltag_disp_code = new String(this.saltag_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.saltag_name != null)		
			this.saltag_name = new String(this.saltag_name.getBytes("ISO8859-1"),"GBK");
		if(this.bk_disp_code != null)		
			this.bk_disp_code = new String(this.bk_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.bk_name != null)		
			this.bk_name = new String(this.bk_name.getBytes("ISO8859-1"),"GBK");
		if(this.inpm_disp_code != null)		
			this.inpm_disp_code = new String(this.inpm_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.inpm_name != null)		
			this.inpm_name = new String(this.inpm_name.getBytes("ISO8859-1"),"GBK");
		if(this.ff_disp_code != null)		
			this.ff_disp_code = new String(this.ff_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.ff_name != null)		
			this.ff_name = new String(this.ff_name.getBytes("ISO8859-1"),"GBK");
		if(this.groupid_disp_code != null)		
			this.groupid_disp_code = new String(this.groupid_disp_code.getBytes("ISO8859-1"),"GBK");
		if(this.groupid_name != null)		
			this.groupid_name = new String(this.groupid_name.getBytes("ISO8859-1"),"GBK");
		if(this.check_no != null)		
			this.check_no = new String(this.check_no.getBytes("ISO8859-1"),"GBK");
		if(this.check_password != null)		
			this.check_password = new String(this.check_password.getBytes("ISO8859-1"),"GBK");
		if(this.clear_date != null)		
			this.clear_date = new String(this.clear_date.getBytes("ISO8859-1"),"GBK");
		if(this.pay_type != null)		
			this.pay_type = new String(this.pay_type.getBytes("ISO8859-1"),"GBK");
		if(this.inputdate != null)		
			this.inputdate = new String(this.inputdate.getBytes("ISO8859-1"),"GBK");
		if(this.bank_id != null)		
			this.bank_id = new String(this.bank_id.getBytes("ISO8859-1"),"GBK");
		if(this.iniaid != null)		
			this.iniaid = new String(this.iniaid.getBytes("ISO8859-1"),"GBK");
		if(this.gkdm != null)		
			this.gkdm = new String(this.gkdm.getBytes("ISO8859-1"),"GBK");
		if(this.bank_num != null)		
			this.bank_num = new String(this.bank_num.getBytes("ISO8859-1"),"GBK");
		if(this.payback_flag != null)		
			this.payback_flag = new String(this.payback_flag.getBytes("ISO8859-1"),"GBK");
		if(this.budget_srcid != null)		
			this.budget_srcid = new String(this.budget_srcid.getBytes("ISO8859-1"),"GBK");
		if(this.btype_id != null)		
			this.btype_id = new String(this.btype_id.getBytes("ISO8859-1"),"GBK");
		if(this.is_pay != null)		
			this.is_pay = new String(this.is_pay.getBytes("ISO8859-1"),"GBK");
		if(this.liq_date != null)		
			this.liq_date = new String(this.liq_date.getBytes("ISO8859-1"),"GBK");
		if(this.tx_code != null)		
			this.tx_code = new String(this.tx_code.getBytes("ISO8859-1"),"GBK");
		if(this.tx_date != null)		
			this.tx_date = new String(this.tx_date.getBytes("ISO8859-1"),"GBK");
		if(this.tx_time != null)		
			this.tx_time = new String(this.tx_time.getBytes("ISO8859-1"),"GBK");
		if(this.tx_teller != null)		
			this.tx_teller = new String(this.tx_teller.getBytes("ISO8859-1"),"GBK");
		if(this.tx_checker != null)		
			this.tx_checker = new String(this.tx_checker.getBytes("ISO8859-1"),"GBK");
		if(this.send_flag != null)		
			this.send_flag = new String(this.send_flag.getBytes("ISO8859-1"),"GBK");
		if(this.note != null)		
			this.note = new String(this.note.getBytes("ISO8859-1"),"GBK");

			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
