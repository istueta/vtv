package vtv;

import javax.swing.JOptionPane;

public class Vtv {

	String motor, frenos, suspension,auto;

	int matricula;
	
	
	
	public  Vtv() {
		
		this.matricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula"));
		this.auto=JOptionPane.showInputDialog("Ingrese el modelo del auto");
		
	}
	
	
	public void Verificar() {

		this.motor = JOptionPane.showInputDialog("Funciona el motor?");
		this.frenos = JOptionPane.showInputDialog("Funcionan los frenos?");
		this.suspension = JOptionPane.showInputDialog("Funciona la suspension?");

		if (motor.equalsIgnoreCase("si") && frenos.equalsIgnoreCase("si") && suspension.equalsIgnoreCase("si")) {
			JOptionPane.showMessageDialog(null, "¡¡La VTV esta aprobada!!");
		} else if (motor.equalsIgnoreCase("si") && frenos.equalsIgnoreCase("si") && suspension.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "La suspension no esta funcionando bien, la VTV esta desaprobada! ");
		} else if (motor.equalsIgnoreCase("si") && frenos.equalsIgnoreCase("no") && suspension.equalsIgnoreCase("si")) {
			JOptionPane.showMessageDialog(null, "Los frenos no estan funcionando bien, la VTV esta desaprobada!");
		} else if (motor.equalsIgnoreCase("no") && frenos.equalsIgnoreCase("si") && suspension.equalsIgnoreCase("si")) {
			JOptionPane.showMessageDialog(null, "El motor no esta funcionando bien, la VTV esta desaprobada!");
		} else if (motor.equalsIgnoreCase("no") && frenos.equalsIgnoreCase("no") && suspension.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null,
					"No funcionan el motor, los frenos y la suspension, la VTV esta desaprobada!");
		} else if (motor.equalsIgnoreCase("si") && frenos.equalsIgnoreCase("no") && suspension.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Los frenos y la suspension no funcionan, la VTV esta desaprobada! ");
		} else if (motor.equalsIgnoreCase("no") && frenos.equalsIgnoreCase("no") && suspension.equalsIgnoreCase("si")) {
			JOptionPane.showMessageDialog(null, "El motor y los frenos no funcionan, la VTV esta desaprobada!");
		} else if (motor.equalsIgnoreCase("no") && frenos.equalsIgnoreCase("si") && suspension.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "El motor y la suspension no funcionan, la VTV esta desaprobada!");
		} 

	}

	@Override
	public String toString() {
		return "Vtv [motor=" + motor + ", frenos=" + frenos + ", suspension=" + suspension + ", auto=" + auto
				+ ", matricula=" + matricula + "]";
	}

}
