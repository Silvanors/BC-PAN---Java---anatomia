package edu.silvano.segundasemana;

public class MinhaClasse {

    public static void main (String [] args) {

        //System.out.print ("Olá turma, bem vindos!");
        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método "+ primeiroNome.concat(" ").concat(segundoNome);
    }



}
