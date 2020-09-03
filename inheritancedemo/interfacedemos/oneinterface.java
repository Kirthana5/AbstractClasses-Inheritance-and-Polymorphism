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
public class oneinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obj creation using CLASS name
        test o=new test();
        o.display();
        
        //obj creation using INTERFACE name
        demo o1=new test();
        o1.display();
    }
    
}
//1------>declaration
interface demo
{
    int a=10;//-------->variable[public final static]---by default
    void display();//------->only declaration--abstract method[public abstract]---by default
}
//2------->implementation
class test implements demo
{
    //definition of abstract method with access specifier "PUBLIC"
    public void display()
    {
        System.out.println("Inside Interface!!");
    }
}
