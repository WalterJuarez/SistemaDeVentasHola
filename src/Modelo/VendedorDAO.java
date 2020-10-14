package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements CRUD {
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    Entidadvendedor ev = new Entidadvendedor();    
    Conexion con = new Conexion();
    Connection acceso;
    
    public Entidadvendedor ValidarVendedor(String dni, String user){
        //Entidadvendedor ev = new Entidadvendedor();
        String sql = "select * from vendedor where Dni=? and User_2=?";
        try{
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1 , dni);
            ps.setString(2 , user);
            rs = ps.executeQuery();
            while (rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNombre(rs.getString(3));
                ev.setTelefono(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
            //acceso.close();
        }catch (Exception e){
            System.out.println("3"+e);
        }
        return ev;
    }
    @Override
    public List listar() {
        List<Entidadvendedor> lista = new ArrayList<>();
        String sql = "select * from vendedor";
        try {
            acceso = cn.Conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Entidadvendedor v = new Entidadvendedor();
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNombre(rs.getString(3));
                v.setTelefono(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUser(rs.getString(6));
                lista.add(v);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into vendedor(Dni,Nombres,Telefono,Estado,User_2)values(?,?,?,?,?)";
        try {
            acceso = cn.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update vendedor set Dni = ?, Nombres = ?, Telefono = ?, Estado = ?, User_2 = ? where IdVendedor = ?";
        try {
            acceso = cn.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    /**
     *
     * @param id
     */
    @Override
    public void eliminar(int id) {
         String sql = "delete from vendedor where IdVendedor = ?";
         try {
            acceso = cn.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
