package com.niit.training.DAO;

import java.util.List;

import javax.ejb.SessionSynchronization;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.training.model.Airlines;
import com.niit.training.model.ScheduleManagement;

@Repository
public class ScheduleManagementDaoImpl implements ScheduleManagementDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void add(ScheduleManagement schedule) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(schedule);

	}

	@Override
	public void delete(String scheduleID) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ScheduleManagement schedule = (ScheduleManagement) session.get(Airlines.class, scheduleID);
		session.delete(schedule);

	}

	@Override
	public List<ScheduleManagement> listAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from ScheduleManagement").list();
	}

	@Override
	public void update(ScheduleManagement schedule) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(schedule);

	}

	@Override
	public ScheduleManagement getScheduleByID(String scheduleID) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (ScheduleManagement) session.get(ScheduleManagement.class, scheduleID);
	}

	@Override
	public List<ScheduleManagement> findSchedule(String from, String to, String deptdate) {
		Session session = sessionFactory.getCurrentSession();
		String str = "from ScheduleManagement sh where sh.fromAirport = '"
				+from + "' and toAirport ='" + to +"' and departureDate = '"
						+ deptdate +"'"; 
		return session.createQuery(str).list();
		
		
	}

}
