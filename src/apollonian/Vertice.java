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
public class Vertice {
    static Long lastId = 0l;
    
    // id do vertice
    public Long id;
    
    // Um vertice possui uma coordenada no espaço
    public Coordenada coordenada;
    
    Vertice(Coordenada coordenada){
        id = lastId;
        //lastId++;
        this.coordenada = coordenada;
    }
    
    /**
     * Gera nova lista de vertices apartir de uma lista existente + 1 novo vertice
     * 
     * Mantém a ordem de criação:
     * 
     * Lista existente, em formato horário, contendo os vértices 0 -> 1 -> 2
     * Terá como saida:
     *  0 -> 1 -> 3
     *  0 -> 3 -> 2
     *  1 -> 2 -> 3
     * 
     * @param vertices
     * @param novoVertice
     * @return 
     */
    public static List<List<Vertice>> criarListasComNovoVertice(List<Vertice> vertices, Vertice novoVertice){
        List<List<Vertice>> listaVertices = new ArrayList<>();
       
        for(int i = 0; i < vertices.size(); i++){
            List<Vertice> novoConjunto = new ArrayList<>(vertices);
            
            novoConjunto.add(novoConjunto.size() - i - 1, novoVertice);
            
            novoConjunto.remove(novoConjunto.size() - i - 1);
            
            listaVertices.add(novoConjunto);
        }
        
        return listaVertices;
    }
    
    
    @Override
    public String toString() {
        return coordenada.toString();
    }    
}
