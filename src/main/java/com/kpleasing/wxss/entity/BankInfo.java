package com.kpleasing.wxss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbBankInfo generated by hbm2java
 */
@Entity
@Table(name = "tb_bank_info", catalog = "wxss")
public class BankInfo implements java.io.Serializable {

	/**	 * 	 */
	private static final long serialVersionUID = 4125020155781958424L;
	private Integer userId;
	private String repayAccBank;
	private String repayAccBankCode;
	private String repayCardNo;
	private String bankPhone;
	private String bankcardFrontImagePath;
	private String bankcardBackImagePath;
	private String token;
	private String storablePan;
	private String smsSendtime;
	private String externalNo;

	public BankInfo() {
	}

	public BankInfo(Integer userId) {
		this.userId = userId;
	}

	public BankInfo(Integer userId, String repayAccBank, String repayAccBankCode, String repayCardNo, String bankPhone,
			String bankcardFrontImagePath, String bankcardBackImagePath, String token, String storablePan,
			String smsSendtime) {
		this.userId = userId;
		this.repayAccBank = repayAccBank;
		this.repayAccBankCode = repayAccBankCode;
		this.repayCardNo = repayCardNo;
		this.bankPhone = bankPhone;
		this.bankcardFrontImagePath = bankcardFrontImagePath;
		this.bankcardBackImagePath = bankcardBackImagePath;
		this.token = token;
		this.storablePan = storablePan;
		this.smsSendtime = smsSendtime;
	}

	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "repay_acc_bank", length = 20)
	public String getRepayAccBank() {
		return this.repayAccBank;
	}

	public void setRepayAccBank(String repayAccBank) {
		this.repayAccBank = repayAccBank;
	}

	@Column(name = "repay_acc_bank_code", length = 20)
	public String getRepayAccBankCode() {
		return this.repayAccBankCode;
	}

	public void setRepayAccBankCode(String repayAccBankCode) {
		this.repayAccBankCode = repayAccBankCode;
	}

	@Column(name = "repay_card_no", length = 20)
	public String getRepayCardNo() {
		return this.repayCardNo;
	}

	public void setRepayCardNo(String repayCardNo) {
		this.repayCardNo = repayCardNo;
	}

	@Column(name = "bank_phone", length = 11)
	public String getBankPhone() {
		return this.bankPhone;
	}

	public void setBankPhone(String bankPhone) {
		this.bankPhone = bankPhone;
	}

	@Column(name = "bankcard_front_image_path", length = 256)
	public String getBankcardFrontImagePath() {
		return this.bankcardFrontImagePath;
	}

	public void setBankcardFrontImagePath(String bankcardFrontImagePath) {
		this.bankcardFrontImagePath = bankcardFrontImagePath;
	}

	@Column(name = "bankcard_back_image_path", length = 256)
	public String getBankcardBackImagePath() {
		return this.bankcardBackImagePath;
	}

	public void setBankcardBackImagePath(String bankcardBackImagePath) {
		this.bankcardBackImagePath = bankcardBackImagePath;
	}

	@Column(name = "token", length = 30)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "storable_pan", length = 20)
	public String getStorablePan() {
		return this.storablePan;
	}

	public void setStorablePan(String storablePan) {
		this.storablePan = storablePan;
	}

	@Column(name = "sms_sendtime", length = 20)
	public String getSmsSendtime() {
		return this.smsSendtime;
	}

	public void setSmsSendtime(String smsSendtime) {
		this.smsSendtime = smsSendtime;
	}
	
	@Column(name = "external_no", length = 32)
	public String getExternalNo() {
		return this.externalNo;
	}

	public void setExternalNo(String externalNo) {
		this.externalNo = externalNo;
	}
}