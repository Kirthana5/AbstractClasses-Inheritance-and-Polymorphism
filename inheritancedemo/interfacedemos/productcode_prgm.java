/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*PROBLEM STATEMENT:
   interface1--->productcode
     -->tv=101,laptop=102,mobile=103
   interface2--->productdetails
     -->getproductdetails(int code)
     -->getproductprice(int code)
    If code is entered have to display details &price about 
particular product.
*/
package interfacedemos;

import java.util.Scanner;

/**
 *
 * @author KIRTHANA
 */
public class productcode_prgm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        product obj=new product();
        System.out.println("Enter Product code:");
        int code=val.nextInt();
        obj.getproductdetails(code);
        obj.getproductprice(code);
    }
    
}
interface productcode
{
    int tv=101,laptop=102,mobile=103;
}
interface productdetails
{
    void getproductdetails(int code);
    void getproductprice(int code);
}
class product implements productcode,productdetails
{
    public void getproductdetails(int code)
    {
        switch(code)
        {
            case tv:
                System.out.println("PRODUCT DETAILS:\nPRODUCT NAME:Television\nBRAND:LG\nPRODUCT CODE:"+code);
                break;
            case laptop:
                System.out.println("PRODUCT DETAILS:\nPRODUCT NAME:Laptop\nBRAND:ASUS\nPRODUCT CODE:"+code);
                break;
            case mobile:
                System.out.println("PRODUCT DETAILS:\nPRODUCT NAME:Mobile Phone\nBRAND:Realme\nPRODUCT CODE:"+code);
                break;
            default:
                System.out.println("INVALID CODE !!");
                break;

        }
    }
    public void getproductprice(int code)
    {
        switch(code)
        {
            case tv:
                System.out.println("PRODUCT PRICE: Rs.18,000/-");
                break;
            case laptop:
                System.out.println("PRODUCT PRICE: Rs.25,000/-");
                break;
            case mobile:
                System.out.println("PRODUCT PRICE: Rs.17,000/-");
                break;
            default:
                System.out.println("NO PRODUCT TO BE DISPLAYED !!");
                break;

        }
    }
}