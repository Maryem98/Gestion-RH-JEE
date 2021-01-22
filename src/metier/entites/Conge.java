package metier.entites;

import java.util.Date;

public class Conge {
	private int id_conge;
	private  int id;
	
	private Date dateDebut;
	private Date dateFin;
	private String typeConge;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	
	public String getTypeConge() {
		return typeConge;
	}
	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}
	public int getId_conge() {
		return id_conge;
	}
	public void setId_conge(int id_conge) {
		this.id_conge = id_conge;
	}
	@Override
	public String toString() {
		return "Conge [id_conge=" + id_conge + ", id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", typeConge=" + typeConge + "]";
	}
	public Conge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conge(int id, Date dateDebut2, Date dateFin2, String typeConge) {
		super();
		this.id = id;
		this.dateDebut =  dateDebut2;
		this.dateFin =  dateFin2;
		this.typeConge = typeConge;
	}
	public Conge(int id_conge, int id, Date dateDebut, Date dateFin, String typeConge) {
		super();
		this.id_conge = id_conge;
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeConge = typeConge;
	}
	

	
	
	

}
