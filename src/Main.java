import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;

        System.out.println("ingrese el numero de lineas: ");
        N = sc.nextInt();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))){
            int lineas = 1;

            while(lineas < N){
                writer.write( "Linea: "+ lineas + " ");
                writer.newLine();
                lineas++;
            }
            if (lineas == N){
                writer.write("Linea: " + lineas + " ");
            }






        }catch (IOException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}