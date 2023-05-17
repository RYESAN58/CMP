import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndEditFile {
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
                File inputFile = new File(fileName);
                Scanner fileScanner = new Scanner(inputFile);

                StringBuilder modifiedContent = new StringBuilder();

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String modifiedLine = modifyLine(line);
                    modifiedContent.append(modifiedLine).append("\n");

                }

                fileScanner.close();

                writeToFile(modifiedContent.toString());

                // System.out.println("File successfully modified and written to HomeworkOutput6-2.txt");

                break; // Exit the loop after successfully writing to the file
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found " + fileName);
            }
        } while (true);
    }

    private static String modifyLine(String line) {
        line = line.substring(0, 1).toUpperCase() + line.substring(1);

        // Capitalize the first letter after every period
        StringBuilder modifiedLine = new StringBuilder();
        boolean capitalizeNext = false;
        for (char c : line.toCharArray()) {
            if (c == '.') {
                capitalizeNext = true;
            } else if (capitalizeNext && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }
            modifiedLine.append(c);
        }

        modifiedLine = new StringBuilder(modifiedLine.toString().replaceAll("\\s+", " "));

        return modifiedLine.toString();
    }

    private static void writeToFile(String content) {
        try {
            FileWriter writer = new FileWriter("HomeworkOutput6-2.txt");
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
