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
public final class Triangulo {
    static int quantidadeTriangulos = 0;
    
    List<No> nosTriangulo = new ArrayList<>();
    List<Triangulo> triangulosInternos = new ArrayList<>();
    
    Triangulo(List<No> nosTriangulo, int inner, int max){
        //System.err.println(quantidadeTriangulos);
        quantidadeTriangulos++;
        this.nosTriangulo = nosTriangulo;
            
        No noIterno = new No(centroid(nosTriangulo));
            
        if(inner < max){
            inner++;
            List<No> trianguloA = new ArrayList<>();
            List<No> trianguloB = new ArrayList<>();
            List<No> trianguloC = new ArrayList<>();

            trianguloA.add(nosTriangulo.get(0));
            trianguloA.add(nosTriangulo.get(1));
            trianguloA.add(noIterno);

            trianguloB.add(nosTriangulo.get(0));
            trianguloB.add(nosTriangulo.get(2));
            trianguloB.add(noIterno);

            trianguloC.add(nosTriangulo.get(1));
            trianguloC.add(nosTriangulo.get(2));
            trianguloC.add(noIterno);

            triangulosInternos.add(new Triangulo(trianguloA, inner, max));
            triangulosInternos.add(new Triangulo(trianguloB, inner, max));
            triangulosInternos.add(new Triangulo(trianguloC, inner, max));
        }
    }
    
    public Coordenada centroid(List<No> nosTriangulo){
        Coordenada centroTriangulo = new Coordenada();
        centroTriangulo.x = (nosTriangulo.get(0).coordenada.x + nosTriangulo.get(1).coordenada.x + nosTriangulo.get(2).coordenada.x) / 3;
        centroTriangulo.y = (nosTriangulo.get(0).coordenada.y + nosTriangulo.get(1).coordenada.y + nosTriangulo.get(2).coordenada.y) / 3;
        
        return centroTriangulo;
    }   
    
    @Override
    public String toString(){
        if(triangulosInternos.size() > 0 && nosTriangulo != null){
            String str = "";
            
            //str += "\\definecolor{teste}{rgb}{.3,.5,0}";
            str += "\\draw [line width=.2pt, color={teste}] " + nosTriangulo.get(0) + " -- " + nosTriangulo.get(1) + ";\n";
            str += "\\draw [line width=.2pt, color={teste}] " + nosTriangulo.get(1) + " -- " + nosTriangulo.get(2) + ";\n";
            str += "\\draw [line width=.2pt, color={teste}] " + nosTriangulo.get(2) + " -- " + nosTriangulo.get(0) + ";\n";
            
            return str + 
                    triangulosInternos.get(0) +
                    triangulosInternos.get(1) +
                    triangulosInternos.get(2);
            
        }
        
        return "";
    }
        /*
        if(triangulosInternos.size() > 0 && nosTriangulo != null){
            return "Nos do triangulo: " + nosTriangulo.toString() + " - { " + triangulosInternos.get(0).toString() + "}";
        }else{
            return "fim";
        }*/
    
            
}
