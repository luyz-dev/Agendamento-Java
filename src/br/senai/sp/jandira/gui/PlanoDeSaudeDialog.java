package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude plano;
    private OperacaoEnum operacao;
    private DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;

        preencherTitulo();
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao,
            PlanoDeSaude p) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;

        plano = p;
        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        codigoTextField.setText(plano.getCodigo().toString());
        operadoraTextField.setText(plano.getOperadora());
        numeroTextField.setText(plano.getNumero());
        categoriaTextField.setText(plano.getCategoria());
        validadeTextField.setText(plano.getValidade().format(formatacao));
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

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        operadoraLabel = new javax.swing.JLabel();
        operadoraTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriaTextField = new javax.swing.JTextField();
        validadeLabel = new javax.swing.JLabel();
        validadeTextField = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(0, 204, 204));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/mais.png"))); // NOI18N
        labelTitulo.setText("Plano De Saúde - ADICIONAR");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(70, 0, 460, 90);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 820, 90);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel2.setLayout(null);

        codigoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoLabel.setText("Código:");
        jPanel2.add(codigoLabel);
        codigoLabel.setBounds(40, 20, 90, 20);

        codigoTextField.setEditable(false);
        codigoTextField.setBackground(new java.awt.Color(255, 255, 204));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(codigoTextField);
        codigoTextField.setBounds(40, 40, 100, 40);

        operadoraLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        operadoraLabel.setText("Operadora:");
        jPanel2.add(operadoraLabel);
        operadoraLabel.setBounds(40, 90, 170, 20);

        operadoraTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        operadoraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadoraTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(operadoraTextField);
        operadoraTextField.setBounds(40, 110, 440, 40);

        numeroLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroLabel.setText("Número;");
        jPanel2.add(numeroLabel);
        numeroLabel.setBounds(40, 160, 240, 20);

        numeroTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(numeroTextField);
        numeroTextField.setBounds(40, 180, 240, 40);

        categoriaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoriaLabel.setText("Categoria:");
        jPanel2.add(categoriaLabel);
        categoriaLabel.setBounds(40, 240, 170, 20);

        categoriaTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        categoriaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(categoriaTextField);
        categoriaTextField.setBounds(40, 260, 440, 40);

        validadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        validadeLabel.setText("Validade");
        jPanel2.add(validadeLabel);
        validadeLabel.setBounds(40, 320, 240, 20);

        validadeTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        validadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(validadeTextField);
        validadeTextField.setBounds(40, 340, 170, 40);

        buttonCancelar.setBackground(new java.awt.Color(204, 255, 204));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(560, 320, 70, 60);

        buttonSalvar.setBackground(new java.awt.Color(204, 255, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(650, 320, 70, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 760, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 820, 460);

        setSize(new java.awt.Dimension(818, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void operadoraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadoraTextFieldActionPerformed

    }//GEN-LAST:event_operadoraTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed

    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void categoriaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaTextFieldActionPerformed

    private void validadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeTextFieldActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    public void editar() {
        if (operadoraTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PorFavor, escreva o nome da operadora!");
        } else if (numeroTextField.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "PorFavor, confira se está certo o número do plano!");
        } else if (categoriaTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PorFavor, escreva o nome da categoria!");
        } else if (validadeTextField.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PorFavor, confira se está certo a data de validade do plano!");
        } else {
        
        plano.setOperadora(operadoraTextField.getText());
        plano.setNumero(numeroTextField.getText());
        plano.setCategoria(categoriaTextField.getText());
        plano.setValidade(LocalDate.parse(validadeTextField.getText(), formatacao));

        PlanoDeSaudeDAO.atualizar(plano);

        JOptionPane.showMessageDialog(null, "Plano atualizada com sucesso",
                "Plano", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        }
    }

    public void adicionar() {
        if (operadoraTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PorFavor, escreva o nome da operadora!");
        } else if (numeroTextField.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "PorFavor, confira se está certo o número do plano!");
        } else if (categoriaTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PorFavor, escreva o nome da categoria!");
        } else if (validadeTextField.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PorFavor, confira se está certo a data de validade do plano!");
        } else {

            PlanoDeSaude novoPlano = new PlanoDeSaude();
            novoPlano.setOperadora(operadoraTextField.getText());
            novoPlano.setNumero(numeroTextField.getText());
            novoPlano.setCategoria(categoriaTextField.getText());
            novoPlano.setValidade(LocalDate.parse(validadeTextField.getText(), formatacao));

            PlanoDeSaudeDAO.gravar(novoPlano);
            JOptionPane.showMessageDialog(this,
                    "Plano gravado com sucesso!",
                    "Plano",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JTextField categoriaTextField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JLabel operadoraLabel;
    private javax.swing.JTextField operadoraTextField;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel validadeLabel;
    private javax.swing.JTextField validadeTextField;
    // End of variables declaration//GEN-END:variables

}
