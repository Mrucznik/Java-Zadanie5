package pl.mrucznik;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj pierwszy wektor: ");
        Vector v1;
        VectorReader reader = new VectorStreamReader(System.in);
        v1 = reader.read();

        System.out.println(v1);

        //serializacja
        /*try {
            BufferedWriter fos = new BufferedWriter(new FileWriter("secretData.txt"));

            for (Integer nob : myCoords) {
                fos.write(nob.toString() + ", ");
                System.out.println(nob.toString());
            }
            fos.flush();
            fos.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }*/

        System.out.println("Podaj drugi wektor: ");
    }
}
