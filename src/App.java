import java.io.File;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner arquivo = new Scanner(new File("src/JogosDesordenados.csv"));
        LerArquivo ler = new LerArquivo();

        ler.armazena(arquivo);
        ler.retorna();

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a opção desejada:");
        System.out.println("[1] - Ler aquivo\n[2] - Ordenar por categoria\n[3] - Ordenar por avaliação\n[4] - Sair");
        int index = input.nextInt();
        
        switch (index) {
            case 1:
                System.out.println("Ler aquivo");
                break;
            case 2:
                System.out.println("Ordenar por categoria");
                break;
            case 3:
                System.out.println("Ordenar por avaliação");
                break;
            
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        input.close();
        */
    }
}
