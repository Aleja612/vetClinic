package com.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pet")
public class Pet {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_pet")
private Integer idPet;

@Column(name="name_pet")
private String namePet;

@Column(name="kind_pet")
private String kindPet;

@Column(name="sex_pet")
private String sexPet;

@Column(name="age_pet")
private String agePet;

@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
@JoinColumn(name="id_pet_owner",referencedColumnName="id_pet_owner")
private PetOwner petOwner;

@OneToMany(mappedBy="idPetA")
List<Appointment> appointments;

public Pet() {
	
}

public Pet(Integer idPet, String namePet, String kindPet, String sexPet, String agePet, List<Appointment> appointments) {
	super();
	this.idPet = idPet;
	this.namePet = namePet;
	this.kindPet = kindPet;
	this.sexPet = sexPet;
	this.agePet = agePet;
	this.appointments=appointments;
}

public Integer getIdPet() {
	return idPet;
}

public void setIdPet(Integer idPet) {
	this.idPet = idPet;
}

public String getNamePet() {
	return namePet;
}

public void setNamePet(String namePet) {
	this.namePet = namePet;
}

public String getKindPet() {
	return kindPet;
}

public void setKindPet(String kindPet) {
	this.kindPet = kindPet;
}

public String getSexPet() {
	return sexPet;
}

public void setSexPet(String sexPet) {
	this.sexPet = sexPet;
}

public String getAgePet() {
	return agePet;
}

public void setAgePet(String agePet) {
	this.agePet = agePet;
}


public List<Appointment> getAppointments() {
	return appointments;
}

public void setAppointments(List<Appointment> appointments) {
	this.appointments = appointments;
}

@Override
public String toString() {
	return "Pet [idPet=" + idPet + ", namePet=" + namePet + ", kindPet=" + kindPet + ", sexPet=" + sexPet + ", agePet="
			+ agePet + ", petOwner=" + petOwner + "]";
}


}
