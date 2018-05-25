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

public double recherchefond(String c) throws FondInexistant{ 
    if(!f.containsKey(c)) //Si la Hashmap ne contient pas de Fonds en c
    {
        throw new FondInexistant("La clé entrée ne correspond à aucun fond");
    }
    else
    {
        return f.get(c).amount; 
    }
    
}

public Instrument rechercheinstru(String c) throws InstruInexistant{
    if(!i.containsKey(c)) //Si la Hashmap ne contient pas d'instruments en c
    {
        throw new InstruInexistant("La clé entrée ne correspond à aucun instrument");
    }
    else
    {
        return i.get(c);
    }
}

public void ajoutfond(String c, double m) throws FondExistant {
    
    try {
        
        if(f.containsKey(c)){ //Si la Hashmap contient déjà un Fond en c
            throw new FondExistant("La clé entrée correspond déjà à un fond existant");
        }
        Fonds t = new Fonds();
        t.amount = this.recherchefond(c);
        
        
    
    }
    catch(FondInexistant fi) {
        Fonds fo = new Fonds(m);
        f.put(c,fo); //Ajoute le fond avec la clé c
        
    }
    
}

public void ajoutinstru(String c, Fonds fo) throws InstruExistant {
    
    try {
        
        if(i.containsKey(c)){ //Si la Hashmap contient déjà un instrument en c
            throw new InstruExistant("La clé entrée correspond déjà à un instrument existant");
        }
        Instrument ins = new Instrument();
        ins = this.rechercheinstru(c);
        
        
    
    }
    catch(InstruInexistant ii) {
        Instrument instru = new Instrument();
        instru.ajoutfond(fo); //Ajoute le fond dans l'Array de l'instrument
        i.put(c, instru); //Ajoute l'instrument avec la clé c
        
    }
    
    
}

public void supprimerfond(String c) {
    try {
        Fonds fo = new Fonds();
        fo.amount=recherchefond(c);
        f.remove(c); //On supprime le fond de la Hashmap
    }
    catch(FondInexistant fi) {}
    
}

public void supprimerinstru(String c) {
    try{
    this.rechercheinstru(c).collect.clear(); //On vide la collection de fonds
    i.remove(c); //On supprime l'instrument de la Hashmap
    }
    catch(InstruInexistant ii){
        
    }
    
}

}
