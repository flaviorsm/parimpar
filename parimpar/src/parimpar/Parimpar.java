package parimpar;
/**
 *
 * @author Flávio Roberto dos Santo Moreira
 * @matricula 2014101137
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Parimpar {
    static int impar, par, n1;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        
        while(n1 > 0){
            impar = par = 0;            
            int n2[] = new int[n1];
            String[] s1 = in.readLine().split(" ");
            for(int i = 0; i < n1; i++)
                n2[i] = Integer.parseInt(s1[i]);

            //Resultado
            for(int x : n2)
            {
                if(x % 2 == 0)            
                    par = par + x;            
                else
                    impar = impar + x;                       
            }
            System.out.println(par + " " + impar);
            n1 = s.nextInt();
        }
    }
}
