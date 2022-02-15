import processing.core.PApplet;

public class MainClass extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0, y=0, z=0, a=0;

    public static void main(String args[]){
        PApplet.main("MainClass", args);

    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){

    }

    @Override
    public void draw(){
        ellipse(x, HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(y, (2*HEIGHT)/5, DIAMETER, DIAMETER);
        ellipse(z, (3*HEIGHT)/5, DIAMETER, DIAMETER);
        ellipse(a, (4*HEIGHT)/5, DIAMETER, DIAMETER);
        x=x+1;
        y=y+2;
        z=z+3;
        a=a+4;
    }
}
