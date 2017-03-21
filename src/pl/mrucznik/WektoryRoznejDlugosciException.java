package pl.mrucznik;

class WektoryRoznejDlugosciException extends Exception {
    int v1Length;
    int v2Length;

    WektoryRoznejDlugosciException(int v1l, int v2l)
    {
        v1Length = v1l;
        v2Length = v2l;
    }
}
