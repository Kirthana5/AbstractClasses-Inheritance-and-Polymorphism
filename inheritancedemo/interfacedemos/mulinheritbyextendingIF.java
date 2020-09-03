/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemos;

/**
 *
 * @author KIRTHANA
 */
public class mulinheritbyextendingIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obj creation using CLASS
        demos1 o=new demos1();
        o.display();//common method for both INTERFACES
        o.dis1();//method of INTERFACE 1
        o.dis2();//method of INTERFACE 2
        o.display1();//concrete method in CLASS
        
        //obj creation using interface 1
        t1 o1=new demos1();//---->super IF
        o1.display();//---->its own method
        o1.dis1();   //---->its own method
        //o1.display1();------>can't call class' method
        //o1.dis2();------>can't call other interface's method
        
        //obj creation using interface 2
        t2 o2=new demos1();//----->sub IF
        o2.display();//---->its own method
        o2.dis2();   //---->its own method
        o2.dis1();//------>can call SUPER INTERFACE'S method
        //o2.display1();------>can't call class' method
        

    }
    
}
interface t1
{
    void display();
    void dis1();
}
interface t2 extends t1//-------->inheriting Interface
{
    void display();
    void dis2();
}
class demos1 implements t2 //implementing sub IF is enough
{
    public void display()
    {
        System.out.println("Common method for Interface 1,Interface 2");
    }
    public void dis1()
    {
        System.out.println("Interface 1");
    }
    public void dis2()
    {
        System.out.println("Interface 2");
    }
    public void display1()
    {
        System.out.println("Method of class");
    }
    
}