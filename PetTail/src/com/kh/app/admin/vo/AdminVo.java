package com.kh.app.admin.vo;

import java.time.LocalDateTime;

public class AdminVo {
	private int no;
	private String id;
	private String pwd;
	private String nick;
	public AdminVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminVo(int no, String id, String pwd, String nick) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "AdminVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
		
}
