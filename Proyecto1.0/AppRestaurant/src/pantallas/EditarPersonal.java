/*
 * Mayra Lucero García Ramírez 
 * Victor Adrian Suaréz Ruiz
 */
package pantallas;

import apprestaurant.Cocinero;
import apprestaurant.Empleado;
import apprestaurant.Mesero;
import apprestaurant.Usuario;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;


public class EditarPersonal extends javax.swing.JFrame {
    private ArrayList<Empleado> empleados;
    private String nomRes;
    private boolean modificacion;
    private int verIndice;
    /**
     * Creates new form EditarEmpleados
     */
    public EditarPersonal(ArrayList<Empleado> empleados, String nomRes) {
        initComponents();
        this.empleados =empleados;
        DefaultListModel modelo = new DefaultListModel();
        modelo = (DefaultListModel) (this.jListEmpleados.getModel());
        for(int i = 0; i<modelo.getSize(); i++)
        {
            modelo.add(i, ((Empleado)empleados.get(i)).accedeNombre());
        }
        this.nomRes=nomRes;
        lcorreo.setVisible(false);
        lnombre.setVisible(false);
        lHorario.setVisible(false);
        lTipp.setVisible(false);
        lA.setVisible(false);
        bAceptar.setVisible(false);
        box.setVisible(false);
        horini.setVisible(false);
        horFin.setVisible(false);
        nombre.setVisible(false);
        correo.setVisible(false);
        modificacion = false;
        verIndice = -1;
        incorrecto.setVisible(false);
        contraseña.setVisible(false);
        confirmarContra.setVisible(false);
        
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEmpleados = new javax.swing.JList<>();
        bMas = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        lnombre = new javax.swing.JLabel();
        lcorreo = new javax.swing.JLabel();
        lHorario = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        horini = new javax.swing.JTextField();
        lA = new javax.swing.JLabel();
        horFin = new javax.swing.JTextField();
        lTipp = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        bAceptar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        bVer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        confirmarContra = new javax.swing.JPasswordField();
        incorrecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Hebrew Scholar", 3, 24)); // NOI18N
        jLabel1.setText("Personal");

        jListEmpleados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListEmpleados.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jListEmpleados);

        bMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus20.png"))); // NOI18N
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        bMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        lnombre.setBackground(new java.awt.Color(107, 107, 203));
        lnombre.setText("Nombre: ");

        lcorreo.setText("Correo:");

        lHorario.setText("Horario:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        horini.setText("inicio");

        lA.setText("a");

        horFin.setText("fin");

        lTipp.setText("Tipo de Usuario: ");

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocinero", "Mesero" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        bAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        bVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        bVer.setText("Ver");
        bVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña: ");

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        jLabel3.setText("confirmar: ");

        confirmarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarContraActionPerformed(evt);
            }
        });

        incorrecto.setForeground(new java.awt.Color(204, 0, 0));
        incorrecto.setText("Correo electrónico o contraseña incorrectos.");
        incorrecto.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRegresar)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVer)
                        .addGap(45, 45, 45)
                        .addComponent(bMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMenos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTipp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lnombre)
                                        .addGap(2, 2, 2)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lcorreo)
                                        .addGap(14, 14, 14)
                                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(horini, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(horFin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addComponent(bAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(incorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lnombre))
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lcorreo)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lA))))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTipp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incorrecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMenos)
                            .addComponent(bMas)
                            .addComponent(bAceptar)))
                    .addComponent(bVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bRegresar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        
        nombre.setText("");
        correo.setText("");
        horini.setText("Inicio");
        horFin.setText("Fin");
        lcorreo.setVisible(true);
        lnombre.setVisible(true);
        lHorario.setVisible(true);
        lTipp.setVisible(true);
        lA.setVisible(true);
        bAceptar.setVisible(true);
        box.setVisible(true);
        horini.setVisible(true);
        horFin.setVisible(true);
        nombre.setVisible(true);
        correo.setVisible(true);
        modificacion = true;
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        contraseña.setVisible(true);
        confirmarContra.setVisible(true);
    }//GEN-LAST:event_bMasActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        if(!jListEmpleados.isSelectionEmpty())
        {
            int i= jListEmpleados.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jListEmpleados.getModel();
            modelo.removeElementAt(i);
            empleados.remove(i);
        }
        modificacion = true;
        
    }//GEN-LAST:event_bMenosActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        String h1,h2,nom,corr, cont, confi;
        DefaultListModel modelo = (DefaultListModel) jListEmpleados.getModel();
        h1=horini.getText();
        h2=horFin.getText();
        nom=nombre.getText();
        corr = this.correo.getText();
        String s = (String )box.getSelectedItem();
        cont = new String(contraseña.getPassword());
        confi = new String(confirmarContra.getPassword());
        Empleado nuevo;
        if(cont == confi  &&  ""!=nom && ""!=corr &&  cont != "" && confi  != "" )
        {
            if(s.equals("Cocinero"))
            {

                nuevo = new Cocinero(nom,corr,h1,h2, cont);
            }
            else
            {
                nuevo = new Mesero(nom,corr,h1,h2, cont);
            }
            
            if(verIndice == -1)
            {
                empleados.add(nuevo);        
                modelo.addElement(nuevo.accedeNombre());
            }
            else
            {
                empleados.add(verIndice, nuevo);       
                empleados.remove(verIndice+1);
                modelo.add(verIndice, nuevo.accedeNombre());
                modelo.remove(verIndice+1);
                verIndice = -1;
            }
        }
        else
        {
            incorrecto.setVisible(true);
        }
        
            
        jListEmpleados.setModel(modelo);
        lcorreo.setVisible(false);
        lnombre.setVisible(false);
        lHorario.setVisible(false);
        lTipp.setVisible(false);
        lA.setVisible(false);
        bAceptar.setVisible(false);
        box.setVisible(false);
        horini.setVisible(false);
        horFin.setVisible(false);
        nombre.setVisible(false);
        correo.setVisible(false);
        contraseña.setVisible(false);
        confirmarContra.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);

    }//GEN-LAST:event_bAceptarActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void bVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerActionPerformed
        if(!jListEmpleados.isSelectionEmpty())
        {
            int i= jListEmpleados.getSelectedIndex();
            Empleado emp = empleados.get(i);
            
            horini.setText(emp.accedeH1());
            horFin.setText(emp.accedeH2());
            nombre.setText(emp.accedeNombre());
            correo.setText(emp.accedeCorreo());
                    
            lcorreo.setVisible(true);
            lnombre.setVisible(true);
            lHorario.setVisible(true);
            lTipp.setVisible(true);
            lA.setVisible(true);
            bAceptar.setVisible(true);
            box.setVisible(true);
            horini.setVisible(true);
            horFin.setVisible(true);
            nombre.setVisible(true);
            correo.setVisible(true);
            verIndice = i;
        }
    }//GEN-LAST:event_bVerActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
       
        FileWriter fichero = null;
        BufferedWriter out = null;   
        
        if(modificacion)
        {
            try {
                fichero = new FileWriter(nomRes+"Empleados.txt"); //escribir el archivo del restaurante
                out=new BufferedWriter(fichero);
                for(int i = 0; i<empleados.size();i++)
                {
                    Empleado emp = empleados.get(i);
                    out.write(emp.accedeNombre()+"\n");
                    out.write(emp.accedeCorreo()+"\n");
                    out.write(emp.accedeH1()+"\n");
                    out.write(emp.accedeH2()+"\n");
                }
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Frame[] frames = Frame.getFrames();
        for(int i=0;i<frames.length;i++)
        {
            if(frames[i].getName().equals("menuRes"))
            {
                this.setVisible(false);
                frames[i].setVisible(true);
            }
        }
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void confirmarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarContraActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditarPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bVer;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JPasswordField confirmarContra;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField horFin;
    private javax.swing.JTextField horini;
    private javax.swing.JLabel incorrecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lA;
    private javax.swing.JLabel lHorario;
    private javax.swing.JLabel lTipp;
    private javax.swing.JLabel lcorreo;
    private javax.swing.JLabel lnombre;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}