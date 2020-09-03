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
public class default_static {

    /**
     * @param args the command line arguments
     */
    
/*DEFAULT/STATIC METHODS----->available only in JDK 1.8(seen in libraries)
    1.DEFAULT METHOD:
          ==>for SPECIFIC method implementation
          ==>can have DEFINITION part of these methods WITHIN INTERFACE
          ==>obj creation is similar to obj creation of abstract methods 
             in INTERFACE(2 ways:using CLASS,using INTERFACE)
    2.STATIC METHOD:
          ==>similar to static methods seen before
          ==>can have DEFINITION part of these methods WITHIN INTERFACE
          ==>obj creation is done only by using INTERFACE'S NAME
          ==> SYNTAX: interface_name.method_name();
 */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obj creation using class
        aaa obj=new aaa();
        obj.display();//----->ABSTRACT METHOD
        obj.display1();//------>DEFAULT METHOD
        
        xxx obj1=new aaa();
        obj1.display();//----->ABSTRACT METHOD
        obj1.display1();//------>DEFAULT METHOD
        
        xxx.display2();//-------->STATIC METHOD
    }
    
}
interface xxx
{
    void display();        //----->ABSTRACT METHOD
    default void display1()//------>DEFAULT METHOD
    {
        System.out.println("2.Default method!!");
    }
    static void display2()//------>STATIC METHOD
    {
        System.out.println("3.Static method!!");
    }

}
class aaa implements xxx
{
    public void display()
    {
        System.out.println("1.Abstract method!!");
    }
}