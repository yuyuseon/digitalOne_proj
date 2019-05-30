package com.DigitalOne.Book;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@Autowired
	ServletContext servletContext;
	
	@Autowired
	private SqlSession sqlsession;
	
	JdbcTemplate template;
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	//QnA 게시물 상세보기
	@RequestMapping(value="/memberLogin", method = RequestMethod.GET)
	public String QnAView(HttpServletRequest req, HttpServletResponse resp, Model model) {
		
		String idx = req.getParameter("idx");
		//QnADTO dto = sqlsession.getMapper(QnAImpl.class).getQnAInfo(idx);
		
		//model.addAttribute("dto", dto);
		model.addAttribute("FAQ", "");
		model.addAttribute("QnA", "");
		model.addAttribute("QnAInfo", "QnAInfo");
		
		return "member/memberLogin";
	}
	
}
