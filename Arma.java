public class Arma {
    private Potencia potencia;
    private String nombre;
    private int alcance;
    private int dados;
    private int valorExito;

    public Arma(String nombre, Potencia potencia, int alcance, int numDados, int valorExito) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.alcance = alcance;
        this.dados = numDados;
        this.valorExito = valorExito;
    }

}
