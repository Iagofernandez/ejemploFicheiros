
package lectura;
//necesitas importar esta libreria para manejar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ifernandezblanco
 */
//creamos la clase Ler
public class Ler {
    //creamos un objeto tipo  Scanner
    Scanner sc;
    //Creamos una nueva clase, con un paramatero ficheiro
    public void lerPalabras(File ficheiro){
        //Van a saltar errores, empleamos un try catch para capturar la excepcion
        try {
            sc = new Scanner(ficheiro);
            //le indicamos que mientras haya algo en el scanner, siga el programa
            while(sc.hasNext())
                System.out.println(sc.next());
        } catch (FileNotFoundException ex) {
          System.out.println(ex.getMessage());
        }
    }
}
