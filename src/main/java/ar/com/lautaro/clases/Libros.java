package ar.com.lautaro.clases;

public class Libros {

    // Campos
    private String autor;
    private String titulo;
    private int ISBN;

    // Constructor vacio
    public Libros() {
    }

    // Constructor
    public Libros(String autor, String titulo, int ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    // Getter y Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    // HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.ISBN;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (this.ISBN != other.ISBN) {
            return false;
        }
        return true;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros{");
        sb.append("Autor: ").append(autor);
        sb.append(", Titulo: ").append(titulo);
        sb.append(", ISBN= ").append(ISBN);
        sb.append('}');
        return sb.toString();
    }

}
