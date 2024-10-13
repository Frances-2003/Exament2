package TestEntidades;

import java.util.Date;
import java.util.List;

import DaoImp.TblProveedorImp;
import model.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tblprov = new TblProveedorcl2();
		TblProveedorImp impprov = new TblProveedorImp();

		// REGISTRAR
		/*
		tblprov.setNomprovecl2("Enrique A");
		tblprov.setRucprovecl2("12345678901");
		tblprov.setRsocialprovecl2("Repsol ");
		tblprov.setEmailprovecl2("Enrique@gmail.com");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprov.setFeingprovecl2(fechasql);

		impprov.RegistrarProveedor(tblprov);
		System.out.println("Proveedor Registrado en la bd");
		
		*/
		
		// ACTUALIZAR
		/*
		tblprov.setIdproveedorcl2(1);
		tblprov.setNomprovecl2("Francesco B.");
		tblprov.setRucprovecl2("98765432109");
		tblprov.setRsocialprovecl2("Petro America S.A.");
		tblprov.setEmailprovecl2("Francesco@gmail.com");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprov.setFeingprovecl2(fechasql);

		impprov.ActualizarProveedor(tblprov);
		System.out.println("Proveedor Actualizado en la bd");
		*/
		
		// ELIMINAR
		/*
		tblprov.setIdproveedorcl2(1);
		impprov.EliminarProveedor(tblprov);
		System.out.println("Proveedor Eliminado en la bd");
		
	*/
		// LISTAR
		/*
		List<TblProveedorcl2> listado = impprov.ListarProveedor();
		for (TblProveedorcl2 lis : listado) {
		    System.out.println("Nombre : " + lis.getNomprovecl2() + "\n" +
		                       "RUC: " + lis.getRucprovecl2() + "\n" +
		                       "Razón Social: " + lis.getRsocialprovecl2() + "\n" +
		                       "Email: " + lis.getEmailprovecl2() + "\n" +
		                       "Fecha de Ingreso: " + lis.getFeingprovecl2());
		}
		*/

		// BUSCAR
		/*
		tblprov.setIdproveedorcl2(1);
		TblProveedorcl2 proveedor = impprov.BuscarProveedor(tblprov);

		System.out.println("Nombre : " + proveedor.getNomprovecl2() + "\n" +
		                   "RUC: " + proveedor.getRucprovecl2() + "\n" +
		                   "Razón Social: " + proveedor.getRsocialprovecl2() + "\n" +
		                   "Email: " + proveedor.getEmailprovecl2() + "\n" +
		                   "Fecha de Ingreso: " + proveedor.getFeingprovecl2());
		*/

	}

}
