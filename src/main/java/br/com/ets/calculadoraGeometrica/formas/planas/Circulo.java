package br.com.ets.calculadoraGeometrica.formas.planas;

import java.util.Scanner;

public class Circulo extends BasePlana
{
    private double raio;


    public Circulo(double raio, int valorString)
    {
        this.raio = raio;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double capturarValor()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nQual o valor do raio do Círculo?");
            try
            {
                double raio = Double.parseDouble(sc.nextLine());

                if (raio >= 0) {
                    return raio;
                }
                else {
                    System.out.println("Valor inválido! Insira um valor positivo!");
                }
            }
            catch(Exception e)
            {
                System.out.println("Inválido! Insira apenas números!");
            }
        }
    }


    public String exibirInformacoes(int valorString)
    {
        if(valorString==1)
        {
            return String.format("O valor do raio do Círculo é: %.2f", this.raio).toUpperCase();
        }
        else {
            return String.format("O valor do raio do Círculo é: %.2f", this.raio).toLowerCase();
        }
    }


    public String direcionarCalculo(int escolha)
    {
        String resposta = "";
        switch (escolha) {
            case 1 -> {resposta = calcularPerimetro();}
            case 2 -> {resposta = calcularArea();}
            case 3 -> {resposta = "\nVoltando ao Menu Principal...\n";}
        }
        return resposta;
    }


    private String calcularPerimetro()
    {
        return String.format("O valor do perímetro é: %.2f", 2 * Math.PI * this.raio);
    }

    private String calcularArea()
    {
        return String.format("O valor da área é: %.2f", Math.PI*Math.pow(this.raio, 2));
    }
}
