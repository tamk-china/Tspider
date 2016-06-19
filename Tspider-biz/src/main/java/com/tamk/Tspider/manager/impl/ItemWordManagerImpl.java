package com.tamk.Tspider.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tamk.Tspider.manager.ItemWordManager;
import com.tamk.Tspider.repository.model.ItemWordDO;
import com.tamk.Tspider.repository.model.query.ItemWordQuery;
import com.tamk.Tspider.repository.service.ItemWordMapper;

/**
 * @author kuanqiang.tkq
 */
@Service("itemWordManager")
public class ItemWordManagerImpl implements ItemWordManager {
	@Resource
	private ItemWordMapper itemWordMapper;

	@Override
	public List<ItemWordDO> queryItemWord(ItemWordQuery query) {
		if (null == query) {
			throw new IllegalArgumentException();
		}

		return itemWordMapper.queryItemWord(query);
	}

	@Override
	public boolean batchInsertItemWord(List<ItemWordDO> itemWords) {
		if (null == itemWords) {
			throw new IllegalArgumentException();
		}

		try {
			itemWordMapper.batchInsertItemWord(itemWords);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public long insertItemWord(ItemWordDO itemWord) {
		if (null == itemWord) {
			throw new IllegalArgumentException();
		}

		return itemWordMapper.insertItemWord(itemWord);
	}

	@Override
	public int deleteItemWord(ItemWordQuery query) {
		if (null == query) {
			throw new IllegalArgumentException();
		}

		return itemWordMapper.deleteItemWord(query);
	}

}
