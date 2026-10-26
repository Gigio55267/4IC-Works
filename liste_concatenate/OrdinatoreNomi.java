
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OrdinatoreNomi {

    File file;

    public OrdinatoreNomi(String filePath) {
        this.file = new File(filePath);
    }

    public SourtedList<String> leggiFile() throws FileNotFoundException {
        SourtedList<String> dati = new SourtedList<>();
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            dati.sortedinsert(s.nextLine());
        }
        s.close();
        return dati;
    }

    // Listato 2. Scrittura di un file
    public static void writeFile() {
        SourtedList<String> dati = leggiFile();
        String path = "C:/html.txt";
        try {
            File file = new File(path);
            PrintWriter fw = new PrintWriter(file);

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/Users/riccardo.saverino/Desktop/4IC-Works/liste_concatenate";
        OrdinatoreNomi t = new OrdinatoreNomi(path);
        t.leggiFile();
        t.writeFile();
    }
}
