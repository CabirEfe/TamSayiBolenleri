/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TamSayıBölenleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        
        
        for(int sayi2 = 1; sayi2 < sayi; sayi2++)
        {
            if(sayi % sayi2 == 0)
            {
            System.out.println(sayi2);
            }
        }
        
          /*
           Adım 1 = Başla
           Adım 2 = Kullanıcadan Değer Al/Oku
           Adım 3 = sayi2 > sayi büyükse Adım 7 Git
           Adım 4 = sayi % sayi2 == 0 ise sayi2 yadzdır
           Adım 5 = sayi2++
           Adım 6 = Git Adım 3
           Adım 7 = Bitir
        */ 
        
        
        
        
        
        
        
    }
    
}
