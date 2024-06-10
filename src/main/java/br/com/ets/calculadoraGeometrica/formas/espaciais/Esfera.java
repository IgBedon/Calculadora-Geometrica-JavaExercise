package br.com.ets.calculadoraGeometrica.formas.espaciais;

import java.util.Scanner;

public class Esfera extends BaseEspacial
{
    private double raio;

    public Esfera(double raio, int valorString)
    {
        this.raio = raio;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double capturarValor()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            try
            {
                System.out.println("\nQual o valor do raio da Esfera?");
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
            return String.format("O valor do raio da Esfera é: %.2f", this.raio).toUpperCase();
        }
        else {
            return String.format("O valor do raio da Esfera é: %.2f", this.raio).toLowerCase();
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
        return String.format("O valor do volume é: %.2f", (4.0/3.0)*Math.PI*Math.pow(this.raio, 3));
    }

    private String calcularAreaSuperficial()
    {
        return String.format("O valor da área superficial é: %.2f", 4*Math.PI*Math.pow(this.raio, 2));
    }
}
