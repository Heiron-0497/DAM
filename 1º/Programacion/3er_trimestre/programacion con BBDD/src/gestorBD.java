import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class gestorBD {

	private static java.sql.Connection conn;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pwd="";
    private static final String url="jdbc:mysql://localhost:3306/concesionario";

public gestorBD() {

	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,pwd);
		if (conn!=null) {
			System.out.println("Conexion");
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Error: " + e.getMessage());
	}
}
	
	public boolean insertar() {
		boolean insertado=false;
		Statement st;
		try {
			st = conn.createStatement();
			//st.execute("INSERT INTO `coche`(`Ident`, `Marca`, `Modelo`, `Potencia`) VALUES ('1','Toyota','IGO',140);");
			int filas=st.executeUpdate("INSERT INTO `coche`(`Ident`, `Marca`, `Modelo`, `Potencia`) VALUES ('2','Toyota','IGO',140);");
            System.out.println("N�mero de filas insertadas: " + filas);
			insertado=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			insertado=false;
			System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		return insertado;
		
	}
	
	public boolean insertarCoche(coche micoche) {
		boolean insertado=false;
		//String sql = "INSERT INTO `coche`(`Ident`, `Marca`, `Modelo`, `Potencia`) VALUES ('"+micoche.getIdent()+"','"+micoche.getMarca()+"','"+micoche.getModelo()+"',"+micoche.getPotencia()+");";
		
		String sql1 = "INSERT INTO `coche`(`Ident`, `Marca`, `Modelo`, `Potencia`) VALUES (?,?,?,?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.setString(1,micoche.getIdent());
			ps.setString(2,micoche.getMarca());
			ps.setString(3,micoche.getModelo());
			ps.setInt(4,micoche.getPotencia());
			if (ps.executeUpdate()>=1) {
				insertado=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return insertado;
	}
	
	public ResultSet getConsulta() {
		
		   ResultSet rs = null;
		   String sql = "Select * from `coche`";
		   try {
			Statement st = conn.createStatement();
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
}

