package com.tamk.Tspider.repository.model.query;

/**
 * @author kuanqiang.tkq
 */
public class BaseQuery {
	private Integer pageSize;
	private Integer pageNo;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getStart() {
		if (null == this.pageSize || null == this.pageNo) {
			throw new IllegalArgumentException();
		}

		return (this.pageNo - 1) * this.pageSize;
	}

}
