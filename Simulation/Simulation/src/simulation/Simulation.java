/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;
import java.util.Scanner;

/**
 *
 * @author ashu
 */
public class Simulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		Scanner x;
		x=new Scanner(System.in);
		
		int a,d;
		
		System.out.println("Enter age of person");
		
		a=x.nextInt();
		
		d=365*a;
		
		System.out.println("The age in days is");
		System.out.println(d);


        
    }
    
}
