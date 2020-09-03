/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;
//single inheritance
/**
 *
 * @author KIRTHANA
 */
public class calcinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        advancecal b=new advancecal();
        b.add(5,7);
        b.sub(35,45);
        b.mul(30,2);
        b.div(25,5);
        b.mod(5,3);
        b.pow(5,3);
    }
    
}
class basiccal
{
    void add(int a,int b)
    {
        System.out.println(""+a+"+"+b+"="+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println(""+a+"-"+b+"="+(a-b));
    }
    void mul(int a,int b)
    {
        System.out.println(""+a+"*"+b+"="+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println(""+a+"/"+b+"="+(a/b));
    }
}
class advancecal extends basiccal
{
    void mod(int a,int b)
    {
        System.out.println(""+a+"%"+b+"="+(a%b));
    }
    void pow(int a,int b)
    {
        System.out.println(""+a+"^"+b+"="+(Math.pow(a,b)));
    }
}