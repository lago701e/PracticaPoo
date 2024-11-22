import java.util.ArrayList;

public class Juego {
    private final int filas = 10;
    private final int columnas = 10;
    private String[][] tablero;
    private ArrayList<Zombi> zombis;
    private int numZombis = 0;

    public Juego(String[][] tablero) {
        tablero = new String[filas][columnas];
        zombis = new ArrayList<>();
        inicializarTablero();
        primerosZombis();
    }

    public void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = " ";
            }
        }
    }

    public void primerosZombis() {
        for (int i = 0; i < 3; i++) {
            zombis.set(i, inicializarZombi(i));
            numZombis++;
        }
    }

    public void anadirZombis() {
        for (int i = 0; i < 4; i++) {
            zombis.set(numZombis + i, inicializarZombi(numZombis + i));
            numZombis++;
        }
    }

    public Zombi inicializarZombi(int i) {
        return new Zombi(i);
    }
}
