package com.example;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        scanner.close();


        System.out.println("String invertida: " + inverter(original));
    }

    public static String inverter(String input) {
        char[] caracteres = input.toCharArray();
        String resultado = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }
        return resultado;
    }
}
