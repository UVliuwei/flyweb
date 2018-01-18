package com.fly.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fly.common.DateUtil;
import com.fly.mapper.FlyCollectionMapper;
import com.fly.mapper.FlyPostMapper;
import com.fly.pojo.FlyCollection;
import com.fly.pojo.FlyCollectionExample;
import com.fly.pojo.FlyCollectionExample.Criteria;
import com.fly.pojo.FlyPost;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
import com.fly.service.CollectionService;
import com.fly.service.utils.UserUtils;
@Service
public class CollectionService {
	
	@Autowired
	private FlyCollectionMapper collectionMapper;
	@Autowired
	private FlyPostMapper postMapper;
//	//操作收藏
//	public boolean oprateCollection(long userid, long postid, String opration) {
//
//		if("add".equals(opration)) {
//			addCollection(userid, postid);
//		}
//		if("delete".equals(opration)) {
//			deleteCollection(userid, postid);
//		}
//		return true;
//	}
	//添加收藏
	@Transactional
	public String addCollection(String postId) {
		FlyUser user = UserUtils.getCurrentUser();
		if(user == null) {
			return FlyResult.error("收藏失败,请重试");
		}
		FlyCollection collection = new FlyCollection();
		collection.setUserId(user.getId());
		collection.setPostId(postId);
		collection.preInsert();
		collectionMapper.insert(collection);
		return FlyResult.ok();
	}
	//取消收藏
	@Transactional
	public String deleteCollection(String postId) {
		FlyUser user = UserUtils.getCurrentUser();
		if(user == null) {
			return FlyResult.error("收藏失败,请重试");
		}
		FlyCollectionExample example = new FlyCollectionExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(user.getId());
		criteria.andPostIdEqualTo(postId);
		collectionMapper.deleteByExample(example);
		return FlyResult.ok();
	}
	//用户是否收藏此帖子
	public String checkCollection(String postId) {
		FlyUser user = UserUtils.getCurrentUser();
		if(user == null) {
			return FlyResult.error("");
		}
		FlyCollectionExample example=new FlyCollectionExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(user.getId());
		criteria.andPostIdEqualTo(postId);
		List<FlyCollection> list=collectionMapper.selectByExample(example);
		if(list==null || list.size()==0) {
			return FlyResult.error("");
		}
		return FlyResult.ok();
	}
//	//查询用户收藏的所有帖子
//	public List<CollectionResponse> getCollection(long userid) {
//		
//		FlyCollectionExample example=new FlyCollectionExample();
//		Criteria criteria=example.createCriteria();
//		example.setOrderByClause("created desc");
//		criteria.andUseridEqualTo(userid);
//		List<FlyCollection> list=collectionMapper.selectByExample(example);
//		List<CollectionResponse> list2=new ArrayList<CollectionResponse>();
//		for (FlyCollection flyCollection : list) {
//			CollectionResponse response=new CollectionResponse();
//			response.setPostid(flyCollection.getPostid());
//			response.setPostTitle(postMapper.selectByPrimaryKey(flyCollection.getPostid()).getPostTitle());
//			try {
//				response.setTime("收藏于"+DateUtil.getDate(collectionMapper.selectByPrimaryKey(flyCollection.getId()).getCreated()));
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			list2.add(response);
//		}
//		return list2;
//	}

}
