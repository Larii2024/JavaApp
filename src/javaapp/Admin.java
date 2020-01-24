/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class Admin extends JavaApp{
    String admin_name;
    public Admin(String uid,String e,String an){
        super(uid,e);
        admin_name=an;
        
    }
   public void Exit(){
       System.exit(0);
   }
    public void UpdateCatalog(){
        Scanner in=new Scanner(System.in);
        System.out.println("******************************ADMIN DETAILS***************************************");
        System.out.println("\n Enter your id");
        userid=in.nextLine();
        System.out.println("Enter the new admin name:");
        admin_name=in.nextLine();
          System.out.println("Enter your email address");
        email=in.nextLine();
        System.out.println("**********************************************************************************");
        
        
    }
    
}
