package com.vetclinic.daotest;

import java.util.List;

import com.hibernate.entity.Pet;
import com.hibernate.entity.PetOwner;
import com.vetclinic.dao.PetOwnerDaoImpl;
import com.vetclinic.idao.IPetOwnerDao;

public class DaoTestPetOwner {
	public static void main(String[] args) {
		//Objeto para manipular el Dao
		IPetOwnerDao petOwnerDao = new PetOwnerDaoImpl();
		
		
				//Prints petOwner
				/*List<PetOwner> getAll = petOwnerDao.getAll();
		        for(PetOwner petOwner:getAll){
		        System.out.println(petOwner);
		        }*/
		     			
				//print petOwner
				
				//System.out.println("el idPetOwner es"+petOwnerDao.getById(5));
				
				//get a petOwner
				/*PetOwner petOwner= petOwnerDao.getById(5);
				petOwner.setNameOwner("Diego");
				System.out.println(petOwner);
				*/
				//update petOwner
				//como se actulizan las entidades relacionadas en hibernate
				/*PetOwner petOwner = new PetOwner("Laura","Nieto","5554389");
				petOwnerDao.updatePetOwner(5,petOwner);
				*/
				
				//save a pet
		        // PetOwner petOwner1 = new PetOwner(5,"Deimos", "Perro","Masculino",List<PetOwner> pets);
				//petOwnerDao.savePetOwner(pet2);
				
				//delete a pet
				//petOwnerDao.deletePetOwner(4);
	}
}
