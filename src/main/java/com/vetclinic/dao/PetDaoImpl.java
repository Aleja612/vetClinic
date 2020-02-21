package com.vetclinic.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.util.Utils;
import com.vetclinic.idao.IPetDao;
import com.vetclinic.model.Pet;

public class PetDaoImpl implements IPetDao{

	//lista de tipo pet
	List<Pet> pets;
	
	//inicializar los objetos pet y añadirlos a la lista
		public PetDaoImpl() {
			pets = new ArrayList<Pet>();
			Pet pet1 = new Pet(0,"Deimos", "Perro","Masculino","dos años");
			Pet pet2 = new Pet(1,"pecas", "Gato","Femenino","seis años");
			pets.add(pet1);
			pets.add(pet2);
		}
		
		//get all the pets
		public List<Pet> getAll(){
			Session session= Utils.getSessionFactory().openSession();
			List<Pet> pets= session.createQuery("From Pet ").list();
			System.out.println(pets);
			return pets;
		}
		
		//get a pet for the id
		public Pet getById(int idPet) {
			return pets.get(idPet);
		}
		
		//update a pet
		public void updatePet(Pet pet) {
			pets.get(pet.getIdPet()).setNamePet(pet.getNamePet());
			pets.get(pet.getIdPet()).setKindPet(pet.getKindPet());
			pets.get(pet.getIdPet()).setSexPet(pet.getSexPet());
			System.out.println("Pet with id"+pet.getIdPet()+"to update satisfactorily");
		}

		//delete pet for id
		public void deletePet(Pet pet) {
			pets.remove(pet.getIdPet());
			System.out.println("Pet with id: "+pet.getIdPet()+"removed satisfactorily");
		}

		
		
		
}
