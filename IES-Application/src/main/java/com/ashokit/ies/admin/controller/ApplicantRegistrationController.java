package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.domain.ApplicantRegistration;
import com.ashokit.ies.admin.service.IAppRegistrationService;


@Controller
public class ApplicantRegistrationController {
	
	@Autowired
	private IAppRegistrationService service;

	@GetMapping("/loadApp")
	public String loadApp(Model model) {
		model.addAttribute("loadform",new ApplicantRegistration());
		return "ApplicantRegistration";
		
	}
	@PostMapping("/saveapp")
	public String saveApplicant(@ModelAttribute ("loadform")ApplicantRegistration reg,Model model) {
	boolean isSaved=service.saveAppRegistration(reg);
	if(isSaved) {
		if(reg.getAid()!=null) {
			model.addAttribute("succMsg","Update Regisration"+reg.getAppNo());
		}else {
				
			model.addAttribute("succMsg","Registration is completed with Id="+reg.getAppNo());
		}
	}
	else {
		model.addAttribute("errMsg","Failed to save");
	}
	model.addAttribute("loadform",new ApplicantRegistration());
		return "ApplicantRegistration";
		
	}
	@GetMapping("/getapp")
	public String getAllRegistration(Model model) {
	List<ApplicantRegistration> list=service.getAllAppRegistration();
	model.addAttribute("listapp",list);
		return "ViewAppRegistration";
		
	}
	
	  @GetMapping("/editapp")
	  public String editApp(@RequestParam("aid")String appNo,Model model) { 
		  ApplicantRegistration appreg=service.editAppRegistration(appNo); 
	        model.addAttribute("loadform",appreg);
	           return "ApplicantRegistration";
	  
	  }
	  
	  @GetMapping("/deleteApp") 
	  public String deleteApp(@RequestParam("aid")String appNo,Model model) {
		  service.deleteRegistration(appNo);
	  List<ApplicantRegistration> list=service.getAllAppRegistration();
	  model.addAttribute("listapp",list);
	  return "ViewAppRegistration";
	  
	  }
	 
		
	}
	

