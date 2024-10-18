
public class mainJugador{
public static void main(String[] args) {
    jugador jugador = new jugador();
    jugador jugador2= new jugador();
    jugador jugador3= new jugador("Joseph", 14,"peru");

    jugador.ingresarDatos();
    System.out.printf("----------jugador-----------\n");
    jugador.patear();
    System.out.printf("\n----------jugador 2-----------");
    jugador2.patear();
    System.out.printf("\n----------jugador 3-----------");
    jugador3.saltar();

}
}