public class Cep {

    static String retorno;

    public String ValidacaoCep(String cep) {

        if ( cep.length() == 9 ){
            retorno = "Cep Válido";
        }
        else if (cep.length() < 9){
            retorno = "Cep incompleto";
        } else {
            retorno = "Cep Inválido";
        }
        return retorno;

    }
    public  String Processamento () {
        return retorno;
    }
}
