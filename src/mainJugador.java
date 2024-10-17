public class mainJugador {

    public static void main(String[]arg){

         jugador j1=new jugador();
         jugador j2= new jugador("Lucas", 24,"Peru");
        System.out.printf("---------------Jugador 1------------------");
         j1.patear();
         j1.correr();

        System.out.printf("\n ---------Jugador 2-------");
         j2.correr();
         j2.patear();
         j2.saltar(4);
         j2.saltar(5);
    }
}
