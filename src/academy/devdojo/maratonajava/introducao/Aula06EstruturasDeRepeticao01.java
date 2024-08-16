package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        // while, do while, for

        int count = 0;

        while (count < 10) {
            System.out.println("While: " + count);
            count++;
        }

        count = 0;

        do {
            System.out.println("Do While: " + count);
            count++;
        } while (count < 10);

        count = 0;

        for (count = 0; count < 10; count++) {
            System.out.println("For: " + count);
        }

    }

}
