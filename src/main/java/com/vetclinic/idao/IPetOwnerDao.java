package com.vetclinic.idao;

import java.util.List;

import com.hibernate.entity.PetOwner;

public interface IPetOwnerDao {

	//declaracion de metodos para acceder a la BD
		public List<PetOwner> getAll();
		public PetOwner getById(Integer idPetOwner);
		public void updatePetOwner(Integer idPetOwner, PetOwner petOwner);
		public void deletePetOwner(Integer idPetOwner);
		public int savePetOwner (PetOwner petOwner);
}
