package com.tamk.Tspider.rpc;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tamk.Tspider.manager.ItemManager;
import com.tamk.Tspider.manager.ItemWordManager;
import com.tamk.Tspider.repository.model.ItemDO;

/**
 * @author kuanqiang.tkq
 */
@Controller
@RequestMapping("/common")
public class Test {
	private Logger log = LoggerFactory.getLogger(Test.class);

	@Resource
	private ItemManager itemManager;

	@Resource
	private ItemWordManager itemWordManager;

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Object test() {
		ItemDO item =new ItemDO();
		item.setItemId(1L);
		item.setEvaluateNum(1);
		item.setItemTitle("test");
		item.setPrice(1);
		item.setSellNum(1);
		item.setSource(1);
		
		return itemManager.insertItem(item);
	}
}
