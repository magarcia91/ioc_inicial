package com.app.ioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	
	public UsuarioFactory(IUsuario usr) {
		this.usr=usr;
	}
	
	public void insertarUsuario() {
		usr.insertarUsuario();
		
	}

	public void eliminarUsuario(int id) {
		usr.eliminarUsuario(id);
	}


}

