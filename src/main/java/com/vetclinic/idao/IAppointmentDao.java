package com.vetclinic.idao;

import java.util.List;

import com.hibernate.entity.Appointment;



public interface IAppointmentDao {
	public List<Appointment> getAll();
	public Appointment getById(Integer idAppointment);
	public void updateAppointment(Integer idAppointment, Appointment appointment);
	public void deleteAppointment(Integer idAppointment);
	public int saveAppointment (Appointment appointment);
}
