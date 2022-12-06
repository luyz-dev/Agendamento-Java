package br.senai.sp.jandira.gui;

import java.awt.Toolkit;

public class FrameHome extends javax.swing.JFrame {

    private EspecialidadesPanel especialidadesPanel;
    private PlanoDeSaudePanel planoDeSaudePanel;
    private MedicoPanel medicoPanel;

    private final int POS_X = 30;
    private final int POS_Y = 180;
    private final int LARGURA = 1090;
    private final int ALTURA = 380;

    private void initPanels() {
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        tela.add(especialidadesPanel);
        especialidadesPanel.setVisible(false);

        planoDeSaudePanel = new PlanoDeSaudePanel();
        planoDeSaudePanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        tela.add(planoDeSaudePanel);
        planoDeSaudePanel.setVisible(false);
        
        medicoPanel = new MedicoPanel();
        medicoPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        tela.add(medicoPanel);
        medicoPanel.setVisible(false);

    }

    public FrameHome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/image/medico.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonAgenda1 = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        tela.setBackground(new java.awt.Color(204, 255, 255));
        tela.setLayout(null);

        labelTitulo.setBackground(new java.awt.Color(0, 204, 204));
        labelTitulo.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/calendario.png"))); // NOI18N
        labelTitle.setText(" Sistema para Agendamento de Consultas");
        labelTitulo.add(labelTitle);
        labelTitle.setBounds(30, 10, 643, 79);

        tela.add(labelTitulo);
        labelTitulo.setBounds(0, 0, 1140, 90);

        panelHome.setBackground(new java.awt.Color(204, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(204, 255, 204));
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("LGS SISTEMAS ");
        panelHome.add(jLabel1);
        jLabel1.setBounds(30, 20, 600, 180);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Sistema para Agendamento de Consulta");
        panelHome.add(jLabel3);
        jLabel3.setBounds(30, 140, 330, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Suporte Técnico:");
        panelHome.add(jLabel2);
        jLabel2.setBounds(810, 170, 230, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("www.lgssistemas.com.br");
        panelHome.add(jLabel4);
        jLabel4.setBounds(860, 240, 180, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("E-mail: lgs_sistemas@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(830, 200, 210, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone: (11) 4002-8922");
        panelHome.add(jLabel6);
        jLabel6.setBounds(860, 220, 180, 30);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        panelHome.add(jPanel1);
        jPanel1.setBounds(30, 170, 1010, 5);

        tela.add(panelHome);
        panelHome.setBounds(20, 180, 1090, 380);

        buttonAgenda1.setBackground(new java.awt.Color(255, 255, 204));
        buttonAgenda1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/299096_calendar_clock_icon.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Agenda");
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        tela.add(buttonAgenda1);
        buttonAgenda1.setBounds(100, 100, 70, 65);

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        tela.add(buttonSair);
        buttonSair.setBounds(1010, 100, 97, 64);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 204));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/cartao-medico.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de Saude");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        tela.add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(420, 100, 70, 65);

        buttonEspecialidade.setBackground(new java.awt.Color(255, 255, 204));
        buttonEspecialidade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/kit-de-primeiros-socorros.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Especialidade");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        tela.add(buttonEspecialidade);
        buttonEspecialidade.setBounds(340, 100, 70, 65);

        buttonPaciente.setBackground(new java.awt.Color(255, 255, 204));
        buttonPaciente.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/paciente.png"))); // NOI18N
        buttonPaciente.setToolTipText("Paciente");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        tela.add(buttonPaciente);
        buttonPaciente.setBounds(180, 100, 70, 65);

        buttonMedico.setBackground(new java.awt.Color(255, 255, 204));
        buttonMedico.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/medico.png"))); // NOI18N
        buttonMedico.setToolTipText("Médico");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        tela.add(buttonMedico);
        buttonMedico.setBounds(260, 100, 70, 66);

        buttonHome.setBackground(new java.awt.Color(255, 255, 204));
        buttonHome.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/home32.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        tela.add(buttonHome);
        buttonHome.setBounds(20, 100, 70, 65);

        getContentPane().add(tela);
        tela.setBounds(0, 0, 1140, 620);

        setSize(new java.awt.Dimension(1156, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        medicoPanel.setVisible(false);
        buttonHome.setBackground(new java.awt.Color(204, 255, 204));
        buttonEspecialidade.setBackground(new java.awt.Color(255, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 204));
        buttonMedico.setBackground(new java.awt.Color(255, 255, 204));
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(true);
        medicoPanel.setVisible(false);
        buttonHome.setBackground(new java.awt.Color(255, 255, 204));
        buttonEspecialidade.setBackground(new java.awt.Color(255, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 255, 204));
        buttonMedico.setBackground(new java.awt.Color(255, 255, 204));
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed

        dispose();

    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        medicoPanel.setVisible(true);
        buttonHome.setBackground(new java.awt.Color(255, 255, 204));
        buttonEspecialidade.setBackground(new java.awt.Color(255, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 204));
        buttonMedico.setBackground(new java.awt.Color(204, 255, 204));
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
        planoDeSaudePanel.setVisible(false);
        medicoPanel.setVisible(false);
        buttonHome.setBackground(new java.awt.Color(255, 255, 204));
        buttonEspecialidade.setBackground(new java.awt.Color(204, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 204));
        buttonMedico.setBackground(new java.awt.Color(255, 255, 204));
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel labelTitulo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables

}
