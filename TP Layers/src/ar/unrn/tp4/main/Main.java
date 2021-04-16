package ar.unrn.tp4.main;

//Depende de la capa UI y BD
import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.ui.AgregarParticipante;

public class Main {

	public static void main(String[] args) {
		
		 new AgregarParticipante(new JdbcParticipante());
	

	}

}
