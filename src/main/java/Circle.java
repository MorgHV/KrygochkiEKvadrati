import javax.swing.*;
import java.awt.*;

public class Circle extends Shape{

    public void cicle(int x, int y, int dlin, int shir){
        super.x = x;
        super.y= y;
        super.dlin=dlin;
        super.shir = shir;

    }

    @Override
    public void draw(Graphics graphika, int x, int y, int dlin, int shir) {
        graphika.drawOval(x,y,dlin,shir);

    }
}
