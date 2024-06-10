package br.com.ets.calculadoraGeometrica.formas.planas;

import java.util.Scanner;

public class Quadrado extends BasePlana
{
    private double lado;


    public Quadrado(double lado, int valorString)
    {
        this.lado = lado;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double capturarValor()
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("\nQual o valor do lado do Quadrado?");
            try 
            {
                double lado = Double.parseDouble(sc.nextLine());

                if (lado >= 0) {
                    return lado;
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
            return String.format("O valor do lado do Quadrado é: %.2f", this.lado).toUpperCase();
        }
        else {
            return String.format("O valor do lado do Quadrado é: %.2f", this.lado).toLowerCase();
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
        return String.format("O valor do perímetro é: %.2f", this.lado*4);
    }

    private String calcularArea()
    {
        return String.format("O valor da área é: %.2f", Math.pow(this.lado, 2));
    }
}
