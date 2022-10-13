package ejercicio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "Libreria");
		
Autor cortazar = new Autor ("Julio", "Cortazar", "1914", "masculino", "Cortazar2008xd@gmail.com");
		
	JOptionPane.showMessageDialog(null, cortazar);

Editorial bosque = new Editorial ("Bosque", "+54 9 11 5445263", "Av. Rivadavia 1250", 
		"CABA","editorialbosque@gmail.com","12345678");

	JOptionPane.showMessageDialog(null, bosque);

Libro rayuela = new Libro ("Rayuela" , "1963", 10,100,cortazar,bosque);

	JOptionPane.showMessageDialog(null, rayuela);

	}

}
