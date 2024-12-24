import java.text.NumberFormat;
import java.util.Scanner;

public class Dog {
    public static void myDog() {

        final byte MONTH_IN_YEARS = 12;
        final byte PERCENT = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest / MONTH_IN_YEARS / PERCENT;

        System.out.print("Period: ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTH_IN_YEARS;
        double mortage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,
                numberOfPayments)
                / (1 + monthlyInterest) * numberOfPayments);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage : " + mortageFormatted);
    }
}
