package web;

import java.util.ArrayList;
import java.util.List;

import metier.entites.*;

public class EmployeModel {
	private String motCle;
	private List<Employe>employes =new ArrayList<Employe>();
	private List<Employe>employestotal =new ArrayList<Employe>();
	private String nom;
	private String name;

	
	private List <Absence>absences=new ArrayList<Absence>();
	private List <Conge>conges=new ArrayList<Conge>();
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Employe> getEmployestotal() {
		return employestotal;
	}
	public void setEmployestotal(List<Employe> employestotal) {
		this.employestotal = employestotal;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Absence> getAbsences() {
		return absences;
	}
	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}
	public List <Conge> getConges() {
		return conges;
	}
	public void setConges(List <Conge> conges) {
		this.conges = conges;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
