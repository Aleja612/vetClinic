package com.vetclinic.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.entity.Appointment;
import com.hibernate.util.Utils;
import com.vetclinic.idao.IAppointmentDao;


public class AppointmentDaoImpl implements IAppointmentDao {
	public List<Appointment> getAll() {// por cada entidad crud(Dao)
		Session session = Utils.getSessionFactory().openSession();
		List<Appointment> appointment = session.createQuery("From Appointment").list();
		session.close();
		System.out.println(appointment);
		return appointment;
	}

	// update a AppointmentResults
	public void updateAppointment(Integer idAppointment, Appointment newAppointment) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		Appointment appointment = (Appointment) session.load(Appointment.class, idAppointment);//este es de la BD
		appointment.setDateAppointment(newAppointment.getDateAppointment());
		appointment.setMedicationCost(newAppointment.getMedicationCost());
		appointment.setNameOwner(newAppointment.getNameOwner());
		appointment.setNamePet(newAppointment.getNamePet());
		appointment.setObservations(newAppointment.getObservations());
		session.update(appointment);
		session.getTransaction().commit();
		session.close();
	}

	// delete pet for id
	public void deleteAppointment(Integer idAppointment) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		Appointment appointment = (Appointment) session.load(Appointment.class, idAppointment);
		session.delete(appointment);
		session.getTransaction().commit();
		session.close();
	}

	public int saveAppointment(Appointment appointment) {
		Session session = Utils.getSessionFactory().openSession();
		session.save(appointment);
		session.close();
		return appointment.getIdAppointment();

	}

	public Appointment getById(Integer idAppointment) {
		Session session=Utils.getSessionFactory().openSession();
		Appointment appointment=(Appointment)session.get(Appointment.class, idAppointment);
		return appointment;
	}
}
