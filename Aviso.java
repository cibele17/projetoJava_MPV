package SistemaAvisos;

public class Aviso {
    private String titulo;
    private String mensagem;

    public Aviso(String titulo, String mensagem) {
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nMensagem: " + mensagem;
    }
}
