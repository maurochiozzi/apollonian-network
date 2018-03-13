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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l = 8;
        
        List<Vertice> verticesIniciais = new ArrayList<>();
        
        Vertice A = new Vertice(new Coordenada(0, 0));
        Vertice B = new Vertice(new Coordenada(l / 2, (l * Math.sqrt(3)) / 2));
        Vertice C = new Vertice(new Coordenada(l, 0));
        
        
        
        /* quadrado
        Vertice A = new Vertice(new Coordenada(0, 0));
        Vertice B = new Vertice(new Coordenada(l, 0));
        Vertice C = new Vertice(new Coordenada(l, l));
        Vertice D = new Vertice(new Coordenada(0, l));
        verticesIniciais.add(D);
        */
        /* hexagono
        Vertice A = new Vertice(new Coordenada(0, 3));
        Vertice B = new Vertice(new Coordenada(2.6, 1.5));
        Vertice C = new Vertice(new Coordenada(2.6, -1.5));
        Vertice D = new Vertice(new Coordenada(0, -3));
        Vertice E = new Vertice(new Coordenada(-2.6, -1.5));
        Vertice F = new Vertice(new Coordenada(-2.6, 1.5));
        */
        
        verticesIniciais.add(A);
        verticesIniciais.add(B);
        verticesIniciais.add(C);
        /*
        verticesIniciais.add(D);
        verticesIniciais.add(E);
        verticesIniciais.add(F);
        */
        
        FiguraGeometrica trianguloInicial = new FiguraGeometrica(verticesIniciais, 0, 6);
        
        System.out.println(
            "\\documentclass[10pt]{article}\n" +
            "\\usepackage{pgf,tikz}\n" +
            "\\usepackage{mathrsfs}\n" +
            "\\usetikzlibrary{arrows}\n" +
            "\\pagestyle{empty}\n" +
            "\\begin{document}\n" +
            "\\definecolor{custom}{rgb}{0.0,0.5,0.2}" + 
            "\\begin{tikzpicture}[line cap=round,line join=round,>=triangle 45,x=1.0cm,y=1.0cm]\n" +
            //"\\clip(-3,-3) rectangle (3,3);\n" +
            "\\clip(-0.42124056193414383,-5.722801838146528) rectangle (12.097420810726101,9.730856698438854);\n" +
            "\\begin{scriptsize}" +
            trianguloInicial.toString() +
            "\\end{scriptsize}\n" +
            "\\end{tikzpicture}\n" +
            "\\end{document}");
        
        //ystem.out.println(Triangulo.quantidadeTriangulos);
    }
    
    
}
