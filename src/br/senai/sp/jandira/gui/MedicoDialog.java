package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    private DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final static String URL = "F:\\JAVA\\Medicos.txt";
    private final static Path PATH = Paths.get(URL);

    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherLista();
    }

    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao, Medico m) {
        super(parent, modal);
        initComponents();
        medico = m;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
        preencherLista();
        preencherEspecialidades();
    }

    private void preencherLista() {
        jlistListaDeEspecialidades.setModel(EspecialidadeDAO.getListaDeEspecialidades());
    }

     private void preencherTitulo() {
        labelTitulo.setText("Especialidades - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png")));
        }
    }

    private void preencherFormulario() {
        codigoTextField.setText(medico.getCodigo().toString());
        crmTextField.setText(medico.getCrm());
        nomeMedicoTextField.setText(medico.getNome());
        telefoneTextField.setText(medico.getTelefone());
        emailTextField.setText(medico.getEmail());
        dataDeNascimentoTextField.setText(medico.getDataDeNascimento().format(formatacao));
    }

    private void preencherEspecialidades() {
        System.out.println("teste");

        DefaultListModel<Especialidade> listaEspMedico = new DefaultListModel<>();
        for (Especialidade e : medico.getEspecialidade()) {
            listaEspMedico.addElement(e);
        }
        jlistListaDeEspecialidadesDoMedicos.setModel(listaEspMedico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        codigoTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        crmTextField = new javax.swing.JTextField();
        crmLabel = new javax.swing.JLabel();
        nomeMedicoTextField = new javax.swing.JTextField();
        nomeMedicoLabel = new javax.swing.JLabel();
        telefoneTextField = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        dataDeNascimentoLabel = new javax.swing.JLabel();
        dataDeNascimentoTextField = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar1 = new javax.swing.JButton();
        listaDeEspecialidadesLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistListaDeEspecialidades = new javax.swing.JList<>();
        especialidadeDoMedicoLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistListaDeEspecialidadesDoMedicos = new javax.swing.JList<>();
        buttonTirarEspecialidade = new javax.swing.JButton();
        buttonAddEspecialidade = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(0, 204, 204));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/mais.png"))); // NOI18N
        labelTitulo.setText("Medico - ADICIONAR");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(70, 0, 460, 90);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 820, 90);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel3.setLayout(null);

        codigoTextField.setEditable(false);
        codigoTextField.setBackground(new java.awt.Color(255, 255, 204));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(codigoTextField);
        codigoTextField.setBounds(30, 60, 120, 40);

        codigoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoLabel.setText("Código:");
        jPanel3.add(codigoLabel);
        codigoLabel.setBounds(30, 40, 90, 20);

        crmTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(crmTextField);
        crmTextField.setBounds(170, 60, 160, 40);

        crmLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        crmLabel.setText("CRM:");
        jPanel3.add(crmLabel);
        crmLabel.setBounds(170, 40, 90, 20);

        nomeMedicoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeMedicoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMedicoTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nomeMedicoTextField);
        nomeMedicoTextField.setBounds(350, 60, 400, 40);

        nomeMedicoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeMedicoLabel.setText("Nome do(a) Médico(a):");
        jPanel3.add(nomeMedicoLabel);
        nomeMedicoLabel.setBounds(350, 40, 140, 20);

        telefoneTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(telefoneTextField);
        telefoneTextField.setBounds(30, 140, 180, 40);

        telefoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefoneLabel.setText("Telefone:");
        jPanel3.add(telefoneLabel);
        telefoneLabel.setBounds(30, 120, 60, 20);

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(emailTextField);
        emailTextField.setBounds(220, 140, 320, 40);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setText("Email:");
        jPanel3.add(emailLabel);
        emailLabel.setBounds(220, 120, 50, 20);

        dataDeNascimentoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dataDeNascimentoLabel.setText("Data de Nascimento:");
        jPanel3.add(dataDeNascimentoLabel);
        dataDeNascimentoLabel.setBounds(550, 120, 170, 20);

        dataDeNascimentoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataDeNascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDeNascimentoTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(dataDeNascimentoTextField);
        dataDeNascimentoTextField.setBounds(550, 140, 200, 40);

        buttonCancelar.setBackground(new java.awt.Color(204, 255, 204));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonCancelar);
        buttonCancelar.setBounds(560, 320, 70, 60);

        buttonSalvar1.setBackground(new java.awt.Color(204, 255, 204));
        buttonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/save32.png"))); // NOI18N
        buttonSalvar1.setToolTipText("Salvar");
        buttonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvar1ActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSalvar1);
        buttonSalvar1.setBounds(650, 320, 70, 60);

        listaDeEspecialidadesLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaDeEspecialidadesLabel1.setText("Lista de Espescialidades:");
        jPanel3.add(listaDeEspecialidadesLabel1);
        listaDeEspecialidadesLabel1.setBounds(30, 210, 150, 20);

        jScrollPane2.setViewportView(jlistListaDeEspecialidades);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(30, 230, 160, 130);

        especialidadeDoMedicoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        especialidadeDoMedicoLabel2.setText("Espescialidades do Médico:");
        jPanel3.add(especialidadeDoMedicoLabel2);
        especialidadeDoMedicoLabel2.setBounds(270, 210, 170, 20);

        jScrollPane3.setViewportView(jlistListaDeEspecialidadesDoMedicos);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(270, 230, 160, 130);

        buttonTirarEspecialidade.setBackground(new java.awt.Color(255, 0, 51));
        buttonTirarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/seta-esquerda.png"))); // NOI18N
        buttonTirarEspecialidade.setToolTipText("Salvar");
        buttonTirarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTirarEspecialidadeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonTirarEspecialidade);
        buttonTirarEspecialidade.setBounds(210, 300, 40, 40);

        buttonAddEspecialidade.setBackground(new java.awt.Color(0, 255, 0));
        buttonAddEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/seta-direita.png"))); // NOI18N
        buttonAddEspecialidade.setToolTipText("Salvar");
        buttonAddEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddEspecialidadeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAddEspecialidade);
        buttonAddEspecialidade.setBounds(210, 240, 40, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 10, 760, 400);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 820, 460);

        setSize(new java.awt.Dimension(831, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void crmTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmTextFieldActionPerformed

    private void nomeMedicoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMedicoTextFieldActionPerformed

    }//GEN-LAST:event_nomeMedicoTextFieldActionPerformed

    private void telefoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTextFieldActionPerformed

    }//GEN-LAST:event_telefoneTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed

    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void dataDeNascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDeNascimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDeNascimentoTextFieldActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonTirarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTirarEspecialidadeActionPerformed
        if (jlistListaDeEspecialidadesDoMedicos.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listaAtualizada = new ArrayList<>();
            int tamanho = jlistListaDeEspecialidadesDoMedicos.getModel().getSize();
            for (int c = 0; c < tamanho; c++) {
                listaAtualizada.add(jlistListaDeEspecialidadesDoMedicos.getModel().getElementAt(c));
            }
            listaAtualizada.remove(jlistListaDeEspecialidadesDoMedicos.getSelectedValue());
            
            DefaultListModel<Especialidade> listaDeEspecialidadesDoMedico = new DefaultListModel<>();
                for (Especialidade e : listaAtualizada) {
                    listaDeEspecialidadesDoMedico.addElement(e);
                }
                jlistListaDeEspecialidadesDoMedicos.setModel(listaDeEspecialidadesDoMedico);
            
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma especialidade! ",
                    "Especialidades do Médico",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_buttonTirarEspecialidadeActionPerformed

    private void buttonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvar1ActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvar1ActionPerformed

    public void editar() {
        if (crmTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o crm do médico!!");
        } else if (nomeMedicoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o nome do médico!!");
        } else if (telefoneTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o telefone do médico!!");
        } else if (emailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o email do médico!!");
        } else if (dataDeNascimentoTextField.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Por Favor, confira se data de nascimento está certo!!");
        } else if (jlistListaDeEspecialidadesDoMedicos.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor, confira se tem alguma especialidade selecionada!!");
        } else {

            medico.setCrm(crmTextField.getText());
            medico.setNome(nomeMedicoTextField.getText());
            medico.setTelefone(telefoneTextField.getText());
            medico.setEmail(emailTextField.getText());
            medico.setDataDeNascimento(LocalDate.parse(dataDeNascimentoTextField.getText(), formatacao));
            medico.setEspecialidade(pegarEspecialidades(jlistListaDeEspecialidadesDoMedicos));

            MedicoDAO.atualizar(medico);

            JOptionPane.showMessageDialog(null, "Médico atualizado com sucesso",
                    "Medico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public void adicionar() {
        if (crmTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o crm do médico!!");
        } else if (nomeMedicoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o nome do médico!!");
        } else if (telefoneTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o telefone do médico!!");
        } else if (emailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, escreva o email do médico!!");
        } else if (dataDeNascimentoTextField.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Por Favor, confira se data de nascimento está certo!!");
        } else if (jlistListaDeEspecialidadesDoMedicos.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor, confira se tem alguma especialidade selecionada!!");
        } else {

            Medico novoMedico = new Medico();
            novoMedico.setCrm(crmTextField.getText());
            novoMedico.setNome(nomeMedicoTextField.getText());
            novoMedico.setTelefone(telefoneTextField.getText());
            novoMedico.setEmail(emailTextField.getText());
            novoMedico.setDataDeNascimento(LocalDate.parse(dataDeNascimentoTextField.getText(), formatacao));
            novoMedico.setEspecialidade(pegarEspecialidades(jlistListaDeEspecialidadesDoMedicos));

            MedicoDAO.gravar(novoMedico);
            JOptionPane.showMessageDialog(this,
                    "Médico gravado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void buttonAddEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEspecialidadeActionPerformed
        if (jlistListaDeEspecialidades.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listaAtualizada = new ArrayList<>();
            int tamanho = jlistListaDeEspecialidadesDoMedicos.getModel().getSize();
            for (int c = 0; c < tamanho; c++) {
                listaAtualizada.add(jlistListaDeEspecialidades.getModel().getElementAt(c));
            }
            if (listaAtualizada.contains(jlistListaDeEspecialidades.getSelectedValue()) == false) {
                listaAtualizada.add(jlistListaDeEspecialidades.getSelectedValue());

                DefaultListModel<Especialidade> listaDeEspecialidadesDoMedico = new DefaultListModel<>();
                for (Especialidade e : listaAtualizada) {
                    listaDeEspecialidadesDoMedico.addElement(e);
                }
                jlistListaDeEspecialidadesDoMedicos.setModel(listaDeEspecialidadesDoMedico);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Especialidade já está cadastrada! ",
                        "Especialidades do Médico",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma especialidade! ",
                    "Especialidades do Médico",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAddEspecialidadeActionPerformed
    public ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {
        int tamanho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList<>();
        for (int contador = 0; contador < tamanho; contador++) {
            listaNova.add(lista.getModel().getElementAt(contador));
        }
        return listaNova;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddEspecialidade;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JButton buttonTirarEspecialidade;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel crmLabel;
    private javax.swing.JTextField crmTextField;
    private javax.swing.JLabel dataDeNascimentoLabel;
    private javax.swing.JTextField dataDeNascimentoTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel especialidadeDoMedicoLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<Especialidade> jlistListaDeEspecialidades;
    private javax.swing.JList<Especialidade> jlistListaDeEspecialidadesDoMedicos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel listaDeEspecialidadesLabel1;
    private javax.swing.JLabel nomeMedicoLabel;
    private javax.swing.JTextField nomeMedicoTextField;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
