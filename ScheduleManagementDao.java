package com.niit.training.DAO;


	import java.sql.Date;
import java.util.List;

	import com.niit.training.model.ScheduleManagement;

	public interface ScheduleManagementDao {
		
		void add(ScheduleManagement schedule);

		void delete(String scheduleID);

		List<ScheduleManagement> listAll();

		void update(ScheduleManagement schedule);

		ScheduleManagement getScheduleByID(String scheduleID);
		
		List<ScheduleManagement> findSchedule(String from, String to, String date);
	}

