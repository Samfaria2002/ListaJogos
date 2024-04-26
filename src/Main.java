import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com a opção desejada:");
        System.out.println("[1] - Ler aquivo\n[2] - Ordenar por categoria\n[3] - Ordenar por avaliação\n[4] - Sair");
        
        int index = input.nextInt();
        switch (index) {
            case 1:
                System.out.println("Ler arquivo");
                try {
                    ReadData.print();
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("Ordenar por categoria");
                try {
                    Sort.selectionSort();
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Ordenar por avaliação");
                try {
                    Sort.bubbleSort();
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        input.close();
    }
}
