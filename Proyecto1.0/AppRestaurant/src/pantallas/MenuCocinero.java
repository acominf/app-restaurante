/*
 * Mayra Lucero García Ramírez 
 * Victor Adrian Suaréz Ruiz
 */
package pantallas;

import apprestaurant.Empleado;
import apprestaurant.Pedido;
import apprestaurant.Platillo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class MenuCocinero extends javax.swing.JFrame {
    ArrayList<Pedido> pedidos;
    /**
     * Creates new form MenuCocinero
     * @param p
     */
    public MenuCocinero(ArrayList<Pedido> p) {
        initComponents();
        pedidos = p;
        DefaultListModel modelo;
        modelo = (DefaultListModel) (this.listaPedidos.getModel());
        for(int i=0; i<pedidos.size();i++)
        {
            modelo.add(i,"Pedido"+i+1);   
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

        labelCocina = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPlatillos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bListo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jNotas = new javax.swing.JTextArea();
        jCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNomPlatillo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCocina.setFont(new java.awt.Font("Sinhala Sangam MN", 3, 24)); // NOI18N
        labelCocina.setText("Cocina");
        getContentPane().add(labelCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 60));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1495758714_food-drink-01.png"))); // NOI18N
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 100));

        listaPlatillos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPlatillos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listaPlatillos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gorrochef.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 80));

        bListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        bListo.setText("Listo");
        bListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoActionPerformed(evt);
            }
        });
        getContentPane().add(bListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 310, 100));

        listaPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPedidos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listaPedidos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 210));

        jNotas.setColumns(20);
        jNotas.setRows(5);
        jScrollPane3.setViewportView(jNotas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 320, 50));

        jCantidad.setText("cantidad");
        jCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 80, 50));

        jLabel2.setText("Pedidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 20));

        jLabel3.setText("Platillos del pedido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel4.setText("Nombre del Platillo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jNomPlatillo.setText("Nombre de platillo");
        jNomPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomPlatilloActionPerformed(evt);
            }
        });
        getContentPane().add(jNomPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, 40));

        jLabel6.setText("Notas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        bVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        bVer.setText("Ver");
        bVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerActionPerformed(evt);
            }
        });
        getContentPane().add(bVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoActionPerformed
        if(!listaPedidos.isSelectionEmpty())
        {
            int a= listaPedidos.getSelectedIndex();
            DefaultListModel modelo0 = (DefaultListModel) listaPedidos.getModel();
            Pedido aux = pedidos.get(a); //el pedido actualmente seleccionado
            if(!listaPlatillos.isSelectionEmpty())
            {
                int i= listaPlatillos.getSelectedIndex();//el platillo seleccionado
                DefaultListModel modelo = (DefaultListModel) listaPlatillos.getModel(); 
                modelo.removeElementAt(i);//quita el platillo seleccionado de la lista
                aux.eliminarPlatillo(i);//elimina el platillo del arraylist
            }
        }
    }//GEN-LAST:event_bListoActionPerformed

    private void jCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadActionPerformed

    private void jNomPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomPlatilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomPlatilloActionPerformed

    private void bVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerActionPerformed
        if(!listaPedidos.isSelectionEmpty())
        {
            DefaultListModel modelo = (DefaultListModel) listaPlatillos.getModel();
            int i= listaPedidos.getSelectedIndex();
            Pedido p = pedidos.get(i);
            for(int j = 0; j< p.numPlatillos() ;j++ )
            {
                Platillo plat = p.regresaPlatillo(i);
                modelo.add(i, plat.accedeNombre());
            }
            listaPedidos.setSelectedIndex(0);
            Platillo plat = p.regresaPlatillo(0);
            jCantidad.setText(""+(p.regresaCantidad(0)));
            jNomPlatillo.setText(p.regresaPlatillo(0).accedeNombre());
            jNotas.setText(p.regresaNota(0));
        }
    }//GEN-LAST:event_bVerActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuCocinero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bListo;
    private javax.swing.JButton bVer;
    private javax.swing.JLabel img1;
    private javax.swing.JTextField jCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNomPlatillo;
    private javax.swing.JTextArea jNotas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCocina;
    private javax.swing.JList<String> listaPedidos;
    private javax.swing.JList<String> listaPlatillos;
    // End of variables declaration//GEN-END:variables
}
