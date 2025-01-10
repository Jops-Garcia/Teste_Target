package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        try {
            if (!Files.exists(Paths.get("src\\main\\java\\com\\example\\dados.json"))) {
                System.err.println("Arquivo dados.json não encontrado!");
                return;
            }
            // Carregar os dados do arquivo JSON
            String content = new String(Files.readAllBytes(Paths.get("src\\main\\java\\com\\example\\dados.json")));
            JSONArray dados = new JSONArray(content);



            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            // Iterar pelos dados para calcular menor e maior valor e soma
            for (int i = 0; i < dados.length(); i++) {
                JSONObject dia = dados.getJSONObject(i);
                double valor = dia.getDouble("valor");

                if (valor > 0) { // Ignorar dias sem faturamento
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                    soma += valor;
                    diasComFaturamento++;
                }
            }

            // Calcular a média mensal
            double media = soma / diasComFaturamento;

            // Contar os dias com faturamento acima da média
            int diasAcimaDaMedia = 0;
            for (int i = 0; i < dados.length(); i++) {
                JSONObject dia = dados.getJSONObject(i);
                double valor = dia.getDouble("valor");
                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibir os resultados
            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
