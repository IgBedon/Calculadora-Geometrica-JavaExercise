package br.com.ets.calculadoraGeometrica.formas.espaciais;

import java.util.Scanner;

public class Paralelepipedo extends BaseEspacial
{
    private double comprimento, altura, largura;


    public Paralelepipedo(double comprimento, double altura, double largura, int valorString)
    {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        System.out.println(exibirInformacoes(valorString));
    }


    public static double[] capturarValores()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            double[] medidas = new double[3];
            try
            {
                System.out.println("\nQual o valor do comprimento do Paralelepípedo?");
                double comprimento = Double.parseDouble(sc.nextLine());
                System.out.println("Qual o valor da altura do Paralelepípedo?");
                double altura = Double.parseDouble(sc.nextLine());
                System.out.println("Qual o valor da largura do Paralelepípedo?");
                double largura = Double.parseDouble(sc.nextLine());

                if (comprimento >= 0 && altura >= 0 && largura >= 0) {
                    medidas[0] = comprimento;
                    medidas[1] = altura;
                    medidas[2] = largura;
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
            return String.format("O valor do comprimento, da altura e da largura do Paralelepípedo é, respectivamente: %.2f, %.2f e %.2f", this.comprimento, this.altura, this.largura).toUpperCase();
        }
        else {
            return String.format("O valor do comprimento, da altura e da largura do Paralelepípedo é, respectivamente: %.2f, %.2f e %.2f", this.comprimento, this.altura, this.largura).toLowerCase();
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
        return String.format("O valor do volume é: %.2f", this.comprimento * this.altura * this.largura);
    }

    private String calcularAreaSuperficial()
    {
        return String.format("O valor da área superficial é: %.2f", 2 * ((this.comprimento*this.altura) + (this.altura*this.largura)+(this.comprimento*this.largura)));
    }
}
