// Nils E Lindfors TE15
// 2017-10-25
// 14:16
public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length = 1f;
        width = 1f;
    }

    public Rectangle(float l , float w){
        length = l;
         width = w;
    }

    public float getLength(){
        return length;
    }
    public void setLength(float l){
        length = l;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float w){
        width = w;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return width * 2 + length * 2;
    }
    public String toString(){
        return "Rectangle[Lenght=" + length +","+"Width=" + width+"]";
    }

}
