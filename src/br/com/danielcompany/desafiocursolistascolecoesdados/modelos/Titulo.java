package br.com.danielcompany.desafiocursolistascolecoesdados.modelos;

public class Titulo implements Comparable<Titulo> {
    private String titulo;

    public Titulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.getTitulo().compareTo(outro.getTitulo());
    }
}
