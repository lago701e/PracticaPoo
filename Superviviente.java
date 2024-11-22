import java.util.ArrayList;
import java.util.List;

public class Superviviente implements Activable {
    private String nombre;
    private Estado estado;
    private int accionesPorTurno = 3;
    private Equipo[] inventario;
    private Arma[] armasActivas;
    private int zombisEliminados;
    private int heridas;

    public Superviviente(String nombre) {
        this.nombre = nombre;
        estado = Estado.VIVO;
        inventario = new Equipo[5];
        armasActivas = new Arma[2];
        zombisEliminados = 0;
        heridas = 0;
    }
    public void activarse(){}
    public void moverse(){}
    public void atacar(){}
    public void elegirArma(){}
    public void buscar(){}
    public void descartarAccion(){}

    public void recibirHerida() {
        heridas++;
        if (heridas >= 2) {
            estado = Estado.ELIMINADO;
        }
    }

}

