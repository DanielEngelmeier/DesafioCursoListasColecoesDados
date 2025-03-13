package br.com.danielcompany.desafiocursolistascolecoesdados.modelos;

public class Titulo implements Comparable<Titulo> {
    private String Titulo;

    public Titulo(String titulo) {
        Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.getTitulo().compareTo(outro.getTitulo());
    }
}
