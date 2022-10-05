package Diseno;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class FmrConversor extends javax.swing.JFrame {

    /**
     * Creates new form FmrConversor
     */
    public FmrConversor() {
        initComponents();
        
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        this.setLocationRelativeTo(null);  
        txtmoneda.setHorizontalAlignment(txtmoneda.CENTER);
        
          this.setResizable(false);
    }
    
    
    
    
    public void Conversor(){
        
          //Declaracion de monedas
        
                   Integer dolar= 4345 ;
                   Integer euro= 4412 ;
                   Integer LibrasEsterlinas= 5031;
                   double yenjapones= 30.77;
                   double Wonsulcoreano= 3.17;
                           
                   //ComboBox
                   String divisa;
                   divisa = cmbdivisa.getSelectedItem().toString();  
                   int cantidad;
                   
                   //Capturamos Excepciones
                   try {
            
             if (cmbdivisa.getSelectedItem().equals("Seleccionar Opcion")||(txtcantidad.getText().equals(""))){
                       
                  JOptionPane.showMessageDialog(this, "Debe Selecionar una opcion para convertir","Error",JOptionPane.ERROR_MESSAGE);
                  txtcantidad.requestFocus();
                  
                  txtmoneda.setText("Selecionar una opcion para convertir");
                  Infmoneda.setText("Selecionar una opcion para convertir");
                  txtresultado.setText("");
                  jLabel1.setText("");
                  
        
                   } 
                     
                 
             else if (txtcantidad.getText().equals("")){
                       
                   JOptionPane.showMessageDialog(this, "Ingresar Valor a Convertir","Error",JOptionPane.WARNING_MESSAGE);
                    txtcantidad.requestFocus();
                  
                    jLabel3.setVisible(true);
                    jLabel4.setVisible(true); 
                   
                   } 
                     
                     /// DOLAR A PESO COLOMBIANO
                     
             else if(cmbdivisa.getSelectedItem().equals("Dólar")){
                       
                       txtmoneda.setText("1 dólar ");
                       Infmoneda.setText("Es igual a " + dolar + " Pesos colombianos ");
                       
                       cantidad=Integer.parseInt(txtcantidad.getText());  
                       
                       int resultado = cantidad*dolar;
                       
                     
                       DecimalFormat df = new DecimalFormat("###,###.##");
 
       
                        txtresultado.setText(String.valueOf(resultado));
                       
                        if (txtresultado.getText().length() >= 1) {
 
                         txtresultado.setText( df.format(Integer.valueOf(txtresultado.getText().replace(".", "").replace(",", ""))) );
                         
                        }
                   
                   
                   }
                         ///EURO A PESO COLOMBIANO
              
             else if(cmbdivisa.getSelectedItem().equals("Euros")){
                       
                       txtmoneda.setText("1 Euro ");
                       Infmoneda.setText("Es igual a: " + euro + " Pesos Colombianos");
                       
                       cantidad=Integer.parseInt(txtcantidad.getText());  
                       
                       int resultado = cantidad*euro;
                       
                       DecimalFormat df = new DecimalFormat("#,###");
 
       
                       txtresultado.setText(String.valueOf(resultado));
                       
                       if (txtresultado.getText().length() >= 1) {
 
                         txtresultado.setText( df.format(Integer.valueOf(txtresultado.getText().replace(".", "").replace(",", ""))) );
                         
                        }
                   
                   
                   }
                     
                  //LIBRAESTERLINA A PESO COLOMBIANO
                     
             else if(cmbdivisa.getSelectedItem().equals("Libras Esterlinas")){
                       
                       
                      
                       txtmoneda.setText("1 Libra Esterlina ");
                       Infmoneda.setText("Es igual a: " + LibrasEsterlinas + " Pesos Colombianos");
                       
                       cantidad=Integer.parseInt(txtcantidad.getText());  
                       
                       int resultado = cantidad*LibrasEsterlinas;
                  
                       DecimalFormat df = new DecimalFormat("#,###");
 
                       txtresultado.setText(String.valueOf(resultado));
                       
             if (txtresultado.getText().length() >= 1) {
 
                         txtresultado.setText( df.format(Integer.valueOf(txtresultado.getText().replace(".", "").replace(",", ""))) );
                         
                        }
                   
                     
                  
                  
                      }
                     
             
             else if(cmbdivisa.getSelectedItem().equals("Yen Japonés")){
                       
                       
                      
                       txtmoneda.setText("1 Yen Japones ");
                       Infmoneda.setText("Es igual a: " + yenjapones + " Pesos Colombianos");
                       
                       cantidad=Integer.parseInt(txtcantidad.getText());  
                       
                       double resultado = cantidad*yenjapones;
                       
                   
                    
                      String str = Double.toString(resultado);
                      
                       txtresultado.setText(str);
                     
                  
                  
                      }
                     
             else if(cmbdivisa.getSelectedItem().equals("Won sul-coreano")){
                      
                       txtmoneda.setText("1 Won sul-coreano ");
                       Infmoneda.setText("Es igual a: " + Wonsulcoreano + " Pesos Colombianos");
                       
                       cantidad=Integer.parseInt(txtcantidad.getText());  
                       
                       double resultado = cantidad*Wonsulcoreano;
                       
                       System.out.println("El "+resultado);
                   
                       String str = Double.toString(resultado);
                      
                       txtresultado.setText(str);
                       
                       }

                    } catch (Exception e)
                     {JOptionPane.showMessageDialog(this, "Error al Realizar Calculo " + e);
        }
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtcantidad = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();
        Infmoneda = new javax.swing.JLabel();
        cmbdivisa = new javax.swing.JComboBox<>();
        txtmoneda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel6)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtcantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        txtresultado.setEditable(false);
        txtresultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtresultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Infmoneda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Infmoneda.setText("                                                                  ");

        cmbdivisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbdivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Opcion", "Dólar", "Euros", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano" }));
        cmbdivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbdivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbdivisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbdivisaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbdivisaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbdivisaMouseReleased(evt);
            }
        });
        cmbdivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdivisaActionPerformed(evt);
            }
        });

        txtmoneda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmoneda.setText("          ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pesos Colombianos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Equivalen a:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/point.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ErroIcon.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ingresar Cantidad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("By Andres Garcia ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("V.1.0 - 22/09/2022");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtresultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbdivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(txtmoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Infmoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Infmoneda)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbdivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbdivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdivisaActionPerformed
                            Conversor();
    }//GEN-LAST:event_cmbdivisaActionPerformed

    private void cmbdivisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdivisaMouseClicked
                
    }//GEN-LAST:event_cmbdivisaMouseClicked

    private void cmbdivisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdivisaMousePressed
         // TODO add your handling code here:
    }//GEN-LAST:event_cmbdivisaMousePressed

    private void cmbdivisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdivisaMouseReleased
                         // TODO add your handling code here:
    }//GEN-LAST:event_cmbdivisaMouseReleased

    private void cmbdivisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdivisaMouseEntered
    
                      // TODO add your handling code here:
    }//GEN-LAST:event_cmbdivisaMouseEntered

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
                  
            char validar=evt.getKeyChar();
        
            if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
 
            JOptionPane.showMessageDialog(this, "Solo Se aceptan Numeros", "Error ",JOptionPane.WARNING_MESSAGE);
            
            }
        
                    jLabel3.setVisible(false);
                    jLabel4.setVisible(false);                           // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
                Conversor();        
    }//GEN-LAST:event_txtcantidadKeyPressed

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
            java.util.logging.Logger.getLogger(FmrConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Infmoneda;
    private javax.swing.JComboBox<String> cmbdivisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JLabel txtmoneda;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
