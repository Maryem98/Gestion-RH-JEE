package metier.entites;

public class Employe {
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String service;
	private String dateEntre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getDateEntre() {
		return dateEntre;
	}
	public void setDateEntre(String dateEntrée) {
		this.dateEntre = dateEntrée;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom, String prenom, String telephone, String email, String service,
			String dateEntre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.service = service;
		this.dateEntre = dateEntre;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email="
				+ email + ", service=" + service + ", dateEntrée=" + dateEntre + "]";
	}
	 
    
	
	
}
