package Application;

import java.util.Scanner;

import Entities.Calculadora;
import Entities.Operacao;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Operacao op = new Operacao();
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro número para a operação: ");
        do {
            if (sc.hasNextDouble()) {
                op.setPrimNum(sc.nextDouble());
                break;
            } else{
                System.out.println("Digite apenas números válidos: ");
                sc.next(); //Descarta o buffer
            }
        } while (true);
        
        System.out.println("-----OPERAÇÕES-----");
        System.out.println("(+) - Soma");
        System.out.println("(-) - Subtrair");
        System.out.println("(*) - Multiplicação");
        System.out.println("(/) - Divisão");

        do {
            System.out.println("Selecione um caractere válido: ");
            op.setOperador(sc.next());
        } while (!op.getOperador().equals("+") && !op.getOperador().equals("-") && !op.getOperador().equals("*") && !op.getOperador().equals("x") && !op.getOperador().equals("/"));
        
        System.out.println("Digite o segundo número: ");
        do {
            if (sc.hasNextDouble()) {
                op.setSegNum(sc.nextDouble());
                break;
            } else {
                System.out.println("Digite apenas números válidos: ");
                sc.next(); //Descarta o buffer
            }
        } while (true);

        if (op.getOperador().equals("+")) {
            op.setResultado(calc.somar(op.getPrimNum(), op.getSegNum()));
            System.out.println("Resultado: " + op.getResultado());   
        }

        else if (op.getOperador().equals("-")) {
            op.setResultado(calc.subtrair(op.getPrimNum(), op.getSegNum()));
            System.out.println("Resultado: " + op.getResultado());
        }

        else if (op.getOperador().equals("*") || op.getOperador().equalsIgnoreCase("x")) {
            op.setResultado(calc.mult(op.getPrimNum(), op.getSegNum()));
            System.out.println("Resultado: " + op.getResultado());
        }

        else if (op.getOperador().equals("/")) {
            op.setResultado(calc.div(op.getPrimNum(), op.getSegNum()));
            System.out.println("Resultado: " + op.getResultado());

        sc.close();
        }
    }
}
