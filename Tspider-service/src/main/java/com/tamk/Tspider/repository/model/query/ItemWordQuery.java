package com.tamk.Tspider.repository.model.query;

/**
 * @author kuanqiang.tkq
 */
public class ItemWordQuery extends BaseQuery {
	private Long id;

	private Long itemId;
	private Integer source;

	private String word;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
