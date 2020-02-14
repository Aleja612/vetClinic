package com.hibernate.entity;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_appointment")
	private Integer IdAppointment;
	
	@Column(name="name_pet")
	private String namePet;
	
	@Column(name="date_appointment")
	private Date dateAppointment;
	
	@Column(name="medication_cost")
	private String medicationCost;
	
	@Column(name="observations")
	private String observations;
	
	@Column(name="name_owner")
	private String nameOwner;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="id_pet",referencedColumnName="id_pet")
	private Pet idPetA;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AppointmentResults AppointmentResults;
	
	public Appointment() {
		
	}

	public Appointment(Integer idAppointment, String namePet, Date dateAppointment, String medicationCost,
			String observations, String nameOwner) {
		super();
		IdAppointment = idAppointment;
		this.namePet = namePet;
		this.dateAppointment = dateAppointment;
		this.medicationCost = medicationCost;
		this.observations = observations;
		this.nameOwner = nameOwner;
	}

	public Integer getIdAppointment() {
		return IdAppointment;
	}

	public void setIdAppointment(Integer idAppointment) {
		IdAppointment = idAppointment;
	}

	public String getNamePet() {
		return namePet;
	}

	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}

	public Date getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	public String getMedicationCost() {
		return medicationCost;
	}

	public void setMedicationCost(String medicationCost) {
		this.medicationCost = medicationCost;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	@Override
	public String toString() {
		return "Appointment [IdAppointment=" + IdAppointment + ", namePet=" + namePet + ", dateAppointment="
				+ dateAppointment + ", medicationCost=" + medicationCost + ", observations=" + observations
				+ ", nameOwner=" + nameOwner + "]";
	}

	
	
}
