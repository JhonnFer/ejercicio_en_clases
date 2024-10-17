public class jugador {

    public String avatar;
    public int edad;
    public String pais;

    public jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;

    }

    public jugador() {
        avatar = "Joseph";
        edad = 25;
        pais = "Alemania";
    }

    public void patear(){
        System.out.printf("\n---------------PATEAR-------------------------\n-");
        System.out.printf("\n-El avatar a pateado  " + avatar + " la edad es  " + edad + " El pais es  " + pais );

    }
    public void saltar(int s){
        System.out.printf("\n-------------SALTAR-------------\n-");
        System.out.printf("\n-El avatar a pateado  " + avatar + " la edad es  " + edad + " El pais es  " + pais );
    saltos =2+s;
    }
    public void correr(){

        System.out.printf("\n-------------CORRER-------------\n-");
        System.out.printf("\n-El avatar a pateado  " + avatar + " la edad es  " + edad + " El pais es  " + pais );

    }
}
