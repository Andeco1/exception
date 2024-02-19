import java.io.*;
import java.util.Scanner;

public class Product {
    public static void workWithString() throws IOException {

        File file = new File("input.txt");
        FileInputStream fis = new FileInputStream(file);
        File file_out = new File("output.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(file_out));
        Scanner in = new Scanner(file);
        int c;
        int k = 0;
        int p =0;
        int b;
        while(in.hasNextInt()){
            b = in.nextInt();
            k++;
        }
        in.close();
        Scanner in2 = new Scanner(file);
        for(int i = 0;i<k;i++){
            if(i>k/2-1){
                writer.print(in2.next());
                writer.print(" ");
            }
            else{
               b = in2.nextInt();
            }
        }
        in2.close();
        Scanner in3 = new Scanner(file);
        for(int i = 0;i<k;i++){
            if(i<=k/2-1){
                writer.print(in3.next());
                writer.print(" ");
            }
            else{
                b = in3.nextInt();
            }
        }
        writer.close();
    }
    public static void main(String[] args) throws IOException {
        workWithString();
    }
}
