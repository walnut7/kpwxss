package com.kpleasing.wxss.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbDictConfig generated by hbm2java
 */
@Entity
@Table(name = "tb_dict_config", catalog = "wxss")
public class DictConfig implements java.io.Serializable {

	/**	 * 	 */
	private static final long serialVersionUID = -658986075369481269L;
	private Integer id;
	private Integer parentNodeId;
	private String nodeCode;
	private String nodeValue;
	private Byte sort;
	private byte status;
	private Byte delFlag;
	private String operator;
	private Date createAt;
	private Date updateAt;
	private String memo;

	public DictConfig() {
	}

	public DictConfig(String nodeCode, String nodeValue, byte status, String operator, Date createAt, Date updateAt) {
		this.nodeCode = nodeCode;
		this.nodeValue = nodeValue;
		this.status = status;
		this.operator = operator;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public DictConfig(Integer parentNodeId, String nodeCode, String nodeValue, Byte sort, byte status, Byte delFlag,
			String operator, Date createAt, Date updateAt, String memo) {
		this.parentNodeId = parentNodeId;
		this.nodeCode = nodeCode;
		this.nodeValue = nodeValue;
		this.sort = sort;
		this.status = status;
		this.delFlag = delFlag;
		this.operator = operator;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.memo = memo;
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

	@Column(name = "parent_node_id")
	public Integer getParentNodeId() {
		return this.parentNodeId;
	}

	public void setParentNodeId(Integer parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	@Column(name = "node_code", nullable = false, length = 60)
	public String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	@Column(name = "node_value", nullable = false, length = 60)
	public String getNodeValue() {
		return this.nodeValue;
	}

	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}

	@Column(name = "sort")
	public Byte getSort() {
		return this.sort;
	}

	public void setSort(Byte sort) {
		this.sort = sort;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Column(name = "del_flag")
	public Byte getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(Byte delFlag) {
		this.delFlag = delFlag;
	}

	@Column(name = "operator", nullable = false, length = 20)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_at", nullable = false, length = 19)
	public Date getCreateAt() {
		return this.createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_at", nullable = false, length = 19)
	public Date getUpdateAt() {
		return this.updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Column(name = "memo")
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
