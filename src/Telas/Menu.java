/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author nilce
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIdade1 = new javax.swing.JPanel();
        jcb1 = new javax.swing.JCheckBox();
        jcb2 = new javax.swing.JCheckBox();
        codigo = new javax.swing.JLabel();
        jrbF = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        sexo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        quantidade = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        jrbM = new javax.swing.JRadioButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        paulo = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jpIdade1.setBackground(new java.awt.Color(255, 255, 255));
        jpIdade1.setBorder(new javax.swing.border.MatteBorder(null));

        jcb1.setBackground(new java.awt.Color(255, 255, 255));
        jcb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb1.setForeground(new java.awt.Color(0, 102, 51));
        jcb1.setText("jCheckBox1");
        jcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb1ActionPerformed(evt);
            }
        });

        jcb2.setBackground(new java.awt.Color(255, 255, 255));
        jcb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb2.setForeground(new java.awt.Color(0, 102, 51));
        jcb2.setText("jCheckBox2");

        javax.swing.GroupLayout jpIdade1Layout = new javax.swing.GroupLayout(jpIdade1);
        jpIdade1.setLayout(jpIdade1Layout);
        jpIdade1Layout.setHorizontalGroup(
            jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdade1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jcb1)
                .addGap(47, 47, 47)
                .addComponent(jcb2)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jpIdade1Layout.setVerticalGroup(
            jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdade1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIdade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb1)
                    .addComponent(jcb2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 102, 51));
        codigo.setText("Codigo:");

        jrbF.setBackground(new java.awt.Color(255, 255, 255));
        jrbF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbF.setForeground(new java.awt.Color(0, 102, 51));
        jrbF.setText("F");
        jrbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(153, 153, 153));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 102, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        sexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 102, 51));
        sexo.setText("Sexo:");

        btnNovo.setBackground(new java.awt.Color(153, 153, 153));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 102, 51));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        quantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quantidade.setForeground(new java.awt.Color(0, 102, 51));
        quantidade.setText("Quantidade");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Cadastro de Bovinos");

        txtQuantidade.setToolTipText("");
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Data de registro:");

        idade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idade.setForeground(new java.awt.Color(0, 102, 51));
        idade.setText("Classificacao da Idade");

        jrbM.setBackground(new java.awt.Color(255, 255, 255));
        jrbM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbM.setForeground(new java.awt.Color(0, 102, 51));
        jrbM.setText("M");
        jrbM.setToolTipText("");
        jrbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMActionPerformed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(0, 255, 204));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane4.setBackground(new java.awt.Color(51, 255, 204));
        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDesktopPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("USE O MENU");

        paulo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pauloLayout = new javax.swing.GroupLayout(paulo);
        paulo.setLayout(pauloLayout);
        pauloLayout.setHorizontalGroup(
            pauloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(pauloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pauloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pauloLayout.setVerticalGroup(
            pauloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(pauloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pauloLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(paulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        jMenu1.setText("Menu");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Gerar Relatorio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void jcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb1ActionPerformed

    private void jrbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFActionPerformed

    private void jrbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbMActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaCadastro cad = new TelaCadastro();
        cad.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaConsultar con = new TelaConsultar();
        con.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaListar list = new TelaListar();
        list.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Connection conn = ConnectionFactory.conecta();

        String src = "C:\\Users\\nilce\\JaspersoftWorkspace\\MyReports\\Games4.jasper";

        JasperPrint jaspertPrint = null;

        try {

            jaspertPrint = JasperFillManager.fillReport(src, null, conn);

        } catch (JRException ex) {
            System.out.println("Erro: "+ex);
        }

        JasperViewer view = new JasperViewer(jaspertPrint,false);

        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel idade;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox jcb1;
    private javax.swing.JCheckBox jcb2;
    private javax.swing.JPanel jpIdade1;
    private javax.swing.JRadioButton jrbF;
    private javax.swing.JRadioButton jrbM;
    private javax.swing.JDesktopPane paulo;
    private javax.swing.JLabel quantidade;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
