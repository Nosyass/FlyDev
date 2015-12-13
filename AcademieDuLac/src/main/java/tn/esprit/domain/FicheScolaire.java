package tn.esprit.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class FicheScolaire {
	
	private int id ;
	@Enumerated(EnumType.STRING)
	private TypeRestauration restauration ;
	private double Montant_a_payer;
	private double Montant_payer;
	private double Montant_restant;
	private double Resultat_trim1;
	private double Resultat_trim2;
	private double Resultat_trim3;
	private Classe classe ;
	private Eleve eleve ;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TypeRestauration getRestauration() {
		return restauration;
	}
	public void setRestauration(TypeRestauration restauration) {
		this.restauration = restauration;
	}
	public double getMontant_a_payer() {
		return Montant_a_payer;
	}
	public void setMontant_a_payer(double montant_a_payer) {
		Montant_a_payer = montant_a_payer;
	}
	public double getMontant_payer() {
		return Montant_payer;
	}
	public void setMontant_payer(double montant_payer) {
		Montant_payer = montant_payer;
	}
	public double getMontant_restant() {
		return Montant_restant;
	}
	public void setMontant_restant(double montant_restant) {
		Montant_restant = montant_restant;
	}
	public double getResultat_trim1() {
		return Resultat_trim1;
	}
	public void setResultat_trim1(double resultat_trim1) {
		Resultat_trim1 = resultat_trim1;
	}
	public double getResultat_trim2() {
		return Resultat_trim2;
	}
	public void setResultat_trim2(double resultat_trim2) {
		Resultat_trim2 = resultat_trim2;
	}
	public double getResultat_trim3() {
		return Resultat_trim3;
	}
	public void setResultat_trim3(double resultat_trim3) {
		Resultat_trim3 = resultat_trim3;
	}
	
	
	@ManyToOne
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	@ManyToOne
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	

}
