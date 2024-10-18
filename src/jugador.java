import java.util.Scanner;

public class jugador {

    public String avatar;
    public int edad;
    public String pais;

    // Constructor que permite ingresar datos
    public jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    // Constructor por defecto
    public jugador() {
        this.avatar = "Joseph";
        this.edad = 25;
        this.pais = "Alemania";
    }

    // Método para ingresar datos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el avatar: ");
        this.avatar = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        this.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingresa el país: ");
        this.pais = scanner.nextLine();
    }

    public void patear() {
        System.out.printf("\n--------------- PATEAR -------------------------\n-");
        System.out.printf("\n-El avatar %s ha pateado. La edad es %d. El país es %s.", avatar, edad, pais);
    }

    public void saltar() {
        System.out.printf("\n------------- SALTAR -------------\n-");
        System.out.printf("\n-El avatar %s ha saltado. La edad es %d. El país es %s.", avatar, edad, pais);
    }

    public void correr() {
        System.out.printf("\n------------- CORRER -------------\n-");
        System.out.printf("\n-El avatar %s ha corrido. La edad es %d. El país es %s.", avatar, edad, pais);
    }
}
