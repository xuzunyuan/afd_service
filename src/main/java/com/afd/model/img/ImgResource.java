package com.afd.model.img;

import java.io.Serializable;

public class ImgResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2393850093336402555L;

	public ImgResource() {
	}

	public ImgResource(String id) {
		this.setId(id);
	}

	/* 分配给图片的ID，使用ID下载图片 */
	private String id;

	/* 图片高度 */
	private int height;

	/* 图片宽度 */
	private int width;

	/* 文件类型 */
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
