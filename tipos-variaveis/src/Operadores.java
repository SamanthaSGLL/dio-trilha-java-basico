public class Operadores {
    public static void main(String[] args) {
         int a,b;

        a=6;
        b=5;
        
        String resultado = "";
        if(a==b){
            resultado="verdadeiro";
        }
        else{
            resultado="Falso";

        }

        System.out.println(resultado);

        String resultado = a==b ? "verdadeiro":"Falso";

        System.out.println(resultado);
        ////////////////////////////////////////////////////////////
        
        String nome1 = "Samantha";
        String nome2 =  new String("Samantha");

        System.out.println(nome1==nome2);
        System.out.println(nome1.equals(nome2) );

        int numero1 = 1;
        int numero2 =2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }


        System.out.println("Numero1 é igual a Numero2 ? " +simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente a Numero2 ? " +simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior a Numero2 ? " +simNao); 

        ////////////////////////////////////////////////////////////////////////
        
        boolean condição1= true;
        boolean condição2= false;

        if (condição1 && condição2){
            System.out.println("As duas consições são verdadeiras");
        }

        if (condição2 || condição1) {
            System.out.println("Uma das codição é verdadeira");
        }

        System.out.println("Fim");
    }
}
