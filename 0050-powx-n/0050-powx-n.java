class Solution {
    public double myPow(double x, int n) {

        long pow = n;
        double res = 1.0;

        if (pow < 0) {
            pow = -pow;
        }

        while (pow > 0) {

            if (pow % 2 == 1) {
                res = res * x;
            }

            x = x * x;
            pow = pow / 2;
        }

        if (n < 0) {
            return 1 / res;
        }

        return res;
    }
}