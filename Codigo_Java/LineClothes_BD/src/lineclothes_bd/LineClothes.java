
package lineclothes_bd;


import controlador.Controlador;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import modelo.ConsultasPaquete;
import modelo.Paquete;
import modelo.Persona;
import vista.VistaConsulta;
import vista.VistaEnvios;

public class LineClothes {
    public static void main(String[] args) {
        
        VistaEnvios vistaEnvios = new VistaEnvios();
        VistaConsulta vistaConsulta = new VistaConsulta();
        Persona persona = new Persona();
        Paquete paquete = new Paquete();
        ConsultasPaquete modelo = new ConsultasPaquete();
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu();
        Controlador controlador = new Controlador(vistaEnvios, vistaConsulta, persona, paquete, modelo, barraMenu, menu);
    
        controlador.iniciar();
        
        
        
    }
    
    
    
    
    
}
