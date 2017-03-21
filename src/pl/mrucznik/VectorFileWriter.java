package pl.mrucznik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VectorFileWriter extends VectorWriter {
    private String filename;

    VectorFileWriter(String filename)
    {
        this.filename = filename;
    }

    public void write(Vector vector)
    {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(filename));

            output.write(vector.toString());

            output.flush();
            output.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
