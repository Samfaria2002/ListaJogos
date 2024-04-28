import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sort {

    /*
    public static Item[] s_item = new Item[40];

    public Sort() throws IOException {
        Sort.s_item = ReadData.getItem();
    }
    */
    
    public static void selectionSort() throws IOException {

        Item[] s_item = ReadData.getItem();

        for (int i = 0; i < 40 - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 40; j++) {
                if (s_item[j].getCategoria().compareTo(s_item[minIndex].getCategoria()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Item temp = s_item[i];
                s_item[i] = s_item[minIndex];
                s_item[minIndex] = temp;
            }
        }

        if (s_item != null) {
            salvarCSV("JogosOrdenadosPorCategoria.csv", s_item, 40);
        }
    }

    public static void bubbleSort() throws IOException {

        Item[] s_item = ReadData.getItem();

        for (int i = 0; i < 40 - 1; i++) {
            for (int j = 0; j < 40 - i - 1; j++) {
                if (s_item[j].getAvaliacao() < s_item[j + 1].getAvaliacao()) {
                    Item temp = s_item[j];
                    s_item[j] = s_item[j + 1];
                    s_item[j + 1] = temp;
                }
            }
        }

        if (s_item != null) {
            salvarCSV("JogosOrdenadosPorAvaliacao.csv", s_item, 40);
        }
    }

    public static void salvarCSV(String nomeArquivo, Item[] items, int n) {
        try (BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo))) {
            escrita.write("Jogo,Categoria,Avaliação\n");
            for (int i = 0; i < n; i++) {
                escrita.write(items[i].toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
