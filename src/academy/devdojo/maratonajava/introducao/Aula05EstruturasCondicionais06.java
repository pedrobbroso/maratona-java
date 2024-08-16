package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou fds
        // Considerando 1 como Domingo

        byte dia = 1;

        switch(dia) {
            case 1:
                System.out.println("Fim de semana.");
                break;
            case 2:
                System.out.println("Dia útil.");
                break;
            case 3:
                System.out.println("Dia útil.");
                break;
            case 4:
                System.out.println("Dia útil.");
                break;
            case 5:
                System.out.println("Dia útil.");
                break;
            case 6:
                System.out.println("Dia útil.");
                break;
            case 7:
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;

        }
    }

}
