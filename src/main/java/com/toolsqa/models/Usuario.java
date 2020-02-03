package com.toolsqa.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String correo, sexo, nombre, apellido, contrasena, fechaNacimient, direccion, ciudad, estado, zip, celular,
			otraDireccion;

	public static List<Usuario> users = new ArrayList<>();

	public static void GuardarDatosDelUsuario(Usuario user) {
		users.add(user);
	}

	public static Usuario LeerDatosDelUsuario(int index) {
		return users.get(index);
	}

	public static void vaciarListaUsuarios() {
		users = new ArrayList<>();
	}
	
	public String getCorreo() {
		return correo;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getFechaNacimient() {
		return fechaNacimient;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public String getZip() {
		return zip;
	}

	public String getCelular() {
		return celular;
	}

	public String getOtraDireccion() {
		return otraDireccion;
	}

}
