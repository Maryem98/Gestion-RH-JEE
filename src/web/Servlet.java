
package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.EmployeDaoImp;
import dao.IEmployeDao;
import metier.entites.*;

@WebServlet(name="servlet",urlPatterns= {"*.php"})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IEmployeDao metier;    //couplage faible interface
	
    
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	metier=new EmployeDaoImp(); //couplage fort classe
    	
    }

	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		
		
		
		
		if (path.equals("/acceuil.php"))
			{
			request.getRequestDispatcher("/login/homejsp.jsp").forward(request,response);
			}
		
		else if(path.equals("/chercher.php")){
			
			  String motCle=request.getParameter("motCle"); 
			  EmployeModel  model = new EmployeModel(); 
			  model.setMotCle(motCle);//je stock le mot cle recupereé dansle model 
			  List<Employe>employes =metier.chercher("%"+motCle+"%");
			  model.setEmployes(employes);//stocker les employes dans le model
			  request.setAttribute("model", model);//je stock le model dans l'objet request
					
			request.getRequestDispatcher("chercher.jsp").forward(request,response);
		}
		else if(path.equals("/saisie.php")) {
			//request.setAttribute("employe", new Employe());
			request.getRequestDispatcher("saisie.jsp").forward(request,response);
		}
		
		
		  else if (path.equals("/save.php")&& (request.getMethod().equals("POST"))){
		  
		  String nom=request.getParameter("nom"); 
		  String prenom=request.getParameter("prenom"); 
		  String tel=request.getParameter("telephone");
		  String email=request.getParameter("email"); 
		  String service=request.getParameter("service");
		  String dateEntre=request.getParameter("dateEntre"); 
		  Employe e= metier.save(new Employe(nom, prenom, tel, email, service, dateEntre));
		  request.setAttribute("employe", e);//je stock l'employe ajouté dand dans l'objet request
		  
		  request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		  
		  }
		  else if(path.equals("/supprimer.php")) {
				int id=Integer.parseInt(request.getParameter("id"));
				metier.delete(id);
				response.sendRedirect("chercher.php?motCle=");
			} 
		  else if(path.equals("/modifier.php")) {
				int id=Integer.parseInt(request.getParameter("id"));
				Employe e=metier.getEmploye(id);
				request.setAttribute("employe",e);
			    request.getRequestDispatcher("edit.jsp").forward(request,response);
	
		  }
		  else if(path.contentEquals("/modifieremp.php")&&(request.getMethod().equals("POST"))) {
			 
			  int id =Integer.parseInt(request.getParameter("id"));
			  String nom=request.getParameter("nom"); 
			  String prenom=request.getParameter("prenom"); 
			  String tel=request.getParameter("telephone");
			  String email=request.getParameter("email"); 
			  String service=request.getParameter("service");
			  String dateEntre=request.getParameter("dateEntre"); 
			  Employe e =new Employe(nom, prenom, tel, email, service, dateEntre);
	          e.setId(id);
			  metier.update(e);
			  request.setAttribute("employe", e);
			  response.sendRedirect("chercher.php?motCle=");}
		  else if(path.equals("/acceuilabs.php")) {
			  
			  request.getRequestDispatcher("acceuilabs.jsp").forward(request,response);

		  }
		  else if(path.equals("/absence.php")) {
			  
			  List<Employe>employes =metier.getemployes();
			  
			  request.setAttribute("employes", employes);//je stock le model dans l'objet request
			  request.getRequestDispatcher("absence.jsp").forward(request,response);
			  }
		
		  else if(path.equals("/addabsence.php")) {
				int id=Integer.parseInt(request.getParameter("id"));
				Absence e=metier.getAbsence(id);
				request.setAttribute("employe",e);
			    request.getRequestDispatcher("addabsence.jsp").forward(request,response);

	
		  }
		  else if (path.equals("/addabsencetoo.php")&& (request.getMethod().equals("POST"))){
			  
			  
			  int id=Integer.parseInt(request.getParameter("id")); 
			  String date=request.getParameter("date");
			  String comment=request.getParameter("comment"); 

			  Absence e= metier.saveabs(new Absence(id, date, comment));
			  request.setAttribute("employe", e);//je stock l'employe ajouté dand dans l'objet request
			  
			  request.getRequestDispatcher("bienaffecte.jsp").forward(request,response);
			  }
		  else if(path.equals("/chercherAbs.php")){
				
			  String nom=request.getParameter("nom"); 
			  EmployeModel  model = new EmployeModel(); 
			  model.setNom(nom);//je stock le mot cle recupereé dansle model 
			  List<Absence>absences =metier.chercherAbs(nom);
			  model.setAbsences(absences);//stocker les employes dans le model
			  request.setAttribute("model", model);//je stock le model dans l'objet request
					
			request.getRequestDispatcher("chercherAbsjsp.jsp").forward(request,response);
		}
            else if(path.equals("/acceuilconge.php")) {
			  
			  request.getRequestDispatcher("acceuilconge.jsp").forward(request,response);

		  }
		  else if(path.equals("/conge.php")) {
			  
			  List<Employe>employes =metier.getemployes();
			  
			  request.setAttribute("employes", employes);//je stock le model dans l'objet request
			  request.getRequestDispatcher("conge.jsp").forward(request,response);
			  }
		
		  else if(path.equals("/addconge.php")) {
				int id=Integer.parseInt(request.getParameter("id"));
				Conge e=metier.getConge(id);
				request.setAttribute("employe",e);
			    request.getRequestDispatcher("addconge.jsp").forward(request,response);
		  }
		  else if (path.equals("/addcongetoo.php")&& (request.getMethod().equals("POST"))){
			    
			  int id=Integer.parseInt(request.getParameter("id")); 
			  java.util.Date dateDebut = null;
			 try {
				dateDebut = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateDebut"));
			 } catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			 }
			  java.util.Date dateFin = null;
			try {
				dateFin = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateFin"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			 String typeConge=request.getParameter("typeConge"); 
			  Conge e= metier.savecong(new Conge(id, dateDebut, dateFin, typeConge));
			  request.setAttribute("employe", e);//je stock l'employe ajouté dand dans l'objet request
			  
			  request.getRequestDispatcher("bienaffecte.jsp").forward(request,response);
			  }
		  else if(path.equals("/chercherConge.php")){
				
			  String name=request.getParameter("name"); 
			  EmployeModel  model = new EmployeModel(); 
			  model.setName(name);//je stock le mot cle recupereé dansle model 
			  List<Conge>conges =metier.chercherconge(name);
			  model.setConges(conges);//stocker les employes dans le model
			  request.setAttribute("model", model);//je stock le model dans l'objet request		
			  request.getRequestDispatcher("getConges.jsp").forward(request,response);
		  }
		
		  }
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
 
}
