/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argue
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        setTitle("Registro");
        setResizable(false); // Evitar que el usuario modifique la ventana
        setLocationRelativeTo(null); // Mostrar la ventana en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbSemestre = new javax.swing.JComboBox<>();
        btnListado = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Semestre");

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));

        btnListado.setText("Ver listado");
        btnListado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("College SQL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListado)
                        .addGap(28, 28, 28)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cmbSemestre, 0, 126, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(txtApellido)))
                        .addComponent(jLabel5)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListado)
                    .addComponent(btnRegistrar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método para verificar si ya existe un estudiante con el mismo código
    private boolean existeEstudianteConCodigo(String codigo) throws SQLException {
        
        // Nos conectamos a la base de datos
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");

        // Consulta para verificar si hay un estudiante con el código ingresado
        String selectQuery = "SELECT * FROM estudiante WHERE codigo = ?";
        try (PreparedStatement selectPst = cn.prepareStatement(selectQuery)) {
            selectPst.setString(1, codigo);

            // Ejecutamos la consulta
            try (ResultSet rs = selectPst.executeQuery()) {
                // Si hay un estudiante con el código ingresado, devuelve true
                return rs.next();
            }
        }
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            // Validacion de campos
            if (txtCodigo.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()
                    || txtApellido.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }else{
            // Validar que se ingresa un numero en el codigo
            try {
                Integer.parseInt(txtCodigo.getText().trim());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El código debe ser un numero", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }

            try {
                // Verificar si ya existe un estudiante con el mismo código
                String codigoIngresado = txtCodigo.getText().trim();
                if (existeEstudianteConCodigo(codigoIngresado)) {
                    JOptionPane.showMessageDialog(null, "Ya hay un estudiante registrado con ese código","Error",JOptionPane.ERROR_MESSAGE);

                }
            } catch (Exception e) {

            }
            try {

                String nombreIngresado = txtNombre.getText().trim();
                String apellidoIngresado = txtApellido.getText().trim();

                // Utilizar una expresión regular para verificar si el texto contiene solo letras
                // El patrón "[a-zA-Z]+" significa una o más letras (mayúsculas o minúsculas)
                Pattern pattern = Pattern.compile("[a-zA-Z]+");

                // Validar el campo de nombre
                Matcher matcherNombre = pattern.matcher(nombreIngresado);
                if (!matcherNombre.matches()) {
                    JOptionPane.showMessageDialog(null, "Solo se permiten letras en el campo de Nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;  // Sale del método si la validación no es exitosa
                }

                // Validar el campo de apellido
                Matcher matcherApellido = pattern.matcher(apellidoIngresado);
                if (!matcherApellido.matches()) {
                    JOptionPane.showMessageDialog(null, "Solo se permiten letras en el campo de Apellido", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;  // Sale del método si la validación no es exitosa
                }

            } catch (Exception e) {

            }
            // Se establece la conexión creando el objeto de tipo connection
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");

            // Ahora, es necesario preparar la instrucción con un objeto del tipo PreparedStatement
            PreparedStatement pst = cn.prepareStatement("insert into estudiante values(?,?,?,?)");

            // Una vez mandada la instrucción, se procede a tomar los datos de la gui 
            // Este valor esta de auto incremento en la base de datos
            pst.setString(1, txtCodigo.getText().trim()); // Codigo 
            // El metodo trim elimina espacios del incio y el final de la cadena
            pst.setString(2, txtNombre.getText().trim()); // Nombre 
            pst.setString(3, txtApellido.getText().trim()); // Apellido

            // Obtener la información del combo box
            String semestreSeleccionado = cmbSemestre.getSelectedItem().toString();
            pst.setString(4, semestreSeleccionado);

            // Una vez finalizada la toma de datos, se envian a la base de datos 
            pst.executeUpdate();

            // Limpiamos los campos
            txtCodigo.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            cmbSemestre.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Registro exitoso!");
            }
        } catch (Exception e) {
            System.err.println("Error de conexión!!");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        // TODO add your handling code here:

        this.dispose();

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT * from estudiante");
            ResultSet rs = pst.executeQuery(); // Traer los datos y almacenarlos

            // Crear una instancia de Listado
            Listado verListado = new Listado();

            DefaultTableModel model = (DefaultTableModel) verListado.tblListado.getModel();
            model.setRowCount(0);

            try {
                // Iterar sobre los resultados y agregarlos al modelo de la tabla
                while (rs.next()) {
                    Object[] fila = new Object[4];
                    // Configurar fila con los datos del resultado
                    // Asegúrate de cambiar los índices de las columnas según tu esquema de base de datos
                    fila[0] = rs.getInt("Codigo");
                    fila[1] = rs.getString("Nombre");
                    fila[2] = rs.getString("Apellido");
                    fila[3] = rs.getString("Semestre");
                    // ... Continuar con las demás columnas

                    // Agregar la fila al modelo de la tabla
                    model.addRow(fila);
                }

                // Mover la llamada a setVisible(true) fuera del bucle
                verListado.setVisible(true);

            } catch (SQLException e) {
                System.out.println("Error al procesar los resultados: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Otro error: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }


    }//GEN-LAST:event_btnListadoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnListado;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
