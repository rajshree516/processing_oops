import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int WIDTH = 1040;
    public static final int HEIGHT = 680;
    public static final int DIAMETER = 10;
    int[] initial= new int[]{0, 0, 0, 0};

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
    }

    @Override
    public void draw() {
        //paintWhite();
        System.out.println("Ball 1");
        drawCircle((float)1/5,1);
        System.out.println("Ball 2");
        drawCircle((float)2/5,2);
        System.out.println("Ball 3");
        drawCircle((float)3/5,3);
        System.out.println("Ball 4");
        drawCircle((float)4/5,4);

    }

    private void drawCircle(float height_ratio,int speed) {
        ellipse(initial[speed-1], HEIGHT*height_ratio, DIAMETER,DIAMETER);
        initial[speed-1] += speed;
        System.out.println(initial[speed-1]);
    }

    private void paintWhite() {
        background(255);
    }
}