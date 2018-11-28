package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.Japan;

public interface JapanDAO {
	public List<Japan> home();
	public Japan selecthome(Integer jn);
	public int inserthome(Japan j);
	public int updatehome(Japan j);
	public int deletehome(Integer jn);
}
