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
public class hierarchicalinheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        students s=new students();
        s.getstudentdetails();
        s.show();
        
        staffs ss=new staffs();
        ss.getstaffdetails();
        ss.show();
    }
    
}
class book
{
    String name,author;
    int accssno;
    Scanner obj=new Scanner(System.in); 
    void getbookdetails()
    {
        System.out.println("Enter book name:");
        name=obj.next();
        System.out.println("Enter access number:");
        accssno=obj.nextInt();
        System.out.println("Enter author's name:");
        author=obj.next();
    }
    void show()
    {
        System.out.println("============\nBOOK DETAILS:\nBook name:"+name+"\nAccess number:"+accssno+"\nAuthor's name:"+author);
    }
}
class students extends book
{
    String name,rollno,dept;
    void getstudentdetails()
    {
        super.getbookdetails();
        
        System.out.println("Enter student's name:");
        name=obj.next();
        System.out.println("Enter student's roll no.");
        rollno=obj.next();
        System.out.println("Enter department:");
        dept=obj.next();
    }
    void show()
    {
        super.show();
        
        System.out.println("STUDENT'S DETAILS:\nName:"+name+"\nRoll no."+rollno+"\nDepartment:"+dept+"\n============");
    }
}
class staffs extends book
{
    String name,sid,dept;
    void getstaffdetails()
    {
        super.getbookdetails();
        
        System.out.println("Enter staff's name:");
        name=obj.next();
        System.out.println("Enter staff's id:");
        sid=obj.next();
        System.out.println("Enter department:");
        dept=obj.next();
        
    }

    void show()
    {
        super.show();
        
        System.out.println("STAFF'S DETAILS:\nName:"+name+"\nStaff ID:"+sid+"\nDepartment:"+dept+"\n===============");
    }
}