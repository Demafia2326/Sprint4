/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renombrarelementos;

import java.io.File;

/**
 *
 * @author Lorenzo
 */
public class Fichero {

    private void imprimirFicheros(String fichero) {
        File archivo = new File(fichero);
        if (archivo.isFile()) {
            System.out.println(archivo.getPath());
        } else if (archivo.isDirectory()) {
          for(String carpeta : archivo.list())
             imprimirFicheros(fichero + archivo.separator + carpeta);
        }
        if (!archivo.exists())
          System.out.println(fichero + " does not exist.");
    }
    
}


