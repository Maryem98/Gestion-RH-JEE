 package dao;

import java.sql.*;
import java.sql.Date; 
import java.util.*;

import metier.entites.Absence;
import metier.entites.Conge;
import metier.entites.Employe;

public class EmployeDaoImp implements IEmployeDao {

	@Override
	public Employe save(Employe e) {
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		 try {
			 //preparer la requete
			PreparedStatement ps=connection.prepareStatement("INSERT INTO EMPLOYES (NOM,PRENOM,TELEPHONE,EMAIL,SERVICE,DATEENTRE)VALUES(?,?,?,?,?,?)");
			ps.setString(1,e.getNom());
			ps.setString(2,e.getPrenom());
			ps.setString(3,e.getTelephone());
			ps.setString(4,e.getEmail());
			ps.setString(5,e.getService());
			ps.setString(6,e.getDateEntre());
			ps.executeUpdate();//car on a insert/delete/update on execute la requete avec executeUpdate
			ps.close();//attention il faut pas fermer la cnx s'il s'agit d'un singleton
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID) AS MAXID FROM EMPLOYES ");
			ResultSet rs =ps2.executeQuery();
			if(rs.next()) {
				e.setId(rs.getInt("MAXID"));//je prend la valeur de maxid (get) je la mis dans la var id (set))
			
			}
		  } catch (SQLException e1) {e1.printStackTrace();}
		return e;
	}

	@Override
	public void delete(int id) {
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		 try {
			 //preparer la requete
			PreparedStatement ps=connection.prepareStatement("DELETE FROM EMPLOYES WHERE ID =?");
			ps.setInt(1,id);
			ps.executeUpdate();//car on a insert/delete/update on execute la requete avec executeUpdate
			ps.close();//attention il faut pas fermer la cnx s'il s'agit d'un singleton
			
		  } catch (SQLException e1) {e1.printStackTrace();}
		
	}
   public Employe getEmploye(int id) {
	    Employe ep=new Employe();
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT* FROM EMPLOYES WHERE ID =? ");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ep=new Employe();
				ep.setId(rs.getInt("ID"));
				ep.setNom(rs.getString("NOM"));
				ep.setPrenom(rs.getString("PRENOM"));
				ep.setEmail(rs.getString("EMAIL"));
				ep.setTelephone(rs.getString("TELEPHONE"));
				ep.setService(rs.getString("SERVICE"));
				ep.setDateEntre(rs.getString("DATEENTRE"));
		
			}
			} catch (SQLException e) {e.printStackTrace();}
		return ep;
	   
	 
	   
   }

	@Override
	public Employe update(Employe ep) {
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		 try {
			 //preparer la requete
			PreparedStatement ps=connection.prepareStatement("UPDATE EMPLOYES SET NOM=?,PRENOM=?,TELEPHONE=?,EMAIL=?,SERVICE=?,DATEENTRE=? WHERE ID=?");
			ps.setString(1,ep.getNom());
			ps.setString(2,ep.getPrenom());
			ps.setString(3,ep.getTelephone());
			ps.setString(4,ep.getEmail());
			ps.setString(5,ep.getService());
			ps.setString(6,ep.getDateEntre());
			ps.setInt(7, ep.getId());
	
			ps.executeUpdate();//car on a insert/delete/update on execute la requete avec executeUpdate
			ps.close();//attention il faut pas fermer la cnx s'il s'agit d'un singleton
			
		  } catch (SQLException e) {e.printStackTrace();}
		return ep;
	}

	@Override
	public List<Employe> chercher(String mc) {
		List<Employe>employes=new ArrayList<Employe>();
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT* FROM EMPLOYES WHERE NOM LIKE ? ");
			ps.setString(1,mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employe e=new Employe();
				e.setId(rs.getInt("ID"));
				e.setNom(rs.getString("NOM"));
				e.setPrenom(rs.getString("PRENOM"));
				e.setEmail(rs.getString("EMAIL"));
				e.setTelephone(rs.getString("TELEPHONE"));
				e.setService(rs.getString("SERVICE"));
				e.setDateEntre(rs.getString("DATEENTRE"));
				employes.add(e);
			}
			} catch (SQLException e) {e.printStackTrace();}
		return employes;
	}
	public List<Employe> getemployes() {
		List<Employe>employes=new ArrayList<Employe>();
		Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT* FROM EMPLOYES  ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employe e=new Employe();
				e.setId(rs.getInt("ID"));
				e.setNom(rs.getString("NOM"));
				e.setPrenom(rs.getString("PRENOM"));
				e.setEmail(rs.getString("EMAIL"));
				e.setTelephone(rs.getString("TELEPHONE"));
				e.setService(rs.getString("SERVICE"));
				e.setDateEntre(rs.getString("DATEENTRE"));
				employes.add(e);
			}
			} catch (SQLException e) {e.printStackTrace();}
		return employes;
	}
	 public Absence getAbsence(int id) {
		    Absence a=new Absence();
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			
			try {
				PreparedStatement ps = connection.prepareStatement("SELECT ABSENCE.ID_ABS,EMPLOYES.ID,ABSENCE.DATE,ABSENCE.COMMENT FROM ABSENCE INNER JOIN EMPLOYES ON  ABSENCE.ID =EMPLOYES.ID WHERE EMPLOYES.ID=? ");
			    ps.setInt(1,id); 
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					a=new Absence();
					a.setId_abs(rs.getInt("ID_ABS"));
					a.setId(rs.getInt("ID"));
					a.setDate(rs.getString("DATE"));
					a.setComment(rs.getString("COMMENT"));
					
				}
				} catch (SQLException e) {e.printStackTrace();}
			return a;  
	   }
	 public Absence saveabs(Absence a) {
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			 try {
				 //preparer la requete
				PreparedStatement ps=connection.prepareStatement("INSERT INTO ABSENCE (ID,DATE,COMMENT)VALUES(?,?,?)");
				ps.setInt(1,a.getId());
				ps.setString(2,a.getDate());
				ps.setString(3,a.getComment());
				ps.executeUpdate();//car on a insert/delete/update on execute la requete avec executeUpdate
				ps.close();//attention il faut pas fermer la cnx s'il s'agit d'un singleton
				//il faut executer une autre requete pour retourner le id
				PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID_ABS) AS MAXID FROM ABSENCE ");
				ResultSet rs =ps2.executeQuery();
				if(rs.next()) {
					a.setId_abs(rs.getInt("MAXID"));//je prend la valeur de maxid (get) je la mis dans la var id (set))
				}
			  } catch (SQLException e1) {e1.printStackTrace();}
			return a;
		}
	 public List<Absence> chercherAbs(String nom) {
			List<Absence>absences=new ArrayList<Absence>();
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			
			try {
				PreparedStatement ps = connection.prepareStatement("SELECT EMPLOYES.ID,ABSENCE.ID_ABS,ABSENCE.DATE,ABSENCE.COMMENT FROM ABSENCE INNER JOIN EMPLOYES ON ABSENCE.ID =EMPLOYES.ID WHERE EMPLOYES.NOM=?  ");
				ps.setString(1,nom);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Absence a=new Absence();
					a.setId(rs.getInt("ID"));
					a.setId(rs.getInt("ID_ABS"));
					a.setDate(rs.getString("DATE"));
					a.setComment(rs.getString("COMMENT"));
					absences.add(a);
				}
				} catch (SQLException e) {e.printStackTrace();}
			return absences;
		}
	 public Conge getConge(int id) {
		    Conge a=new Conge();
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			
			try {
				PreparedStatement ps = connection.prepareStatement("SELECT CONGE.ID_CONGE,EMPLOYES.ID,CONGE.DATEDEBUT,CONGE.DATEFIN,CONGE.TYPECONGE FROM CONGE INNER JOIN EMPLOYES ON  CONGE.ID =EMPLOYES.ID WHERE EMPLOYES.ID=? ");
			    ps.setInt(1,id); 
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					a=new Conge();
					a.setId_conge(rs.getInt("ID_ABS"));
					a.setId(rs.getInt("ID"));
					a.setDateDebut(rs.getDate("DATEDEBUT"));
					a.setDateFin(rs.getDate("DATEFIN"));
					a.setTypeConge(rs.getString("TYPECONGE"));
					
				}
				} catch (SQLException e) {e.printStackTrace();}
			return a;  
	   }
	
	
	 public Conge savecong(Conge a) {
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			 try {
				 //preparer la requete
				PreparedStatement ps=connection.prepareStatement("INSERT INTO CONGE (ID,DATEDEBUT,DATEFIN,TYPECONGE)VALUES(?,?,?,?)");
				ps.setInt(1,a.getId());
				ps.setDate(2,new java.sql.Date(a.getDateDebut().getTime()));	
				ps.setDate(3,new java.sql.Date(a.getDateFin().getTime()));			
				ps.setString(4,a.getTypeConge());
				ps.executeUpdate();//car on a insert/delete/update on execute la requete avec executeUpdate
				ps.close();//attention il faut pas fermer la cnx s'il s'agit d'un singleton
				//il faut executer une autre requete pour retourner le id
				PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID_CONGE) AS MAXID FROM CONGE ");
				ResultSet rs =ps2.executeQuery();
				if(rs.next()) {
					a.setId_conge(rs.getInt("MAXID"));//je prend la valeur de maxid (get) je la mis dans la var id (set))
				}
			  } catch (SQLException e1) {e1.printStackTrace();}
			return a;
		}
	 public List<Conge> chercherconge(String nom) {
			List <Conge>absences=new ArrayList<Conge>();
			Connection connection=SingletonConnexion.getConnetion();//ona va returner la conx apres sa creation
			
			try {
				PreparedStatement ps = connection.prepareStatement("SELECT EMPLOYES.ID,CONGE.ID_CONGE,CONGE.DATEDEBUT,CONGE.DATEFIN ,CONGE.TYPECONGE FROM CONGE INNER JOIN EMPLOYES ON CONGE.ID =EMPLOYES.ID WHERE EMPLOYES.NOM=? ");
				ps.setString(1,nom);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Conge a=new Conge();
					a.setId(rs.getInt("ID"));
					a.setId(rs.getInt("ID_CONGE"));
					a.setDateDebut(rs.getDate("DATEDEBUT"));
					a.setDateFin(rs.getDate("DATEFIN"));
					a.setTypeConge(rs.getString("TYPECONGE"));
					absences.add(a);
				}
				} catch (SQLException e) {e.printStackTrace();}
			return absences;
		}


}
 