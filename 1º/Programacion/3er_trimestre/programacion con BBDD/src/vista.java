import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class vista {

	public void mostrarDatos(ResultSet rs) {
	  int i=0;
	  try {
		while (rs.next()) {
			  i++;
			  JOptionPane.showMessageDialog(null,rs.getString("Ident") + rs.getString("Marca") + rs.getString("Modelo")+
					  rs.getInt("Potencia"));
		  }
		if (i==0) {
			JOptionPane.showMessageDialog(null, "No hay datos");
		} 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public coche pedirDatos() {
		coche micoche=new coche();
		micoche.setIdent(JOptionPane.showInputDialog("Escriba el ide del coche"));
        micoche.setModelo(JOptionPane.showInputDialog("Escriba el modelo del coche"));
        micoche.setMarca(JOptionPane.showInputDialog("Escriba la marca del coche"));
        micoche.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Escriba la potencia del coche")));
		return micoche;
	}
}
