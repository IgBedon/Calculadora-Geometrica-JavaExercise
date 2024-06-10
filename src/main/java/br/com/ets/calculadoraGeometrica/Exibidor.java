package br.com.ets.calculadoraGeometrica;

import java.util.Scanner;

public class Exibidor
{
    private Usuario usuario;

    public Exibidor(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public void exibirMenu()
    {
        System.out.println("\nSeja bem-vindo a Calculadora Geométrica, "+this.usuario.getName()+"!\n------------------------------------------------\n");
        System.out.println("Aqui nós temos cálculos para formas geométricas planas e espaciais:");
        System.out.println(
                "--- Planas : ---\n"+
                        "[1] Quadrado\n"+
                        "[2] Retângulo\n"+
                        "[3] Triângulo Equilátero\n"+
                        "[4] Círculo\n"+
                        "[5] Hexágono Regular\n\n"+
                        "--- Espaciais : ---\n"+
                        "[6] Cubo\n"+
                        "[7] Paralelepípedo\n"+
                        "[8] Esfera\n"+
                        "[9] Pirâmide de Base Quadrada\n"+
                        "[10] Cilindro\n"+
                        "[11] Cone\n"
        );
        System.out.println("Insira o número correspondente a forma que deseja saber sobre: ");
    }


    public boolean perguntarSaida()
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println(this.usuario.getName()+", gostaria de continuar usando a calculadora?\n[1] Sim\n[2] Não");
            try {
                int escolha = Integer.parseInt(sc.nextLine());
                if (escolha==1) {
                    limpar(100);
                    return false;
                }
                else if(escolha==2) {
                    System.out.println("\nSaindo... Nos vemos na próxima, "+this.usuario.getName()+"!\n");
                    return true;
                }
                else {
                    System.out.println("\nValor inválido! Apenas 1 ou 2!\n");
                }
            } catch(Exception e) {
                System.out.println("\nValor inválido! Insira apenas o número da opção!\n");
            }
        }
    }

    public void limpar(int quantidade)
    {
        for(int cont = 0; cont<=quantidade; cont++)
        {
            System.out.println();
        }
    }
}
