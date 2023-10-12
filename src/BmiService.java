public class BmiService {
    public int calculate(double weight, double height){

        double h = height * height;
        return (int) (weight / h);
    }
}