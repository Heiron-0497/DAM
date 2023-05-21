import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Concesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  
	   gestorBD gb = new gestorBD();
	   coche micoche = new coche();
	   vista v = new vista();
	   String opcion = JOptionPane.showInputDialog("Escriba A para Alta; B para Consulta");
	   switch (opcion) {
	      case "A":  
		             if (gb.insertarCoche(v.pedirDatos())) {
		          	   JOptionPane.showMessageDialog(null,"Coche registrado con exito");
		          	   
		            } else {
		          	  JOptionPane.showMessageDialog(null,"Coche no registrado con exito");
		            }
		             break;
	      case "B": ResultSet result = gb.getConsulta();
	                v.mostrarDatos(result);
	                break;
	   }  
	}

}
