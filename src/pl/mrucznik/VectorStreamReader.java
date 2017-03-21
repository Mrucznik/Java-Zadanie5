package pl.mrucznik;

import java.io.InputStream;
import java.util.Scanner;

public class VectorStreamReader extends VectorReader {
    private InputStream stream;

    VectorStreamReader(InputStream stream)
    {
        this.stream = stream;
    }

    public Vector read()
    {
        Scanner input = new Scanner(stream);
        String str = input.nextLine();
        VectorStringReader reader = new VectorStringReader(str,"(\\d+)");
        return reader.read();
    }
}
