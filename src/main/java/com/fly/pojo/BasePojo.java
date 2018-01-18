package com.fly.pojo;

import java.util.Date;
import java.util.UUID;

public class BasePojo {
	
	private String id;

	private Date createDate;
	private Date updateDate;
	//格式化的日期
	private String time;
	
	/**
	 * 插入操作时手动调用
	 */
	public void preInsert() {
		String  uuid = UUID.randomUUID().toString();
		String id = uuid.replaceAll("-", "");
		this.id=id;
		this.createDate = new Date();
		this.updateDate = new Date();
	}
	/**
	 * 更新前操作时手动调用
	 */
	public void preUpdate() {
		this.updateDate = new Date();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
