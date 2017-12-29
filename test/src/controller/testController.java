package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.testDAO;

@Controller
public class testController {
	@Autowired
	testDAO tdao;

	@RequestMapping({"/","/index.do"})
	public String test() {
		return "index";
	}
}
