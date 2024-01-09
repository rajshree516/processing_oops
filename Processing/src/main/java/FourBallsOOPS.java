import processing.core.PApplet;
public class FourBallsOOPS extends PApplet{
    public static final int width=1040;
    public static final int height=680;
    public static final int diameter=50;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOPS",args);
    }

    public class Ball{
        int initial;
        float height;
        int diameter;
        public Ball(int initial,float height,int diameter){
            this.initial=initial;
            this.height=height;
            this.diameter=diameter;
        }

        void display(int speed){
            ellipse(initial,height,diameter,diameter);
            initial+=speed;
        }
    }

    int num_Balls=4;
    Ball[] ball=new Ball[num_Balls];

    @Override
    public void settings(){
        super.settings();
        size(width,height);
    }

    @Override
    public void setup(){
        for(int i=0;i<num_Balls;i++){
            ball[i]=new Ball(0,((float)height/5)*(i+1),diameter);
        }
    }

    @Override
    public void draw(){
        for(int i=0;i<num_Balls;i++){
            ball[i].display(i+1);
        }
    }


}