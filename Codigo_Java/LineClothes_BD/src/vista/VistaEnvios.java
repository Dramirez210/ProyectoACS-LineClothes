
package vista;

import javax.swing.JOptionPane;


public class VistaEnvios extends javax.swing.JFrame {

    
    public VistaEnvios() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("LineClothes - Envios");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagen = new javax.swing.JLabel();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaID = new javax.swing.JLabel();
        cajaID = new javax.swing.JTextField();
        etiquetaPrioridad = new javax.swing.JLabel();
        comboPrioridad = new javax.swing.JComboBox<>();
        etiquetaPeso = new javax.swing.JLabel();
        cajaPeso = new javax.swing.JTextField();
        etiquetaNPaquetes = new javax.swing.JLabel();
        comboArticulos = new javax.swing.JComboBox<>();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaCalle = new javax.swing.JLabel();
        cajaCalle = new javax.swing.JTextField();
        etiquetaCodigoPostal = new javax.swing.JLabel();
        cajaCodigoPostal = new javax.swing.JTextField();
        etiquetaNombreDestinatario = new javax.swing.JLabel();
        cajaNombreDestinatario = new javax.swing.JTextField();
        comboEstado = new javax.swing.JComboBox<>();
        etiquetaEstado = new javax.swing.JLabel();
        botonEnviar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        envios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        botonMenuConsulta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        botonMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(510, 670));

        etiquetaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lineClothes.jpg"))); // NOI18N

        etiquetaDatos.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etiquetaDatos.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaDatos.setText("Datos Paquete:");

        etiquetaID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaID.setText("ID del paquete:");

        cajaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaIDKeyTyped(evt);
            }
        });

        etiquetaPrioridad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPrioridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPrioridad.setText("Prioridad");

        comboPrioridad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona", "Normal", "Express ($100 pesos extra)", " " }));
        comboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrioridadActionPerformed(evt);
            }
        });

        etiquetaPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPeso.setText("Peso en kg:");
        etiquetaPeso.setMaximumSize(new java.awt.Dimension(92, 17));
        etiquetaPeso.setMinimumSize(new java.awt.Dimension(92, 17));

        cajaPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaPeso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPesoKeyTyped(evt);
            }
        });

        etiquetaNPaquetes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNPaquetes.setText("N° Articulos");

        comboArticulos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        comboArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArticulosActionPerformed(evt);
            }
        });

        etiquetaDireccion.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        etiquetaDireccion.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaDireccion.setText("Dirección:");

        etiquetaCalle.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        etiquetaCalle.setText("Calle y Número");

        cajaCalle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaCodigoPostal.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        etiquetaCodigoPostal.setText("Código Postal:");

        cajaCodigoPostal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCodigoPostalKeyTyped(evt);
            }
        });

        etiquetaNombreDestinatario.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        etiquetaNombreDestinatario.setText("Nombre y apellido del destinatario");

        cajaNombreDestinatario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        comboEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona", "CDMX ($50 pesos extra)", "Estado de México  ($50 pesos extra)", "Jalisco  ($100 pesos extra)", "Nuevo León ($100 pesos extra)", "Chiapas ($100 pesos extra)", "Michoacán ($100 pesos extra)", "Baja California ($100 pesos extra)", "Yucatan ($100 pesos extra)", "Sonora ($100 pesos extra)", "Sinaloa ($100 pesos extra)", "Puebla ($100 pesos extra)", "Oaxaca ($100 pesos extra)", "Veracruz ($100 pesos extra)", "Queretaro ($100 pesos extra)" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        etiquetaEstado.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        etiquetaEstado.setText("Estado");

        botonEnviar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEnviar.setText("Enviar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cajaNombreDestinatario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(cajaCalle, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaCodigoPostal))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaEstado)
                                .addGap(18, 18, 18)
                                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEnviar)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cajaCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(etiquetaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCalle)
                    .addComponent(etiquetaNombreDestinatario)
                    .addComponent(etiquetaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(cajaID))
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaNPaquetes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboArticulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNombreDestinatario)
                .addGap(13, 13, 13)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombreDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigoPostal)
                    .addComponent(cajaCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaCalle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstado)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        barraMenu.setText("Menú");
        barraMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        envios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/envios.jpg"))); // NOI18N
        envios.setText("Envios");
        barraMenu.add(envios);
        barraMenu.add(jSeparator1);

        botonMenuConsulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonMenuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.jpg"))); // NOI18N
        botonMenuConsulta.setText("Consulta");
        botonMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuConsultaActionPerformed(evt);
            }
        });
        barraMenu.add(botonMenuConsulta);
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

        menu.add(barraMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIDKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Números");
        }
    }//GEN-LAST:event_cajaIDKeyTyped

    private void comboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrioridadActionPerformed
        /*
        if("Selecciona"==comboPrioridad.getItemAt(0)){
            JOptionPane.showMessageDialog(null, "Por favor selecciona una prioridad");
            
        }
       
        
        int Jcbtdi = comboPrioridad.getSelectedIndex();

        if (Jcbtdi==0) {

            JOptionPane.showMessageDialog(null, "Por favor selecciona una prioridad", "Verificar", JOptionPane.WARNING_MESSAGE);
            this.comboPrioridad.requestFocus();
        }
        
         */
    }//GEN-LAST:event_comboPrioridadActionPerformed

    private void cajaPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPesoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Números");
        }
    }//GEN-LAST:event_cajaPesoKeyTyped

    private void comboArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArticulosActionPerformed

    }//GEN-LAST:event_comboArticulosActionPerformed

    private void cajaCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCodigoPostalKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Números");
        }
    }//GEN-LAST:event_cajaCodigoPostalKeyTyped

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
       
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void botonMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuConsultaActionPerformed
        
    }//GEN-LAST:event_botonMenuConsultaActionPerformed

    private void botonMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuSalirActionPerformed
      
    }//GEN-LAST:event_botonMenuSalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEnvios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu barraMenu;
    public javax.swing.JButton botonEnviar;
    public javax.swing.JMenuItem botonMenuConsulta;
    public javax.swing.JMenuItem botonMenuSalir;
    public javax.swing.JTextField cajaCalle;
    public javax.swing.JTextField cajaCodigoPostal;
    public javax.swing.JTextField cajaID;
    public javax.swing.JTextField cajaNombreDestinatario;
    public javax.swing.JTextField cajaPeso;
    public javax.swing.JComboBox<String> comboArticulos;
    public javax.swing.JComboBox<String> comboEstado;
    public javax.swing.JComboBox<String> comboPrioridad;
    public javax.swing.JMenuItem envios;
    private javax.swing.JLabel etiquetaCalle;
    private javax.swing.JLabel etiquetaCodigoPostal;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEstado;
    private javax.swing.JLabel etiquetaID;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaNPaquetes;
    private javax.swing.JLabel etiquetaNombreDestinatario;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPrioridad;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menu;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
