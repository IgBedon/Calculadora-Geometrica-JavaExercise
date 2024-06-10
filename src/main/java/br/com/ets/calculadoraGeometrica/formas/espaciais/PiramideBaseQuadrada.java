package br.com.ets.calculadoraGeometrica.formas.espaciais;

import java.util.Scanner;

public class PiramideBaseQuadrada extends BaseEspacial
{
    private double altura,  aresta;

    public PiramideBaseQuadrada(double altura, double aresta, int valorString)
    {
        this.altura = altura;
        this.aresta = aresta;
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
                System.out.println("\nQual o valor do altura da Pirâmide?");
                double altura = Double.parseDouble(sc.nextLine());
                System.out.println("Qual o valor da aresta da base da Pirâmide?");
                double aresta = Double.parseDouble(sc.nextLine());

                if (altura >= 0 && aresta >= 0) {
                    medidas[0] = altura;
                    medidas[1] = aresta;
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
            return String.format("O valor da aresta e da altura da Pirâmide de Base Quadrada é, respectivamente: %.2f e %.2f", this.aresta, this.altura).toUpperCase();
        }
        else {
            return String.format("O valor da aresta e da altura da Pirâmide de Base Quadrada é, respectivamente: %.2f e %.2f", this.aresta, this.altura).toLowerCase();
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
        double areaDaBase = this.aresta*this.aresta;
        return String.format("O valor do volume é: %.2f", (areaDaBase*this.altura)/3.0);
    }

    private String calcularAreaSuperficial()
    {
        double areaDaBase = this.aresta*this.aresta;
        double apotema = Math.sqrt(Math.pow((this.aresta/2.0),2) + Math.pow(altura, 2));
        return String.format("O valor da área superficial é: %.2f", (2.0*this.aresta*apotema)+areaDaBase);
    }
}
