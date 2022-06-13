package com.omikuji.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class FormController {

	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	// ...
	@PostMapping("/post")
	public String login(
	    @RequestParam(value="number") Integer number,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="living") String living,
	    @RequestParam(value="nice") String nice,
	    @RequestParam Map<String, String> requestParams, HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		System.out.println("test post");
	    return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("nice", session.getAttribute("nice"));
		
		return "show.jsp";
	}

}
