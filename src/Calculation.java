public class Calculation {
    public double squareSum(double[] number) {
        double sum = 0;
        for ( double value : number) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }
}

