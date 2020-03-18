package com.vetclinic.idao;

import java.util.List;

import com.hibernate.entity.AppointmentResults;



public interface IAppointmentResultsDao {
	public List<AppointmentResults> getAll();
	public AppointmentResults getById(Integer idAppointmentResults);
	public void updateAppointmentResults(Integer idAppointmentResults, AppointmentResults appointmentResults);
	public void deleteAppointmentResults(Integer idAppointmentResults);
	public int saveAppointmentResults (AppointmentResults appointmentResults);
}
