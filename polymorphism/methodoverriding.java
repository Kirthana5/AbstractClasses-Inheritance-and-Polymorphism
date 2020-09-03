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
public class methodoverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("By formal method:");        
        //obj creation of subclasses---->formal method
        sbi obj1=new sbi();
        System.out.println(obj1.getrateofinterest());
        
        iob obj2=new iob();
        System.out.println(obj2.getrateofinterest());
        
        cbi obj3=new cbi();
        System.out.println(obj3.getrateofinterest());
        
        System.out.println("By dynamic method dispatch:");
        
        //obj creation using superclass--->DYNAMIC METHOD DISPATCH
        bank b;       //reference 
        
        b=new sbi();  //creating memory
        System.out.println(b.getrateofinterest());
        
        b=new iob();  //creating memory
        System.out.println(b.getrateofinterest());

        b=new cbi();  //creating memory
        System.out.println(b.getrateofinterest());
        
    }
    
}
class bank
{
    int getrateofinterest()
    {
        return 0;
    }
}
class sbi extends bank
{
    int getrateofinterest()
    {
        return 5;
    }
}
class iob extends bank
{
    int getrateofinterest()
    {
        return 7;
    }
}
class cbi extends bank
{
    int getrateofinterest()
    {
        return 9;
    }
}