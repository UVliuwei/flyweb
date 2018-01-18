package com.fly.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class FlyPost extends BasePojo{

    private String userId;

    private String title;

    private String ptype;

    private String version;

    private String pcolumn;

    private Integer kiss;

    private Integer ansnum;

    private Integer popularity;
    
    //加精
    private String boutiqued;

    private String topped;

    private String ended;

    private String accepted;

    private String content;
    //发帖人
    private FlyUser user;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getPcolumn() {
        return pcolumn;
    }

    public void setPcolumn(String pcolumn) {
        this.pcolumn = pcolumn == null ? null : pcolumn.trim();
    }

    public Integer getKiss() {
        return kiss;
    }

    public void setKiss(Integer kiss) {
        this.kiss = kiss;
    }

    public Integer getAnsnum() {
        return ansnum;
    }

    public void setAnsnum(Integer ansnum) {
        this.ansnum = ansnum;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getBoutiqued() {
        return boutiqued;
    }

    public void setBoutiqued(String boutiqued) {
        this.boutiqued = boutiqued == null ? null : boutiqued.trim();
    }

    public String getTopped() {
        return topped;
    }

    public void setTopped(String topped) {
        this.topped = topped == null ? null : topped.trim();
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended == null ? null : ended.trim();
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted == null ? null : accepted.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	public FlyUser getUser() {
		return user;
	}

	public void setUser(FlyUser user) {
		this.user = user;
	}
	
	public String getColumn() {
		if("168".equals(pcolumn)) {
			return "公告";
		} else if("99".equals(pcolumn)) {
			return "分享";
		} else if("100".equals(pcolumn)) {
			return "讨论";
		} else if("101".equals(pcolumn)) {
			return "建议";
		} else {
			return "提问";
		}
	}
}