// Nils E Lindfors TE15 
// 2017-11-08
// 15:08
public class MyTriangle {
    private myPoint v1;
    private myPoint v2;
    private myPoint v3;





    public MyTriangle(int x1, int y1,int x2, int y2,int x3, int y3){
        v1 = new myPoint();
        v2 = new myPoint();
        v3 = new myPoint();
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(){
        v1 = new myPoint();
        v2 = new myPoint();
        v3 = new myPoint();
    }

    public String toString(){
        return "MyTriangle[v1="+v1.toString()+",v2="+v2.toString()+",v3=("+v3.toString()+"]";
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)){
            return "The triangle is equilateral.";
        }
        else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v3) ){
            return "The triangle is isosceles.";
        }
        else
            return "The triangle is scalene.";
        }

    public String getAllsidesSep(){
        return v1.distance(v2) + " <- v1(v2) " + v2.distance(v3) + " <- v2(v3) "  + v3.distance(v1) + " <- v3(v1)";
    }

    }


