package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.domain.Plan;


public interface IPlanService {
	
	public boolean savePlan(Plan plan);
	public List<Plan> getAllPlan();
	public boolean updatePlan(Integer pid);
	public Plan editPlan(Integer pid);
	public boolean deletePlan(Integer pid);

}
