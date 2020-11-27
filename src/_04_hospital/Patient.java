package _04_hospital;

public class Patient {
	private boolean feelsCaredFor = false;
	
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
	
	public void checkPulse() {
		feelsCaredFor = true;
	}
	
	public void recievedMedicine() {
		feelsCaredFor = true;
	}
}
