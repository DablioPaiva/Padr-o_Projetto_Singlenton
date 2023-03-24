package singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ConfiguracaoTest {

    @Test
    public void testSingletonInstance() {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        assertSame(config1, config2);
    }

    @Test
    public void testGetUrl() {
        Configuracao config = Configuracao.getInstance();
        String expectedUrl = "http://localhost:8080";

        String actualUrl = config.getUrl();

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testSetUrl() {
        Configuracao config = Configuracao.getInstance();
        String expectedUrl = "http://example.com";

        config.setUrl(expectedUrl);
        String actualUrl = config.getUrl();

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testGetUsuario() {
        Configuracao config = Configuracao.getInstance();
        String expectedUsuario = "paiva";

        String actualUsuario = config.getUsuario();

        assertEquals(expectedUsuario, actualUsuario);
    }

    @Test
    public void testSetUsuario() {
        Configuracao config = Configuracao.getInstance();
        String expectedUsuario = "joao";

        config.setUsuario(expectedUsuario);
        String actualUsuario = config.getUsuario();

        assertEquals(expectedUsuario, actualUsuario);
    }

    @Test
    public void testGetSenha() {
        Configuracao config = Configuracao.getInstance();
        String expectedSenha = "paiva123";

        String actualSenha = config.getSenha();

        assertEquals(expectedSenha, actualSenha);
    }

    @Test
    public void testSetSenha() {
        Configuracao config = Configuracao.getInstance();
        String expectedSenha = "54321";

        config.setSenha(expectedSenha);
        String actualSenha = config.getSenha();

        assertEquals(expectedSenha, actualSenha);
    }
}
