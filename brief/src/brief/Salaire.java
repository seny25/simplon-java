package brif;

import java.util.Scanner;

public class Salaire {
	public static void main(String[] args) {
		
				
		EmployeFixe EF= new EmployeFixe("EE","rr","uu",300000);		
		EmployeHoraire EH=new EmployeHoraire( "ft","yt","11/03/1994",34,190,6460,20);
		EmployeCom EC=new EmployeCom("dd", "ff", "23/05/199", 25, 1/2, 1000, 4000);
		
		System.out.println(EF.toString());
		System.out.println(EH.toString());
		System.out.println(EC.toString());
  }
}	

