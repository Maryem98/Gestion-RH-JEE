package metier.entites;

public class Absence {
	private int id_abs;
	private int id;
	private String date;
	private String comment;
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Absence(int id, String date, String comment) {
		super();
		this.id = id;
		this.date = date;
		this.comment = comment;
	}

	public Absence(int id_abs, int id, String date, String comment) {
		super();
		this.id_abs = id_abs;
		this.id = id;
		this.date = date;
		this.comment = comment;
	}
	public int getId_abs() {
		return id_abs;
	}
	public void setId_abs(int id_abs) {
		this.id_abs = id_abs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Absence [id_abs=" + id_abs + ", id=" + id + ", date=" + date + ", comment=" + comment + "]";
	}
	

}