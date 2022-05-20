package brif;
import java.util.Date;

public class EmployeFixe extends Employe{
private double salaireFixe=4000;



public  EmployeFixe() {
	
}



public EmployeFixe(double salaireFixe) {
	super();
	this.salaireFixe = salaireFixe;
}



public EmployeFixe(String nom, String prenom, String date, double salaireFixe) {
	super(nom, prenom, date);
	this.salaireFixe = salaireFixe;
}



@Override
public void calcul_salaire() {
	// TODO Auto-generated method stub
	
}



@Override
public String toString() {
	return "EmployeFixe [salaireFixe=" + salaireFixe + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + "]";
}



	
	
}
