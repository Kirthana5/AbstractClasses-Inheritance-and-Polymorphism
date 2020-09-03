/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassdemos;

import java.util.Scanner;

/**
 *
 * @author KIRTHANA
 */
public class demo2shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        shape s;      //--->DYNAMIC METHOD DISPATCH
        
        s=new circle();  
        s.read();
        s.findarea();
        s.display();
        
        s=new square();
        s.read();
        s.findarea();
        s.display();

    }
    
}
abstract class shape         //-->CONCRETE CLASS
{
    abstract void read();
    abstract void findarea();
    abstract void display();
    Scanner obj=new Scanner(System.in);
}
class circle extends shape       //-->SUB CLASS-1
{
    float radius,area;
    void read()
    {
        System.out.println("ENTER RADIUS:");
        radius=obj.nextFloat();
    }
    void findarea() 
    {
        area=(float)Math.PI*radius*radius;
    }
    void display()
    {
       System.out.println("AREA OF A CIRCLE="+area); 
    }
}
class square extends shape       //-->SUB CLASS-2
{
    float side,area;
    void read()
    {
        System.out.println("ENTER SIDE:");
        side=obj.nextFloat();
    }
    void findarea()
    {
        area=4*side;
    }
    void display()
    {
       System.out.println("AREA OF A SQUARE="+area); 
    }
}            
            
