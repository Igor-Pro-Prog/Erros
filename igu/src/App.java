// cria um script que calcula erro relativo e erro absoluto

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double x, y, erroAbsoluto, erroRelativo;

        System.out.println("Digite o valor de x: ");
        x = input.nextDouble();

        System.out.println("Digite o valor de y: ");
        y = input.nextDouble();

        erroAbsoluto = Math.abs(x - y);
        erroRelativo = erroAbsoluto / x;

        System.out.println("O erro absoluto é: " + erroAbsoluto);
        System.out.println("O erro relativo é: " + erroRelativo);

        input.close();
    }
}