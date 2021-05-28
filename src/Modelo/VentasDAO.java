
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VentasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    public String IdVentas(){
        String idv = "";
        String sql = "select max(IdVentas) from ventas";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                idv = rs.getString(1);
            }
        }catch(Exception e){            
        }
        return idv;
    }
    
    public String NroSerieVentas(){
        String serie = "";
        String sql = "select max(NumeroSerie) from ventas";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                serie = rs.getString(1);
            }
        }catch(Exception e){            
        }
        return serie;
    }
    
    public int GuardarVentas(Ventas v){
        Ventas ventas = new Ventas();
        String sql = "insert into ventas(IdCliente,IdVendedor,NumeroSerie,FechaVenta,Monto,Estado)values(?,?,?,?,?,?)";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.idVendedor);
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            
            r = ps.executeUpdate();
        }catch(Exception e){            
        }
        return r;
    }
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql = "insert into detalle_ventas(IdVentas, IdProducto, Cantidad, PrecioVenta, Codigo)value(?,?,?,?,?)";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPreVenta());            
            ps.setString(5, dv.getCodigo()); 
            r = ps.executeUpdate();
            
        }catch(Exception e){            
        }
        return r;
    }
    
    
}
