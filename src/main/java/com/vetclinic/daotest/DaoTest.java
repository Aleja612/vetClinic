package com.vetclinic.daotest;

import com.vetclinic.dao.PetDaoImpl;
import com.vetclinic.idao.IPetDao;
import com.vetclinic.model.Pet;

public class DaoTest {

	public static void main(String[] args) {
		//object to manipulate the dao
		IPetDao petDao = new PetDaoImpl();
		
		//print pets
		petDao.gettPet().forEach(System.out.println());
		
		//get a pet
		Pet pet= petDao.gettPet(0);
		pet.setNamePet("cherry");
		
		//update pet
		petDao.updatePet(pet);
		
				
	}
}
