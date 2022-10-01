/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int item, bonus, total;
        
        System.out.println("selamat Datang di\nGerai Riston");
        System.out.println("beli 2 gratis 1");
        System.out.print("masukkan jumlah item anda=");
        item = input.nextInt();
        
       if(item%5==0){
           bonus = item/2;          
           total = item+bonus;
           System.out.println("Anda membeli "+item+" item dengan bonus sebanyak "+bonus+" item,total "+total+" item");
           System.out.print("Dan anda mendapatkan cashback 20.000. ");
          }
       else if(item%2==0){
           bonus = item/2;
           total = item+bonus;
           System.out.println("Anda membeli "+item+" item dengan bonus sebanyak "+bonus+" item,total "+total+" item");
       }
    }
}

    
    

