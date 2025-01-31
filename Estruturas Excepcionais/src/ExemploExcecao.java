public class ExemploExcecao {
    public static void main(String[]args){
        try{
            String cepFormatado = formatarCep("74723260");
            System.out.print(cepFormatado);
        } catch (CepInvalidoException e){
            e.printStackTrace();
        }
    }
    static String formartaCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8){
            throw new CepInvalidoException();


            
        }
        return "74.723-260";

    }

}
