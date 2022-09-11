import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.cicle(300,300,300,300);
        Rectangle rectangle = new Rectangle();
        rectangle.rectangle(600,300,100,100);

        Shape[] masiv = {circle,rectangle};
        BufferedImage nazvanie = new BufferedImage(2500,2500,BufferedImage.TYPE_INT_ARGB);
        Graphics nazvanieEE = nazvanie.createGraphics();

        for (int i=0;i<masiv.length;i++){
            masiv[i].draw(nazvanieEE,masiv[i].x,masiv[i].y,masiv[i].dlin,masiv[i].shir);
        }
        File NazvanieF = new File("NazvanieFaila.png");
        try {
            ImageIO.write(nazvanie,"png",NazvanieF);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
