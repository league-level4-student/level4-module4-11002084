package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public ArrayList<Patient> getPatients(){
		return patientList;
	}
	
	public void assignPatient(Patient patient) throws DoctorFullException {
		if(getPatients().size() == 3) {
			throw new DoctorFullException();
		}
		
		patientList.add(patient);
	}
	
	public void doMedicine() {
		for(Patient patient : patientList) {
			patient.recievedMedicine();
		}
	}
}
