package quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double[] roots;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.roots = calculateRoots();

    }
    public boolean hasRealRoots() {
        return roots != null;
    }
    public double[] getRoots() {
        return roots;
    }

    private double[] calculateRoots() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return null; // нет действительных корней
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // один корень
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2}; // два корня
        }
    }

}