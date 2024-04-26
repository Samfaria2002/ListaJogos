package model;

public class Item {
    public static String jogos;
    public static String categoria;
    public static double avaliacao;

    public Item(String jogos, String categoria, double avaliacao) {
        this.jogos = jogos;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
    }

    public static String getJogos() {
        return jogos;
    }
    public static void setJogos(String jogos) {
        Item.jogos = jogos;
    }
    public static String getCategoria() {
        return categoria;
    }
    public static void setCategoria(String categoria) {
        Item.categoria = categoria;
    }
    public static double getAvaliacao() {
        return avaliacao;
    }
    public static void setAvaliacao(double avaliacao) {
        Item.avaliacao = avaliacao;
    }
}
