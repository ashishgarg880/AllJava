import java.util.*;
import java.io.*;

class Result{
    public static String timeConversion(String s){
        return s;
    }
}
public class DateFormatMain{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bf.readLine();
        String result = Result.timeConversion(s);
        bw.write(result);
        bw.newLine();
        bf.close();
        bw.close();
    }
}