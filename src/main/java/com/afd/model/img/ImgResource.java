package com.afd.model.img;

import java.io.Serializable;
import java.util.Date;

public class ImgResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2393850093336402555L;

	/* 分配给图片的ID，使用ID下载图片 */
	private String id;

	/* 创建时间 */
	private Date createTime;

	/* 文件大小 */
	private long size;

	/* 文件名称 */
	private String name;

	/* 图片高度 */
	private int height;

	/* 图片宽度 */
	private int width;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
