/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author rapha
 */
public class Erreur extends Exception {
    
    public String message;
    
    public Erreur(String m)
    {
        message=m;
    }
    
    @Override
    public String toString()
    {
        return message;
    }
            

            
}
