package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SingupController {

	private Map<String,String> radioMarriage;

	private Map<String, String> initRadioMarrige(){

		Map<String, String> radio = new LinkedHashMap<>();

		radio.put("既婚", "true");
		radio.put("未婚", "false");

		return radio;
	};

	@GetMapping("/signup")
	public String getSingUp(Model model) {

		radioMarriage = initRadioMarrige();

		model.addAttribute("radioMarriage",radioMarriage);


		return "login/signup";
	}


	@PostMapping("/signup")
	public String postSignUp(Model model) {

		return "redirect:/login";
	}


}
