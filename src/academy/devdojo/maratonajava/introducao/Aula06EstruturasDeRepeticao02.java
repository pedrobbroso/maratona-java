package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {

    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100
        int par;

        for (par = 0; par <= 100; par++) {
            if (par % 2 == 0) {
                System.out.println("Pares: " + par);
            }
        }

    }

}
