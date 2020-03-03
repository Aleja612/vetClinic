package com.vetclinic.idao;

import java.util.List;

import com.hibernate.entity.Pet;

public interface IPetDao {
	//declaracion de metodos para acceder a la BD
	public List<Pet> getAll();
	public Pet getById(Integer idPet);
	public void updatePet(Integer idPet, Pet pet);
	public void deletePet(Integer idPet);
	public int savePet (Pet pet);
}
