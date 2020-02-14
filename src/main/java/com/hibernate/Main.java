package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Appointment;
import com.hibernate.entity.AppointmentResults;
import com.hibernate.entity.Pet;
import com.hibernate.entity.PetOwner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration().configure();
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		SessionFactory sessionFactory = conf.buildSessionFactory(builder.build());
		return sessionFactory;
		
	}

	public static List<Pet> getAll() {
		Session session = getSessionFactory().openSession();
		List<Pet> pets = session.createQuery("FROM Pet").list();
		session.close();
		System.out.println("Size: " + pets.size());
		return pets;
	}
	
	public static List<PetOwner> getAllO() {
		Session session = getSessionFactory().openSession();
		List<PetOwner> owners = session.createQuery("FROM pet_owner").list();
		session.close();
		System.out.println("Size: " + owners.size());
		return owners;
	}
	
	public static List<Appointment> getAllA() {
		Session session = getSessionFactory().openSession();
		List<Appointment> appointments = session.createQuery("FROM appointment").list();
		session.close();
		System.out.println("Size: " + appointments.size());
		return appointments;
	}
	
	public static List<AppointmentResults> getAllAR() {
		Session session = getSessionFactory().openSession();
		List<AppointmentResults> appointmentResults = session.createQuery("FROM appointment_results").list();
		session.close();
		System.out.println("Size: " + appointmentResults.size());
		return appointmentResults;
	}
	
	public static int save(Pet pet) {
		Session session = getSessionFactory().openSession();
		session.save(pet);
		session.close();
		return pet.getIdPet();
	}
	
	public static int save(PetOwner petOwner) {
		Session session = getSessionFactory().openSession();
		session.save(petOwner);
		session.close();
		return petOwner.getIdPetOwner();
	}
	
	public static int save(Appointment appointment) {
		Session session = getSessionFactory().openSession();
		session.save(appointment);
		session.close();
		return appointment.getIdAppointment();
	}
	
	public static int save(AppointmentResults appointmentResults) {
		Session session = getSessionFactory().openSession();
		session.save(appointmentResults);
		session.close();
		return appointmentResults.getIdAppointmentResults();
	}

	public static void update(Integer idPet) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Pet pet = (Pet) session.load(Pet.class,idPet );
		session.update(pet);
		session.getTransaction().commit();
		session.close();
		}
	
	public static void updateO(Integer idPetOwner) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		PetOwner petOwner = (PetOwner) session.load(Pet.class,idPetOwner);
		session.update(petOwner);
		session.getTransaction().commit();
		session.close();
		}
	
	public static void updateA(Integer idAppointment) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Appointment appointment = (Appointment) session.load(Pet.class,idAppointment);
		session.update(appointment);
		session.getTransaction().commit();
		session.close();
		}
	
	public static void updateAR(Integer idAppointmentResults) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Appointment appointmentResults = (Appointment) session.load(Pet.class,idAppointmentResults);
		session.update(appointmentResults);
		session.getTransaction().commit();
		session.close();
		}
	
	public static void delete(Integer idPet) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Pet pet =(Pet) session.load(Pet.class, idPet);//estamos trayendo la entidad de la base de datos
		session.delete(pet);//no retorna nada void
		session.getTransaction().commit();
		session.close();
	}
	
	public static void deleteO(Integer idPetOwner) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		PetOwner petOwner =(PetOwner) session.load(PetOwner.class, idPetOwner);
		session.delete(petOwner);
		session.getTransaction().commit();
		session.close();
	}
	
	public static void deletA(Integer idAppointment) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Appointment appointment =(Appointment) session.load(Appointment.class, idAppointment);
		session.delete(appointment);
		session.getTransaction().commit();
		session.close();
	}
	
	public static void deletAR(Integer idAppointmentResults) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		AppointmentResults appointmentResults =(AppointmentResults) session.load(AppointmentResults.class, idAppointmentResults);
		session.delete(appointmentResults);
		session.getTransaction().commit();
		session.close();
	}


}
