package com.vetclinic.dao;

import java.util.List;

import org.hibernate.Session;


import com.hibernate.entity.PetOwner;
import com.hibernate.util.Utils;
import com.vetclinic.idao.IPetDao;
import com.vetclinic.idao.IPetOwnerDao;

public class PetOwnerDaoImpl implements IPetOwnerDao{

	//lista de tipo petOwner
		List<PetOwner> petOwners;

	// get all the petOwners
	public List<PetOwner> getAll() {// por cada entidad crud(Dao)
		Session session = Utils.getSessionFactory().openSession();
		List<PetOwner> petOwners = session.createQuery("From PetOwner ").list();
		session.close();
		System.out.println(petOwners);
		return petOwners;
	}

	// update a petOwner
	public void updatePetOwner(Integer idPetOwner, PetOwner newPetOwner) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		PetOwner petOwner = (PetOwner) session.load(PetOwner.class, idPetOwner);//este es de la BD
		petOwner.setLastnameOwner(newPetOwner.getLastnameOwner());
		petOwner.setNameOwner(newPetOwner.getNameOwner());
		petOwner.setTelephone(newPetOwner.getTelephone());
		petOwner.setPets(newPetOwner.getPets());
		session.update(petOwner);
		session.getTransaction().commit();
		session.close();
	}

	// delete pet for id
	public void deletePetOwner(Integer idPetOwner) {
		Session session = Utils.getSessionFactory().openSession();
		session.beginTransaction();
		PetOwner petOwner = (PetOwner) session.load(PetOwner.class, idPetOwner);
		session.delete(petOwner);
		session.getTransaction().commit();
		session.close();
	}

	public int savePetOwner(PetOwner petOwner) {
		Session session = Utils.getSessionFactory().openSession();
		petOwner.setNameOwner(petOwner.getNameOwner());
		petOwner.setLastnameOwner(petOwner.getLastnameOwner());
		petOwner.setTelephone(petOwner.getTelephone());
		session.save(petOwner);
		session.close();
		return petOwner.getIdPetOwner();

	}

	public PetOwner getById(Integer idPetOwner) {
		Session session=Utils.getSessionFactory().openSession();
		PetOwner petOwner=(PetOwner)session.get(PetOwner.class, idPetOwner);
		return petOwner;
	}
}
