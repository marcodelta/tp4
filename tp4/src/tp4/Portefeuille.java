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
public double recherchefond(String c) throws FondInexistant{ 
    if(!f.containsKey(c))
    {
        throw new FondInexistant("La clé entrée ne correspond à aucun fond");
    }
    else
    {
        return f.get(c).amount; 
    }
    
}
// A blinder !
public Instrument rechercheinstru(String c){
    Instrument instru = new Instrument();
    instru=i.get(c);
    
    return instru;
}
//A blinder
public void ajoutfond(String c, double m) throws FondExistant {
    
    try {
        
        Fonds t = this.recherchefond(c);
        throw new FondExistant("La clé entrée correspond déjà à un fond existant");
    
    }
    catch(FondInexistant fi) {
        
    }
    Fonds fo = new Fonds(m);
    f.put(c,fo);
}

public void ajoutinstru(String c, Fonds fo) {
    Instrument instru = new Instrument();
    instru.ajoutfond(fo);
    i.put(c, instru);
}

public void supprimerfond(String c) {
    f.remove(c);
}

public void supprimerinstru(String c) {
    this.rechercheinstru(c).collect.clear(); //On vide la collection de fonds
    i.remove(c);
    
}

}
