public class ResultadoEscolar{

    public static void main (String [] args) {
        int nota2 =5;

        String resultado = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2<7 ? "Exame" : "Reprovado";

        System.out.println(resultado);
        
        /*int nota = 5;

        if (nota >=7 )
            System.out.println("Aprovado");

            else if (nota>=5 && nota <7)
            System.out.println("Exame");

        else
            System.out.println("Reprovado");*/

    }

}