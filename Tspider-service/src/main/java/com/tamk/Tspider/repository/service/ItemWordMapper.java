package com.tamk.Tspider.repository.service;

import java.util.List;

import com.tamk.Tspider.repository.model.ItemWordDO;
import com.tamk.Tspider.repository.model.query.ItemWordQuery;

/**
 * @author kuanqiang.tkq
 */
public interface ItemWordMapper {
	List<ItemWordDO> queryItemWord(ItemWordQuery query);

	boolean batchInsertItemWord(List<ItemWordDO> itemWords);

	long insertItemWord(ItemWordDO itemWord);

	int deleteItemWord(ItemWordQuery query);
}
