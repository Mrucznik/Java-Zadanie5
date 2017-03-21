package pl.mrucznik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VectorStringReader extends VectorReader {
    private String string;
    private String regexPattern;

    VectorStringReader(String string, String regexPattern)
    {
        this.string = string;
        this.regexPattern = regexPattern;
    }

    Vector read()
    {
        Vector vector = new Vector();
        Matcher matcher = Pattern.compile(regexPattern).matcher(string);
        while (matcher.find())
        {
            vector.add(Integer.parseInt(matcher.group()));
        }
        return vector;
    }
}
