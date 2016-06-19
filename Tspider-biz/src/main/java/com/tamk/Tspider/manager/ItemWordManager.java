package com.tamk.Tspider.manager;

import java.util.List;

import com.tamk.Tspider.repository.model.ItemWordDO;
import com.tamk.Tspider.repository.model.query.ItemWordQuery;

/**
 * @author kuanqiang.tkq
 */
public interface ItemWordManager {
	List<ItemWordDO> queryItemWord(ItemWordQuery query);

	boolean batchInsertItemWord(List<ItemWordDO> itemWords);

	long insertItemWord(ItemWordDO itemWord);

	int deleteItemWord(ItemWordQuery query);
}
