package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

        // Doar se salario > 5000
        double salario = 3000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições";
        boolean possoDoar = salario > 5000 ? true : false;

        System.out.println(resultado);

    }

}
