// Nils E Lindfors TE15 
// 2017-11-08
// 14:35
public class MyCircle {

    private myPoint center;
    private int radius;


    public MyCircle() {
        center.setXY(0, 0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        center.setXY(x, y);
        radius = radius;
    }

    public MyCircle(myPoint center, int radius) {
        center = center;
        radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        radius = radius;
    }

    public myPoint getCenter(){
        return center;
    }

    public void getCenter(myPoint center){
        center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public void setCenterXY(int x, int y){
        center.setXY(x , y);
    }

    public String toString(){
        return "MyCircle[radius="+radius+",center="+center.toString()+"].";
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return radius*2*Math.PI;
    }

    public double distance(MyCircle another){
       return center.distance(another.center);
    }


}

