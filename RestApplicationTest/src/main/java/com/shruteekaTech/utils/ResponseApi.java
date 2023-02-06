package com.shruteekaTech.utils;


public class ResponseApi {
	
	private String msg;
	private boolean status;
	
	public ResponseApi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ResponseApi(String msg, boolean status) {
		super();
		this.msg = msg;
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ResponseApi [msg=" + msg + ", status=" + status + "]";
	}

	
}
