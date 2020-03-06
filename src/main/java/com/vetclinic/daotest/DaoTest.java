package com.vetclinic.daotest;

import java.util.List;

import com.hibernate.entity.Pet;
import com.vetclinic.dao.PetDaoImpl;
import com.vetclinic.idao.IPetDao;



public class DaoTest {

	public static void main(String[] args) {
		//object to manipulate the dao
		IPetDao petDao = new PetDaoImpl();
		//IPetOwnerDao petOwnerDao = new PetOwnerDaoImpl();
		//Prints pets
		/*List<Pet> getAll = petDao.getAll();
        for(Pet pet:getAll){
        System.out.println(pet);
        }*/
      //Prints pets
      		/*List<PetOwner> getAll = petOwnerDao.getAll();
              for(PetOwner petOwner:getAll){
              System.out.println(petOwner);
              }*/
		
		//print pet
		
		System.out.println("el idPet es"+petDao.getById(5));
		
		//get a pet
		//Pet pet= petDao.getById(5);
		//pet.setNamePet("cherry");
		//System.out.println(pet);
		
		//update pet
		//como se actulizan las entidades relacionadas en hibernate
		Pet pet = new Pet("Nala","Perro","Femenino","tres meses");
		petDao.updatePet(5,pet);
		
		
		//save a pet
		//petDao.savePet(pet2);
		
		//delete a pet
		//petDao.deletePet(4);
				
	}
}
