
package Modelo;

public class Recibos {
    int id;
    int idventas;
    int pedido;
    double totalp;
    String tenvio;
    int recibo;

    public Recibos() {
    }

    public Recibos(int id, int idventas, int pedido, double totalp, String tenvio, int recibo) {
        this.id = id;
        this.idventas = idventas;
        this.pedido = pedido;
        this.totalp = totalp;
        this.tenvio = tenvio;
        this.recibo = recibo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public double getTotalp() {
        return totalp;
    }

    public void setTotalp(double totalp) {
        this.totalp = totalp;
    }

    public String getTenvio() {
        return tenvio;
    }

    public void setTenvio(String tenvio) {
        this.tenvio = tenvio;
    }

    public int getRecibo() {
        return recibo;
    }

    public void setRecibo(int recibo) {
        this.recibo = recibo;
    }
    
    
    
    
}
