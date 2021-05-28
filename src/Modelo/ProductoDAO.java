package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD{
    int r;
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int actualizarStock(int cant, String idp){
        
        String sql = "update producto set Stock = ? where Codigo = ?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, idp);
            ps.executeUpdate();
        }catch(Exception e){          
        }
        return r;
    }
    
    public Producto ListarID(String id){
        String sql = "select * from producto where Codigo = ?";
        Producto p = new Producto();
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getInt(1));
                p.setCodigo(rs.getString(2));
                p.setNombres(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setStock(rs.getInt(5));
                p.setEstado(rs.getString(6));                
            }
        }catch(Exception e){            
        }
        return p;
    }

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setCodigo(rs.getString(2));
                p.setNombres(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setStock(rs.getInt(5));
                p.setEstado(rs.getString(6));
                lista.add(p);
            }
            
        } catch (Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into producto(Codigo,Nombres,Precio,Stock,Estado)values(?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o [0]);
            ps.setObject(2, o [1]);
            ps.setObject(3, o [2]);
            ps.setObject(4, o [3]);
            ps.setObject(5, o [4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update producto set Codigo = ?, Nombres = ?, Precio = ?, Stock = ?, Estado = ? where IdProducto = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o [0]);
            ps.setObject(2, o [1]);
            ps.setObject(3, o [2]);
            ps.setObject(4, o [3]);
            ps.setObject(5, o [4]);
            ps.setObject(6, o [5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from producto where IdProducto = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
