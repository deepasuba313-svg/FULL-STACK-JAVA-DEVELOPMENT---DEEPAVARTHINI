import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class File_Handling {
    public static void main(String args[]) {
        int days;
        int deluxe;
        int suit;
        int total;
        int deluxeamt = 2000;
        int suitamt = 1500;

        try {
            Scanner ip = new Scanner(System.in);
            System.out.println("Number of Deluxe rooms: ");
            deluxe = ip.nextInt();
            System.out.println("Number of Suit rooms: ");
            suit = ip.nextInt();
            System.out.println("Number of days staying: ");
            days = ip.nextInt();

            total = deluxeamt * days * deluxe + suitamt * days * suit;

            BufferedWriter fr = new BufferedWriter(new FileWriter("D:\\java\\Sample.txt"));
            fr.write("Deluxe Rooms: " + deluxe + "\n");
            fr.write("Suit Rooms: " + suit + "\n");
            fr.write("Days: " + days + "\n");
            fr.write("Total Cost: " + total + "\n");
            fr.close();

            System.out.println("Booking saved successfully!");

            BufferedReader br = new BufferedReader(new FileReader("D:\\java\\Sample.txt"));
            String line;
            System.out.println("\n--- File Content ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            ip.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
