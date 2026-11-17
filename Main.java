public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Carlos");

        System.out.println("DATOS INICIALES");
        mostrarJugador(j1);
        mostrarJugador(j2);

        j1.ganarPuntos(100);
        j2.ganarPuntos(200);
        j1.ganarPuntos(-50);
        j1.subirNivel();

        System.out.println("\\nRESULTADOS FINALES");
        mostrarJugador(j1);
        mostrarJugador(j2);
    }

    public static void mostrarJugador(Jugador jugador) {
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Nivel: " + jugador.getNivel());
        System.out.println("Puntos: " + jugador.getPuntos());
        System.out.println();
    }
}
