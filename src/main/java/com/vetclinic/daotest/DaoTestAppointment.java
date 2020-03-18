package com.vetclinic.daotest;

import java.util.List;

import com.hibernate.entity.Appointment;
import com.vetclinic.dao.AppointmentDaoImpl;
import com.vetclinic.idao.IAppointmentDao;



public class DaoTestAppointment {
	public static void main(String[] args) {
	//Objeto para manipular el Dao
			IAppointmentDao appointmentDao = new AppointmentDaoImpl();
			
			
					//Prints Appointment
					List<Appointment> getAll = appointmentDao.getAll();
			        for(Appointment appointment:getAll){
			        System.out.println(appointment);
			        }
			     			
					//print Appointment
					
					//System.out.println("el idAppointment es"+AppointmentDao.getById(3));
					
					//get a Appointment
					//Appointment appointment= appointmentDao.getById(3);
					//appointment.setMedicationCost("50000");
					//System.out.println(appointment);
					
					//update Appointment
					//Appointment appointment = new Appointment(1,"Nala", 21:07:36 ,"Gratis","n ");
					//appointmentDao.updateAppointment(5,appointment);
					
					
					//save a pet
					//appointmentResultsDao.saveAppointmentResults();
					
					//delete a pet
					//appointmentResultsDao.deleteAppointmentResults(4);
}
}
