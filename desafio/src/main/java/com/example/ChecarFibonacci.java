package com.example;

import java.util.Scanner;

public class ChecarFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número para verificar: ");
            String input = scanner.nextLine();

            // Verifica se o input é um número válido
            if (!input.matches("\\d+")) {
                throw new NumberFormatException("Entrada inválida. Por favor, insira um número inteiro positivo.");
            }

            int num = Integer.parseInt(input);
            // Verifica se o número pertence à sequência
            if (pertenceFibonacci(num)) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, fib = 0;

        while (fib < num) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return (fib == num || num == 0);
    }
}
