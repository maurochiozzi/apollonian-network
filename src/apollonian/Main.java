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
        int l = 10;
        No A = new No(new Coordenada(0, 0));
        No B = new No(new Coordenada(l / 2, (l * Math.sqrt(3)) / 2));
        No C = new No(new Coordenada(l, 0));
        
        List<No> nosIniciais = new ArrayList<>();
        
        nosIniciais.add(A);
        nosIniciais.add(B);
        nosIniciais.add(C);
        
        Triangulo trianguloInicial = new Triangulo(nosIniciais, 0, 7);
        
        System.out.println(
            "\\documentclass[10pt]{article}\n" +
            "\\usepackage{pgf,tikz}\n" +
            "\\usepackage{mathrsfs}\n" +
            "\\usetikzlibrary{arrows}\n" +
            "\\pagestyle{empty}\n" +
            "\\begin{document}\n" +
            "\\definecolor{ududff}{rgb}{0.0,0.0,1.}\n" +
            "\\begin{tikzpicture}[line cap=round,line join=round,>=triangle 45,x=1.0cm,y=1.0cm]\n" +
            "\\clip(-0.42124056193414383,-5.722801838146528) rectangle (12.097420810726101,9.730856698438854);\n" +
            "\\begin{scriptsize}" +
            trianguloInicial.toString() +
            "\\end{scriptsize}\n" +
            "\\end{tikzpicture}\n" +
            "\\end{document}");
        
        //ystem.out.println(Triangulo.quantidadeTriangulos);
    }
    
    
}
