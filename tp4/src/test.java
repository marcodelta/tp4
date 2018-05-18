
import tp4.Fonds;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marc
 */
public class test implements Comparable<Fonds>{

    public int compareTo(Fonds t,Object obj) {
    if(this.size > t.amount)
    {return 1;}
    else if( this.size <t.amount )
    {return 0;}
    else
    {return -1; }
      
    }
    
    public boolean equals(Fonds t, Object obj){
        if(t.amount == (double)obj)
        {return true;}
        else
        { return false; }
    
}

}