package pl.mrucznik;

import java.io.InputStream;
import java.util.Scanner;

public class VectorStreamReader extends VectorReader {
    InputStream stream;

    VectorStreamReader(InputStream stream)
    {
        this.stream = stream;
    }

    Vector read()
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        VectorStringReader reader = new VectorStringReader(str,"(\\d+)");
        return reader.read();
    }
}
