import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class aspectoRatioImg {
    public static void main(String[] args) throws IOException {
        /*
         * Crea un programa que se encargue de calcular el aspect ratio de una
         * imagen a partir de una url.
         * - Url de ejemplo:
         *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
         * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
         *   imagen de 1920*1080px.
         */

        String imageUrl = "";
        URL url = new URL("https://i.pinimg.com/736x/c2/24/a8/c224a86cf9a708ec6f5c3b49e557dcaa.jpg");
        BufferedImage  image = ImageIO.read(url);
        String[] relaciones = {"16:9", "4:3", "1:1", "3:2", "21:9"};
        double[] valores = {16.0/9.0, 4.0/3.0, 1.0, 3.0/2.0, 21.0/9.0};


        int width = image.getWidth();
        int height = image.getHeight();
        double aspectRatio = (double) width / height;
        System.out.println("Ancho: " + width + ", Alto: " + height);
        System.out.println("el ratio de la imagen es: " + aspectRatio);
        String aspectoAproximado = "";
        double diferenciaMinima = Double.MAX_VALUE;
        //la constante más grande que puede tener un número tipo double en Java.
        for (int i = 0; i < valores.length; i++) {
            double diferencia = Math.abs(aspectRatio - valores[i]);
            if(diferencia < diferenciaMinima){
                diferenciaMinima = diferencia;
                aspectoAproximado = relaciones[i];
            }
        }
        System.out.println(aspectoAproximado);
    }
}
