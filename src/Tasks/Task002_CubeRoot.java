package Tasks;

public class Task002_CubeRoot {

    public static void main(String[] args) {
        int X = 10 , Y = 10 , Z = 10;
        double result = Math.cbrt((X*X)+(Y*Y)-Math.abs(Z));
        System.out.println(result);
    }
}
