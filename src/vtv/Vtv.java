package vtv;

import javax.swing.JOptionPane;

public class Vtv {

	String motor, frenos, suspension;

	int matricula;

	public Vtv(String motor,String frenos,String suspension) {
		
		
		this.motor=motor;
		this.frenos=frenos;
		this.suspension=suspension;
		
	}

	@Override
	public String toString() {
		return "Vtv [motor=" + motor + ", frenos=" + frenos + ", suspension=" + suspension + ", matricula=" + matricula
				+ "]";
	}

}
