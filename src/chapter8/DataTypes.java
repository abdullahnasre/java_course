package chapter8;

public class DataTypes {
    public static void main(String[] args) {
        double[] numbers = {1.5, 45.5, 222.2};
        for (Double number : numbers) {
            System.out.println(number.intValue());
        }
    }
}
