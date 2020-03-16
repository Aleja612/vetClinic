package com.vetclinic.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.entity.AppointmentResults;
import com.hibernate.util.Utils;
import com.vetclinic.idao.IAppointmentResultsDao;


public class AppointmentResultsDaoImpl implements IAppointmentResultsDao {
	public List<AppointmentResults> getAll() {// por cada entidad crud(Dao)
		Session session = Utils.getSessionFactory().openSession();
		List<AppointmentResults> appointmentResults = session.createQuery("From AppointmentResults ").list();
		session.close();
		System.out.println(appointmentResults);
		return appointmentResults;
	}

	// update a AppointmentResults
	public void updateAppointmentResults(Integer idAppointmentResults, AppointmentResults newAppointmentResults) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		AppointmentResults appointmentResults = (AppointmentResults) session.load(AppointmentResults.class, idAppointmentResults);//este es de la BD
		appointmentResults.setNamePet(newAppointmentResults.getNamePet());
		appointmentResults.setPrescriptionDrugs(newAppointmentResults.getPrescriptionDrugs());
		session.update(appointmentResults);
		session.getTransaction().commit();
		session.close();
	}

	// delete pet for id
	public void deleteAppointmentResults(Integer idAppointmentResults) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		AppointmentResults appointmentResults = (AppointmentResults) session.load(AppointmentResults.class, idAppointmentResults);
		session.delete(appointmentResults);
		session.getTransaction().commit();
		session.close();
	}

	public int saveAppointmentResults(AppointmentResults appointmentResults) {
		Session session = Utils.getSessionFactory().openSession();
		session.save(appointmentResults);
		session.close();
		return appointmentResults.getIdAppointmentResults();

	}

	public AppointmentResults getById(Integer idAppointmentResults) {
		Session session=Utils.getSessionFactory().openSession();
		AppointmentResults appointmentResults=(AppointmentResults)session.get(AppointmentResults.class, idAppointmentResults);
		return appointmentResults;
	}
}
