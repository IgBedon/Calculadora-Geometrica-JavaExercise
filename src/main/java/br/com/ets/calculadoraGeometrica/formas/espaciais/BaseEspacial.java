package br.com.ets.calculadoraGeometrica.formas.espaciais;
import br.com.ets.calculadoraGeometrica.formas.BaseShape;
import java.util.Scanner;

public abstract class BaseEspacial extends BaseShape {

    public int perguntarCalculo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tipo de cálculo que deseja realizar: ");
        System.out.println(
                "[1] Calcular Volume\n"+
                "[2] Calcular Área Superficial\n"+
                "[3] Voltar\n"
        );
        while(true)
        {
            try {
                int escolha = Integer.parseInt(sc.nextLine());
                if (escolha>0 && escolha <= 3)
                {
                    return escolha;
                }
                else
                {
                    System.out.println("Valor inválido! Apenas entre 1 e 3!");
                }

            } catch(Exception e)
            {
                System.out.println("Valor inválido! Insira apenas o número da opção!");
            }
        }
    }
}
