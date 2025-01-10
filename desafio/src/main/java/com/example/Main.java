package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual exercicio deseja verificar:");
        System.out.println("1 - Soma de numeros");
        System.out.println("2 - Verificar Fibonacci");
        System.out.println("3 - Analisar Faturamento");
        System.out.println("4 - Calcular Percentual de Faturamento");
        System.out.println("5 - Inverter String");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> SomaNumeros.main(null);
            case 2 -> ChecarFibonacci.main(null);
            case 3 -> FaturamentoDistribuidora.main(null);
            case 4 -> PercentualFaturamento.main(null);
            case 5 -> InverterString.main(null);
            default -> System.out.println("Opção inválida!");
        }
        scanner.close();
    }

    public final static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
}
