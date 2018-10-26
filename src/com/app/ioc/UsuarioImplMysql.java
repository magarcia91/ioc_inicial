package com.app.ioc;

public class UsuarioImplMysql implements IUsuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario de Mysql");
		
	}

	@Override
	public void eliminarUsuario(int id) {
		System.out.println("Eliminando usuario de Mysql:"+id);
	}

	
}
