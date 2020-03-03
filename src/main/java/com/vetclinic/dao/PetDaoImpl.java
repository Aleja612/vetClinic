package com.vetclinic.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.entity.Pet;
import com.hibernate.util.Utils;
import com.vetclinic.idao.IPetDao;


public class PetDaoImpl implements IPetDao{

	//lista de tipo pet
	List<Pet> pets;
	
	//inicializar los objetos pet y añadirlos a la lista
		/*public PetDaoImpl() {
			pets = new ArrayList<Pet>();
			Pet pet1 = new Pet("Deimos", "Perro","Masculino","dos años");
			Pet pet2 = new Pet("pecas", "Gato","Femenino","seis años");
			pets.add(pet1);
			pets.add(pet2);
		}*/
		
		//get all the pets
		public List<Pet> getAll(){//por cada entidad crud(Dao) 
			Session session= Utils.getSessionFactory().openSession();
			List<Pet> pets= session.createQuery("From Pet ").list();
			session.close();
			System.out.println(pets);
			return pets;
		}
		
		
		
		//update a pet
		public void updatePet(Integer idPet, Pet newPet) {
			Session session = Utils.getSessionFactory().openSession();
			session.beginTransaction();
			Pet pet = (Pet) session.load(Pet.class,idPet);//este es el de la BD
			pet.setAgePet(newPet.getAgePet());//el objeto newPet es el que trae la nueva informacion
			pet.setSexPet(newPet.getSexPet());
			pet.setKindPet(newPet.getKindPet());
			pet.setNamePet(newPet.getNamePet());
			session.update(pet);
			session.getTransaction().commit();
			session.close();
		}

		//delete pet for id
		public void deletePet(Integer idPet) {
			Session session= Utils.getSessionFactory().openSession();
			session.beginTransaction();
			Pet pet =(Pet) session.load(Pet.class, idPet);
			session.delete(pet);
			session.getTransaction().commit();
			session.close();
			}

		public int savePet (Pet pet) {
			Session session= Utils.getSessionFactory().openSession();
			session.save(pet);
			session.close();
			return pet.getIdPet();
			
		}

		public Pet getById(Integer idPet) {
			Session session= Utils.getSessionFactory().openSession();
			//se hace un casting porque retorna un tipo object a tipo pet
			//leer casting en java
			Pet pet= (Pet)session.get(Pet.class, idPet);//get retorna el tipo de dato que se coloque en los parametros
			return pet;
		}

		
		
		

		

	
		
		
}
