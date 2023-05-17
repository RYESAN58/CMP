import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        do {
          fileName = scanner.nextLine();
          if (fileName.isEmpty()) {
              break;
          }
          System.out.println("What is the name of your file?");


            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found " + fileName);
            }
        } while (true);
    }
}