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
public class Recruiter extends JavaApp {
    public String Name;
    public String Company;
    public int Contactnumber;
    String studentid,qualification,branch;
    public int Companycont_num;
    public String cemail;

    public Recruiter(String uid,String e,String n,String Cn,int connum) {
        super(uid,e);
        Name=n;
        Company=Cn;
        Contactnumber=connum;
    }

    public void updatedetails() {
        System.out.println("******************************RECRUITER DETAILS**********************************");
        System.out.println("Enter in your new details:");
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the new name");
        Name=in.nextLine();
        System.out.println("Enter the new Company name");
        Company=in.nextLine();
        System.out.println("Enter your new contact number");
        Contactnumber=Integer.parseInt(in.nextLine());
        System.out.println("**********************************************************************************");
        
        }
    public void Companyextended(){
        System.out.println("**********************************************************************************");
       Scanner in=new Scanner(System.in);
        System.out.println("The Recruiter's Company details are as follows");
        System.out.println("Company name:"+Company);
        System.out.println("Enter company's contact number and email address");
        Companycont_num=in.nextInt();
        cemail=in.nextLine();
         System.out.println("**********************************************************************************");
    }
    
    public void studentdetails() {
        Scanner s=new Scanner(System.in);
        System.out.println("\n*****************************Recruited Student Details****************************");
        System.out.println("Enter the student id");
        studentid=s.nextLine();
        System.out.println("Enter the Qualification:");
        qualification=s.nextLine();
        System.out.println("Enter the Branch:");
        branch=s.nextLine();
        System.out.println("************************************************************************************");
        }

    
    
    
}
