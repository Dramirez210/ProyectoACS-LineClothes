
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class VistaConsulta extends javax.swing.JFrame {
    
    

    public VistaConsulta() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("LineClothes - Consultas");
        //cajaID2.setVisible(false);
    }
    
    
 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        etiquetaImagen = new javax.swing.JLabel();
        etiquetaConsultaID = new javax.swing.JLabel();
        cajaConsultaID = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        botonMenuEnvios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        consulta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        botonMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(510, 670));

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID paquete", "Peso", "Prioridad", "N° Articulos", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaConsultas);

        etiquetaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lineClothes.jpg"))); // NOI18N

        etiquetaConsultaID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaConsultaID.setText("ID del paquete");

        cajaConsultaID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Search");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        barraMenu.setText("Menú");
        barraMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonMenuEnvios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonMenuEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/envios.jpg"))); // NOI18N
        botonMenuEnvios.setText("Envios");
        botonMenuEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuEnviosActionPerformed(evt);
            }
        });
        barraMenu.add(botonMenuEnvios);
        barraMenu.add(jSeparator1);

        consulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.jpg"))); // NOI18N
        consulta.setText("Consultas");
        barraMenu.add(consulta);
        barraMenu.add(jSeparator2);

        botonMenuSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        botonMenuSalir.setText("Salir");
        botonMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuSalirActionPerformed(evt);
            }
        });
        barraMenu.add(botonMenuSalir);

        jMenuBar1.add(barraMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(etiquetaImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etiquetaConsultaID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajaConsultaID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaConsultaID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaConsultaID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuEnviosActionPerformed
      
    }//GEN-LAST:event_botonMenuEnviosActionPerformed

    private void botonMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuSalirActionPerformed
        
    }//GEN-LAST:event_botonMenuSalirActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaConsultas.setModel(modeloTabla);
        String campo = cajaConsultaID.getText();
        String where = "";
        boolean bandera=false;
        
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        if(!"".equals(campo)){//no esta vacio
            where = "where codigo='"+campo+"'";        
        }
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
          
            ps = conexion.prepareStatement("select p.codigo, p.peso, p.prioridad, p.cantidadArticulos, c.calle from paquetes as p inner join personas as c on p.idPersona = c.idPersona "+where);
            rs = ps.executeQuery();
            
            modeloTabla.addColumn("ID paquete");
            modeloTabla.addColumn("Peso");
            modeloTabla.addColumn("Prioridad");
            modeloTabla.addColumn("N° Articulos");
            modeloTabla.addColumn("Dirección");
            
            int anchos[]={80,80,80,80,200};
            for (int i = 0; i < 5; i++) {
                tablaConsultas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                
            }
            while(rs.next()){
                bandera = true;
                Object fila[] = new Object[5];//arreglo de filas para cualquier dato
                for(int i=0; i<5; i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            if(bandera==false){
                JOptionPane.showMessageDialog(null, "No existe el codigo");
            
            }
            
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu barraMenu;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JMenuItem botonMenuEnvios;
    public javax.swing.JMenuItem botonMenuSalir;
    public javax.swing.JTextField cajaConsultaID;
    public javax.swing.JMenuItem consulta;
    private javax.swing.JLabel etiquetaConsultaID;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}
