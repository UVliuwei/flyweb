
package com.fly.service;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fly.common.DateUtil;
import com.fly.mapper.FlyAnswerMapper;
import com.fly.mapper.FlyCollectionMapper;
import com.fly.mapper.FlyPostMapper;
import com.fly.mapper.FlyUserMapper;
import com.fly.pojo.FlyPost;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
@Service
public class PostService {
	
	@Autowired
	private FlyPostMapper postMapper;
	@Autowired
	private FlyUserMapper userMapper;
	@Autowired
	private UserService userService;
//	@Autowired
//	private JedisClient jedisClient;
	@Autowired
	private FlyAnswerMapper answerMapper;
	@Autowired
	private FlyCollectionMapper collectionMapper;
	
	//创建新的帖子
	@Transactional
	public String addPost(FlyPost post) {
		
		try {
			post.setAnsnum(0);
			post.setBoutiqued("0");
			post.setEnded("0");
			post.setPopularity(0);
			post.setTopped("0");
			post.preInsert();
			postMapper.insert(post);
			return FlyResult.action("/index", "发帖成功");
		} catch (Exception e) {
			e.printStackTrace();
			return FlyResult.error("发帖失败，请重试");
		}
	}
	//编辑帖子
	@Transactional
	public String editPost(FlyPost post) {
		
		try {
			post.preUpdate();
			postMapper.updateByPrimaryKeySelective(post);
			return FlyResult.action("/jie/post/"+post.getId(), "编辑成功");
		} catch (Exception e) {
			e.printStackTrace();
			return FlyResult.error("编辑失败，请重试");
		}
	}
	//根据Id查询帖子
	@Transactional(readOnly=true)
	public FlyPost getPostById(String postId) throws ParseException {
		
		FlyPost post = postMapper.selectByPrimaryKey(postId);
		FlyUser user = userMapper.selectByPrimaryKey(post.getUserId());
		post.setUser(user);
		post.setTime(DateUtil.getDate(post.getCreateDate()));
		return post;
	}
	//置顶帖子
	@Transactional
	public String topPost(String id, String rank) {
		FlyPost post=new FlyPost();
		post.setId(id);
		post.setTopped(rank);
		postMapper.updateByPrimaryKeySelective(post);
		return FlyResult.ok();
	}
	//加精
	@Transactional
	public String jingPost(String id, String rank) {
		FlyPost post=new FlyPost();
		post.setId(id);
		post.setBoutiqued(rank);
		postMapper.updateByPrimaryKeySelective(post);	
		return FlyResult.ok();
	}
	//删除帖子
	@Transactional
	public String deletePost(String id) {
		try {
			postMapper.deleteByPrimaryKey(id);
//			FlyAnswerExample example=new FlyAnswerExample();
//			example.createCriteria().andPostidEqualTo(postid);
//			answerMapper.deleteByExample(example);
//			FlyCollectionExample example2=new FlyCollectionExample();
//			example2.createCriteria().andPostidEqualTo(postid);
//			collectionMapper.deleteByExample(example2);
//			List<FlyPost> list=JsonUtils.jsonToList(jedisClient.get("topPost"), FlyPost.class);
//			for (FlyPost flyPost : list) {
//				if(list!=null && flyPost.getPostid().equals(postid)) {
//					jedisClient.del("topPost");
//				}
//			}
			return FlyResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return FlyResult.error("删除失败,请重试");
		}
	}
//	//根据时间查询首页(index/index)的25个帖子
//	public List<PostCatalog> getPostListOrderByTime() {
//		
//		try {
//			FlyPostExample example=new FlyPostExample();
//			example.setOrderByClause("created desc");
//			Criteria criteria=example.createCriteria();
//			criteria.andPostTopEqualTo("0");
//			List<FlyPost> postList=postMapper.selectByExampleWithBLOBs(example);
//			List<PostCatalog> postCatalogList=new ArrayList<PostCatalog>();
//			int count=0;
//			for (FlyPost flyPost : postList) {
//				PostCatalog catalog=new PostCatalog();
//				FlyUser user=userMapper.selectByPrimaryKey(flyPost.getUserid());
//				catalog.setPost(flyPost);
//				catalog.setImage(user.getImg());
//				catalog.setName(user.getName());
//				catalog.setTime(DateUtil.getDate(flyPost.getCreated()));
//				postCatalogList.add(catalog);	
//				count++;
//				if(count>25) {
//					break;
//				}
//			}	
//			return postCatalogList;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	//首页按条件查询置顶的帖子
//	public List<PostCatalog> getPostCatalogByTop(String term) {
//		
//		try {
//			FlyPostExample example=new FlyPostExample();
//			example.setOrderByClause("created desc");
//			Criteria criteria=example.createCriteria();
//			criteria.andPostTopEqualTo("1");
//			if("wonderful".equals(term)) {
//				criteria.andPostBoutiqueEqualTo("1");
//			}
//			if("solved".equals(term)) {
//				criteria.andPostEndEqualTo("1");
//			}
//			if("unsolved".equals(term)) {
//				criteria.andPostEndEqualTo("0");
//			}	
//			List<FlyPost> postList=postMapper.selectByExampleWithBLOBs(example);
//			List<PostCatalog> postCatalogList=new ArrayList<PostCatalog>();
//			if(postList.size()!=0) {
//				for (FlyPost flyPost : postList) {
//					PostCatalog catalog=new PostCatalog();
//					FlyUser user=userMapper.selectByPrimaryKey(flyPost.getUserid());
//					catalog.setPost(flyPost);
//					catalog.setImage(user.getImg());
//					catalog.setName(user.getName());
//					catalog.setTime(DateUtil.getDate(flyPost.getCreated()));
//					postCatalogList.add(catalog);	
//				}	
//				return postCatalogList;
//			} else {
//				return null;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//	//分页查询
//	public FlyPageInfo getPostCatalogPage(int page, int rows,String sign) {
//		FlyPostExample example=new FlyPostExample();
//		PageHelper.startPage(page, rows);
//		example.setOrderByClause("created desc");
//		Criteria criteria=example.createCriteria();
//		criteria.andPostTopEqualTo("0");
//		if("unsolved".equals(sign)) {
//			criteria.andPostEndEqualTo("0");
//		}
//		if("solved".equals(sign)) {
//			criteria.andPostEndEqualTo("1");
//		}
//		if("wonderful".equals(sign)) {
//			criteria.andPostBoutiqueEqualTo("1");
//		}
//		List<FlyPost> postList=postMapper.selectByExampleWithBLOBs(example);
//		PageInfo<FlyPost> pageInfo=new PageInfo<FlyPost>(postList);
//		List<PostCatalog> catalogList=new ArrayList<PostCatalog>();
//		long total = pageInfo.getTotal();
//		for (FlyPost flyPost : postList) {
//			PostCatalog catalog=new PostCatalog();
//			long userid=flyPost.getUserid();
//			FlyUser user=userService.getUserById(userid);
//			catalog.setImage(user.getImg());
//			catalog.setName(user.getName());
//			catalog.setPost(flyPost);
//			try {
//				catalog.setTime(DateUtil.getDate(flyPost.getCreated()));
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			catalogList.add(catalog);
//		}
//		FlyPageInfo flyPageInfo=new FlyPageInfo(page, TotalUtil.gePagetTotal(total, rows), total,catalogList );
//		return flyPageInfo;
//	}

//	//获取帖子所含内容
//	public PostCatalog getPostCatalog(long postId) {
//		
//		FlyPost post=getPostById(postId);
//		FlyUser user=userService.getUserById(post.getUserid());
//		PostCatalog catalog=new PostCatalog();
//		catalog.setImage(user.getImg());
//		catalog.setName(user.getName());
//		try {
//			catalog.setTime(DateUtil.getDate(post.getCreated()));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		catalog.setPost(post);
//		return catalog;
//	}
//	//获取user发的帖子
//	public List<PostCatalog> getPostCatalogByUserId(long userid) {
//		FlyPostExample example=new FlyPostExample();
//		example.setOrderByClause("created desc");
//		example.createCriteria().andUseridEqualTo(userid);
//		List<FlyPost> postList=postMapper.selectByExampleWithBLOBs(example);
//		List<PostCatalog> catalogs=new ArrayList<PostCatalog>();
//		for (FlyPost flyPost : postList) {
//			PostCatalog catalog=new PostCatalog();
//			catalog.setPost(flyPost);
//			try {
//				catalog.setTime(DateUtil.getDate(flyPost.getCreated()));
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			catalogs.add(catalog);
//		}
//		return catalogs;
//	}
//	//增加人气
//	public void addPostPop(long postid) {
//		
//		FlyPost flyPost=postMapper.selectByPrimaryKey(postid);
//		FlyPost post=new FlyPost();
//		post.setPostid(postid);
//		post.setPostPopularity(flyPost.getPostPopularity()+1);
//		postMapper.updateByPrimaryKeySelective(post);
//	}

//	//获取侧栏热帖
//	public List<FlyPost> getPostByPop() {
//		String json=jedisClient.get("topPost");
//		if(json!=null && !json.equals("")) {
//			return JsonUtils.jsonToList(json, FlyPost.class);
//		}
//		FlyPostExample example=new FlyPostExample();
//		example.setOrderByClause("post_popularity desc");
//		List<FlyPost> list=postMapper.selectByExampleWithBLOBs(example);
//		int num=0;
//		List<FlyPost> postList=new ArrayList<FlyPost>();
//		for (FlyPost flyPost : list) {
//			num++;
//			postList.add(flyPost);
//			if(num>=20) {
//				break;
//			}
//		}
//		jedisClient.set("topPost", JsonUtils.objectToJson(list));
//		jedisClient.expire("topPost", 60*60);
//		return postList;
//	}

	
	
//	//采纳最佳答案
//	public boolean acceptAnswer(long answerid, long postid) {
//		try {
//			FlyPost post=new FlyPost();
//			post.setPostid(postid);
//			post.setPostEnd("1");
//			post.setPostAccept(answerid);
//			postMapper.updateByPrimaryKeySelective(post);
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
}
