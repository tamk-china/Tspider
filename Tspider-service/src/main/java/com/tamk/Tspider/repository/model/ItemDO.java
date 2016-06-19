package com.tamk.Tspider.repository.model;

import java.util.Date;

/**
 * @author kuanqiang.tkq
 */
public class ItemDO {
	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	private Long itemId;
	private Integer source;
	private String itemTitle;
	private Integer price;
	private Integer sellNum;
	private Integer evaluateNum;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSellNum() {
		return sellNum;
	}

	public void setSellNum(Integer sellNum) {
		this.sellNum = sellNum;
	}

	public Integer getEvaluateNum() {
		return evaluateNum;
	}

	public void setEvaluateNum(Integer evaluateNum) {
		this.evaluateNum = evaluateNum;
	}

}
