package IO_operations.IO_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            TreeMap<String, Integer> map = new TreeMap<>();

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.trim().split("\\s+");

                for (String word : words) {

                    if (word.length() == 0)
                        continue;

                    if (map.containsKey(word))
                        map.put(word, map.get(word) + 1);
                    else
                        map.put(word, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            br.close();
            bw.close();
            sc.close();

            System.out.println("File is created.");

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}