/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturafichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class LeerFicheroLineaALinea {
    public static void main(String[] args) {
    String nombreFichero = "C:\\Users\\PITI\\Desktop\\2DAM\\1. Acceso a datos\\Proyectos\\LecturaFichero\\src\\lecturafichero\\prob_lines.txt";
        //Declarar una variable BufferedReader
        BufferedReader br = null;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(nombreFichero));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               //Hacer lo que sea con la línea leída
               System.out.println(texto);
               //Leer la siguiente línea
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
