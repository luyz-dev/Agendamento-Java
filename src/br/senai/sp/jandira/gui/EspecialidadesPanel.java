package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarlistaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = especialidadeTable.getSelectedRow();
        return linha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        especialidadeTable = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        especialidadeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 20", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(especialidadeTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 1020, 270);

        buttonExcluir.setBackground(new java.awt.Color(204, 255, 204));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        buttonExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(820, 310, 70, 60);

        buttonEditar.setBackground(new java.awt.Color(204, 255, 204));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        buttonEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(900, 310, 70, 60);

        buttonAdicionar.setBackground(new java.awt.Color(204, 255, 204));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você desea excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttonExcluirActionPerformed
    
    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    private Integer getCodigo(){
        String codigoStr = especialidadeTable.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void editarEspecialidade(){
        
       Especialidade especialidade = EspecialidadeDAO.getEspecialidades(getCodigo());
               
       EspecialidadeDialog especialidadeDialog = 
               new EspecialidadeDialog(null, true,  especialidade, OperacaoEnum.EDITAR);
       especialidadeDialog.setVisible(true);
       preencherTabela();
    }

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
       if(getLinha() != -1){
           editarEspecialidade();
       }else{
           JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você desea editar",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
       }
       
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        EspecialidadeDialog especialidadeDialog = 
                new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JTable especialidadeTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela() {

        especialidadeTable.setModel(EspecialidadeDAO.getEspecialidadesModel());

        ajustarTabela();
    }

    private void ajustarTabela() {

        //Impedir que o úsuario movimente as colunas
        especialidadeTable.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        especialidadeTable.setDefaultEditor(Object.class, null);

        //Definir largura das colunas
        especialidadeTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        especialidadeTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        especialidadeTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        especialidadeTable.getColumnModel().getColumn(2).setPreferredWidth(717);

    }

}
