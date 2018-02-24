/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollonian;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauro
 */
public class No {
    static List<No> nosGlobais = new ArrayList<>();
    static Long lastId = 0l;
    
    Long id;
    Coordenada coordenada;
    
    No(Coordenada coordenada){
        id = lastId;
        lastId++;
        this.coordenada = coordenada;
    }
    

    @Override
    public String toString() {
        //return "No{" + id + " - " + coordenada.toString() + "}";
        return coordenada.toString();
    }    
}
