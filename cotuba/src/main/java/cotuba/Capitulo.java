package cotuba;

public class Capitulo {
    private String titulo;
    private String conteudoHTML;

    public String getTitulo() {
        return titulo;
    }

    public Capitulo setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getConteudoHTML() {
        return conteudoHTML;
    }

    public Capitulo setConteudoHTML(String conteudoHTML) {
        this.conteudoHTML = conteudoHTML;
        return this;
    }
}
