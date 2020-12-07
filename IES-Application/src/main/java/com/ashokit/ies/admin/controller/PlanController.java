package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.domain.Plan;
import com.ashokit.ies.admin.service.IPlanService;

@Controller
public class PlanController {
	@Autowired
	private IPlanService service;
	
	@GetMapping("/load")
	public String loadForm(Model model) {
		Plan pd=new Plan();
		model.addAttribute("planReg",pd);
		return "PlanRegister";
		
	}
	@PostMapping("/saveplan")
	public String savePlan(@ModelAttribute("planReg")Plan plan,Model model) {
		
		boolean save=service.savePlan(plan);
		if(save) {
		  if(plan.getPid()!=null){
			   model.addAttribute("succMsg","Plan update successfully");
			   }else {
			model.addAttribute("succMsg","plan save Successfully");
			}
		}else {
			model.addAttribute("errMsg","Failed to Save Plan");
		}
		model.addAttribute("planReg",new Plan());
		return "PlanRegister";
		
}
	@GetMapping("/getAllPlan")
	public String viewAllPlan(Model model) {
	List<Plan>listplan=	service.getAllPlan();
	model.addAttribute("listplan",listplan);
		return "viewPlan";
		
	}
	@GetMapping("/editPlan")
	public String editPlan(@RequestParam("pid")Integer pid,Model model) {
	Plan plan=	service.editPlan(pid);
	model.addAttribute("planReg",plan);
		return "PlanRegister";
		
	}
	@GetMapping("/deletePlan")
	public String deletePlan(@RequestParam("pid")Integer pid,Model model) {
		service.deletePlan(pid);
		List<Plan>listplan=	service.getAllPlan();
		model.addAttribute("listplan",listplan);
			return "viewPlan";
		
	}
}
