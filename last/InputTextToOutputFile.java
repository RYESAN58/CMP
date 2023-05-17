import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputTextToOutputFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outputFileName;

        System.out.println("What is the name of your output file?");
        outputFileName = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(outputFileName);

            String input;
            do {
                input = scanner.nextLine();
                writer.write(input + "\n");
            } while (!input.equals("STOP!"));

            writer.close();
            System.out.println("Input successfully written to the file: " + outputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
