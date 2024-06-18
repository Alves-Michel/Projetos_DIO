package Sistema_Processo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class metodos {

    static void imprimirSelecionados(){
        String [] candidatos = {
                "FELIPE","MARCIA","PAULO","AUGUSTO"
        };
        System.out.println("Imprimindo a lista de candidatos:");
        for (int index = 0; index < candidatos.length; index++){
            System.out.println("O candidato, " + (index+1)+ " "+candidatos[index]);
        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRelaizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando =!  atendeu;
            if (continuarTentando)
                tentativasRelaizadas ++;
            else
                System.out.println("contato ralizado com sucesso");

        }while(continuarTentando && tentativasRelaizadas < 3);

        String result = atendeu ? "Conseguimos conato com a " + candidato + ", na " + tentativasRelaizadas + "° tentativa." :
                " Não Conseguimos conato com " + candidato + ", número máximo de tentativas " + tentativasRelaizadas ;

        System.out.println(result);
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    static  void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        String resultado = salarioBase > salarioPretendido ? "Aguardando o Resultado dos Demais Candidatos" :
                "Ligar Para o Candidato";
        System.out.println(resultado);
    }

    static void selectionCandidatos(){
        String [] candidatos = {
                "FELIPE","MARCIA","PAULO","AUGUSTO", "MONICA", "MIRELA"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salrioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato =  candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato, "+ candidato + " Solicitou esse valor de Salario, "+ salarioPretendido);
            if(salrioBase >= salarioPretendido){
                System.out.println("O Candidato, "+ candidato + " Foi selecionado a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}
