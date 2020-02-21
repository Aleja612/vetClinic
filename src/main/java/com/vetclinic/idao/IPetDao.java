package com.vetclinic.idao;

import java.util.List;

import com.vetclinic.model.Pet;

public interface IPetDao {
	//declaracion de metodos para acceder a la BD
	public List<Pet> getAll();
	public Pet getById(int id);
	public void updatePet(Pet pet);
	public void deletePet(Pet pet);
}
