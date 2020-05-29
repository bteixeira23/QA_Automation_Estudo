import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

public class Teste_CPF {
    @Test // Teste de validação de CPF retorno válido
    public void ValidadorCPF (){

        //arrange
        CPF CPF = new CPF();
        String esperado = "Válido" ;
        String atual = "";

        //act
        atual = CPF.ValidadorCPF ("233.417.018-69");
        System.out.println(atual);

        //assert
        Assert.assertEquals(esperado, atual);
    }
    @Test // Teste de validação de CPF retorno inválido

    public void CPFInvalido (){

        //arrange
        CPF CPF = new CPF();
        String esperado = "Inválido" ;
        String atual = "";

        //act
        atual = CPF.ValidadorCPF ("233.123.01845");
        System.out.println(atual);

        //assert
        Assert.assertEquals(esperado, atual);
    }
    @Test // Teste mockado
    public void Mock () throws Exception {

        //arrange
        CPF CPF = new CPF();
        final String Method = "ValidadorCPF";
        CPF spy = PowerMockito.spy(CPF);
        PowerMockito.when(spy,Method,"").thenReturn((String) "Válido");

        String esperado =  "Válido";
        String atual = "0";

        //act
        atual = CPF.ValidadorCPF ("233.123.018-12");
        System.out.println(atual);

        //assert

        Assert.assertEquals(esperado, atual);
    }
}
