package org.gokuma.controller;

import java.util.List;

import javax.inject.Inject;

import org.gokuma.domain.BoardVO;
import org.gokuma.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		
		logger.info("register Get..................");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String registerPOST(BoardVO board, Model model) 
	// RedirectAttributes를 이용한 숨김 데이터의 전송
	public String registerPOST(BoardVO board, RedirectAttributes rttr) 
	throws Exception {
		
		logger.info("register POST..................");
		logger.info(board.toString());
		
		service.regist(board);
		
//		model.addAttribute("result", "success");
	 
		// RedirectAttributes를 이용한 숨김 데이터의 전송 addFlashAttributes -> http://localhost:8090/board/listAll
		// model.addAttribute로 전달시 http://localhost:8090/board/listAll?result=success
		rttr.addFlashAttribute("rttr", "success");
		
//		return "/board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "listAll" ,method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		
		logger.info("show all list........");
		
	}
	
}
