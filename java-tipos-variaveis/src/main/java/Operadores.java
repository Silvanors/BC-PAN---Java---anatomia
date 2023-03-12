public class Operadores {
    public static void main(String[] args) {
        /*String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
         */

        /*
        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);
         */

        /*int numero = 5;
        numero = - numero;

        System.out.println(- numero);

        System.out.println(numero);

        //numero = + numero; não funciona para tornar positivo
        numero = numero * -1;

        System.out.println(numero);
        */

        /*int numero = 5;

        //x repeticao
        //numero = numero + 1;
        //numero++;

        System.out.println(++numero);
        System.out.println(numero++);
        System.out.println(numero);*/

        /* boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);
        */

        //operador ternário <> ? <> : <>
        int a, b;

        a = 6;
        b = 6;

        //
        String resultado = a==b ? "verdadeiro" : "falso";
        int resultadoInt = a==b ? 1 : 0;
        //a==b é uma expressão booleana

        // String resultado = "";
        /*if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";*/

        System.out.println(resultado);
        System.out.println(resultadoInt);


//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //String resultado = (a==b) ? "verdadeiro" : "false";

        //System.out.println(valor);

        int numero1 = 1;
        int numero2 = 2;
        String nomeUm = "Silvano";
        String nomeDois = "Silvano";

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        System.out.println(nomeUm == nomeDois);

        if(numero1 > numero2){
            System.out.println("a nossa condição é verdadeira");
        }


        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        //também funciona na forma abaixo
        if(condicao1 && (7>4)) {
            System.out.println("as duas condições são verdadeiras 7>4");
        }

        if(condicao1 || condicao2) {
            System.out.println("uma das duas é verdadeiras");
        }
        System.out.println("fim");





    }

}
