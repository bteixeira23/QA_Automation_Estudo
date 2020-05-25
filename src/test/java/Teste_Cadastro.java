import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Cep.class)

public class Teste_Cadastro {

    @Test // Teste de validação de CEP dentro do esperado
    public void ValidacaoCep (){

        //arrange
        Cep Cep = new Cep();
        String esperado =  "Cep Válido";
        String atual = "0";

        //act
        atual = Cep.ValidacaoCep("12345-678");
        System.out.println(atual);

        //assert

        Assert.assertEquals(esperado, atual);
    }
    @Test // Teste de validação de CEP fora do esperado
    public void CepInvalido (){

        //arrange
        Cep Cep = new Cep();
        String esperado =  "Cep Inválido";
        String atual = "0";

        //act
        atual = Cep.ValidacaoCep("12345-6782");
        System.out.println(atual);

        //assert

        Assert.assertEquals(esperado, atual);
    }

    @Test // Teste de validação de CEP menor do que esperado
    public void CepMenor (){

        //arrange
        Cep Cep = new Cep();
        String esperado =  "Cep incompleto";
        String atual = "0";

        //act
        atual = Cep.ValidacaoCep("12345-62");
        System.out.println(atual);

        //assert

        Assert.assertEquals(esperado, atual);
    }
    @Test // Teste mockado
    public void Mock () throws Exception {

        //arrange
        Cep Cep = new Cep();
        final String Method = "ValidacaoCep";
        Cep spy = PowerMockito.spy(Cep);
        PowerMockito.when(spy,Method,"02111031").thenReturn((String) "Cep válido");

        String esperado =  "Cep Válido";
        String atual = "0";

        //act
        atual = Cep.ValidacaoCep("12345-678");
        System.out.println(atual);

        //assert

        Assert.assertEquals(esperado, atual);
    }



}
