/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollonian;

/**
 *
 * @author Mauro
 */
public class Coordenada {
    double x, y;

    public Coordenada() {
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
