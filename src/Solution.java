public class Solution {

    public static double rowCalc(float eps){
        float x = (float) (Math.PI / 8);
        float result = 0;
        float pow = x;

        int fac = 1;
        int lastFacNum = 1;

        float add = 2 * pow / fac;
        while (add > eps) {
            result += add;
            pow *= x * x;
            fac = fac * ++lastFacNum * ++lastFacNum;
            add = 2 * pow / fac;
        }

        return result;
    }

    private static double funcForDerivative(double x){
        return x * x - x + 1;
    }

    public static double calculateDerivative(double x, double dx) {
        double fx = funcForDerivative(x);
        double fxPlusDx = funcForDerivative(x + dx);
        return (fxPlusDx - fx) / dx;
    }

    public static double funcForIntegral(double x) {
        return 4 * Math.sqrt(1 - x * x);
    }

    public static double trapezoidalRule(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0.5 * (funcForIntegral(a) + funcForIntegral(b));

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += funcForIntegral(x);
        }

        return sum * h;
    }
}
