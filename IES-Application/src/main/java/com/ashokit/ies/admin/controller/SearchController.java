package com.ashokit.ies.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.domain.ApplicantRegistration;
import com.ashokit.ies.admin.service.IAppRegistrationService;

@Controller
public class SearchController {
	@Autowired
	private IAppRegistrationService service;
	
	@GetMapping("/searchbar")
	public String searchApp(Model model) {
		model.addAttribute("caseApp",new ApplicantRegistration());
		return "Search";
		
	}
	
	
	  @GetMapping("/searchApp" ) 
	  public String searchRecord(@RequestParam("appNo")String appNo,Model model) {
	ApplicantRegistration appreg=  service.findByAppNo(appNo);
	if(appreg==null) {
	}else {
		 model.addAttribute("ar",appreg);
	}
		
	  return "CreateCase"; 
	  }
	 
	 
	/*
	 * @GetMapping("/searchApp") public String
	 * searchRecord(@RequestParam(defaultValue="appNo")String appNo,Model model) {
	 * ApplicantRegistration apr= service.getOneApplicantRegistration(appNo);
	 * model.addAttribute("ar",apr); return "CreateCase";
	 * 
	 * }
	 */
}
