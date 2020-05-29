import org.junit.Assert;
import org.junit.Test;

public class Teste_Email {

    @Test // Teste de validação de email
    public void ValidadorEmail() {

        //arrange
        Email Email = new Email();
        String esperado = "Email válido";
        String atual = "0";

        //act
        atual = Email.ValidadorEmail("teste@teste.com");
        System.out.println(atual);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test // Teste de validação de e-mail
    public void EmailInvalido() {

        //arrange
        Email Email = new Email();
        String esperado = "Email inválido";
        String atual = "0";

        //act
        atual = Email.ValidadorEmail("teste@.com");
        System.out.println(atual);

        //assert
        Assert.assertEquals(esperado, atual);
    }
}