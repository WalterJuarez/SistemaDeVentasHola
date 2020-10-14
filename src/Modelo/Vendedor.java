package Modelo;

public class Vendedor {
    int idven;
    String dniven;
    String nomven;
    String telven;
    String estven;
    String userven;

    public Vendedor() {
    }

    
    public Vendedor(int idven, String dniven, String nomven, String telven, String estven, String userven) {
        this.idven = idven;
        this.dniven = dniven;
        this.nomven = nomven;
        this.telven = telven;
        this.estven = estven;
        this.userven = userven;
    }

    public int getIdven() {
        return idven;
    }

    public void setIdven(int idven) {
        this.idven = idven;
    }

    public String getDniven() {
        return dniven;
    }

    public void setDniven(String dniven) {
        this.dniven = dniven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public String getTelven() {
        return telven;
    }

    public void setTelven(String telven) {
        this.telven = telven;
    }

    public String getEstven() {
        return estven;
    }

    public void setEstven(String estven) {
        this.estven = estven;
    }

    public String getUserven() {
        return userven;
    }

    public void setUserven(String userven) {
        this.userven = userven;
    }
    
    
    
}
