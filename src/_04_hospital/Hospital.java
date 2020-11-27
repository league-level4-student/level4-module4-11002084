package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	private ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public ArrayList<Doctor> getDoctors() {
		return doctorList;
	}
	
	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
	}
	
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	
	public void addPatient(Patient patient) {
		patientList.add(patient);
	}
	
	public void assignPatientsToDoctors() throws DoctorFullException{
		for(int i = 0; i < patientList.size(); i++) {
			doctorList.get((int)(i / 3)).assignPatient(patientList.get(i));
		}
	}
}
