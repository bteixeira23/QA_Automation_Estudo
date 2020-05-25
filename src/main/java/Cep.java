public class Cep {

    public String ValidacaoCep(String cep) {
        if ( cep.length() == 9 ){
            return "Cep Válido";
        }
        else if (cep.length() < 9){
            return "Cep incompleto";
        }
        return "Cep Inválido";
    }
}
