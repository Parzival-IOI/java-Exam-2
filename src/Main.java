import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input : ");
        String date = cin.nextLine();

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};

        String year = date.substring(0, 4);
        String month1 = date.substring(5, 7);
        String day = date.substring(8, 10);

        System.out.print("Output : ");
        System.out.println(month[Integer.parseInt(month1)+1] + " " + day + "," + year);

    }
}