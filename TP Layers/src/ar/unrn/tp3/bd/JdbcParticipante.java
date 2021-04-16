package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Solo depende de la capa modelo
import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipantes;

public class JdbcParticipante implements RepositorioDeParticipantes {

	public void nuevoParticipante(Participante participante) {
		PreparedStatement st;
		try {
			st = setupBaseDeDatos()
					.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
			st.setString(1, participante.obtenerNombre());
			st.setString(2, participante.obtenerTelefono());
			st.setString(3, participante.obtenerRegion());
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Connection setupBaseDeDatos() throws SQLException {
		String url = "jdbc:derby://localhost:1527/participantes";
		String user = "app";
		String password = "app";
		return DriverManager.getConnection(url, user, password);
	}

}
