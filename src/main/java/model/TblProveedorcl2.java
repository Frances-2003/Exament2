package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailprovecl2;

	@Temporal(TemporalType.DATE)
	private Date feingprovecl2;
	 @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedorcl2;

	private String nomprovecl2;

	private String rsocialprovecl2;

	private String rucprovecl2;

	public TblProveedorcl2() {
	}

	public String getEmailprovecl2() {
		return this.emailprovecl2;
	}

	public void setEmailprovecl2(String emailprovecl2) {
		this.emailprovecl2 = emailprovecl2;
	}

	public Date getFeingprovecl2() {
		return this.feingprovecl2;
	}

	public void setFeingprovecl2(Date feingprovecl2) {
		this.feingprovecl2 = feingprovecl2;
	}

	public int getIdproveedorcl2() {
		return this.idproveedorcl2;
	}

	public void setIdproveedorcl2(int idproveedorcl2) {
		this.idproveedorcl2 = idproveedorcl2;
	}

	public String getNomprovecl2() {
		return this.nomprovecl2;
	}

	public void setNomprovecl2(String nomprovecl2) {
		this.nomprovecl2 = nomprovecl2;
	}

	public String getRsocialprovecl2() {
		return this.rsocialprovecl2;
	}

	public void setRsocialprovecl2(String rsocialprovecl2) {
		this.rsocialprovecl2 = rsocialprovecl2;
	}

	public String getRucprovecl2() {
		return this.rucprovecl2;
	}

	public void setRucprovecl2(String rucprovecl2) {
		this.rucprovecl2 = rucprovecl2;
	}

}