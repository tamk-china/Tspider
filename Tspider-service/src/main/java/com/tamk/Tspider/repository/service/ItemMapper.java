package com.tamk.Tspider.repository.service;

import java.util.List;

import com.tamk.Tspider.repository.model.ItemDO;
import com.tamk.Tspider.repository.model.query.ItemQuery;

/**
 * @author kuanqiang.tkq
 */
public interface ItemMapper {
	List<ItemDO> queryItems(ItemQuery query);

	int updateItem(ItemDO item);

	int deleteItem(ItemQuery query);

	long insertItem(ItemDO item);
	
	boolean batchInsertItem(List<ItemDO> items);
}
