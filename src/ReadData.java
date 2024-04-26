import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadData {
    public static void leitura(String file) throws IOException {
        String line = "";
        String splitBy = ",";
        int n_linhas = 0;
        Item[] item = new Item[40];
        
        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((line = br.readLine()) != null) {
            String[] data = line.split(splitBy);
            item[n_linhas] = new Item(data[0], data[1], Double.parseDouble(data[2]));
            n_linhas++;
        }

        for (int i = 0; i < n_linhas; i++) {
            System.out.println(item[i]);
        }
    }

}
