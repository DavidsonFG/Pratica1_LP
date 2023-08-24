import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String placa;
        int ano;
        System.out.println("Digite a placa:");
        placa = ler.nextLine();
        System.out.println("Digite ano");
        ano = ler.nextInt();
        if (ano<=2010)
            System.out.println("carro velho");
        else if (ano<=2022)
            System.out.println("carro semi novo");
        else if (ano==2023)
            System.out.println("carro novo");
        else
            System.out.println("inválido");
    }
}
