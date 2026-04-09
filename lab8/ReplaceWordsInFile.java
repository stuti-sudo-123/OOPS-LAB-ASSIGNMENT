
 import java.io.*;

public class ReplaceWordsInFile {
    public static void main(String[] args) {
        String inputFile = "sdj.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = br.readLine()) != null) {
                // Replace "his" with "her"
                line = line.replace("his", "her");
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacement completed. Check output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}    

