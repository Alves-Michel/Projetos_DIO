package Sistema_Processo;

public class Sistema {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String [] candidatos = {
                "FELIPE","MARCIA","PAULO","AUGUSTO"
        };
        for(String candidato : candidatos){
            metodos.entrandoEmContato(candidato);

        }



    }
}
