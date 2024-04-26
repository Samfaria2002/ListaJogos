public class Main {
    public static void main(String[] args) {
        String file = "src/JogosDesordenados.csv";

        try {
            ReadData.leitura(file);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
