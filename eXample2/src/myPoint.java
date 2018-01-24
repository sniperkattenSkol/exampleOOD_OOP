// Nils E Lindfors TE15 
// 2017-11-08
// 13:56
public class myPoint {
    private int x;
    private int y;

    public myPoint(){
        x = 0;
        y = 0;
    }

    public void myPoint(int y, int x){
        y = this.y;
        x = this.x;
    }

    public int getX(){
        return x;
    }

    public void setX(int xx){
        x = xx;
    }

    public int getY(){
        return y;
    }

    public void setY(int yy){
        y = yy;
    }

    public int[] getXY(){
        int[] XY = {x,y};
        return XY;
    }

    public void setXY(int xx, int yy){
        x = xx;
        y = yy;
    }

    public String toString(){
        return "(" + x +","+ y +")";
    }

    public double distance(int yy, int xx){
        x = x - xx;
        y = y - yy;
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(myPoint another){
        int xdif = this.x - another.x;
        int ydif = this.y - another.y;
        return Math.sqrt((xdif*xdif) + (ydif*ydif));
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }




}
