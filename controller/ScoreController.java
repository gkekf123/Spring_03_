package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class ScoreController {

	// 1st - 멤버변수로 선언해도 된다
	// 갯수가 많아지면 많아진만큼 객체생성 해야된다
//	ScoreService service = new ServiceScoreImpl();
	
//	System.out.println(vo.toString());
	
	// 1st
	// 자식생성 부모저장!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	ScoreService service = new ServiceScoreImpl();
//	service.scoreRegist(vo);
	
	// 2st - 직접 빈등록 자동주입
//	@Autowired
//	ScoerService service;
	
	// 3st
	@Autowired
	ScoreService service;
	
	
	// 화면 처리
	// 등록
	@RequestMapping("/scoreRegist")
	public String scoreregist() {
		return "service/scoreRegist";
	}
	
	// 목록
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "service/scoreList";
	}
	
	// 결과
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}
	
	// 등록 요청
	@RequestMapping(value = "/scoreForm", method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		
		return "";
	}
	
}
