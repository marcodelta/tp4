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
public class Portefeuille {
    
public HashMap<String, Fonds> f;
public HashMap<String, Instrument> i;


public Portefeuille() {
    f = new HashMap<>() ;
    i = new HashMap<>() ;
}
// A blinder !
public double recherchefond(String s){ 
    Fonds fo = new Fonds();
    fo=f.get(s);
    
    return fo.amount; 
}
// A blinder !
public Instrument rechercheinstru(String s){
    Instrument instru = new Instrument();
    instru=i.get(s);
    
    return instru;
}
//A blinder
public void ajoutfond(String c, double m) {
    Fonds fo = new Fonds(m);
    f.put(c,fo);
}

}
