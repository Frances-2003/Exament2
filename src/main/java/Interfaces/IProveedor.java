package Interfaces;

import java.util.List;

import model.TblProveedorcl2;

public interface IProveedor {
	
	void RegistrarProveedor(TblProveedorcl2 proveedor);
	void ActualizarProveedor(TblProveedorcl2 proveedor);
	void EliminarProveedor(TblProveedorcl2 proveedor);
	List<TblProveedorcl2> ListarProveedor();
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveedor);


}
