package com.tamk.Tspider.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import com.tamk.Tspider.manager.ItemManager;
import com.tamk.Tspider.repository.model.ItemDO;
import com.tamk.Tspider.repository.model.query.ItemQuery;
import com.tamk.Tspider.repository.service.ItemMapper;

public class ItemManagerImpl implements ItemManager {
	@Resource
	private ItemMapper itemMapper;

	@Override
	public List<ItemDO> queryItems(ItemQuery query) {
		if (null == query) {
			throw new IllegalArgumentException();
		}

		return itemMapper.queryItems(query);
	}

	@Override
	public int updateItem(ItemDO item) {
		if (null == item) {
			throw new IllegalArgumentException();
		}

		return itemMapper.updateItem(item);
	}

	@Override
	public int deleteItem(ItemQuery query) {
		if (null == query) {
			throw new IllegalArgumentException();
		}

		return itemMapper.deleteItem(query);
	}

	@Override
	public long insertItem(ItemDO item) {
		if (null == item) {
			throw new IllegalArgumentException();
		}

		return itemMapper.insertItem(item);
	}

	@Override
	public boolean batchInsertItem(List<ItemDO> items) {
		if (null == items) {
			throw new IllegalArgumentException();
		}

		try {
			itemMapper.batchInsertItem(items);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
