import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Proba {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String [] first = reader.readLine().split(" ");
        String [] second = reader.readLine().split(" ");
        for (String sec:second) {
            for (String fir:first) {

                if (sec.equals(fir))
                    System.out.print(sec + " ");
                }

            }
            
        }

    }


