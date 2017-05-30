/*
 * Mayra Lucero García Ramírez 
 * Victor Adrian Suaréz Ruiz
 */
package pantallas;

import apprestaurant.Menu;
import apprestaurant.Platillo;
import apprestaurant.Usuario;
import apprestaurant.Utilidad;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class EditarMenu extends javax.swing.JFrame {
    private Menu menu;
    private boolean modif;
    private int verIndice;
    private String nomRes;
    /**
     * Creates new form EditarMenu
     */
    public EditarMenu(Menu m, String nom) {
        initComponents();
        menu = m;
        nomRes=nom;
        lCosto.setVisible(false);
        lDescrip.setVisible(false);
        lTipo.setVisible(false);
        lnombre.setVisible(false);
        nombre.setVisible(false);
        tipo.setVisible(false);
        jScrollPane2.setVisible(false);
        costo.setVisible(false);
        bAceptar.setVisible(false);
        modif = false;
        verIndice = -1;
        DefaultListModel modelo = (DefaultListModel) Lista.getModel();
        for(int i=0; i < menu.regresaPlatillos().size() ;i++)
        {
            modelo.add(i, menu.regresaPlatillo(i).accedeNombre());
        }
        Lista.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        bMas = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        bVer = new javax.swing.JButton();
        lnombre = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        lCosto = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        lDescrip = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descrip = new javax.swing.JTextArea();
        img2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlMenu.setFont(new java.awt.Font("Optima", 3, 24)); // NOI18N
        jlMenu.setText("Menú");

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(Lista);

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

        bVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        bVer.setText("Ver");
        bVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerActionPerformed(evt);
            }
        });

        lnombre.setBackground(new java.awt.Color(107, 107, 203));
        lnombre.setText("Nombre: ");

        lTipo.setText("Tipo:");

        lCosto.setText("Costo:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        lDescrip.setText("Descripción");

        bAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        Descrip.setColumns(20);
        Descrip.setRows(5);
        Descrip.setBounds(new java.awt.Rectangle(0, 0, 180, 80));
        jScrollPane2.setViewportView(Descrip);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/platillo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jlMenu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAceptar)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lnombre)
                                                .addGap(2, 2, 2)
                                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lTipo))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(lDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bVer)
                                .addGap(45, 45, 45)
                                .addComponent(bMas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bMenos)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bMenos)
                                .addComponent(bMas))
                            .addComponent(bVer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lnombre))
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTipo)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDescrip)
                            .addComponent(jScrollPane2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAceptar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        lCosto.setVisible(true);
        lDescrip.setVisible(true);
        lTipo.setVisible(true);
        lnombre.setVisible(true);
        nombre.setText("");
        tipo.setText("");
        Descrip.setText("");
        costo.setText("");
        nombre.setVisible(true);
        tipo.setVisible(true);
        jScrollPane2.setVisible(true);
        costo.setVisible(true);
        bAceptar.setVisible(true);
        modif = true;
        
    }//GEN-LAST:event_bMasActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        if(!Lista.isSelectionEmpty())
        {
            int i= Lista.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) Lista.getModel();
            modelo.removeElementAt(i);
            menu.eliminarPlatillo(i);
        }
        modif = true;

    }//GEN-LAST:event_bMenosActionPerformed

    private void bVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerActionPerformed
        if(!Lista.isSelectionEmpty())
        {
            int i= Lista.getSelectedIndex();
            Platillo pl= menu.regresaPlatillo(i);

            costo.setText(""+pl.costo());
            nombre.setText(pl.accedeNombre());
            tipo.setText(pl.accedeTipo());
            Descrip.setText(pl.accedeDescrip());

            lCosto.setVisible(true);
            lDescrip.setVisible(true);
            lTipo.setVisible(true);
            lnombre.setVisible(true);
            nombre.setVisible(true);
            tipo.setVisible(true);
            jScrollPane2.setVisible(true);
            costo.setVisible(true);
            bAceptar.setVisible(true);
            
            verIndice = i;
        }
    }//GEN-LAST:event_bVerActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        String nom, t, d, cost = "0.0";
        float c;
        DefaultListModel modelo = (DefaultListModel) Lista.getModel();
        nom=nombre.getText();
        t=tipo.getText();
        cost = costo.getText();
        c= Float.parseFloat(cost);
        d=Descrip.getText();
        
        Platillo p = new Platillo(nom,t,c,d);
        if(verIndice == -1)
        {
            menu.agregarPlatillo(p);        
            modelo.addElement(nom);
        }
        else
        {
            menu.agregarPlatillo(verIndice, p);       
            menu.eliminarPlatillo(verIndice+1);
            modelo.add(verIndice, nom);
            modelo.remove(verIndice+1);
            verIndice = -1;
        }
        Lista.setModel(modelo);
        
        lCosto.setVisible(false);
        lDescrip.setVisible(false);
        lTipo.setVisible(false);
        lnombre.setVisible(false);
        nombre.setVisible(false);
        tipo.setVisible(false);
        jScrollPane2.setVisible(false);
        costo.setVisible(false);
        bAceptar.setVisible(false);
        modif = true;
    }//GEN-LAST:event_bAceptarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        /*FileWriter fichero = null;
        BufferedWriter out = null;   
        
        if(modif)
        {
            try {
                fichero = new FileWriter("Menu"+nomRes+".txt"); //escribir el archivo del restaurante
                out=new BufferedWriter(fichero);
                ArrayList<Platillo> m =menu.regresaPlatillos();
                for(int i = 0; i<m.size();i++)
                {
                    Platillo p= m.get(i);
                    out.write(p.accedeNombre()+"\n");
                    out.write(p.accedeTipo()+"\n");
                    out.write(p.costo()+"\n");
                    out.write(p.accedeDescrip()+"\n");
                }
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
        ArrayList<Usuario> usuarios = apprestaurant.AppRestaurant.usuarios;
        Utilidad.guardarUsuarios(usuarios);
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
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descrip;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bVer;
    private javax.swing.JTextField costo;
    private javax.swing.JLabel img2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlMenu;
    private javax.swing.JLabel lCosto;
    private javax.swing.JLabel lDescrip;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lnombre;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
