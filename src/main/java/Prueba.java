
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Prueba {

    public static void main(String args[]) throws IOException {
        String whoAmI = FigletFont.convertOneLine("JAVA");
        System.out.println( "Yo soy ...." );
        System.out.println( whoAmI );
       /* MongoDBConexion prueba= new MongoDBConexion() ;
        prueba.crearColeccion("prueba");*/
    }

}
