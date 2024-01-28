package equationSolver;

import quadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите коэффициенты для подсчета квадратного уравнения");
            System.out.println("Введите коэффициент a квадратного уравнения: ");
            double a = scanner.nextDouble();

            System.out.println("Введите коэффициент b квадратного уравнения: ");
            double b = scanner.nextDouble();

            System.out.println("Введите коэффициент c квадратного уравнения: ");
            double c = scanner.nextDouble();

            QuadraticEquation equation = new QuadraticEquation(a, b, c);

            if (equation.hasRealRoots()) {
                double[] roots = equation.getRoots();
                System.out.println("Корни уравнения: ");
                for (double root : roots) {
                    System.out.println(root);
                }
            } else {
                System.out.println("Уравнение не имеет действительных корней");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}