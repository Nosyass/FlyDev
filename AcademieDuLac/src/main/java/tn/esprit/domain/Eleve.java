package tn.esprit.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 @Entity
public class Eleve {
	
	
	private int id;

	private String Nom;
	private String Prenom ;
	private char Sexe ;
	private Date Date_de_Naissance ;
	private String Lieu_de_Naissance;
	private String Adresse ;
	private String Nom_pere ;
	private String Nom_mere;
	private int Tel_pere ;
	private int Tel_mere;
	private int Contact_durgence ;
	private String Etat_Sante;
	private List<FicheScolaire> ficheScolaires ;
	
	
	

	
	public Eleve(String nom, String prenom, char sexe, Date date_de_Naissance,
			String lieu_de_Naissance, String adresse, String nom_pere,
			String nom_mere, int tel_pere, int tel_mere, int contact_durgence,
			String etat_Sante) {
		super();
		Nom = nom;
		Prenom = prenom;
		Sexe = sexe;
		Date_de_Naissance = date_de_Naissance;
		Lieu_de_Naissance = lieu_de_Naissance;
		Adresse = adresse;
		Nom_pere = nom_pere;
		Nom_mere = nom_mere;
		Tel_pere = tel_pere;
		Tel_mere = tel_mere;
		Contact_durgence = contact_durgence;
		Etat_Sante = etat_Sante;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public char getSexe() {
		return Sexe;
	}

	public void setSexe(char sexe) {
		Sexe = sexe;
	}

	public Date getDate_de_Naissance() {
		return Date_de_Naissance;
	}

	public void setDate_de_Naissance(Date date_de_Naissance) {
		Date_de_Naissance = date_de_Naissance;
	}

	public String getLieu_de_Naissance() {
		return Lieu_de_Naissance;
	}

	public void setLieu_de_Naissance(String lieu_de_Naissance) {
		Lieu_de_Naissance = lieu_de_Naissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNom_pere() {
		return Nom_pere;
	}

	public void setNom_pere(String nom_pere) {
		Nom_pere = nom_pere;
	}

	public String getNom_mere() {
		return Nom_mere;
	}

	public void setNom_mere(String nom_mere) {
		Nom_mere = nom_mere;
	}

	public int getTel_pere() {
		return Tel_pere;
	}

	public void setTel_pere(int tel_pere) {
		Tel_pere = tel_pere;
	}

	public int getTel_mere() {
		return Tel_mere;
	}

	public void setTel_mere(int tel_mere) {
		Tel_mere = tel_mere;
	}

	public int getContact_durgence() {
		return Contact_durgence;
	}

	public void setContact_durgence(int contact_durgence) {
		Contact_durgence = contact_durgence;
	}

	public String getEtat_Sante() {
		return Etat_Sante;
	}

	public void setEtat_Sante(String etat_Sante) {
		Etat_Sante = etat_Sante;
	}
	@OneToMany (mappedBy="eleve")
	public List<FicheScolaire> getFicheScolaires() {
		return ficheScolaires;
	}

	public void setFicheScolaires(List<FicheScolaire> ficheScolaires) {
		this.ficheScolaires = ficheScolaires;
	}

	

   
}
