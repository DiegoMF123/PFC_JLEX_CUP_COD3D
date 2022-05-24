package Formato_Jlex;

import java.io.BufferedReader;
import java.io.StringReader;
import Codigo_3_Direcciones.ControlCodigo3Direcciones;
import Codigo_3_Direcciones.parser;
import Codigo_3_Direcciones.Yylex;
/**
 *
 * @author Diego_MF
 */
public class PantallaAnalizadores extends javax.swing.JFrame {

    public PantallaAnalizadores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
    * Este método se llama desde dentro del constructor para inicializar el formulario.
    * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
    * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_GenerarC3D = new javax.swing.JButton();
        jTextField_Expresion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Codigo3Dgenerado = new javax.swing.JTextArea();
        jButton_GenerarC3D1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_GenerarC3D.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButton_GenerarC3D.setText("Generar Codigo_3D");
        jButton_GenerarC3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarC3DActionPerformed(evt);
            }
        });

        jTextField_Expresion.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N

        jTextArea_Codigo3Dgenerado.setColumns(20);
        jTextArea_Codigo3Dgenerado.setFont(new java.awt.Font("Roboto Mono Light", 0, 18)); // NOI18N
        jTextArea_Codigo3Dgenerado.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Codigo3Dgenerado);

        jButton_GenerarC3D1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButton_GenerarC3D1.setText("Generar Lenguaje Sintactico");
        jButton_GenerarC3D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarC3D1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Generador para el Analizador Lexico y código de 3 Direcciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_GenerarC3D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_GenerarC3D1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField_Expresion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jTextField_Expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_GenerarC3D, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GenerarC3D1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GenerarC3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarC3DActionPerformed
        String texto = jTextField_Expresion.getText();
        if(texto.isEmpty()){
            System.err.println("No podemos evaluar un cadena en blanco.");
            return;
        }
        try {
            jTextArea_Codigo3Dgenerado.setText("");
            System.out.println("Inicia la generación de C3D...");
            Yylex scan = new Yylex(new BufferedReader( new StringReader(texto)));
            parser parser = new parser(scan);
            parser.parse();
            jTextArea_Codigo3Dgenerado.setText(ControlCodigo3Direcciones.getC3D());
            System.out.println("Finaliza la generación del Código_3_Direciones...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton_GenerarC3DActionPerformed

    private void jButton_GenerarC3D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarC3D1ActionPerformed
        try {
            Formato_Jlex.parser p = new Formato_Jlex.parser(new Formato_Jlex.Yylex(new java.io.FileInputStream("D:\\Escritorio\\PFC_JLEX_CUP_COD3D\\ejempAnalizador.mlp")));
            p.parse();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_GenerarC3D1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAnalizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAnalizadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GenerarC3D;
    private javax.swing.JButton jButton_GenerarC3D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Codigo3Dgenerado;
    private javax.swing.JTextField jTextField_Expresion;
    // End of variables declaration//GEN-END:variables
}
