import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public String ValidadorEmail(String email) {

        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        final Pattern r = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher regexemail =  r.matcher(email);
        if (regexemail.matches()== true){
            return "Email válido";
        } else {
            return "Email inválido";
        }


    }
}
