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
private Integer namePet;

@Column(name="kind_pet")
private Integer kindPet;

@Column(name="sex_pet")
private Integer sexPet;

@Column(name="age_pet")
private Integer agePet;

@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
@JoinColumn(name="id_pet_owner",referencedColumnName="id_pet_owner")
private PetOwner petOwner;

@OneToMany(mappedBy="idPetA")
List<Appointment> appointments;

public Pet() {
	
}

public Pet(Integer idPet, Integer namePet, Integer kindPet, Integer sexPet, Integer agePet, List<Appointment> appointments) {
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

public Integer getNamePet() {
	return namePet;
}

public void setNamePet(Integer namePet) {
	this.namePet = namePet;
}

public Integer getKindPet() {
	return kindPet;
}

public void setKindPet(Integer kindPet) {
	this.kindPet = kindPet;
}

public Integer getSexPet() {
	return sexPet;
}

public void setSexPet(Integer sexPet) {
	this.sexPet = sexPet;
}

public Integer getAgePet() {
	return agePet;
}

public void setAgePet(Integer agePet) {
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
