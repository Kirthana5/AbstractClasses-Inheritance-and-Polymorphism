/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassdemos;

/**
 *
 * 
 * @author KIRTHANA
 */
public class demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        a obj=new b();  //-------->can't create obj for abstract class
        obj.display();  //         hence we create like this using
        obj.add();      //         DYNAMIC METHOD DISPATCH
        obj.sub();      //         Or simply can create obj for sub class
        
        
        
    }
}
/*As like METHODS should be present inside CLASS,
ABSTRACT METHODS should be present inside ABSTRACT CLASS.
 In abstract class, only DECLARATION part is allowed.
DEFINITION part should be in DERIVED(SUB) CLASS.*/
abstract class a  //---->also called CONCRETE CLASS
{
    abstract void add();         //--->one abstract class can have n no. of abstract
    abstract public void sub();  //methods and also can have normal methods
    void display()
    {
        System.out.println("1st method:display");
    }
}
class b extends a
{
    void add()
    {
        System.out.println("2nd method:add");
    }
    public void sub()
    {
        System.out.println("3rd method:sub");
    }
}