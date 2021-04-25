/*
    Trabalho Calculadora com serviço WEB
    Aluno: Rafael Almeida Soares
*/
package visao;

import calculadoraService.Calculator;
import calculadoraService.CalculatorSoap;

/**
 *
 * @author Rafael Alemida Soares
 */
public class FrmCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form FrmCalculadora
     */
    private int num1;
    private int num2;
    private String sinal;
    
    Calculator locator = new Calculator();
    CalculatorSoap calcula= locator.getCalculatorSoap();
    
    public FrmCalculadora() {
        initComponents();
        bloqueia(false);
        num1 = 0;
        num2 = 0;
        sinal = null;
    }

    public void bloqueia(boolean valido){
        btn0.setEnabled(valido);
        btn1.setEnabled(valido);
        btn2.setEnabled(valido);
        btn3.setEnabled(valido);
        btn4.setEnabled(valido);
        btn5.setEnabled(valido);
        btn6.setEnabled(valido);
        btn7.setEnabled(valido);
        btn8.setEnabled(valido);
        btn9.setEnabled(valido);
        btnBackspace.setEnabled(valido);
        btnDIvisao.setEnabled(valido);
        btnIgual.setEnabled(valido);
        btnSoma.setEnabled(valido);
        btnSubtracao.setEnabled(valido);
        btnVezes.setEnabled(valido);
        btnOff.setEnabled(valido);
        btnOn.setEnabled(!valido);
        if(!valido){
            tfTela.setText("");
            num1 = 0;
            num2 = 0;
            sinal = null;
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        tfTela = new javax.swing.JTextField();
        btnBackspace = new javax.swing.JButton();
        btnOff = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDIvisao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        tfTela.setEditable(false);
        tfTela.setBackground(new java.awt.Color(102, 102, 102));
        tfTela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTela.setForeground(new java.awt.Color(255, 255, 255));
        tfTela.setBorder(null);

        btnBackspace.setBackground(new java.awt.Color(0, 0, 0));
        btnBackspace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBackspace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackspace.setText("Backspace");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnOff.setBackground(new java.awt.Color(0, 0, 0));
        btnOff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOff.setForeground(new java.awt.Color(255, 255, 255));
        btnOff.setText("OFF");
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });

        btnOn.setBackground(new java.awt.Color(0, 0, 0));
        btnOn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOn.setForeground(new java.awt.Color(255, 255, 255));
        btnOn.setText("ON");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDIvisao.setBackground(new java.awt.Color(0, 0, 0));
        btnDIvisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDIvisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDIvisao.setText("/");
        btnDIvisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIvisaoActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnVezes.setBackground(new java.awt.Color(0, 0, 0));
        btnVezes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVezes.setForeground(new java.awt.Color(255, 255, 255));
        btnVezes.setText("*");
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSubtracao.setBackground(new java.awt.Color(0, 0, 0));
        btnSubtracao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 0, 0));
        btnIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSoma.setBackground(new java.awt.Color(0, 0, 0));
        btnSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSoma.setForeground(new java.awt.Color(255, 255, 255));
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDIvisao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfTela, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnBackspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDIvisao, btnSoma, btnSubtracao, btnVezes});

        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tfTela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace)
                    .addComponent(btnOff)
                    .addComponent(btnOn))
                .addGap(11, 11, 11)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDIvisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDIvisao, btnIgual, btnSoma, btnSubtracao, btnVezes});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "1");
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        tfTela.setText(tfTela.getText() + "9");
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        // TODO add your handling code here:
        int tamanho = tfTela.getText().length();
        if(tamanho > 0){
            tfTela.setText(tfTela.getText().substring(0, tamanho - 1));
        }  
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        // TODO add your handling code here:
        bloqueia(true);
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffActionPerformed
        // TODO add your handling code here:
        bloqueia(false);
    }//GEN-LAST:event_btnOffActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().isEmpty()){
            
        }else if(sinal == null){
            sinal = "somar";
            num1 = Integer.parseInt(tfTela.getText());
            tfTela.setText("");
        }else{
            if(sinal.equalsIgnoreCase("somar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.add(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("subtrair")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.subtract(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("multiplicar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.multiply(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else{
                num2 = Integer.parseInt(tfTela.getText());
                if(num2 == 0){
                    tfTela.setText("Impossivel dividir por 0");
                    sinal = null;
                    num1 = 0;
                    num2 = 0;
                }else{
                    num1 = calcula.divide(num1, num2);
                    tfTela.setText(Integer.toString(num1));
                    sinal = null;
                }
            }
        }
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().isEmpty()){
            
        }else if(sinal == null){
            sinal = "subtrair";
            num1 = Integer.parseInt(tfTela.getText());
            tfTela.setText("");
        }else{
            if(sinal.equalsIgnoreCase("somar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.add(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("subtrair")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.subtract(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("multiplicar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.multiply(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else{
                if(num2 == 0){
                    tfTela.setText("Impossivel dividir por 0");
                    sinal = null;
                    num1 = 0;
                    num2 = 0;
                }else{
                    num1 = calcula.divide(num1, num2);
                    tfTela.setText(Integer.toString(num1));
                    sinal = null;
                }
            }
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().isEmpty()){
            
        }else if(sinal == null){
            sinal = "multiplicar";
            num1 = Integer.parseInt(tfTela.getText());
            tfTela.setText("");
        }else{
            if(sinal.equalsIgnoreCase("somar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.add(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("subtrair")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.subtract(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("multiplicar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.multiply(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else{
                num2 = Integer.parseInt(tfTela.getText());
                if(num2 == 0){
                    tfTela.setText("Impossivel dividir por 0");
                    sinal = null;
                    num1 = 0;
                    num2 = 0;
                }else{
                    num1 = calcula.divide(num1, num2);
                    tfTela.setText(Integer.toString(num1));
                    sinal = null;
                }
            }
        }
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btnDIvisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIvisaoActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().isEmpty()){
            
        }else if(sinal == null){
            sinal = "dividir";
            num1 = Integer.parseInt(tfTela.getText());
            tfTela.setText("");
        }else{
            if(sinal.equalsIgnoreCase("somar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.add(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("subtrair")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.subtract(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("multiplicar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.multiply(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else{
                num2 = Integer.parseInt(tfTela.getText());
                if(num2 == 0){
                    tfTela.setText("Impossivel dividir por 0");
                    sinal = null;
                    num1 = 0;
                    num2 = 0;
                }else{
                    num1 = calcula.divide(num1, num2);
                    tfTela.setText(Integer.toString(num1));
                    sinal = null;
                }
            }
        }
    }//GEN-LAST:event_btnDIvisaoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        if(tfTela.getText().equalsIgnoreCase("Impossivel dividir por 0")){
            tfTela.setText("");
        }
        if(tfTela.getText().isEmpty()){
            
        }else if(sinal == null){
            
        }else{
            if(sinal.equalsIgnoreCase("somar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.add(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("subtrair")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.subtract(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else if(sinal.equalsIgnoreCase("multiplicar")){
                num2 = Integer.parseInt(tfTela.getText());
                num1 = calcula.multiply(num1, num2);
                tfTela.setText(Integer.toString(num1));
                sinal = null;
            }else{
                num2 = Integer.parseInt(tfTela.getText());
                if(num2 == 0){
                    tfTela.setText("Impossivel dividir por 0");
                    sinal = null;
                    num1 = 0;
                    num2 = 0;
                }else{
                    num1 = calcula.divide(num1, num2);
                    tfTela.setText(Integer.toString(num1));
                    sinal = null;
                }
            }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnDIvisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnOff;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVezes;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField tfTela;
    // End of variables declaration//GEN-END:variables
}
