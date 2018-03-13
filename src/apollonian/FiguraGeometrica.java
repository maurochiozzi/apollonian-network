/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollonian;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que contem as caracteristicas e funções de uma figura geométrica
 * @author Mauro
 */
public class FiguraGeometrica {
    // Uma figura possui uma lista de vertices
    private final List<Vertice> vertices;
    // Uma figura poderá ter m figuras internas
    private final List<FiguraGeometrica> figurasInternas;
    
    public FiguraGeometrica(List<Vertice> vertices, int inner, int max){
        figurasInternas = new ArrayList<>();
        
        this.vertices = vertices;
        
        if(inner < max){
            inner++;
            List<List<Vertice>> listaVertices = Vertice.criarListasComNovoVertice(vertices, this.verticeCentro(vertices));
            
            for(List<Vertice> vertice : listaVertices) {
                figurasInternas.add(new FiguraGeometrica(vertice, inner, max));
            }
        }
    }
    
    // Calcula o centro geometrico da figura
    public Vertice verticeCentro(List<Vertice> vertices){
        Coordenada centroGeometrico = new Coordenada();
        
        for( Vertice vertice : vertices) {
            centroGeometrico.x += vertice.coordenada.x;
            centroGeometrico.y += vertice.coordenada.y;
        }
        
        centroGeometrico.x /= vertices.size();
        centroGeometrico.y /= vertices.size();
        
        Vertice verticeCentro = new Vertice(centroGeometrico);
        
        return verticeCentro;
    }    
   
    /**
     * Imprime em LaTex
     * 
     * @return 
     */
    @Override
    public String toString(){
        if(figurasInternas.size() > 0 && vertices != null){
            String str = "\\draw [line width=.2pt, color=custom] ";
            
            for(Vertice vertice : vertices){
                str += vertice + " -- ";
            }
            
            str += vertices.get(0) + ";\n";
            
            return str + figurasInternasToString();           
        }
        
        return "";
    }
    
    /**
     * Imprimi demais figuras internas
     * 
     * @return 
     */
    public String figurasInternasToString(){
        String str = "";
        
        for(FiguraGeometrica figura : figurasInternas){
            str += figura.toString();
        }
        
        return str;
    }
}
