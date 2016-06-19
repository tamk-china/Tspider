package com.tamk.Tspider.manager;

import java.util.List;

import com.tamk.Tspider.repository.model.ItemDO;
import com.tamk.Tspider.repository.model.query.ItemQuery;

/**
 * @author kuanqiang.tkq
 */
public interface ItemManager {
	List<ItemDO> queryItems(ItemQuery query);

	int updateItem(ItemDO item);

	int deleteItem(ItemQuery query);

	long insertItem(ItemDO item);
	
	boolean batchInsertItem(List<ItemDO> items);
}
