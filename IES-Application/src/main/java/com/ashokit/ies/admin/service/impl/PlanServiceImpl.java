package com.ashokit.ies.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.domain.Plan;
import com.ashokit.ies.admin.entity.PlanEntity;
import com.ashokit.ies.admin.repository.PlanRepository;
import com.ashokit.ies.admin.service.IPlanService;

@Service
public class PlanServiceImpl implements IPlanService{

	@Autowired
	private PlanRepository repo;
	@Override
	
	public boolean savePlan(Plan plan) {
		PlanEntity entity=new PlanEntity();
		BeanUtils.copyProperties(plan, entity);
	  PlanEntity isSaved=repo.save(entity);
		return (isSaved!=null)? true : false ;
	}

	@Override
	public List<Plan> getAllPlan() {
	List<Plan> listplan=new ArrayList<Plan>();
	List<PlanEntity>entitylist=repo.findAll();
	entitylist.forEach(entity->{
	Plan p=	new Plan();
	BeanUtils.copyProperties(entity, p);
	listplan.add(p);
	});
		return listplan;
	}

	@Override
	public boolean updatePlan(Integer pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Plan editPlan(Integer pid) {
	Optional<PlanEntity> optional=	repo.findById(pid);
	if(optional.isPresent()) {
		PlanEntity planentity=optional.get();
	          Plan p=new Plan();
	BeanUtils.copyProperties(planentity, p);
	return p;
	}
		return null;
	}

	@Override
	public boolean deletePlan(Integer pid) {
		repo.deleteById(pid);
		return true;
	}

}