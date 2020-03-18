package com.vetclinic.daotest;

import java.util.List;

import com.hibernate.entity.AppointmentResults;
import com.vetclinic.dao.AppointmentResultsDaoImpl;
import com.vetclinic.idao.IAppointmentResultsDao;




public class DaoTestAppointmentResults {
	public static void main(String[] args) {
		//Objeto para manipular el Dao
		IAppointmentResultsDao appointmentResultsDao = new AppointmentResultsDaoImpl();
		
		
				//Prints AppoimentResults
				/*List<AppointmentResults> getAll = appointmentResultsDao.getAll();
		        for(AppointmentResults appointmentResults:getAll){
		        System.out.println(appointmentResults);
		        }*/
		     			
				//print AppointmentResults
				
				//System.out.println("el idAppointment es"+appointmentResultsDao.getById(2));
				
				//get a AppointmentResults
				//AppointmentResults appointmentResults= appointmentResultsDao.getById(2);
				//appointmentResults.setPrescriptionDrugs("Pastas");
				//System.out.println(appointmentResults);
				
				//update AppointmentResults
				//como se actulizan las entidades relacionadas en hibernate
				//AppointmentResults appointmentResults = new AppointmentResults(2,"Pecas","Pastas");
				//appointmentResultsDao.updateAppointmentResults(2, appointmentResults);				
				
				//save a pet
				//appointmentResultsDao.saveAppointmentResults(appointmentResultsDao);
				
				//delete a pet
				//appointmentResultsDao.deleteAppointmentResults(4);
	}
}
