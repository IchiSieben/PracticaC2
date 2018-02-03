/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProDaoFactory;
import entidad.Profesor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import service.EntidadService;
import util.InvalidDataProfesorException;

/**
 *
 * @author DesktopN°1
 */
public class GUIProfesores extends javax.swing.JFrame {

    /**
     * Creates new form GUIProfesores
     */
    EntidadService<Profesor> servicio = ProDaoFactory.getClienteDao();
    private Integer idProfesorGenerador = 100; 
    
    public GUIProfesores() {
         this.getContentPane().setBackground(Color.DARK_GRAY);
        //Para que se ejecute desde el centro
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldAgregarNombres = new javax.swing.JTextField();
        textFieldAgregarApellidos = new javax.swing.JTextField();
        textFieldAgregarSueldo = new javax.swing.JTextField();
        textFieldAgregarEdad = new javax.swing.JTextField();
        jButtonAgregarProfesor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textFieldModificarNombres = new javax.swing.JTextField();
        textFieldModificarApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldModificarSueldo = new javax.swing.JTextField();
        textFieldModificarEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldBuscarIDProfesor = new javax.swing.JTextField();
        buttonBuscarProfesor = new javax.swing.JButton();
        buttonModificarDatosProfesor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textFieldEliminarIDProfesor = new javax.swing.JTextField();
        buttonEliminarProfesor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buttonMostrarPrimerElemento = new javax.swing.JButton();
        buttonSueldoBruto = new javax.swing.JButton();
        buttonmasde1500 = new javax.swing.JButton();
        buttonMayor40 = new javax.swing.JButton();
        buttonTodosMayor2500 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaProfesor = new javax.swing.JTextArea();
        buttonVerProfesores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Sueldo");

        jLabel4.setText("Edad");

        textFieldAgregarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAgregarEdadActionPerformed(evt);
            }
        });

        jButtonAgregarProfesor.setText("Agregar Profesor");
        jButtonAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldAgregarNombres)
                    .addComponent(textFieldAgregarApellidos)
                    .addComponent(textFieldAgregarSueldo)
                    .addComponent(textFieldAgregarEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jButtonAgregarProfesor)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldAgregarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldAgregarApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textFieldAgregarSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldAgregarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarProfesor))
                .addGap(22, 22, 22))
        );

        jTabPane.addTab("Agregar", jPanel1);

        jLabel5.setText("Nombres");

        jLabel6.setText("Apellidos");

        jLabel7.setText("Sueldo");

        textFieldModificarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldModificarEdadActionPerformed(evt);
            }
        });

        jLabel8.setText("Edad");

        jLabel9.setText("ID Profesor");

        textFieldBuscarIDProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarIDProfesorActionPerformed(evt);
            }
        });

        buttonBuscarProfesor.setText("Buscar Profesor");
        buttonBuscarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarProfesorActionPerformed(evt);
            }
        });

        buttonModificarDatosProfesor.setText("Modificar Datos Profesor");
        buttonModificarDatosProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarDatosProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textFieldBuscarIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonBuscarProfesor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldModificarNombres)
                    .addComponent(textFieldModificarApellidos)
                    .addComponent(textFieldModificarSueldo)
                    .addComponent(textFieldModificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonModificarDatosProfesor)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldModificarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(textFieldBuscarIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldModificarApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(textFieldModificarSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textFieldModificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonBuscarProfesor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonModificarDatosProfesor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabPane.addTab("Modificar", jPanel2);

        jLabel10.setText("ID Profesor");

        textFieldEliminarIDProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEliminarIDProfesorActionPerformed(evt);
            }
        });

        buttonEliminarProfesor.setText("Eliminar Profesor");
        buttonEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(textFieldEliminarIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(buttonEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textFieldEliminarIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminarProfesor))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabPane.addTab("Eliminar", jPanel3);

        buttonMostrarPrimerElemento.setText("mostar primer elemento");
        buttonMostrarPrimerElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarPrimerElementoActionPerformed(evt);
            }
        });

        buttonSueldoBruto.setText("Sueldo Bruto");
        buttonSueldoBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSueldoBrutoActionPerformed(evt);
            }
        });

        buttonmasde1500.setText("Profesores ganando mas de 1500 y menores de 40, no A");
        buttonmasde1500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmasde1500ActionPerformed(evt);
            }
        });

        buttonMayor40.setText("Promedio Sueldo mayor 40 años");
        buttonMayor40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMayor40ActionPerformed(evt);
            }
        });

        buttonTodosMayor2500.setText("¿Todos mayor a 2500?");
        buttonTodosMayor2500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTodosMayor2500ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(buttonMostrarPrimerElemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTodosMayor2500)
                .addGap(115, 115, 115))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(buttonSueldoBruto)
                        .addGap(172, 172, 172)
                        .addComponent(buttonMayor40))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(buttonmasde1500)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMostrarPrimerElemento)
                    .addComponent(buttonTodosMayor2500))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMayor40)
                    .addComponent(buttonSueldoBruto))
                .addGap(18, 18, 18)
                .addComponent(buttonmasde1500)
                .addGap(14, 14, 14))
        );

        jTabPane.addTab("Operaciones", jPanel4);

        textAreaProfesor.setColumns(20);
        textAreaProfesor.setRows(5);
        jScrollPane1.setViewportView(textAreaProfesor);

        buttonVerProfesores.setText("Ver Profesores");
        buttonVerProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabPane)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(buttonVerProfesores)))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTabPane)
                .addGap(18, 18, 18)
                .addComponent(buttonVerProfesores)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Integer obtenerIdProfesor(){
        return idProfesorGenerador++;
    }
    
    private void textFieldAgregarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAgregarEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAgregarEdadActionPerformed

    private void jButtonAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProfesorActionPerformed
        
        
        
        Profesor newProfesor = new Profesor();

        newProfesor.setIdProfesor(obtenerIdProfesor());
        newProfesor.setNombres(textFieldAgregarNombres.getText());
        newProfesor.setApellidos(textFieldAgregarApellidos.getText());
        newProfesor.setSueldo(Integer.parseInt(textFieldAgregarSueldo.getText()));
        newProfesor.setEdad(Integer.parseInt(textFieldAgregarEdad.getText()));
        try {
            
            if(newProfesor.getEdad()>=18){
                int listaLengthBefore = servicio.obtenerEntidades().size();
                int listaLengthAfter = servicio.crearEntidad(newProfesor);

                if (listaLengthBefore < listaLengthAfter) {
                    refreshTextAreaProfesors(servicio.obtenerEntidades());
                    textFieldAgregarNombres.setText("");
                    textFieldAgregarApellidos.setText("");
                    textFieldAgregarSueldo.setText("");
                    textFieldAgregarEdad.setText("");
                    JOptionPane.showMessageDialog(null, "Profesor agregado satisfactoriamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar el nuevo Profesor");
                }
            }
            else{
                throw new InvalidDataProfesorException("No cumple con la edad minima para ser profesor, debe tener 18 o más años");
            }
        } catch (InvalidDataProfesorException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonAgregarProfesorActionPerformed

    private void textFieldModificarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldModificarEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldModificarEdadActionPerformed

    private void textFieldBuscarIDProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarIDProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarIDProfesorActionPerformed

    private void buttonBuscarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarProfesorActionPerformed
        Profesor ProfesorBuscado;
        int idProfesor = Integer.valueOf(textFieldBuscarIDProfesor.getText());
        ProfesorBuscado = servicio.buscarEntidad(idProfesor);
        if (ProfesorBuscado != null) {
            textFieldModificarNombres.setText(ProfesorBuscado.getNombres());
            textFieldModificarApellidos.setText(ProfesorBuscado.getApellidos());
            textFieldModificarSueldo.setText(String.valueOf(ProfesorBuscado.getSueldo()));
            textFieldModificarEdad.setText(String.valueOf(ProfesorBuscado.getEdad()));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el id del cliente, verifique por favor.");
        }
        
    }//GEN-LAST:event_buttonBuscarProfesorActionPerformed

    private void buttonModificarDatosProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarDatosProfesorActionPerformed
        // TODO add your handling code here:
        Profesor profesorModifica = new Profesor();

        int idProfesor = Integer.valueOf(textFieldBuscarIDProfesor.getText());

        profesorModifica.setIdProfesor(idProfesor);
        profesorModifica.setNombres(textFieldModificarNombres.getText());
        profesorModifica.setApellidos(textFieldModificarApellidos.getText());
        profesorModifica.setSueldo(Integer.parseInt(textFieldModificarSueldo.getText()));
        profesorModifica.setEdad(Integer.parseInt(textFieldModificarEdad.getText()));

        int tamanioListaAntes = servicio.obtenerEntidades().size();
        int tamanioListaDespues = servicio.actualizarEntidad(profesorModifica);

        if (tamanioListaAntes == tamanioListaDespues) {
            refreshTextAreaProfesors(servicio.obtenerEntidades());
            textFieldBuscarIDProfesor.setText("");
            textFieldModificarNombres.setText("");
            textFieldModificarApellidos.setText("");
            textFieldModificarSueldo.setText("");
            textFieldModificarEdad.setText("");
            
            JOptionPane.showMessageDialog(null, "Cliente actualizado satisfactoriamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al actualizar los datos del cliente.");
        }
        
    }//GEN-LAST:event_buttonModificarDatosProfesorActionPerformed

    private void textFieldEliminarIDProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEliminarIDProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEliminarIDProfesorActionPerformed

    private void buttonEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarProfesorActionPerformed
         int idCliente = Integer.valueOf(textFieldEliminarIDProfesor.getText());

        int tamanioListaAntes = servicio.obtenerEntidades().size();
        int tamanioListaDespues = servicio.eliminarEntidad(idCliente);
        
        if(tamanioListaAntes>tamanioListaDespues){
            refreshTextAreaProfesors(servicio.obtenerEntidades());
            textFieldEliminarIDProfesor.setText("");
            JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente al cliente con id: "+idCliente);
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error o no se encontro el id del cliente, verifique por favor.");
        }
    }//GEN-LAST:event_buttonEliminarProfesorActionPerformed

    private void buttonMostrarPrimerElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarPrimerElementoActionPerformed
       List<Profesor> listProfTemp = new ArrayList<>();
       listProfTemp = servicio.mostrarPrimerElemento();
        refreshTextAreaProfesors(listProfTemp);
        
    }//GEN-LAST:event_buttonMostrarPrimerElementoActionPerformed

    private void buttonTodosMayor2500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTodosMayor2500ActionPerformed
        boolean tempBoolean;
        tempBoolean = servicio.todosMas2500();
        textAreaProfesor.setText(String.valueOf(tempBoolean));
                
    }//GEN-LAST:event_buttonTodosMayor2500ActionPerformed

    private void buttonSueldoBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSueldoBrutoActionPerformed
        List<Integer> listaSueldosBrutos = new ArrayList<>();
        List<Profesor> listaProfesors = new ArrayList<>();
        
        listaSueldosBrutos = servicio.sueldoBrutoAnual();
        listaProfesors = servicio.obtenerEntidades();
        
        
        textAreaProfesor.setText("");
        textAreaProfesor.append("IDPROFESOR\t");
        textAreaProfesor.append("NOMBRES\t");
        textAreaProfesor.append("APELLIDOS\t");
        textAreaProfesor.append("SUELDO\t");
        textAreaProfesor.append("EDAD\t");
        textAreaProfesor.append("SUELDOBRUTO\n\n");
        int c=0;
        for (Profesor profesor : listaProfesors){
            textAreaProfesor.append(profesor.getIdProfesor()+"\t");
            textAreaProfesor.append(profesor.getNombres()+"\t");
            textAreaProfesor.append(profesor.getApellidos()+"\t");
            textAreaProfesor.append(profesor.getSueldo()+"\t");
            textAreaProfesor.append(profesor.getEdad()+"\t");
            textAreaProfesor.append(String.valueOf(listaSueldosBrutos.get(c))+"\n");
            c++;
            
        }
    }//GEN-LAST:event_buttonSueldoBrutoActionPerformed

    private void buttonVerProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerProfesoresActionPerformed
        List<Profesor> listaProfesors = new ArrayList<>();
        listaProfesors = servicio.obtenerEntidades();
        refreshTextAreaProfesors(listaProfesors);
    }//GEN-LAST:event_buttonVerProfesoresActionPerformed

    private void buttonMayor40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMayor40ActionPerformed
        // TODO add your handling code here:
        double promSueldoMayor40 = servicio.promedioMayor40();
        textAreaProfesor.setText("el promedio del sueldo los profesores mayores a 40 años es: "+String.valueOf(promSueldoMayor40));
    }//GEN-LAST:event_buttonMayor40ActionPerformed

    private void buttonmasde1500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmasde1500ActionPerformed
        List<Profesor> listaProfesors = new ArrayList<>();
        listaProfesors = servicio.mas1500Menos40NoA();
        refreshTextAreaProfesors(listaProfesors);
    }//GEN-LAST:event_buttonmasde1500ActionPerformed

    public void refreshTextAreaProfesors(List<Profesor> listProf){
        textAreaProfesor.setText("");
        textAreaProfesor.append("IDPROFESOR\t");
        textAreaProfesor.append("NOMBRES\t");
        textAreaProfesor.append("APELLIDOS\t");
        textAreaProfesor.append("SUELDO\t");
        textAreaProfesor.append("EDAD\n\n");
        
        for (Profesor profesor : listProf){
            textAreaProfesor.append(profesor.getIdProfesor()+"\t");
            textAreaProfesor.append(profesor.getNombres()+"\t");
            textAreaProfesor.append(profesor.getApellidos()+"\t");
            textAreaProfesor.append(profesor.getSueldo()+"\t");
            textAreaProfesor.append(profesor.getEdad()+"\n");
            
            
        }
        
        
    }
    
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
            java.util.logging.Logger.getLogger(GUIProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscarProfesor;
    private javax.swing.JButton buttonEliminarProfesor;
    private javax.swing.JButton buttonMayor40;
    private javax.swing.JButton buttonModificarDatosProfesor;
    private javax.swing.JButton buttonMostrarPrimerElemento;
    private javax.swing.JButton buttonSueldoBruto;
    private javax.swing.JButton buttonTodosMayor2500;
    private javax.swing.JButton buttonVerProfesores;
    private javax.swing.JButton buttonmasde1500;
    private javax.swing.JButton jButtonAgregarProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabPane;
    private javax.swing.JTextArea textAreaProfesor;
    private javax.swing.JTextField textFieldAgregarApellidos;
    private javax.swing.JTextField textFieldAgregarEdad;
    private javax.swing.JTextField textFieldAgregarNombres;
    private javax.swing.JTextField textFieldAgregarSueldo;
    private javax.swing.JTextField textFieldBuscarIDProfesor;
    private javax.swing.JTextField textFieldEliminarIDProfesor;
    private javax.swing.JTextField textFieldModificarApellidos;
    private javax.swing.JTextField textFieldModificarEdad;
    private javax.swing.JTextField textFieldModificarNombres;
    private javax.swing.JTextField textFieldModificarSueldo;
    // End of variables declaration//GEN-END:variables
}
