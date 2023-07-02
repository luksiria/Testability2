
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        int weight = 64;

        double bmi = service.calculate((double) height, weight);
        System.out.println((int) bmi);
    }
}
