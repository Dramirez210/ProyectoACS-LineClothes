package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import jdk.nashorn.internal.scripts.JO;
import modelo.ConsultasPaquete;
import modelo.Paquete;
import modelo.Persona;
//import sun.swing.table.DefaultTableCellHeaderRenderer;
import vista.VistaConsulta;
import vista.VistaEnvios;

public class Controlador implements ActionListener { //relacionado con la vista

    private VistaEnvios vistaEnvios;
    private VistaConsulta vistaConsulta;
    private Persona persona;
    private Paquete paquete;
    private ConsultasPaquete modelo;
    private JMenuBar barraMenu;
    private JMenu menu;
    private boolean datoNombre = false, datoCodigo = false, datoDireccion = false, datoPeso= false, datoID=true;
    private boolean comboPrioridad = false, comboEstado = false, comboArticulos = false;

    public Controlador(VistaEnvios vistaEnvios, VistaConsulta vistaConsulta, Persona persona, Paquete paquete, ConsultasPaquete modelo, JMenuBar barraMenu, JMenu menu) {
        this.vistaEnvios = vistaEnvios;
        this.vistaConsulta = vistaConsulta;
        this.persona = persona;
        this.paquete = paquete;
        this.modelo = modelo;
        this.barraMenu = barraMenu;
        this.menu = menu;
        
        //de donde utilizaremos el action
        vistaEnvios.botonEnviar.addActionListener(this);
        vistaEnvios.botonMenuConsulta.addActionListener(this);
        vistaConsulta.botonBuscar.addActionListener(this);
        vistaConsulta.botonMenuEnvios.addActionListener(this);

    }

    public void iniciar() {
        //vistaConsulta.cajaID2.setVisible(false);
        vistaEnvios.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vistaConsulta.botonMenuEnvios){
            vistaEnvios.setVisible(true);
            vistaConsulta.dispose();
        }
        if(ae.getSource() == vistaConsulta.botonMenuSalir){
            System.exit(0);
        }
        if(ae.getSource() == vistaEnvios.botonMenuConsulta){
            vistaConsulta.setVisible(true);
            vistaEnvios.dispose();
        }
        if(ae.getSource() == vistaEnvios.botonMenuSalir){
            System.exit(0);
        }
        
        if (ae.getSource() == vistaEnvios.botonEnviar) { 
            //Persona
            if("".equals(vistaEnvios.cajaNombreDestinatario.getText())){
                JOptionPane.showMessageDialog(null, "Llene el campo Destinatario");
                vistaEnvios.cajaNombreDestinatario.requestFocus();
                persona.setNombre(vistaEnvios.cajaNombreDestinatario.getText());
            }else{
                persona.setNombre(vistaEnvios.cajaNombreDestinatario.getText());
                datoNombre=true;
            }
            
            if("".equals(vistaEnvios.cajaCodigoPostal.getText())){
                JOptionPane.showMessageDialog(null, "Llene el campo Codigo Postal");
                vistaEnvios.cajaCodigoPostal.requestFocus();
                persona.setCodigoPostal(Integer.parseInt(vistaEnvios.cajaCodigoPostal.getText()));
                
            }else if(vistaEnvios.cajaCodigoPostal.getText().length()<5){
                JOptionPane.showMessageDialog(null, "El codigo postal requiere 5 digitos");
            }else{
                persona.setCodigoPostal(Integer.parseInt(vistaEnvios.cajaCodigoPostal.getText()));
                datoCodigo=true;
            }
            if("".equals(vistaEnvios.cajaCalle.getText())){
                JOptionPane.showMessageDialog(null, "Llene el campo Calle y número");
                vistaEnvios.cajaCalle.requestFocus();
                persona.setCalle(vistaEnvios.cajaCalle.getText());
            }else{
                persona.setCalle(vistaEnvios.cajaCalle.getText());
                datoDireccion=true;
            }
            
            int aux = vistaEnvios.comboEstado.getSelectedIndex();
            if(aux==0){
                JOptionPane.showMessageDialog(null, "Por favor selecciona un estado", "Verificar", JOptionPane.WARNING_MESSAGE);
                this.vistaEnvios.comboEstado.requestFocus();
                persona.setEstado(vistaEnvios.comboEstado.getSelectedItem().toString());
            }else{
                persona.setEstado(vistaEnvios.comboEstado.getSelectedItem().toString());
                comboEstado=true;
            }
            //Paquete
            
            if("".equals(vistaEnvios.cajaID.getText())){
                JOptionPane.showMessageDialog(null, "Llene el campo ID del paquete");
                vistaEnvios.cajaID.requestFocus();
                paquete.setCodigo(vistaEnvios.cajaID.getText());
            }else{
                paquete.setCodigo(vistaEnvios.cajaID.getText());
                datoID=true;
            }
            if("".equals(vistaEnvios.cajaPeso.getText())){
                JOptionPane.showMessageDialog(null, "Llene el campo Peso del paquete");
                vistaEnvios.cajaPeso.requestFocus();
                paquete.setPeso(Double.parseDouble(vistaEnvios.cajaPeso.getText()));
            }else{
                paquete.setPeso(Double.parseDouble(vistaEnvios.cajaPeso.getText()));
                datoPeso=true;
            }
            paquete.setCantidadArticulos(vistaEnvios.comboArticulos.getSelectedItem().toString());
            paquete.setPrioridad(vistaEnvios.comboPrioridad.getSelectedItem().toString());
            int aux2 = vistaEnvios.comboPrioridad.getSelectedIndex();
            if(aux2==0){
                JOptionPane.showMessageDialog(null, "Por favor selecciona una Prioridad", "Verificar", JOptionPane.WARNING_MESSAGE);
                this.vistaEnvios.comboPrioridad.requestFocus();
                persona.setEstado(vistaEnvios.comboPrioridad.getSelectedItem().toString());
            }else{
                persona.setEstado(vistaEnvios.comboPrioridad.getSelectedItem().toString());
                comboPrioridad=true;
            }
            
            if(datoID==true && datoPeso ==true && datoCodigo==true && datoDireccion==true&& datoNombre==true && comboEstado== true && comboPrioridad==true){
                if (modelo.validarCodigo(paquete.getCodigo())) {
                    if (modelo.insertar(persona, paquete)) {
                        JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                        limpiarCajas();
                    } else {

                        JOptionPane.showMessageDialog(null, "Error al insertar registro");
                        limpiarCajas();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Codigo del paquete invalido (Codigo en uso).");

                }
            }

        }
        /*
        if(ae.getSource() == vistaConsulta.botonBuscar){
            //obtener
            paquete.setCodigo(vistaConsulta.cajaConsultaID.getText());
            if(modelo.buscar(persona, paquete)){
            }else{
                JOptionPane.showMessageDialog(null, "No existe registro");
            }    
        }
        */
        
    }

    public void limpiarCajas() {
        vistaEnvios.cajaCalle.setText(null);
        vistaEnvios.cajaCodigoPostal.setText(null);
        vistaEnvios.cajaID.setText(null);
        vistaEnvios.cajaPeso.setText(null);
        vistaEnvios.cajaNombreDestinatario.setText(null);
        vistaEnvios.comboArticulos.setSelectedIndex(0);
        vistaEnvios.comboEstado.setSelectedIndex(0);
        vistaEnvios.comboPrioridad.setSelectedIndex(0);
    }
    
    public void verificarCajas(){
       
            if ("".equals(vistaEnvios.cajaNombreDestinatario.getText())) {
                datoNombre = false;
                JOptionPane.showMessageDialog(null, "Llene el campo Destinatario");
                vistaEnvios.cajaNombreDestinatario.requestFocus();
            } else {
                datoNombre = true;

            }
            if ("".equals(vistaEnvios.cajaCodigoPostal.getText())) {
                datoCodigo = false;
                JOptionPane.showMessageDialog(null, "Llene el campo Codigo Postal");
                vistaEnvios.cajaCodigoPostal.requestFocus();
            } else {
                datoCodigo = true;

            }
            if ("".equals(vistaEnvios.cajaCalle.getText())) {
                datoDireccion = false;
                JOptionPane.showMessageDialog(null, "Llene el campo Calle y número");
                vistaEnvios.cajaCalle.requestFocus();
            } else {
                datoDireccion = true;

            }
    }
    
    
    

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public void agregarModeloTabla() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("N° Artículos");
        modeloTabla.addColumn("Peso en kg");
        modeloTabla.addColumn("Prioridad");
        modeloTabla.addColumn("Dirección");
    }
   

}
