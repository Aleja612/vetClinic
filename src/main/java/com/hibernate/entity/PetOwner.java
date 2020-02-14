package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pet_owner")
public class PetOwner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pet_owner")
	private Integer IdPetOwner;
	
	@Column(name="name_owner")
	private String nameOwner;
	
	@Column(name="lastname_owner")
	private String lastnameOwner;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToMany(mappedBy="petOwner")
	List<Pet> pets;//se hace una lista porque son varios
	
	public PetOwner() {
		
	}

	public PetOwner(int IdPetOwner, String nameOwner, String lastnameOwner,  String telephone, List<Pet> pets) {
	this.IdPetOwner=IdPetOwner;
	this.nameOwner=nameOwner;
	this.telephone=telephone;
	this.lastnameOwner=lastnameOwner;
	this.pets=pets;
	
}
	public Integer getIdPetOwner() {
		return IdPetOwner;
	}


	public void setIdPetOwner(Integer idPetOwner) {
		IdPetOwner = idPetOwner;
	}


	public String getNameOwner() {
		return nameOwner;
	}


	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}


	public String getLastnameOwner() {
		return lastnameOwner;
	}


	public void setLastnameOwner(String lastnameOwner) {
		this.lastnameOwner = lastnameOwner;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Pet> getPets(){
		return pets;
	}
	
	public void setPets(List<Pet> pets) {
		this.pets=pets;
	}
	
	@Override
	public String toString() {
		return "PetOwner [IdPetOwner=" + IdPetOwner + ", nameOwner=" + nameOwner + ", lastnameOwner=" + lastnameOwner
				+ ", telephone=" + telephone + "]";
	}
	
}
