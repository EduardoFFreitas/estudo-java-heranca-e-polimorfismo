package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;
    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public int setClassificacao(int classificacao) {
        this.classificacao = classificacao;
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
