/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author KIRTHANA
 */
public class constructoroverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        aaa obj1=new aaa();      //constructor overloading(similar to method overloading)
        aaa obj2=new aaa(2);     //same constructor 
        aaa obj3=new aaa("3");   //diff parameter list      but specific constructor definition
    }
    
}
class aaa
{
    aaa()
    {
        System.out.println("Constructor 1 ");
    }
    aaa(int a)
    {
        System.out.println("Constructor "+a);
    }
    aaa(String a)
    {
        System.out.println("Constructor "+a);
    }
}
