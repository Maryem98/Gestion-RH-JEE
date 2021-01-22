package dao;

import java.util.*;

import metier.entites.*;

public interface IEmployeDao {
	public Employe save (Employe e);
	public void delete(int id);
	public Employe getEmploye(int id);
	public Employe update(Employe e);
	public List<Employe> chercher(String mc);
	public List<Employe> getemployes();
	public Absence getAbsence(int id);
	public Absence saveabs(Absence absence);
	public List<Absence> chercherAbs(String nom) ;
	public Conge getConge(int id);
	public Conge savecong(Conge a);
    public List<Conge> chercherconge(String nom) ;

}
