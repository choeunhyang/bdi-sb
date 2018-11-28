package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.vo.Japan;


@RestController
public class JapanController {
	
	@Autowired
	/*private SqlSession ss;*/
	private JapanService js;
	
	@GetMapping("/japans")
	public @ResponseBody List<Map<String,String>> home() {
		/*return ss.selectList("com.example.demo.JAPAN.selectJapan");*/
		return null;
	}
	@GetMapping("/japans/{jpnum}")
	public @ResponseBody String selecthome(@PathVariable Integer jn) { 
		return null;
	}
	@PostMapping("/japans")
	public @ResponseBody Integer inserthome(@RequestBody Japan j) {
		return null;
	}
	@PutMapping("/japans/{jpnum}")
	public @ResponseBody Integer updatehome(@RequestBody Japan j) {
		return null;
	}
	@DeleteMapping("/japans/{jpnum}")
	public @ResponseBody Integer deletehome(@PathVariable Integer jn) {
		return null;
	}
	
}
