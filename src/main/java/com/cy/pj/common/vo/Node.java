package com.cy.pj.common.vo;

import java.io.Serializable;

import lombok.Data;


public class Node implements Serializable{
	private static final long serialVersionUID = 2048083156365694892L;
	private Integer id;
	private String name;
	private Integer parentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
