package ar.unrn.tp3.modelo;

public class Participante {

	String nombre, telefono, region;

	public Participante(String nombre, String telefono, String region) {
		if (nombre.isEmpty()) {
			throw new RuntimeException("El nombre no puede estar vacio");
		}
		if (telefono.isEmpty()) {
			throw new RuntimeException("El telefono no puede estar vacio");
		}
		if (region.isEmpty()) {
			throw new RuntimeException("El region no puede estar vacio");
		}

		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
	}

	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String obtenerTelefono() {
		// TODO Auto-generated method stub
		return this.telefono;
	}

	public String obtenerRegion() {

		return this.region;
	}

}
