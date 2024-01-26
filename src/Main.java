public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height;
        int weight;
        int bmiIndex;
        height = 1.87;
        weight = 98;
        bmiIndex = service.calculate(height, weight);
        System.out.println(bmiIndex);

    }
}