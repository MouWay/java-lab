public class Lab2 {
    public static void main(String[] args) {
        //lab_2 1
        System.out.printf("\nHere is raw sum: %.5f\n", Solution.rowCalc(0.00001F));

        //lab_2 2
        double x = 1.0;
        double dx = 0.0001;

        double derivative = Solution.calculateDerivative(x, dx);
        System.out.printf("\n(x^2 - x + 1)' in point x = 1 is: ~%.3f\n", derivative);

        //lab_2 3
        double a = 0;
        double b = 1;
        int n = 1000;

        double integral = Solution.trapezoidalRule(a, b, n);
        System.out.printf("\nЗначение интеграла методом трапеций: %.3f\n\n", integral);
    }
}
