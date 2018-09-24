package livraria.testejava.view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import livraria.testejava.controller.LivrariaController;
import livraria.testejava.model.Livro;

/**
 * Classe da Interface Gráfica para listagem de livros
 * @author Paulo S
 * @version 1.0
 */
public class Acervo extends JFrame {

     // Variables declaration
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivrosList;
    private List<Livro> listaLivro =  new LivrariaController().listarLivros();
    // End of variables declaration
    
    /**
     * Creates new form Livraria
     */
    public Acervo() {
        initComponents();
    }
                         
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(190,200,215));
        jLabelCadastro = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTableLivrosList = new JTable();
        btnExcluir = new JButton();
        btnAlterar = new JButton();
        btnNovo = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 346));

        jLabelCadastro.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/livros1.png"))); // NOI18N
        jLabelCadastro.setText("Acervo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastro)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastro))
        );
        
        jTableLivrosList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [18][3],
            new String [] {
                "Id", "Nome", "Autor"
            }
        ));
        updateTable();
        /*
        for(int i = 0; i < (listaLivro.size()); i++) {
            jTableLivrosList.setValueAt(listaLivro.get(i).getId(), i, 0);
            jTableLivrosList.setValueAt(listaLivro.get(i).getNome(), i, 1);
            jTableLivrosList.setValueAt(listaLivro.get(i).getAutor(), i, 2);
        }*/
        jTableLivrosList.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableLivrosList.getColumnModel().getColumn(1).setPreferredWidth(500); 
        jTableLivrosList.getColumnModel().getColumn(2).setPreferredWidth(500);
        
        jTableLivrosList.setPreferredSize(new java.awt.Dimension(75, 302));
        jScrollPane1.setViewportView(jTableLivrosList);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        if(jTableLivrosList.getSelectedRow() >= 0) {
            try {
                LivrariaController lc = new LivrariaController();
                lc.excluirLivro(listaLivro.get(jTableLivrosList.getSelectedRow()).getId());
                JOptionPane.showMessageDialog(this, "Livro " + listaLivro.get(jTableLivrosList.getSelectedRow()).getNome() +
                        " excluído com sucesso!");
                
                listaLivro = new LivrariaController().listarLivros();
                updateTable();
            } 
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir o livro.\n" + e.getLocalizedMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela!");
    }                                          

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        if(jTableLivrosList.getSelectedRow() >= 0) {
            
            EditarLivro frame = new EditarLivro((Livro) listaLivro.get(jTableLivrosList.getSelectedRow()));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            this.dispose();
            listaLivro = new LivrariaController().listarLivros();
            updateTable();
        }
        else
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela!");
    }                                          

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Cadastro frame = new Cadastro();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.dispose();
    }
    
    private void updateTable() {
        for(int i = 0; i < 18; i++) {
            if(i < listaLivro.size()) {
                jTableLivrosList.setValueAt(listaLivro.get(i).getId(), i, 0);
                jTableLivrosList.setValueAt(listaLivro.get(i).getNome(), i, 1);
                jTableLivrosList.setValueAt(listaLivro.get(i).getAutor(), i, 2);
            }
            else {
                jTableLivrosList.setValueAt("", i, 0);
                jTableLivrosList.setValueAt("", i, 1);
                jTableLivrosList.setValueAt("", i, 2);
            }
        }
    }
}
