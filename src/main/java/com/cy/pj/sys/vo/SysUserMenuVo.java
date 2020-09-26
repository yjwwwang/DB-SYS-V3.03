package com.cy.pj.sys.vo;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
/**
 * 借助此类对象封装用户(登录用户)对应的菜单信息
 */

public class SysUserMenuVo implements Serializable{//XxxDao/SysUserService/PageController
	private static final long serialVersionUID = -6532648335943768546L;
	private Integer id;
	private String name;
	private String url;
	private List<SysUserMenuVo> childMenus;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SysUserMenuVo> getChildMenus() {
		return childMenus;
	}

	public void setChildMenus(List<SysUserMenuVo> childMenus) {
		this.childMenus = childMenus;
	}
}
