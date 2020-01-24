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
public class Student extends JavaApp{
       /**
     * Default constructor
     */
    public Student(String uid,String e,String Sn,String Cn,String Qf,String Br) {
        super(uid,e);
        Studentname=Sn;
        College_name=Cn;
        Qualification=Qf;
        Branch=Br;
    }

   public String Studentname;
   public String College_name;
   public String Qualification;
   public String Branch;
   public int aptitude_marks;


    public void login() {
        super.login();
         }
    public void Training(){
        System.out.println("************************************Training Details******************************");
        System.out.println("\nStudent id"+userid);
        Date d1=new Date();
        System.out.println("Registered Date: "+ d1);
         System.out.println("Student Name:"+Studentname);
        System.out.println("Qualification:"+Qualification);
        if(Qualification=="B.E First Year"){
            System.out.println("The company gives training for one year period for the course of your choice");
            }
        else if(Qualification=="B.E Second Year"){
           System.out.println("The company gives training for 9 months period for the course of your choice"); 
        }
        else if(Qualification=="B.E Third Year"){
         System.out.println("The company gives training for 6 months period for the course of your choice");   
        }
        else if(Qualification=="B.E Final Year"){
         System.out.println("The company gives training for 3 months period for the course of your choice");   
        }
        else if(Qualification=="M.Tech First Year"){
         System.out.println("The company gives training for 2 months period and a fixed job");   
        }
        else if(Qualification=="M.Tech Second Year"){
         System.out.println("The company gives training for 1 months period and a fixed job");
        }
        else{
         System.out.println("Invalid Qualification");}
        System.out.println("**********************************************************************************");        
       
        }
    public void Placement(){
        System.out.println("***************************PlACEMENT DETAILS**************************************");
        System.out.println("Student id"+userid);
        System.out.println("Student Name:"+Studentname);
        System.out.println("Qualification:"+Qualification);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter aptitude marks out of 100(Passing Criteria:75 or above):");
        aptitude_marks=Integer.parseInt(in.nextLine());
        if((Qualification=="B.E Final Year"||Qualification=="M.Tech First Year"||Qualification=="M.Tech Second Year")&&(aptitude_marks>=75))
        {
            System.out.println("You get a job in your desired Company");
        }
        else
        {
            System.out.println("Try out next year");
        }
        System.out.println("**********************************************************************************"); 
          
    }
    
    public void Changepassword() {
        Scanner in=new Scanner(System.in);
        System.out.println("***********************************************************************************");
        System.out.println("\nEnter your new password");
        password1=in.nextLine();
        System.out.println("Your password has been changed");
        System.out.println("********************************");
    }

    /**
     * 
     */
    public void Verifydetails() {
        System.out.println("*******************************STUDENT DETAILS*************************************");
        System.out.println("\nStudent Details are:");
        System.out.println("Student name"+ Studentname);
        System.out.println("College Name:"+College_name);
        System.out.println("Qualification:"+Qualification);
        System.out.println("Branch:"+Branch);
        System.out.println("***********************************************************************************");
            
           
        }
}
