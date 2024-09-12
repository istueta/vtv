package vtv;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Vtv auto1= new Vtv();
		auto1.Verificar();
		
		Vtv auto2= new Vtv();
		auto2.Verificar();
		
		JOptionPane.showMessageDialog(null, auto1);
		JOptionPane.showMessageDialog(null, auto2);
	}

}
