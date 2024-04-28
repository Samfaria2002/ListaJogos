import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadData {

    public static Item[] item = new Item[40];
    public static int n_linhas = 0;
    public static final String file = "D:\\projetos\\JavaListaJogos\\ListaJogos\\src\\JogosDesordenados.csv";

    public static void leitura() throws IOException {
        String line = "";
        String splitBy = ",";
        
        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((line = br.readLine()) != null) {
            String[] data = line.split(splitBy);
            item[n_linhas] = new Item(data[0], data[1], Double.parseDouble(data[2]));
            n_linhas++;
        }
    }

    public static void print() throws IOException {
        leitura();
        for (int i = 0; i < 40; i++) {
            System.out.println(item[i]);
        }
    }

    public static Item[] getItem() throws IOException {
        leitura();
        return item;
    }
}