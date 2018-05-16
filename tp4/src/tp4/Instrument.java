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
public class Instrument {
    
public ArrayList<Fonds> collect;

public Instrument() {
    collect = new ArrayList<Fonds>();
}

public void ajoutfond(Fonds f){
    collect.add(f);
}


}
