package br.com.javaestudo.javacore.introducaoclasses.classes;

public class ExercicioClasses {
    public String[] integrante = new String[3];

    public String entrarNoClube(){
        String nomeIntegrante = integrante[0];
        String nacIntegrante = integrante[1];
        int idadeIntegrante = Integer.parseInt(integrante[2]);

        if (idadeIntegrante <= 10) {
            return "O integrante "+nomeIntegrante+" com a nacionalidade de "+nacIntegrante+" entrou no Clube Infantil";
        }else if(idadeIntegrante < 18){
            return "O integrante "+nomeIntegrante+" com a nacionalidade de "+nacIntegrante+" entrou no Clube Juvenil";
        }else{
            return "O integrante "+nomeIntegrante+" com a nacionalidade de "+nacIntegrante+" entrou no Clube Adulto";
        }
    }
}
