import java.awt.Color;
import java.awt.Graphics;


public class Confetti{

    private int x;
    private int y;
    private Color blue;
    private Color pink;
    private Color yellow;
    private Color green;

    public Confetti(){
        //random x within 0 to 798
        x = (int)(Math.random() * 1440 );
        //random y within 0 to 595
        y = (int)(Math.random() * 800);
        blue = new Color (0,0,255);
        pink = new Color (255, 54, 245);
        yellow = new Color (250, 242, 25);
        green = new Color (26, 173, 48);
    }

    public Color getRandColor(){
        Color[] colors = new Color[]{blue, pink, yellow, green};
        return colors[(int)(Math.random()*4)];

    }
    
    public void drawMeWin(Graphics g){
        g.setColor(getRandColor());
        g.fillRect(x,y,7,7);
    }

    public void drawMeLose(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x,y,7,7);
    }
    

    public void moveDown(){
        y++;
        if (y>800){
            y = -5;
        }
    }
   
}