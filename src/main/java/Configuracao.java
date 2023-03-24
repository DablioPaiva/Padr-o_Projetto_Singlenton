public class Configuracao {

    private static Configuracao instance = null;
    private String url;
    private String usuario;
    private String senha;

    private Configuracao() {
        url = "http://localhost:8080";
        usuario = "paiva";
        senha = "paiva123";
    }

    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

