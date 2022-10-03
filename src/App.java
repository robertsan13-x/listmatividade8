import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double hora, nhora, dia, tsal;
        System.out.println("Digite o quanto você ganha por hora :");
        hora = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha por dia :");
        nhora = input.nextDouble();
        dia = hora * nhora;
        tsal = dia * 30;
        System.out.println("O seu salário é: " + tsal);

        input.close();

    }
}
