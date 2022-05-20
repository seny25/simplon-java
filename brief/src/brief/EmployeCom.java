package brief;

public class EmployeCom {

}
package brif;

import java.util.Scanner;

public class EmployeCom extends Employe{
private int vente=25;
private int commi=1/2;
private double salairenet=1000;
private double salaireFixe=4000;

Scanner clavier=new Scanner(System.in);

public EmployeCom() {
	
}



public EmployeCom(String nom, String prenom, String date, int vente, int commi, double salairenet,double salaireFixe) {
	super(nom, prenom, date);
	this.vente = vente;
	this.commi = commi;
	this.salairenet = salairenet;
}





public double getSalaireFixe() {
	return salaireFixe;
}



public void setSalaireFixe(double salaireFixe) {
	this.salaireFixe = salaireFixe;
}



public int getVente() {
	return vente;
}



public void setVente(int vente) {
	this.vente = vente;
}



public int getCommi() {
	return commi;
}



public void setCommi(int commi) {
	this.commi = commi;
}



public double getSalairenet() {
	return salairenet;
}



public void setSalairenet(double salairenet) {
	this.salairenet = salairenet;
}



@Override
public void calcul_salaire() {
	  Scanner sc = new Scanner(System.in);
	   
	        salairenet = salaireFixe + (vente * commi);
	        System.out.println(" votre salaire est "+salairenet);
	    }



@Override
public String toString() {
	return "EmployeCom [vente=" + vente + ", commi=" + commi + ", salairenet=" + salairenet + ", salaireFixe="
			+ salaireFixe + "]";
}
	}




