package brif;

import java.util.Scanner;

public class EmployeHoraire extends Employe{
	Scanner clavier=new Scanner(System.in);
	        int TH =34;
	        int HP=190;
	        int salairnet = 6460;
;
	  
	       	
	        public EmployeHoraire() {
				
			}
	        
			public EmployeHoraire(String nom, String prenom, String date, int tH, int hP, int salairnet, int tmin) {
				super(nom, prenom, date);
				this.TH = tH;
				this.HP = hP;
				this.salairnet = salairnet;
				
			}
			@Override
			public void calcul_salaire() {
			               
			                        System.out.println("votre salaire est "+salairnet);
			                    }
				
			

			@Override
			public String toString() {
				return "EmployeHoraire [TH=" + TH + ", HP=" + HP + ", salairnet=" + salairnet + "]";
			}

}
 
