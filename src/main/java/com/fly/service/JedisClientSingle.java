package com.fly.service;

import org.springframework.beans.factory.annotation.Autowired;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClientSingle  {

	@Autowired
	private JedisPool jedisPool;
	
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get(key);
		jedis.close();
		return string;
	}

	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.set(key, value);
		jedis.close();
		return string;
	}

	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		return string;
	}

	public long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
		
	}

	public long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	public long expire(String key, long second) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key,(int) second);
		jedis.close();
		return result;
	}

	public long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}
	public void del(String key) {
			
		Jedis jedis=jedisPool.getResource();
		jedis.del(key);
		jedis.close();
	}

}
