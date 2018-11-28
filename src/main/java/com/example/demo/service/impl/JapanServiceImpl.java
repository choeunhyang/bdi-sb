package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;
import com.example.demo.vo.Japan;

@Service
public class JapanServiceImpl implements JapanService{

	@Autowired
	private JapanDAO jdao;
	
	@Override
	public List<Japan> home() {
		return jdao.home();
	}

	@Override
	public Japan selecthome(Integer jn) {
		return jdao.selecthome(jn);
	}

	@Override
	public int inserthome(Japan j) {
		return jdao.inserthome(j);
	}

	@Override
	public int updatehome(Japan j) {
		return jdao.updatehome(j);
	}

	@Override
	public int deletehome(Integer jn) {
		return jdao.deletehome(jn);
	}
 
}
