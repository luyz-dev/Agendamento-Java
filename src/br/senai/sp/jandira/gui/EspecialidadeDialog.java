/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282203
 */
public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        especialidade = e;
        this.operacao = operacao;
        preencherTitulo();

        preencherFormulario();
    }

    private void preencherFormulario() {

        codigoTextField.setText(especialidade.getCodigo().toString());
        nomeEspecialidadeTextField.setText(especialidade.getNome());
        descricaoEspecialidadeTextField.setText(especialidade.getDescriçao());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Especialidades - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        inicioPanel = new javax.swing.JPanel();
        paginaPanel = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        nomeEspecialidadeLabel = new javax.swing.JLabel();
        nomeEspecialidadeTextField = new javax.swing.JTextField();
        descricaoEspecialidadeLabel = new javax.swing.JLabel();
        descricaoEspecialidadeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tituloPanel.setBackground(new java.awt.Color(0, 204, 204));
        tituloPanel.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/mais.png"))); // NOI18N
        labelTitulo.setText("Especialidades - ADICIONAR");
        tituloPanel.add(labelTitulo);
        labelTitulo.setBounds(70, 0, 460, 90);

        getContentPane().add(tituloPanel);
        tituloPanel.setBounds(0, 0, 800, 90);

        inicioPanel.setBackground(new java.awt.Color(204, 255, 255));
        inicioPanel.setLayout(null);

        paginaPanel.setBackground(new java.awt.Color(204, 255, 255));
        paginaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 51, 102))); // NOI18N
        paginaPanel.setLayout(null);

        codigoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoLabel.setText("Código:");
        paginaPanel.add(codigoLabel);
        codigoLabel.setBounds(40, 60, 90, 20);

        codigoTextField.setEditable(false);
        codigoTextField.setBackground(new java.awt.Color(255, 255, 204));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        paginaPanel.add(codigoTextField);
        codigoTextField.setBounds(40, 80, 100, 40);

        buttonCancelar.setBackground(new java.awt.Color(204, 255, 204));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        paginaPanel.add(buttonCancelar);
        buttonCancelar.setBounds(560, 320, 70, 60);

        buttonSalvar.setBackground(new java.awt.Color(204, 255, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        paginaPanel.add(buttonSalvar);
        buttonSalvar.setBounds(650, 320, 70, 60);

        nomeEspecialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeEspecialidadeLabel.setText("Nome da Especialidade:");
        paginaPanel.add(nomeEspecialidadeLabel);
        nomeEspecialidadeLabel.setBounds(40, 150, 170, 20);

        nomeEspecialidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEspecialidadeTextFieldActionPerformed(evt);
            }
        });
        paginaPanel.add(nomeEspecialidadeTextField);
        nomeEspecialidadeTextField.setBounds(40, 170, 580, 40);

        descricaoEspecialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoEspecialidadeLabel.setText("Descrição da Especialidade:");
        paginaPanel.add(descricaoEspecialidadeLabel);
        descricaoEspecialidadeLabel.setBounds(40, 240, 240, 20);

        descricaoEspecialidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoEspecialidadeTextFieldActionPerformed(evt);
            }
        });
        paginaPanel.add(descricaoEspecialidadeTextField);
        descricaoEspecialidadeTextField.setBounds(40, 260, 680, 40);

        inicioPanel.add(paginaPanel);
        paginaPanel.setBounds(20, 10, 760, 400);

        getContentPane().add(inicioPanel);
        inicioPanel.setBounds(0, 90, 800, 450);

        setSize(new java.awt.Dimension(818, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed
      
    private void editar(){
        especialidade.setNome(nomeEspecialidadeTextField.getText());
        especialidade.setDescricao(descricaoEspecialidadeTextField.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, "Especialidade atualizada com sucesso", 
                "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void adicionar(){
        if(nomeEspecialidadeTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "PorFavor, escreva o nome da especialidade!");
        }else if(nomeEspecialidadeTextField.getText().length() < 3){
            JOptionPane.showMessageDialog(null, "Nome da especialidade não é valido!");
        }else if(descricaoEspecialidadeTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "PorFavor, escreva a descrição da especialidade!");
        }else if(descricaoEspecialidadeTextField.getText().length() < 10){
            JOptionPane.showMessageDialog(null, "PorFavor, escreva uma descrição coerente e válida!");
        }else{
        
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(nomeEspecialidadeTextField.getText());
        novaEspecialidade.setDescricao(descricaoEspecialidadeTextField.getText());

        EspecialidadeDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso!!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
        }
    }
    
    private void nomeEspecialidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEspecialidadeTextFieldActionPerformed

    }//GEN-LAST:event_nomeEspecialidadeTextFieldActionPerformed

    private void descricaoEspecialidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoEspecialidadeTextFieldActionPerformed

    }//GEN-LAST:event_descricaoEspecialidadeTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel descricaoEspecialidadeLabel;
    private javax.swing.JTextField descricaoEspecialidadeTextField;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel nomeEspecialidadeLabel;
    private javax.swing.JTextField nomeEspecialidadeTextField;
    private javax.swing.JPanel paginaPanel;
    private javax.swing.JPanel tituloPanel;
    // End of variables declaration//GEN-END:variables


}
