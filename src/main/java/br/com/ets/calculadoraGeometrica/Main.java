package br.com.ets.calculadoraGeometrica;
import br.com.ets.calculadoraGeometrica.formas.espaciais.Cilindro;
import br.com.ets.calculadoraGeometrica.formas.espaciais.Cone;
import br.com.ets.calculadoraGeometrica.formas.espaciais.Cubo;
import br.com.ets.calculadoraGeometrica.formas.espaciais.Esfera;
import br.com.ets.calculadoraGeometrica.formas.espaciais.Paralelepipedo;
import br.com.ets.calculadoraGeometrica.formas.espaciais.PiramideBaseQuadrada;
import br.com.ets.calculadoraGeometrica.formas.planas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        System.out.println("Seja bem-vindo!\nComo gostaria de ser chamado: ");
        String nome = sc.nextLine();
        Usuario usuario = new Usuario(nome);
        Exibidor exibidor = new Exibidor(usuario);

        while(!sair)
        {
            exibidor.exibirMenu();
            try {
                int escolha = Integer.parseInt(sc.nextLine());

                if (escolha>0 && escolha <= 11)
                {
                    switch (escolha) {
                        case 1 -> {
                            double ladoQuadrado = Quadrado.capturarValor();
                            int valorString = Quadrado.capturarValorString();
                            Quadrado quadrado = new Quadrado(ladoQuadrado, valorString);
                            System.out.println(quadrado.direcionarCalculo(quadrado.perguntarCalculo()));
                        }
                        case 2 -> {
                            double[] medidasRetangulo = Retangulo.capturarValores();
                            int valorString = Retangulo.capturarValorString();
                            Retangulo retangulo = new Retangulo(medidasRetangulo[0], medidasRetangulo[1], valorString);
                            System.out.println(retangulo.direcionarCalculo(retangulo.perguntarCalculo()));
                        }
                        case 3 -> {
                            double ladoTriangulo = TrianguloRegular.capturarValor();
                            int valorString = TrianguloRegular.capturarValorString();
                            TrianguloRegular trianguloRegular = new TrianguloRegular(ladoTriangulo, valorString);
                            System.out.println(trianguloRegular.direcionarCalculo(trianguloRegular.perguntarCalculo()));
                        }
                        case 4 -> {
                            double raio = Circulo.capturarValor();
                            int valorString = Circulo.capturarValorString();
                            Circulo circulo = new Circulo(raio, valorString);
                            System.out.println(circulo.direcionarCalculo(circulo.perguntarCalculo()));
                        }
                        case 5 -> {
                            double ladoHexagono = HexagonoRegular.capturarValor();
                            int valorString = HexagonoRegular.capturarValorString();
                            HexagonoRegular hexagonoRegular = new HexagonoRegular(ladoHexagono, valorString);
                            System.out.println(hexagonoRegular.direcionarCalculo(hexagonoRegular.perguntarCalculo()));
                        }
                        case 6 -> {
                            double ladoCubo = Cubo.capturarValor();
                            int valorString = Cubo.capturarValorString();
                            Cubo cubo = new Cubo(ladoCubo, valorString);
                            System.out.println(cubo.direcionarCalculo(cubo.perguntarCalculo()));
                        }
                        case 7 -> {
                            double[] medidasParalelepipedo = Paralelepipedo.capturarValores();
                            int valorString = Paralelepipedo.capturarValorString();
                            Paralelepipedo paralelepipedo = new Paralelepipedo(medidasParalelepipedo[0], medidasParalelepipedo[1], medidasParalelepipedo[2], valorString);
                            System.out.println(paralelepipedo.direcionarCalculo(paralelepipedo.perguntarCalculo()));
                        }
                        case 8 -> {
                            double raioEsfera = Esfera.capturarValor();
                            int valorString = Esfera.capturarValorString();
                            Esfera esfera = new Esfera(raioEsfera, valorString);
                            System.out.println(esfera.direcionarCalculo(esfera.perguntarCalculo()));
                        }
                        case 9 -> {
                            double[] medidasPiramide = PiramideBaseQuadrada.capturarValores();
                            int valorString = PiramideBaseQuadrada.capturarValorString();
                            PiramideBaseQuadrada piramide = new PiramideBaseQuadrada(medidasPiramide[0], medidasPiramide[1], valorString);
                            System.out.println(piramide.direcionarCalculo(piramide.perguntarCalculo()));
                        }
                        case 10 -> {
                            double[] medidasCilindro = Cilindro.capturarValores();
                            int valorString = Cilindro.capturarValorString();
                            Cilindro cilindro = new Cilindro(medidasCilindro[0], medidasCilindro[1], valorString);
                            System.out.println(cilindro.direcionarCalculo(cilindro.perguntarCalculo()));
                        }
                        case 11 -> {
                            double[] medidasCone = Cone.capturarValores();
                            int valorString = Cone.capturarValorString();
                            Cone cone = new Cone(medidasCone[0], medidasCone[1], valorString);
                            System.out.println(cone.direcionarCalculo(cone.perguntarCalculo()));
                        }
                    }
                    sair = exibidor.perguntarSaida();
                }
                else {
                    System.out.println("Valor inválido! Insira um valor entre 1 e 11!");
                    exibidor.limpar(2);
                }

            } catch(Exception e)
            {
                System.out.println("Valor inválido! Insira apenas o número da opção!");
                exibidor.limpar(2);
            }
        }
    }
}