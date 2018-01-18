package com.fly.pojo;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;


public class FlyResult extends JSONObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static String ok() {
		JSONObject result = new FlyResult();
		result.put("status", "1");
		return result.toJSONString();
	}
	public static String ok(String msg) {
		JSONObject result = new FlyResult();
		result.put("status", "1");
		result.put("msg", msg);
		return result.toJSONString();
	}
	public static String ok(String msg,String data) {
		JSONObject result = new FlyResult();
		result.put("status", "1");
		result.put("msg", msg);
		result.put("data", data);
		return result.toJSONString();
	}
	public static String action(String action,String msg) {
		JSONObject result = new FlyResult();
		result.put("status", "1");
		result.put("msg", msg);
		result.put("action", action);
		return result.toJSONString();
	}
	public static String action(String action) {
		JSONObject result = new FlyResult();
		result.put("status", "1");
		result.put("action", action);
		return result.toJSONString();
	}
	public static String error(String msg) {
		JSONObject result = new FlyResult();
		result.put("status", "0");
		result.put("msg", msg);
		return result.toJSONString();
	}

	
	
}
