package datatpye.epam.lesson;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int seconds1 = seconds % 60;

        // Formatting the output
        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds1);
    }
}
