package com.app.ioc;

public class App {
	
	public static void main(String[] args) {
		
		UsuarioFactory usuario = new UsuarioFactory(new UsuarioImplPostgress());
		usuario.insertarUsuario();
		usuario.eliminarUsuario(1);
		
		
		usuario = new UsuarioFactory(new UsuarioImplMysql());
		usuario.insertarUsuario();
		usuario.eliminarUsuario(2);

usuario = new UsuarioFactory(new UsuarioImplPostgress());
		usuario.insertarUsuario();
		usuario.eliminarUsuario(3);

		
	}

}
