package br.com.ets.calculadoraGeometrica.formas.planas;

import java.util.Scanner;

public class Retangulo extends BasePlana
{
    private double base, altura;


    public Retangulo(double base, double altura, int valorString)
    {
        this.base = base;
        this.altura = altura;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double[] capturarValores()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            double[] medidas = new double[2];
            try
            {
                System.out.println("\nQual o valor da base do Retângulo?");
                double base = Double.parseDouble(sc.nextLine());
                System.out.println("Qual o valor da altura do Retângulo?");
                double altura = Double.parseDouble(sc.nextLine());

                if (base >= 0 && altura >= 0) {
                    medidas[0] = base;
                    medidas[1] = altura;
                    return medidas;
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
            return String.format("O valor da base do Retângulo é: %.2f. Já o valor da altura do Retângulo é: %.2f", this.base, this.altura).toUpperCase();
        }
        else {
            return String.format("O valor da base do Retângulo é: %.2f. Já o valor da altura do Retângulo é: %.2f", this.base, this.altura).toLowerCase();
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
        return String.format("O valor do perímetro é: %.2f", (2*this.base)+(2*this.altura));
    }

    private String calcularArea()
    {
        return String.format("O valor da área é: %.2f", (this.base * this.altura));
    }
}