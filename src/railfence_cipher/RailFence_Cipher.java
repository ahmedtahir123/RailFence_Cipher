/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railfence_cipher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class RailFence_Cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         FileReader fr;
         inc_or_dec q=new inc_or_dec();
        String s = "C:\\Users\\dell\\Documents\\NetBeansProjects\\the_vigenere_cipher\\src\\the_vigenere_cipher\\Plaintext.txt";
        BufferedReader br = new BufferedReader(new FileReader(s));
        String h = br.readLine();
        String w[] = h.split("");

        Scanner input = new Scanner(System.in);
        System.out.println("select a option you want \n1-incrip \n2-decrip");
        h = input.nextLine();
       
        if(h.equals("1")){
           q.inc(w);
        }else if(h.equals("2")){
           q.dec(w); 
        }else{
            System.out.println("Wrong choise");
        }
        
    }
    
}
