/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railfence_cipher;

/**
 *
 * @author dell
 */
public class inc_or_dec {
    
  String  inc(String w[]){
      int i;
      for (int j = 0; j <2; j++) {
          i=j;
      for ( ;i < w.length;) {
          System.out.print(w[i]);
          i+=2;
      }
      }
      return null;
        
    }
  
  
  
    String dec(String w[]){
      
int j;        
if(w.length%2==0){
j=((w.length/2));
    System.out.println(j);
    for (int i = 0; i < (w.length/2); i++) {
        System.out.print(w[i]+w[j]);
        j++;
    }
    
}else{
j=(w.length/2);
j+=1;
    for (int i = 0; i < (w.length/2); i++) {
        System.out.print(w[i]+w[j]);
        j++;
    }
    System.out.print(w[(w.length/2)]);
}
        
     
        
        
        
//        for (int k = 0; k < v.length; k++) {
//            System.out.print(v[k]);
//        }
//        ;
        return null;
        
    }
    
}
