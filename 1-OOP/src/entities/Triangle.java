package entities;

public class Triangle {
    /*
     * Uma classe possui:
     * Atributos: dados/campos
     * Métodos: funções/operações
     */

    // Atributos
    // * Public indica que o atributo ou método pode ser usado em outros arquivos *
    public double a;
    public double b;
    public double c;

    // Métodos
    // O double após o 'public' informa o tipo do dado que o método retorna
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
