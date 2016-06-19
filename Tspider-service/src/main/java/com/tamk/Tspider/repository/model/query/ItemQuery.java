package com.tamk.Tspider.repository.model.query;

import java.util.List;

/**
 * @author kuanqiang.tkq
 */
public class ItemQuery extends BaseQuery {
	private Long id;
	private List<Long> ids;

	private String itemTitle;

	private Long itemId;
	private List<Long> itemIds;

	private Integer priceFrom;
	private Integer priceTo;

	private Integer sellNumFrom;
	private Integer sellNumTo;

	private Integer evaluateNumFrom;
	private Integer evaluateNumTo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public List<Long> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<Long> itemIds) {
		this.itemIds = itemIds;
	}

	public Integer getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(Integer priceFrom) {
		this.priceFrom = priceFrom;
	}

	public Integer getPriceTo() {
		return priceTo;
	}

	public void setPriceTo(Integer priceTo) {
		this.priceTo = priceTo;
	}

	public Integer getSellNumFrom() {
		return sellNumFrom;
	}

	public void setSellNumFrom(Integer sellNumFrom) {
		this.sellNumFrom = sellNumFrom;
	}

	public Integer getSellNumTo() {
		return sellNumTo;
	}

	public void setSellNumTo(Integer sellNumTo) {
		this.sellNumTo = sellNumTo;
	}

	public Integer getEvaluateNumFrom() {
		return evaluateNumFrom;
	}

	public void setEvaluateNumFrom(Integer evaluateNumFrom) {
		this.evaluateNumFrom = evaluateNumFrom;
	}

	public Integer getEvaluateNumTo() {
		return evaluateNumTo;
	}

	public void setEvaluateNumTo(Integer evaluateNumTo) {
		this.evaluateNumTo = evaluateNumTo;
	}

}
