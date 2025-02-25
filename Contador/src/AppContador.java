import java.util.Scanner;

public class AppContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();

        contador.solicitarParametros(scanner);
        scanner.close();
    }
}
