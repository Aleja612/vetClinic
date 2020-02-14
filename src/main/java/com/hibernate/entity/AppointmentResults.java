package com.hibernate.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	private Integer IdAppointmentResults;
	
	@Column(name="name_pet")
	private String namePet;
	
	@Column(name="prescription_drugs")
	private Date prescriptionDrugs;
	
	@OneToOne(mappedBy = "appointmentResults", cascade = CascadeType.ALL)
    private Appointment appointment;
	
	public AppointmentResults() {
		
	}

	public AppointmentResults(Integer idAppointment, String namePet, Date prescriptionDrugs) {
		super();
		IdAppointmentResults = idAppointment;
		this.namePet = namePet;
		this.prescriptionDrugs = prescriptionDrugs;
		
	}

	public Integer getIdAppointmentResults() {
		return IdAppointmentResults;
	}

	public void setIdAppointmentResults(Integer idAppointment) {
		IdAppointmentResults = idAppointment;
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
		return "AppointmentResults [IdAppointment=" + IdAppointmentResults + ", namePet=" + namePet + ", prescriptionDrugs="
				+ prescriptionDrugs + "]";
	}
	
	
}
