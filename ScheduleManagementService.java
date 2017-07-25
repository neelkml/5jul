package com.niit.training.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.training.DAO.ScheduleManagementDao;
import com.niit.training.model.ScheduleManagement;

@Service
@Transactional
public class ScheduleManagementService {
	
	@Autowired
	ScheduleManagementDao scheduleDao;
	
	public static List<ScheduleManagement> schedule = new ArrayList<>();

	public void addSchedule(final String fromAirport, final String toAirport, final String departureDate,
			final int flightNumber, final String flightCode, final String arrivalTime, final Double costPerTicket,
			final Double distanceInKM) {
		
	}

	public List<ScheduleManagement> listSchedule() {
		return schedule;
	}

	
	public List<ScheduleManagement> findSchedule(String from, String to, String deptdate) {
		
		return scheduleDao.findSchedule(from, to, deptdate);
	}

}
