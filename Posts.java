package com.example.springGolang.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Posts {
	
	
	@Id
	private int idNo;
	private String user;
	private String tag;
	private String comment;
	
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Posts() {
		
		// TODO Auto-generated constructor stub
	}
	public Posts(int idNo, String user, String tag, String comment) {
		super();
		this.idNo = idNo;
		this.user = user;
		this.tag = tag;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Posts [idNo=" + idNo + ", user=" + user + ", tag=" + tag + ", comment=" + comment + "]";
	}
	
	
	
}
