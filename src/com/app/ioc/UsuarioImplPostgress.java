package com.app.ioc;

public class UsuarioImplPostgress implements IUsuario {

	@Override
	public void insertarUsuario() {
		
		System.out.println("Insertando usuario de Postgres");
		
	}

	@Override
	public void eliminarUsuario(int id) {
		
		System.out.println("Eliminando usuario de Postgres:"+id);
	}

}
