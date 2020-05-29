import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF {
    public String ValidadorCPF(String cpf) {
        String pattern = "([0-9]{2}[\\.][0-9]{3}[\\.][0-9]{3}[\\/][0-9]{4}[-][0-9]{2})|" +
                "([0-9]{3}[\\.][0-9]{3}[\\.][0-9]{3}[-][0-9]{2})";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Matcher regexCPF =  r.matcher(cpf);
        if (regexCPF.find()){
            return "Válido";
        } else {
            return "Inválido";
        }
    }
}
