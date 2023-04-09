public class BmiService {

    public int calculate(double x, int y) {
        double z = x * x;
        double result = y / z;
        return (int) result;

        /*public int calculate(double x, int y) {
            double result = y / Math.pow(x, x);
            return (int) result ;*/
    }
}
