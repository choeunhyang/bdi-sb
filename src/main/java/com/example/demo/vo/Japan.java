package com.example.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class Japan {
	private Integer jpnum;
	private String jpname;
	private Integer jpage;
	
	public Integer getJpnum() {
		return jpnum;
	}

	public void setJpnum(Integer jpnum) {
		this.jpnum = jpnum;
	}

	public String getJpname() {
		return jpname;
	}

	public void setJpname(String jpname) {
		this.jpname = jpname;
	}

	public Integer getJpage() {
		return jpage;
	}

	public void setJpage(Integer jpage) {
		this.jpage = jpage;
	}

	@Override
	public String toString() {
		return "Japan [jpnum=" + jpnum + ", jpname=" + jpname + ", jpage=" + jpage + "]";
	}
	
}
