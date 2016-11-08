package com.ygmy.quicksale.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ygmy.quicksale.pojo.StaffEntity;
import com.ygmy.quicksale.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	@Resource
	private StaffService staffService;
	
	@RequestMapping("/showStaff")
	public String toIndex(HttpServletRequest request,Model model){
		int staffId = Integer.parseInt(request.getParameter("id"));
		StaffEntity staff = this.staffService.getStaffById(staffId);
		model.addAttribute("staff", staff);
		return "showStaff";
	}
}
