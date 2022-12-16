//comments at the bottom

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
    
        String csvfilepath = args[0];
        String txtfilepath = args[1];

        List<String> headerList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        String line;

        try {
            FileReader fr = new FileReader(csvfilepath);
            BufferedReader bdf = new BufferedReader(fr);

            while (null != (line = bdf.readLine())) {
                line = bdf.readLine();            
                String[] values =  line.split(",");
                System.out.println(values);
                headerList.add(values[0]);
                for (int i = 1; i < 3 ; i++) {
                    nameList.add(values[i]);
                }
            }

            for (String w: values) {
                String Cleanword = w.replaceAll("<<first_name>>",values[0]);
            }

            FileReader fr = new FileReader(txtfilepath);
            BufferedReader bfe = new BufferedReader(fr);
            String line;
            while(null != (line = bfe.readLine())) {
                System.out.println(line);
            }

            bdf.close();

            }
            catch (FileNotFoundException e) {
                System.out.println("File not found. Plese check input file: " + e.getMessage());
            }
    
            catch (IOException e) {
                System.out.println("Unable to read line: " + e.getMessage());
    
            }
      
       
    }

}

/**
 * didn't have time to complete but below is my logic breakdown:
 * 
 * create 2 list: headerList and nameList
 * 
 * use readLine() and insert into headerList
 * then insert the second line into nameList
 * 
 * Use replace function to find <<first_name>> and replace with headerList[0]
 * read txt file, readLine(), then use FileReader to print it out.
 * repeat the loop for the size length
 */