import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        String line;
        // float sum = 0;
        boolean stop = false;
        float total = 0;
        System.out.println("Welcome.");

        while (!stop) { 
            //Read a line
            line = sc.nextLine();
            line = line.trim();
            // String[] arr1 = new String[] {};
            float x,y;

            if (line.equalsIgnoreCase("exit")) {
                //exit the while loop
                System.out.println("Bye bye");
                break;
            }
                String[] strs = line.trim().split(" ");

                if (strs[0].equalsIgnoreCase("$last") && !strs[2].equalsIgnoreCase("$last")) {
                    x = total;
                    y = Float.parseFloat(strs[2]);
                } else if (!strs[0].equalsIgnoreCase("$last") && strs[2].equalsIgnoreCase("$last")) {
                    x = Float.parseFloat(strs[0]);
                    y = total;
                } else if (strs[0].equalsIgnoreCase("$last") && strs[2].equalsIgnoreCase("$last")) {
                    x = total;
                    y = total;
                } else {
                x = Float.parseFloat(strs[0]);
                y = Float.parseFloat(strs[2]);
                }
                   
                switch (strs[1]) {

                    case "+":
                    total = x + y; 
                    break;
                    case "-":
                    total = x - y; 
                    break;
                    case "*":
                    total = x * y; 
                    break;
                    case "/":
                    total = x / y; 
                    break;
                    default:
                    System.out.printf("Unknown command %s", line);
                }
                
                System.out.println(total);
                
            }
            sc.close();  
        }

              
    }




        
   


