package livraria.testejava.main;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import livraria.testejava.view.Acervo;
import livraria.testejava.view.Cadastro;

/**
 *
 * @author Paulo S
 */
public class Livraria extends javax.swing.JFrame {

     // Variables declaration
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcervo;
    private javax.swing.JMenuItem jMenuItemCadastrarLivro;
    // End of variables declaration
    
    /**
     * Creates new form Livraria
     */
    public Livraria() {
        initComponents();
    }
                   
    private void initComponents() {

        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItemCadastrarLivro = new JMenuItem();
        jMenuItemAcervo = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/livros1.png"))); // NOI18N
        jLabel1.setText("Livraria Java test");

        jMenu1.setText("Opções");

        jMenuItemCadastrarLivro.setText("Cadastrar Livro");
        jMenuItemCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarLivroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastrarLivro);

        jMenuItemAcervo.setText("Acervo");
        jMenuItemAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcervoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAcervo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItemCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        Cadastro frame = new Cadastro();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                                       

    private void jMenuItemAcervoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Acervo acervo = new Acervo();
        acervo.setLocationRelativeTo(null);
        acervo.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(Livraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Livraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Livraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Livraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Livraria livraria = new Livraria();
                livraria.setLocationRelativeTo(null);
                livraria.getContentPane().setBackground(new Color(255,255,255));
                //livraria.jPanel1.setBackground(new Color(190,200,215));
                livraria.setVisible(true);
            }
        });
    }
}
