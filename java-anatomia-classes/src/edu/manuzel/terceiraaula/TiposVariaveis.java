    package edu.manuzel.terceiraaula;
    public class TiposVariaveis{

        public static void main(String[] args) throws Exception{
            //Tipos Primitivos
            //Estudar a classe String que representa texto na aplicação

            String meuNome = "Emanuel Victor";
            
            double salarioMinimo = 2500.33;
            
            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal;
            //Aqui estou convertendo a variável short para int e depois para short novamente.

            int numero = 5;

            numero = 10;

            System.out.print(numero);

            final double VALOR_DE_PI = 3.14;

            
        } 
    }