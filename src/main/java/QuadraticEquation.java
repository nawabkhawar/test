public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double secondRoot = 0, firstRoot = 0;
        Roots roots;

        double div = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(div);

        if(div>0){
            firstRoot = (-b + sqrt)/(2*a);
            secondRoot= (-b - sqrt)/(2*a);
            roots= new Roots(firstRoot,secondRoot);
            return roots;

        }else if(div == 0){
            firstRoot = (-b + sqrt)/(2*a);
            roots = new Roots(firstRoot,firstRoot);
            return roots;
        }

        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}