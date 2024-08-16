package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {

        double salarioAnual = 70000;
        double taxaAnual;

        if (salarioAnual <= 34712) {
            taxaAnual = salarioAnual * 0.097;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            taxaAnual = salarioAnual * 0.3735;
        } else {
            taxaAnual = salarioAnual * 0.495;
        }

        System.out.println("Você pagará de taxa anual na Holanda: " + taxaAnual);

    }

}
