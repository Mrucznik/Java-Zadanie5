package pl.mrucznik;

import java.util.LinkedList;
import java.util.ListIterator;

public class Vector {
    private LinkedList<Integer> list;

    Vector()
    {
        list = new LinkedList<>();
    }

    static Vector addVectors(Vector v1, Vector v2) throws WektoryRoznejDlugosciException
    {
        if(equalSize(v1, v2))
            throw new WektoryRoznejDlugosciException(v1.list.size(), v2.list.size());

        Vector wynik = new Vector();

        ListIterator<Integer> list1Iterator = v1.list.listIterator();
        ListIterator<Integer> list2Iterator = v2.list.listIterator();
        while(list1Iterator.hasNext() && list2Iterator.hasNext())
        {
            wynik.add(list1Iterator.next()+list2Iterator.next());
        }
        return wynik;
    }

    static boolean equalSize(Vector v1, Vector v2)
    {
        return v1.list.size() != v2.list.size();
    }

    void add(int value)
    {
        list.add(value);
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}
