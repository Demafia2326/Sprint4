/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraerSuperclase;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public abstract class SuperAnalizadorDatos {
    static final boolean CORRECTOS = true;
    static final boolean INCORRECTOS = false;
    ArrayList<String> datos;

    public abstract boolean comprobarDatos();
    
}
