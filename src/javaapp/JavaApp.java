 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.*;
    /**


/**
 *User class
 */
 public class JavaApp{
    public String userid;
    public String email;
    public String password1,password2;
    public JavaApp(String uid,String e) {
        userid=uid;
        email=e;
        }
  
    public void login() {
        System.out.println("****************************USER LOGIN PORTAL*************************************");
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter Email address:");
        email=in.nextLine();
        System.out.println("Enter the password:");
        password1=in.nextLine();
    }
    
    public void Verifylogin() {
        System.out.println("****************************LOGIN VERIFICATION************************************");
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter your password again:");
        password2=in.nextLine();
        if(password1.equals(password2))
        {
            System.out.println("Login Successful!!");
        }
        else
        {
            System.out.println("Incorrect password!!");
        }
        System.out.println("**********************************************************************************");
    }

    public static void main(String args[]){
    
        Admin ad=new Admin("Pr5374","jdh@fghmail.com","Larina Maskren");
        Student s=new Student("S5656","536735@hhjh.com","Sakshi","KLSGIT","B.E First Year","C.S"); 
        Recruiter r=new Recruiter("R673846","fcgf@gmail.com","Pratiksha","Wipro",6549568);
        System.out.println("**************A SIMPLE TRAINING AND PLACEMENT MANAGEMENT SYSTEM*******************");
        System.out.println("\n");
        s.login();
        s.Training();
        s.Placement();
        s.Verifylogin();
        
} 
} 
     
    
    

