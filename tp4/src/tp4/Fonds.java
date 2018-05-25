/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.*;

/**
 *
 * @author rapha
 */
public class Fonds implements Comparable<Fonds> {
    
public double amount;

//Constructeur par défaut
public Fonds() {
    amount=0;
}

//COnstructeur avec paramètre
public Fonds(double a) {
    amount=a;
}
 
@Override
   public int compareTo(Fonds t) {
  
    if(this.amount > t.amount)
    {return 1;}
    else if( this.amount == t.amount )
    {return 0;}
    else
    {return -1; }
      
    }
    
    public boolean equals(Fonds t){
        
  
     if(t.amount == t.amount)
     return true  ;  
     else
             
    return false;
}

}
