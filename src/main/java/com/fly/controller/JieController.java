package com.fly.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fly.pojo.FlyPost;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
import com.fly.service.PostService;
import com.fly.service.utils.UserUtils;

@Controller
@RequestMapping("jie")
public class JieController extends BaseController{
	
	
	@Autowired
	private PostService postService;
	
	/**
	 * 发表新帖
	 */
	@RequestMapping(value="add",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String addPost(FlyPost post) {
		if(!UserUtils.isLogin()) {
			return FlyResult.error("还没有登陆，请先登录");
		}
		FlyUser user = UserUtils.getCurrentUser();
		if("1".equals(user.getLocked())) {
			return FlyResult.error("账号已被锁定,解锁请联系管理员");
		}
		if(post.getContent().length()<8) {
			return FlyResult.error("详细描述太短啦");
		}	
		post.setUserId(user.getId());
		String result = postService.addPost(post);
		return result;
	}
	/**
	 * 编辑帖子
	 */
	@RequestMapping(value="edit",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String editPost(FlyPost post) {
		if(post.getContent().length()<8) {
			return FlyResult.error("详细描述太短啦");
		}
		String result = postService.editPost(post);
		return result;
	}
	/**
	 * 设置置顶、加精
	 */
	@RequestMapping(value="jie-set",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String setPost(String id, String field, String rank) {
		String result = null;
		if("boutiqued".equals(field)) {
			result = postService.jingPost(id, rank);
		}
		if("topped".equals(field)) {
			result = postService.topPost(id, rank);
		}
		return result;
	}
	/**
	 * 删帖
	 */
	@RequestMapping(value="jie-delete",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String deletePost(String id) {
		String result = postService.deletePost(id);
		return result;
	}
	/**
	 * 页面跳转，数据绑定
	 */
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String toAdd() {
		return "jie/add";
	}
	@RequestMapping(value="edit/{postId}",method=RequestMethod.GET)
	public String toEdit(@PathVariable("postId") String postId, Model model) {
		FlyPost post;
		try {
			post = postService.getPostById(postId);
		} catch (ParseException e) {
			e.printStackTrace();
			return "system/error";
		}
		model.addAttribute("post", post);
		return "jie/edit";
	}
	@RequestMapping(value="post/{postId}",method=RequestMethod.GET)
	public String toPost(@PathVariable("postId") String postId, Model model) {
		FlyPost post;
		try {
			post = postService.getPostById(postId);
		} catch (ParseException e) {
			e.printStackTrace();
			return "system/error";
		}
		model.addAttribute("post", post);
		return "jie/detail";
	}
}
