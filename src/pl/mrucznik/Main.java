package pl.mrucznik;

public class Main {

    public static void main(String[] args) {
        Vector v1, v2, wynik;
        VectorWriter writer = new VectorFileWriter("secretData.txt");
        VectorReader reader = new VectorStreamReader(System.in);

        do {

            System.out.println("Podaj pierwszy wektor: ");
            v1 = reader.read();
            System.out.println("Podaj drugi wektor: ");
            v2 = reader.read();

            //zapis
            try {
                wynik = Vector.addVectors(v1, v2);
                writer.write(wynik);
                System.out.println("Pomyślnie dodano i zapisano wektory do pliku.");
            } catch (WektoryRoznejDlugosciException e) {
                System.out.println("Błąd! Wektory nie są takich samych długości!\nDlugość pierwszego wektora: " + e.v1Length + "\nDługość drugiego wektora: " + e.v2Length);
            }
        } while(Vector.equalSize(v1,v2));
    }
}
