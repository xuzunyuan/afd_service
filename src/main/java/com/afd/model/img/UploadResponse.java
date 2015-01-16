package com.afd.model.img;


public class UploadResponse extends ImgResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 511292377113030114L;

	/* 返回状态码，大于0表示正常 */
	private int code;

	/* 描述 */
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
