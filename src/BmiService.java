public class BmiService {

    public int calculate(double height, int weight) {
        double sqrHeight = height * height;
        double result = weight / sqrHeight;
        return (int) result;

        /*public int calculate(double height, int weight) {
            double result = weight / Math.pow(height, height);
            return (int) result ;*/
    }
}
