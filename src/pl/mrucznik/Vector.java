package pl.mrucznik;

import java.io.InputStream;
import java.util.LinkedList;

public class Vector {
    private LinkedList<Integer> list;

    Vector()
    {
        list = new LinkedList<>();
    }

    public void add(int value)
    {
        list.add(value);
    }

    public boolean equalSize(Vector v)
    {
        return list.size() == v.list.size();
    }

    public String toString()
    {
        return list.toString();
    }
}
