
package exficheiros;

import java.io.File;
import lectura.Ler;


//Creamos la clase ExFicheiros
public class ExFicheiros {

   
    public static void main(String[] args) {
        //creamos un obxecto d etipo Ler
        Ler obxLer = new Ler();
       //Por defecto, busca na carpeta do proxecto, se non hay que indicarlle a ruta
        File f = new File("/home/local/DANIELCASTELAO/ifernandezblanco/Escritorio/nomes.txt");
        //chamamos ao obxecto ler e lle mandamos a nosa ruta, que chamamos f
        obxLer.lerPalabras(f);
    }
    
}
