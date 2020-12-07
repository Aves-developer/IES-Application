package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashokit.ies.admin.domain.AccountRegistration;
import com.ashokit.ies.admin.service.IRegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private IRegistrationService service;
	
	@GetMapping("/welcome")
	public String loadRegForm(Model model) {
		AccountRegistration accobj=new AccountRegistration();
		model.addAttribute("accReg",accobj);
		return "index";
	}

	@PostMapping("/save")
	public String sbmtForm(@ModelAttribute("accReg") AccountRegistration accform, Model model) {
		boolean isSaved=service.saveRegistration(accform);
		     if(isSaved) {
		    	 if(accform.getId()!=null) {
		    		 model.addAttribute("succMsg","Updated successfully"); 
		    	 }else {
				model.addAttribute("succMsg", "registration is successfull");
		    	 }
			 }else {
				 model.addAttribute("errMsg", "Registration is failed");
			 }
			model.addAttribute("accReg",new AccountRegistration());
	
		return "index";
	}


	@GetMapping("/getAll")
	public String loadAllData(Model model) {
	List<AccountRegistration> listAcc=	service.fetchAllRecord();
	model.addAttribute("account",listAcc);
		return "viewAccount";
		
	}
	@GetMapping("/edit")
	public String editAccount(@RequestParam("id")Integer id,Model model) {
	AccountRegistration account=	service.editRegistrationData(id);
	model.addAttribute("accReg",account);
		return "index";
	}
	
	@GetMapping("/uniqueMail")
	public @ResponseBody String uniqueMailCheck(@RequestParam("email")String email) {
	boolean isUnique=	service.isUniqeEmail(email);
		return isUnique ? "UNIQUE":"DUPLICATE";
		
	}
	@GetMapping("/delete")
	public String deleteRegistration(@RequestParam("id")Integer id,Model model) {
		service.deleteRegistration(id);
		List<AccountRegistration> listAcc=service.fetchAllRecord();
		model.addAttribute("account",listAcc);
		return "viewAccount";
		
	}
}