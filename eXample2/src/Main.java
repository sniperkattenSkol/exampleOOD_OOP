// Nils E Lindfors TE15
// 2017-11-15
// 13:39
public class Main {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(1,1,5,1,3,5);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getAllsidesSep());
        System.out.println(triangle.getType());



    }
}
