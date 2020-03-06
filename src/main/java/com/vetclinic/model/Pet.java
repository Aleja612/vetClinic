package com.vetclinic.model;

public class Pet {

	private int idPet;
	private String namePet;
	private String kindPet;
	private String sexPet;
	private String agePet;
	
	public Pet() {
		
	}

	public Pet(Integer idPet, String namePet, String kindPet, String sexPet, String agePet) {
		super();
		this.idPet = idPet;
		this.namePet = namePet;
		this.kindPet = kindPet;
		this.sexPet = sexPet;
		this.agePet = agePet;
	}
	

	public int getIdPet() {
		return idPet;
	}

	public void setIdPet(int idPet) {
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

	@Override
	public String toString() {
		return "Pet [idPet=" + idPet + ", namePet=" + namePet + ", kindPet=" + kindPet + ", sexPet=" + sexPet
				+ ", agePet=" + agePet + "]";
	}
	
	
}
