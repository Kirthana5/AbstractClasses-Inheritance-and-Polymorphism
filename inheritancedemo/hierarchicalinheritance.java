/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

import java.util.Scanner;

/**
 *
 * @author KIRTHANA
 */
public class hierarchicalinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter college details:");
        String clgname=obj.next();
        String clgcode=obj.next();
        
        //obj of subclass 1
        student s=new student(clgname,clgcode,"RIYA","19CSE008","CSE");
        System.out.println(s);
        
        //obj of subclass 2
        staff sf=new staff(clgname,clgcode);
        sf.read();
        sf.display();
    }
    
}
class college
{
    String clgname,clgcode;
}
class student extends college
{
    String name,rollno,dept;
    student(String cn,String cc,String n,String r,String d)
    {
        clgname=cn;
        clgcode=cc;
        name=n;
        rollno=r;
        dept=d;
    }
    @Override
    public String toString()
    {
        return ("\nCOLLEGE NAME:"+clgname+"\nCOLLEGE CODE:"+clgcode+"\nSTUDENT DETAILS:\nNAME:"+name+"\nROLL NO:"+rollno+"\nDEPARTMENT:"+dept);
        
    }
}
class staff extends college
{
    String name,staffid,dept;
    staff(String cn,String cc)
    {
        clgname=cn;
        clgcode=cc;
    }
    void read()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter STAFF details:");
        System.out.println("Enter name:");
        name=obj.next();
        System.out.println("Enter staffid:");
        staffid=obj.next();
        System.out.println("Enter department:");
        dept=obj.next();
    }
    void display()
    {
        System.out.println("\nCOLLEGE NAME:"+clgname+"\nCOLLEGE CODE:"+clgcode+"\nSTAFF DETAILS:\nNAME:"+name+"\nSTAFF ID:"+staffid+"\nDEPARTMENT:"+dept);
    }
}