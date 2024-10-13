package TestEntidades;

import java.util.List;

import DaoImp.TblUsuarioImp;
import model.TblUsuariocl2;

public abstract class TestUsuario {

	public static void main(String[] args) {
		
		TblUsuariocl2 tbluse = new TblUsuariocl2();
		TblUsuarioImp impuse = new TblUsuarioImp();
		
		//REGISTRAR
		/*
		tbluse.setUsuariocl2("Julio");
		tbluse.setPasswordcl2("123");
		
		impuse.RegitrarUsuario(tbluse);
		System.out.println("Usuario Registrado en la bd");
		*/
		
		//ACTUALIZAR
		/*
		tbluse.setIdusuariocl2(1);
		tbluse.setUsuariocl2("Francesco");
		tbluse.setPasswordcl2("123");
		
		impuse.ActualizarUsuario(tbluse);
		System.out.println("Usuario Actualizado en la bd");
		*/
		
		//ELIMINAR 
		/*
		tbluse.setIdusuariocl2(2);
		impuse.EliminarUsuario(tbluse);
		System.out.println("Usuario Eliminado en la bd");
		*/
		
		
		//LISTAR
		/*
		List<TblUsuariocl2> listado=impuse.ListarUsuario();
		for(TblUsuariocl2 lis:listado){
			System.out.println("usuario:"+lis.getUsuariocl2()+"\n"+
					"password:"+lis.getPasswordcl2()
				);
		}
		*/
		
		
		//BUSCAR
		tbluse.setIdusuariocl2(2);		
		TblUsuariocl2 usuario = impuse.BuscarUsuario(tbluse);
		
		System.out.println("usuario:"+usuario.getUsuariocl2()+"\n"+
				"password:"+usuario.getPasswordcl2()
			);
			
	}

}
