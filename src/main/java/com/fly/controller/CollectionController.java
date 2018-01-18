package com.fly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fly.service.CollectionService;

@Controller
@RequestMapping("collection")
public class CollectionController {
	
	@Autowired
	private CollectionService collectionService;
	
	/**
	 * 判断用户是否收藏此帖
	 **/
	@RequestMapping("find")
	@ResponseBody
	public String findCollection(String cid) {
		String result = collectionService.checkCollection(cid);
		return result;
	}
	/**
	 * 收藏/取消收藏
	 */
	@RequestMapping("{type}")
	@ResponseBody
	public String operateCollection(@PathVariable("type") String type, String cid) {
		String result = null;
		if("add".equals(type)) {
			result = collectionService.addCollection(cid);
		} else {
			result = collectionService.deleteCollection(cid);
		}
		return result;
	}
}
