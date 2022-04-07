package ar.com.lautaro.clases;

public class Motos {

    // Campos
    private int numeroChasis;
    private String patente;

    // Constructor vacio
    public Motos() {
    }

    // Constructor
    public Motos(int numeroChasis, String patente) {
        this.numeroChasis = numeroChasis;
        this.patente = patente;
    }

    // Getter y Setter
    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    // HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numeroChasis;
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
        final Motos other = (Motos) obj;
        if (this.numeroChasis != other.numeroChasis) {
            return false;
        }
        return true;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motos{");
        sb.append("Número de Chasis= ").append(numeroChasis);
        sb.append(", Patente= ").append(patente);
        sb.append('}');
        return sb.toString();
    }

}
