package com.kpleasing.wxss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbSpSales generated by hbm2java
 */
@Entity
@Table(name = "tb_sp_sales", catalog = "wxss")
public class SpSales implements java.io.Serializable {

	/**	 * 	 */
	private static final long serialVersionUID = 8913541158865943130L;
	private Integer id;
	private int bpId;
	private int saleId;
	private String salePhone;
	private String saleName;
	private byte enabledFlag;

	public SpSales() {
	}

	public SpSales(int bpId, int saleId, String saleName, byte enabledFlag) {
		this.bpId = bpId;
		this.saleId = saleId;
		this.saleName = saleName;
		this.enabledFlag = enabledFlag;
	}

	public SpSales(int bpId, int saleId, String salePhone, String saleName, byte enabledFlag) {
		this.bpId = bpId;
		this.saleId = saleId;
		this.salePhone = salePhone;
		this.saleName = saleName;
		this.enabledFlag = enabledFlag;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "bp_id", nullable = false)
	public int getBpId() {
		return this.bpId;
	}

	public void setBpId(int bpId) {
		this.bpId = bpId;
	}

	@Column(name = "sale_id", nullable = false)
	public int getSaleId() {
		return this.saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	@Column(name = "sale_phone", length = 11)
	public String getSalePhone() {
		return this.salePhone;
	}

	public void setSalePhone(String salePhone) {
		this.salePhone = salePhone;
	}

	@Column(name = "sale_name", nullable = false, length = 20)
	public String getSaleName() {
		return this.saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	@Column(name = "enabled_flag", nullable = false)
	public byte getEnabledFlag() {
		return this.enabledFlag;
	}

	public void setEnabledFlag(byte enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
