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
public class multilevelinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        System.out.println("Enter height,width,depth:");
        double h=val.nextDouble();
        double w=val.nextDouble();
        double d=val.nextDouble();
        
        //obj of derived class
        boxcost b=new boxcost(h,w,d,20);
        System.out.println(b.height);
        b.volume(h,w,d);
        System.out.println(b.weight);
        b.incr();
        System.out.println(b.cost);

    }
    
}
class box1
{
    double height,width,depth;
    void volume(double h,double w,double d)
    {
        System.out.println("VOLUME: "+(h*w*d));
    }
}
class boxweight1 extends box1
{
    double weight;
    void incr()
    {
        System.out.println("WEIGHT:"+(weight+10));
    }
    
}
class boxcost extends boxweight1
{
    double cost=30.0;
    boxcost(double h,double w,double d,double we)
    {
        height=h;
        width=w;
        depth=d;
        weight=we;
    }
}
