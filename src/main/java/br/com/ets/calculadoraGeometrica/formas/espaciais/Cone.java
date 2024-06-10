package br.com.ets.calculadoraGeometrica.formas.espaciais;

import java.util.Scanner;

public class Cone extends BaseEspacial
{
    private double altura,  raio;

    public Cone(double altura, double raio, int valorString)
    {
        this.altura = altura;
        this.raio = raio;
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
                System.out.println("\nQual o valor do altura do Cone?");
                double altura = Double.parseDouble(sc.nextLine());
                System.out.println("Qual o valor da raio do Cone?");
                double raio = Double.parseDouble(sc.nextLine());

                if (altura >= 0 && raio >= 0) {
                    medidas[0] = altura;
                    medidas[1] = raio;
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
            return String.format("O valor do raio e da altura do Cone é, respectivamente: %.2f e %.2f", this.raio, this.altura).toUpperCase();
        }
        else {
            return String.format("O valor da raio e da altura do Cone é, respectivamente: %.2f e %.2f", this.raio, this.altura).toLowerCase();
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
        return String.format("O valor do volume é: %.2f", (1.0/3.0)*Math.PI*Math.pow(this.raio, 2)*this.altura);
    }

    private String calcularAreaSuperficial()
    {
        return String.format("O valor da área superficial é: %.2f", Math.PI*this.raio*(this.raio + Math.sqrt(Math.pow(this.altura, 2)+Math.pow(this.raio, 2))));
    }
}