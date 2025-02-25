import java.util.Scanner;

public class Contador {

    public void solicitarParametros(Scanner scanner) {

        boolean entradaValida = false;

        while (!entradaValida) {
            
            int[] parametro = new int[2];
            for (int i = 1; i <= parametro.length; i++) {
                parametro[i] = obterParametros(scanner, "Digite o " + (i+1) + "º parametro: ");
            }

            try {
                if (validarParametro(parametro)) {
                    this.imprimir(parametro);
                    entradaValida = true;
                }
                
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int obterParametros(Scanner scanner, String mensagem) {

        int parametro = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println(mensagem);
            String entrada = scanner.nextLine();

            try {
                if (entrada.isEmpty()) {
                    throw new ParametrosInvalidosException("Este campo não pode ficar em branco.");
                }

                parametro = Integer.parseInt(entrada);
                entradaValida = true;

            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números inteiros.");
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
        return parametro;
    }

    private boolean validarParametro(int[] parametro) throws ParametrosInvalidosException {
        
        boolean parametroValido = parametro[1] > parametro[0];
        if (!parametroValido) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return parametroValido;
    }

    private void imprimir(int[] parametro) {

        int imprimir = parametro[1] - parametro[0];
        for (int x = 1; x <= imprimir; x++) {
            System.out.println("Imprimindo o número " + x);
        }
    }
}
