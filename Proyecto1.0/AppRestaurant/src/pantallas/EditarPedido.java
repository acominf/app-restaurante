/*
 * Mayra Lucero García Ramírez 
 * Victor Adrian Suaréz Ruiz
 */
package pantallas;

import apprestaurant.Menu;
import apprestaurant.Pedido;
import apprestaurant.Platillo;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class EditarPedido extends javax.swing.JFrame {
    private Pedido pedido;
    private Menu menu;
    private boolean modif;
    private String nombreRestaurante;
    /**
     * Crea una nueva ventana EditarPedido
     */
    public EditarPedido(Pedido p,String nomRes)
    {
        initComponents();
        menu = new Menu();
        String n=" ",t=" ",d=" ", aux=" ";
        float c=25;
        if(p!=null)
        {
            pedido=p;
        }
        else
        {
            pedido = new Pedido();
        }
        
        modif = false;
        nombreRestaurante=nomRes;
        //Platillo plat=new Platillo("Papas","frito",25,"genious");
        //menu.agregarPlatillo(plat);
        DefaultListModel modelo = (DefaultListModel)ListaMenu.getModel();
        FileReader f;
        BufferedReader b;
        try {
                f = new FileReader("Menu"+nomRes+".txt"); //LEER ARCHIVO DEL MENU
                b=new BufferedReader(f);
                d=" ";
                while( n!=null || t!=null||d !=null || aux!=null)
                {
                    n=b.readLine();
                    modelo.addElement(n);
                    t=b.readLine();
                    aux=b.readLine();
                    System.out.print(aux);
                    //c=parseFloat(aux);
                    d=b.readLine();
                    Platillo plat= new Platillo(n,t,c,d);
                    menu.agregarPlatillo(plat);
                }
                b.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NuevoRestaurante.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMenu = new javax.swing.JList<>();
        bMas = new javax.swing.JButton();
        jlMenu = new javax.swing.JLabel();
        bMenos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descrip = new javax.swing.JTextArea();
        lNotar = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numAgregar = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPedido = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCantidadP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaMenu.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(ListaMenu);

        bMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus20.png"))); // NOI18N
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        jlMenu.setFont(new java.awt.Font("Optima", 3, 24)); // NOI18N
        jlMenu.setText("Pedido");

        bMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus.png"))); // NOI18N
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        Descrip.setColumns(20);
        Descrip.setRows(5);
        Descrip.setBounds(new java.awt.Rectangle(0, 0, 180, 80));
        jScrollPane2.setViewportView(Descrip);

        lNotar.setText("Notas:");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu");

        jLabel2.setText("Número");

        listaPedido.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPedido.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listaPedido);

        jLabel3.setText("Pedido");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubiertos.png"))); // NOI18N

        jLabel5.setText("Cantidad");

        jCantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCantidadPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNotar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bMas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(bMenos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(numAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCantidadP)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(142, 142, 142))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jlMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bMas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bMenos)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNotar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        String d = " ";
        if(!ListaMenu.isSelectionEmpty())
        {
            int i= ListaMenu.getSelectedIndex();
            Platillo platillo = menu.regresaPlatillo(i);
            System.out.print(platillo.accedeNombre());
            d = Descrip.getText();
            int c = (int) numAgregar.getValue();
            if(c!=0)
            {
                pedido.agregarPlatillo(platillo,d,c);
                DefaultListModel modeloPedido = (DefaultListModel) listaPedido.getModel();
                modeloPedido.addElement(platillo.accedeNombre());
            }
                
        }
        modif = true;
    }//GEN-LAST:event_bMasActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        if(!listaPedido.isSelectionEmpty())
        {
            int i= listaPedido.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) listaPedido.getModel();
            jCantidadP.setText(""+pedido.regresaCantidad(i));
            modelo.removeElementAt(i);
            pedido.eliminarPlatillo(i);
        }
        modif = true;
    }//GEN-LAST:event_bMenosActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        
        Frame[] frames = Frame.getFrames();
        for(int i=0;i<frames.length;i++)
        {
            if(frames[i].getName().equals("DiagramaMesas"))
            {
                this.setVisible(false);
                frames[i].setVisible(true);
            }
        }
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void jCantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCantidadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadPActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descrip;
    private javax.swing.JList<String> ListaMenu;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JTextField jCantidadP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlMenu;
    private javax.swing.JLabel lNotar;
    private javax.swing.JList<String> listaPedido;
    private javax.swing.JSpinner numAgregar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
