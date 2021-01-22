package dao;

import java.util.List;

import metier.entites.*;
public class TestDao {

	public static void main(String[] args) {
		EmployeDaoImp dao =new EmployeDaoImp();
		 List <Conge>absences=dao.chercherconge("hanini");
		 System.out.println(absences.toString());
		 //dao.delete(30);
		/*
		 * Absence e = dao.getAbsence(22); System.out.println(e.toString());
		 */
		System.out.println("==================..........==");
		//Employe e2=new Employe("ttttttttttttttttttttttt", "ahmed", "062564525", "ahmed@gmail.com"," RH", "15/12/2017");
		//e2.setId(55);;
		/*
		 * e=dao.update(new Employe("ttttttttttttttttttttttt", "ahmed", "062564525",
		 * "ahmed@gmail.com"," RH", "15/12/2017"));
		 * System.out.println("eveeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeet");
		 * System.out.println(e.toString());
		 */
		/*
		 * List<Employe> produits=dao.getemployes(); for(Employe p:produits) {
		 * System.out.println(p.toString()); }
		 */
		

		/*
		 * System.out.println("...............................=================");
		 * List<Employe> produits = dao.chercher("%m%");
		 *  for(Employe p:produits) {
		 * System.out.println(p.toString()); }
		 */
	}

}
