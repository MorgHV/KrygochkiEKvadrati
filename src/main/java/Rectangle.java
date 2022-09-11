import java.awt.*;

public class Rectangle extends Shape{

    public void rectangle(int x, int y, int dlin, int shir){
        super.x = x;
        super.y= y;
        super.dlin=dlin;
        super.shir = shir;

    }

    @Override
    public void draw(Graphics graphika, int x, int y, int dlin, int shir) {
        graphika.drawRect(x,y,dlin,shir);

    }
}
