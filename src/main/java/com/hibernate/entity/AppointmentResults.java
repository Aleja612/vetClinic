package com.hibernate.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment_results")
public class AppointmentResults {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_appointment_results")
	private Integer idAppointmentResults;
	
	@Column(name="name_pet")
	private String namePet;
	
	@Column(name="prescription_drugs")
	private Date prescriptionDrugs;
	//fetch->consultar
	//laizy solo la entidad
	//eager->codicioso :v todo lo relacionado
	
	@OneToOne(fetch=FetchType.EAGER, mappedBy="appointmentResults", cascade = CascadeType.ALL)//mappedBy nombre de la variable que esta en la otra tabla 
    private Appointment idAppointment;
	
	public AppointmentResults() {
		
	}

	public AppointmentResults(Integer idAppointment, String namePet, Date prescriptionDrugs) {
		super();
		idAppointmentResults = idAppointment;
		this.namePet = namePet;
		this.prescriptionDrugs = prescriptionDrugs;
		
	}

	public Integer getIdAppointmentResults() {
		return idAppointmentResults;
	}

	public void setIdAppointmentResults(Integer idAppointment) {
		idAppointmentResults = idAppointment;
	}

	public String getNamePet() {
		return namePet;
	}

	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}

	public Date getPrescriptionDrugs() {
		return prescriptionDrugs;
	}

	public void setPrescriptionDrugs(Date prescriptionDrugs) {
		this.prescriptionDrugs = prescriptionDrugs;
	}

	@Override
	public String toString() {
		return "AppointmentResults [IdAppointment=" + idAppointmentResults + ", namePet=" + namePet + ", prescriptionDrugs="
				+ prescriptionDrugs + "]";
	}
	
	
}
