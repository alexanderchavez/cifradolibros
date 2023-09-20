/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradolibros;


import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author federico cirett galan
 */


public class CifradoLibros {
    /**     * @param args the command line arguments */
    public static void main(String[] args) {
      
        Instant inicio = Instant.now();
        LinkedTreeMap<String,LinkedTreeMap> encoder = cargaCipher("encode_cipher.json");
        String directorio;
        if (args.length > 0) {
            directorio = args[0];
        }
        else {
            directorio = ".";
        }
        List<Libro> lista = cifradoLibros(directorio, encoder);
        System.out.println("Total libros:"+lista_libros.size());        
        Instant fin = Instant.now();
        long tiempoComputo = Duration.between(inicio,fin).toMillis();
        System.out.println("Tiempo de computo: "+tiempoComputo+" milisegundos");
    }
    public static List<Libro> cifradoLibros(String folder, LinkedTreeMap<String,LinkedTreeMap> encoder){

    }
    public static List<File> obtenListaArchivos(String ruta) {

    }
    public static LinkedTreeMap cargaCipher(String archivo) {
        LinkedTreeMap map=null;
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            String texto="";
            while ( (linea= reader.readLine()) !=null ){
                texto += linea;
            }
            map = gson.fromJson(texto, LinkedTreeMap.class);
        } catch (IOException e) {
            System.out.println("cargaCipher "+e.getMessage());
        }
        return map;
    }        

}
