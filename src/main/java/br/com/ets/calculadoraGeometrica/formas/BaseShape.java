package br.com.ets.calculadoraGeometrica.formas;
import java.util.Scanner;

public abstract class BaseShape
{
    public static double capturarValor() { return 0; }

    public static double[] capturarValores() { return new double[2]; }

    public static int capturarValorString()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Deseja exibir as informações em maiúsculo [1] ou minúsculo [2]?");
            try
            {
                int valorString = Integer.parseInt(sc.nextLine());

                if (valorString == 1 || valorString == 2) {
                    return valorString;
                }
                else {
                    System.out.println("Valor inválido! Insira apenas 1 ou 2!");
                }
            }
            catch(Exception e)
            {
                System.out.println("Inválido! Insira apenas números inteiros!");
            }
        }
    }

}
