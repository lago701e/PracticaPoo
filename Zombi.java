import javax.xml.stream.events.StartDocument;
import java.util.Random;

public class Zombi {
    private int id;
    private int potencia;
    private int activaciones;
    private String tipo;
    private int[][] posicion;

    public Zombi(int id) {
        String[] tipos = new String[]{"Caminante Normal", "Corredor Normal", "Abominacion Normal", "Caminante Berserker", "Corredor Berserker", "Abominacion Berserker", "Caminante Toxico", "Corredor Toxico", "Abominacion Toxico"};
        int[] probablidades = {18, 9, 3, 18, 9, 3, 18, 9, 3};
        String tipoSeleccionado = seleccionarTipo(tipos, probablidades);
        tipo = tipoSeleccionado;
        asignarCaracteristicas(tipo);
        this.id = id + 1;
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        posicion = new int[x][y];
    }

    public String seleccionarTipo(String[] tipos, int[] probabilidades) {
        Random random = new Random();
        int totalProb = 90;

        int valorRandom = random.nextInt(totalProb);

        int rango = 0;
        for (int i = 0; i < tipos.length; i++) {
            rango += probabilidades[i];
            if (valorRandom < rango) {
                return tipos[i];
            }
        }
        return tipos[tipos.length - 1];
    }

    public void asignarCaracteristicas(String tipo) {
        switch (tipo) {
            case "Caminante Normal":
                potencia = 1;
                activaciones = 1;
                break;
            case "Caminante Berserker":
                potencia = 1;
                activaciones = 1;
                break;
            case "Caminante Toxico":
                potencia = 1;
                activaciones = 1;
                break;
            case "Corredor Normal":
                potencia = 1;
                activaciones = 2;
                break;
            case "Corredor Berserker":
                potencia = 1;
                activaciones = 2;
                break;
            case "Corredor Toxico":
                potencia = 1;
                activaciones = 2;
                break;
            case "Abominacion Normal":
                potencia = 3;
                activaciones = 1;
                break;
            case "Abominacion Berserker":
                potencia = 3;
                activaciones = 1;
                break;
            case "Abominacion Toxico":
                potencia = 3;
                activaciones = 1;
                break;
        }
    }

    public void activar(){}
    public void reaccionar(){}
}
