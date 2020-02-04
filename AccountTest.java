package sample;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        Account mydorogaya = new Account("String mame", 50);
        System.out.printf("Initial name is: %s, %s.%n", mydorogaya.getName(), mydorogaya.getBalance());
        System.out.print("Please enter the name:");
        String theName = tes.nextLine();

        System.out.println("Please enter the new balance:");
        double bal =tes.nextDouble();
        mydorogaya.setName(theName);
        mydorogaya.setBalance(bal);

        System.out.println();
        System.out.printf("Name in object myAccount is: %s, %2f.%n", mydorogaya.getName(), mydorogaya.getBalance());

    }



}
