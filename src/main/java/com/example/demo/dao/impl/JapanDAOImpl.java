package com.example.demo.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.JapanDAO;
import com.example.demo.vo.Japan;

@Repository
public class JapanDAOImpl implements JapanDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Japan> home() {
		return ss.selectList("com.example.demo.JAPAN.selectJapan");
	}

	@Override
	public Japan selecthome(Integer jn) {
		return ss.selectOne("com.example.demo.JAPAN.Japan",jn);
	}

	@Override
	public int inserthome(Japan j) {
		return ss.insert("com.example.demo.JAPAN.insertJapan",j);
	}

	@Override
	public int updatehome(Japan j) {
		return ss.update("com.example.demo.JAPAN.updateJapan",j);
	}

	@Override
	public int deletehome(Integer jn) {
		return ss.delete("com.example.demo.JAPAN.deleteJapan",jn);
	}
	
}
