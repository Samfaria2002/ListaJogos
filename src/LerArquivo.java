import java.util.Scanner;
import model.Item;

public class LerArquivo {

    private Item[] item;
    private String[] dados;
    public int i = 0;

    public void armazena(Scanner arquivo) {
        try {
            while(arquivo.hasNextLine()) {
                String linha = arquivo.nextLine();
                dados = linha.split(",");

                item[i] = new Item[];
                item[i].setJogos(dados[0]);
                item[i].setCategoria(dados[1]);
                item[i].setAvaliacao(Double.parseDouble(dados[2]));
                i++;
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public void retorna() {
        for (int i = 0; i < item.length; i++) {
            System.out.println("Jogo: " + item[i].getJogos());
            System.out.println("Categoria: " + item[i].getCategoria());
            System.out.println("Avaliação: " + item[i].getAvaliacao());
        }
    }
}
