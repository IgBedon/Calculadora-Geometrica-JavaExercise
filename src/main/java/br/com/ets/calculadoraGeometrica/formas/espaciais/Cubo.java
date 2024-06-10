package br.com.ets.calculadoraGeometrica.formas.espaciais;

import java.util.Scanner;

public class Cubo extends BaseEspacial
{
    private double lado;


    public Cubo(double lado, int valorString)
    {
        this.lado = lado;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double capturarValor()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nQual o valor do lado do Cubo?");
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
            return String.format("O valor do lado do Cubo é: %.2f", this.lado).toUpperCase();
        }
        else {
            return String.format("O valor do lado do Cubo é: %.2f", this.lado).toLowerCase();
        }
    }


    public String direcionarCalculo(int escolha)
    {
        String resposta = "";
        switch (escolha) {
            case 1 -> {resposta = calcularVolume();}
            case 2 -> {resposta = calcularAreaSuperficial();}
            case 3 -> {resposta = "\nVoltando ao Menu Principal...\n";}
        }
        return resposta;
    }


    private String calcularVolume()
    {
        return String.format("O valor do volume é: %.2f", Math.pow(this.lado, 3));
    }

    private String calcularAreaSuperficial()
    {
        return String.format("O valor da área superficial é: %.2f", Math.pow(this.lado, 2)*6);
    }
}
