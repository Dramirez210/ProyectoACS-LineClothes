
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import vista.VistaConsulta;

public class ConsultasPaquete extends Conexion{
    VistaConsulta vistaConsulta = new VistaConsulta();
    
    PreparedStatement ps = null; //consultas
    ResultSet rs = null; //obtener datos
    
    
    public boolean validarCodigo(String codigo){
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("select idPaquete from paquetes where codigo = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            return !rs.first();
            
        }catch(Exception ex){
            
            System.err.println("Error, "+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error, "+ex);
            }
        }
        
        
        
    }
    
    public boolean insertar(Persona persona, Paquete paquete){
        Connection conexion = getConnection();//conexion a la base
        
        try{
            ps = conexion.prepareStatement("insert into personas (nombre, codigoPostal, calle, estado) values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            //rellenar persona
            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getCodigoPostal());
            ps.setString(3, persona.getCalle());
            ps.setString(4, persona.getEstado());
            
          
            int resultado1 = ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            Integer idPersona=null;
            if (rs.next()){
                // aquí está el id generadobu
                idPersona = rs.getInt(1);
            } 
            
            ps = conexion.prepareStatement("insert into paquetes (codigo, peso, prioridad,cantidadArticulos, idPersona) values (?,?,?,?,?)");
            //rellenar paquete
            ps.setString(1, paquete.getCodigo());
            ps.setDouble(2, paquete.getPeso());
            ps.setString(3, paquete.getPrioridad());
            ps.setString(4, paquete.getCantidadArticulos());
            ps.setInt(5, idPersona.intValue());
            
            
            int resultado2 = ps.executeUpdate();
            if(resultado1 >0 && resultado2 >0){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            
            System.err.println("Error, "+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error, "+ex);
            }
        }
        
    }
    /*
    public boolean buscar(Persona persona, Paquete paquete){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        vistaConsulta.tablaConsultas.setModel(modeloTabla);
        Connection conexion = getConnection();//conexion a la base
        
        
        String campo = vistaConsulta.cajaConsultaID.getText();
        String where = "";
        
      
        try{
            ps = conexion.prepareStatement("select codigo,cantidadArticulos,peso,prioridad from paquetes"+where);
            ps = conexion.prepareStatement("select calle from personas");
            rs = ps.executeQuery();
            
            
                
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No existe el registro");
                return false;
            }
                
        }catch(Exception ex){
            
            System.err.println("Error, "+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error, "+ex);
            }
        }
        
    }
    */
    
    
}
