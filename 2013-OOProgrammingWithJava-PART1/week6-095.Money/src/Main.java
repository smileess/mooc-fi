
public class Main {

    public static void main(String[] args) {
Money r1 = new Money(1000, 0);
Money r2 = new Money(7, 400);
Money r3 = r1.minus(r2);
        System.out.println(r3.cents());
    }
}
