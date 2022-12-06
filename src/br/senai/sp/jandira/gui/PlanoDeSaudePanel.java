package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

    private int linha;

    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanos();
        preencherTabela();
    }

    private int getLinha() {
        linha = planoTable.getSelectedRow();
        return linha;
    }
    
    private Integer getCodigo(){
        String codigoStr = planoTable.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrolPlanoDeSaude = new javax.swing.JScrollPane();
        planoTable = new javax.swing.JTable();
        buttonApagar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        jScrolPlanoDeSaude.setMinimumSize(new java.awt.Dimension(60, 30));
        jScrolPlanoDeSaude.setPreferredSize(new java.awt.Dimension(300, 80));

        planoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrolPlanoDeSaude.setViewportView(planoTable);

        add(jScrolPlanoDeSaude);
        jScrolPlanoDeSaude.setBounds(30, 30, 1020, 270);

        buttonApagar.setBackground(new java.awt.Color(204, 255, 204));
        buttonApagar.setForeground(new java.awt.Color(153, 255, 153));
        buttonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        buttonApagar.setToolTipText("Excluir Plano");
        buttonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarActionPerformed(evt);
            }
        });
        add(buttonApagar);
        buttonApagar.setBounds(820, 310, 70, 60);

        buttonAdicionar.setBackground(new java.awt.Color(204, 255, 204));
        buttonAdicionar.setForeground(new java.awt.Color(153, 255, 153));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Plano");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(980, 310, 70, 60);

        buttonEditar.setBackground(new java.awt.Color(204, 255, 204));
        buttonEditar.setForeground(new java.awt.Color(153, 255, 153));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Plano");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(900, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarActionPerformed
        
        if (getLinha() != -1) {
            excluirPlano();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você desea excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_buttonApagarActionPerformed
    private void excluirPlano() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanoDeSaudeDialog planoDialog = 
                new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed
    
    private void editarPlano(){
        PlanoDeSaude plano = PlanoDeSaudeDAO.getPlano(getCodigo());
        
        PlanoDeSaudeDialog planoDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.EDITAR, plano);
        planoDialog.setVisible(true);
        preencherTabela();
    }
    
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if(getLinha() != -1){
           editarPlano();
       }else{
           JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano de saude que você deseja editar",
                    "Plano",
                    JOptionPane.WARNING_MESSAGE);
       }
        
    }//GEN-LAST:event_buttonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonApagar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JScrollPane jScrolPlanoDeSaude;
    private javax.swing.JTable planoTable;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela() {

        planoTable.setModel(PlanoDeSaudeDAO.getPlanosModel());

        ajustarTabela();
    }

    private void ajustarTabela() {

        //Impedir que o úsuario movimente as colunas
        planoTable.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        planoTable.setDefaultEditor(Object.class, null);

        //Definir largura das colunas
        planoTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        planoTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        planoTable.getColumnModel().getColumn(1).setPreferredWidth(229);
        planoTable.getColumnModel().getColumn(2).setPreferredWidth(229);
        planoTable.getColumnModel().getColumn(3).setPreferredWidth(229);
        planoTable.getColumnModel().getColumn(4).setPreferredWidth(229);

    }

}
