package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;

	  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
	  public void listAll(Model model) throws Exception {

	    logger.info("show all list......................????????");
	    model.addAttribute("list", service.listAll());
	    BoardVO vo = new BoardVO();
	    System.out.println(vo.getBno());
	    System.out.println(vo.getTitle());
	    
	  }

}
