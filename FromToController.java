package com.niit.training.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.training.services.ScheduleManagementService;

@Controller
public class FromToController {

	@Autowired
	ScheduleManagementService service;


	@RequestMapping(value = "/fromTo", method = RequestMethod.POST)
	public ModelAndView addUser() {
		ModelAndView view = new ModelAndView("listFromTo");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c=new GregorianCalendar();
		Date minDate=c.getTime();
		c.add(Calendar.DATE, 90);
		Date maxDate=c.getTime();
		view.addObject("maxDate", sdf.format(maxDate));
		//view.addObject("minDate", sdf.format(minDate));
		return view;
	}
	
	@RequestMapping(value = "/listFromTo", method = RequestMethod.POST)
	public ModelAndView findFlight(@RequestParam String from, @RequestParam String to, 
			@RequestParam("deptdate") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateTo,
			@RequestParam String noOfPassengers) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return new ModelAndView("listFromTo", "message", service.findSchedule(from,to,sdf.format(dateTo)));
	}
	
}
