package com.vetclinic.daotest;

import com.hibernate.entity.Pet;
import com.hibernate.entity.PetOwner;
import com.vetclinic.dao.PetDaoImpl;
import com.vetclinic.idao.IPetDao;



public class DaoTest {

	public static void main(String[] args) {
		//object to manipulate the dao
		IPetDao petDao = new PetDaoImpl();
		//Prints pets
		/*List<Pet> getAll = petDao.getAll();
        for(Pet pet:getAll){
        System.out.println(pet);
        }*/
      
		
		//print pet
		
		//System.out.println("el idPet es"+petDao.getById(5));
		
		//get a pet
		/*Pet pet= petDao.getById(5);
		pet.setNamePet("cherry");
		System.out.println(pet);*/
		
		//update pet
		//como se actulizan las entidades relacionadas en hibernate
		/*Pet pet = new Pet("cherry","Perra","Femenino","siete años");
		petDao.updatePet(5,pet);*/
		
		
		//save a pet
		/*PetOwner owner= new PetOwner();
		owner.setIdPetOwner(2);
		Pet pet = new Pet("Nala", "Perra","Femenino","tres meses",owner);
		int savePet = petDao.savePet(pet);
		System.out.println("Se guardo el registro con id"+savePet);
		*/
		//delete a pet
		petDao.deletePet(12);
		System.exit(0);
	}
}
