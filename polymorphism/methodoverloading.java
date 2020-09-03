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
public class methodoverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arith obj1=new arith();
        obj1.add();                    //Same method name
        obj1.add(10,20);               //Diff parameterlist
        obj1.add(14.5,0.6);            //specific method definition
        obj1.add("CSE"," Dept");
    }
    
}
class arith
{
    void add()
    {
        int a=5,b=10;
        System.out.println("Method 1:"+(a+b));
    }
    void add(int a,int b)
    {
        System.out.println("Method 2:"+(a+b));
    }
    void add(double a,double b)
    {
        System.out.println("Method 2:"+(a+b));
    }
    void add(String a,String b)
    {
        System.out.println("Method 2:"+(a+b));
    }
}
