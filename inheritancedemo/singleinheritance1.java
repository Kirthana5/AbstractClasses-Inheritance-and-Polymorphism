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
public class singleinheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stud s;
        s=new mark();
        s.read();
        s.display();
    }
    
}
class stud
{
    String name,rollno;
    Scanner obj=new Scanner(System.in); //no need to use scanner again in inherited class sice it is super class
    void read()
    {
        System.out.println("Enter student's name:");
        name=obj.next();
        System.out.println("Enter rollno.");
        rollno=obj.next();
    }
    void display()
    {
        System.out.println("===========\nSTUDENT DETAILS:\nName:"+name+"\nRoll no."+rollno);
    }
}
class mark extends stud
{
    double m1,m2,m3;
    void read()
    {
        super.read();  //to use super class' method as both super & sub class have same method name
        
        System.out.println("Enter marks 1:");
        m1=obj.nextDouble();
        
        System.out.println("Enter marks 2:");
        m2=obj.nextDouble();
        
        System.out.println("Enter marks 3:");
        m3=obj.nextDouble();
    }
    void display()
    {
        super.display();
        
        System.out.println("Marks 1:"+m1+"\nMarks 2:"+m2+"\nMarks 3:"+m3);
    }
}