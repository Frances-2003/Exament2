package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario{

	@Override
	public void RegitrarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_BERNALESCUADROSJULIO");
		EntityManager em= emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(usuario);
			
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}
		finally{
			em.close();
		}
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_BERNALESCUADROSJULIO");
		EntityManager em= emf.createEntityManager();
		
		try{
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
			}catch(RuntimeException e){
				e.getMessage();
			}finally{
			em.close();
			}
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_BERNALESCUADROSJULIO");
		EntityManager em= emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TblUsuariocl2 codelim=em.find(TblUsuariocl2.class, usuario.getIdusuariocl2());
			if(codelim !=null){
				em.remove(codelim);
			}
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		
	}

	@Override
	public List<TblUsuariocl2> ListarUsuario() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_BERNALESCUADROSJULIO");
		EntityManager em= emf.createEntityManager();
		List<TblUsuariocl2> listado=null;

		try {
			em.getTransaction().begin();
			listado=em.createQuery("select p from TblUsuariocl2 p", TblUsuariocl2.class).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally{
			em.close();
		}
		return listado;
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_BERNALESCUADROSJULIO");
		EntityManager em= emf.createEntityManager();
		TblUsuariocl2 buscause=null;
		
		try {
			em.getTransaction().begin();
			buscause=em.find(TblUsuariocl2.class,usuario.getIdusuariocl2());
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		}finally{
			em.close();
		}
	
			
	return buscause;
		
	}
	
}
