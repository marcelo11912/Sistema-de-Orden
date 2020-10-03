/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaginaPrincipal;

import Controlador.EventoTeclas;
import Controlador.Orden.EventoOrden;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user1
 */
public class PanelOrden extends javax.swing.JPanel {

    EventoTeclas teclas = new EventoTeclas();
    EventoOrden orden = new EventoOrden();

    public PanelOrden() {
        initComponents();

        this.fFechaOrden.setText(formatDate(new Date()));
        this.fId.setVisible(false);
        orden.generarNumero(fNumOrden);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEncontrados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fNombreEmpresa = new javax.swing.JTextField();
        fNombreApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fFechaOrden = new javax.swing.JTextField();
        fNumOrden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cEstadoOrden = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrden = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        fServicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fSubTotal = new javax.swing.JTextField();
        fIva0 = new javax.swing.JTextField();
        fIva12 = new javax.swing.JTextField();
        fTotal = new javax.swing.JTextField();
        fId = new javax.swing.JTextField();
        fSaldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JBuscarM = new rsbuttom.RSButtonMetro();
        jAgregar = new rsbuttom.RSButtonMetro();
        fEliminar = new rsbuttom.RSButtonMetro();
        fGuardar = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));

        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBuscarKeyTyped(evt);
            }
        });

        jListEncontrados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 102, 0))); // NOI18N
        jListEncontrados.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jListEncontrados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEncontradosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListEncontrados);

        jLabel1.setText("NOMBRE DE EMPRESA:");

        jLabel2.setText("NOMBRE Y APELLIDO:");

        fNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNombreEmpresaKeyTyped(evt);
            }
        });

        fNombreApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNombreApellidoKeyTyped(evt);
            }
        });

        jLabel3.setText("Nº. DE ORDEN:");

        jLabel4.setText("FECHA DE ORDEN:");

        fFechaOrden.setEditable(false);

        fNumOrden.setEditable(false);
        fNumOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNumOrdenKeyTyped(evt);
            }
        });

        jLabel5.setText("ESTADO:");

        cEstadoOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAGADA", "ABONADO", "NO PAGADO" }));
        cEstadoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstadoOrdenActionPerformed(evt);
            }
        });

        tableOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "SERVICIO", "CANTIDAD", "PRECIO UNITARIO", "PRECIO TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tableOrden);

        jLabel6.setText("SERVICIO:");

        fServicio.setEditable(false);

        jLabel7.setText("PRECIO:");

        fPrecio.setEditable(false);

        jLabel8.setText("CANTIDAD:");

        fCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCantidadKeyTyped(evt);
            }
        });

        jLabel9.setText("SUB TOTAL:");

        jLabel10.setText("IVA 0%:");

        jLabel11.setText("IVA 12%:");

        jLabel12.setText("TOTAL:");

        fSubTotal.setEditable(false);

        fIva0.setEditable(false);

        fIva12.setEditable(false);

        fTotal.setEditable(false);

        fId.setEditable(false);

        fSaldo.setEnabled(false);
        fSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fSaldoKeyTyped(evt);
            }
        });

        jLabel13.setText("ABONO:");

        JBuscarM.setBackground(new java.awt.Color(255, 51, 51));
        JBuscarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoDisponible.png"))); // NOI18N
        JBuscarM.setText("SERVICIOS DISPONIBLES");
        JBuscarM.setColorHover(new java.awt.Color(153, 0, 0));
        JBuscarM.setColorNormal(new java.awt.Color(255, 51, 51));
        JBuscarM.setColorPressed(new java.awt.Color(204, 0, 0));
        JBuscarM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarMActionPerformed(evt);
            }
        });

        jAgregar.setBackground(new java.awt.Color(255, 51, 51));
        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoAgregar.png"))); // NOI18N
        jAgregar.setText("AGREGAR");
        jAgregar.setColorHover(new java.awt.Color(153, 0, 0));
        jAgregar.setColorNormal(new java.awt.Color(255, 51, 51));
        jAgregar.setColorPressed(new java.awt.Color(204, 0, 0));
        jAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        fEliminar.setBackground(new java.awt.Color(255, 51, 51));
        fEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoEliminar.png"))); // NOI18N
        fEliminar.setText("ELIMINAR");
        fEliminar.setColorHover(new java.awt.Color(153, 0, 0));
        fEliminar.setColorNormal(new java.awt.Color(255, 51, 51));
        fEliminar.setColorPressed(new java.awt.Color(204, 0, 0));
        fEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEliminarActionPerformed(evt);
            }
        });

        fGuardar.setBackground(new java.awt.Color(255, 51, 51));
        fGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoGuardar.png"))); // NOI18N
        fGuardar.setText("GUARDAR");
        fGuardar.setColorHover(new java.awt.Color(153, 0, 0));
        fGuardar.setColorNormal(new java.awt.Color(255, 51, 51));
        fGuardar.setColorPressed(new java.awt.Color(204, 0, 0));
        fGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(fCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fFechaOrden)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(fEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(fGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGap(753, 753, 753))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(fId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(JBuscarM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(554, 554, 554)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fIva0, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fIva12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(fCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(fIva0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fIva12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(fTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(fId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
public static String formatDate(Date fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoDelTexto.format(fecha);

    }
    private void jListEncontradosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEncontradosValueChanged
        orden.listaEncontrados(fId, fServicio, fPrecio, jListEncontrados);
    }//GEN-LAST:event_jListEncontradosValueChanged

    private void fNombreEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNombreEmpresaKeyTyped
        teclas.letraMayuscula(evt);
    }//GEN-LAST:event_fNombreEmpresaKeyTyped

    private void fNombreApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNombreApellidoKeyTyped
        teclas.letraMayuscula(evt);
    }//GEN-LAST:event_fNombreApellidoKeyTyped

    private void jBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyTyped
        teclas.letraMayuscula(evt);
    }//GEN-LAST:event_jBuscarKeyTyped

    private void fCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCantidadKeyTyped
        teclas.numeros(evt);
    }//GEN-LAST:event_fCantidadKeyTyped

    private void fNumOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNumOrdenKeyTyped
        teclas.numeros(evt);
    }//GEN-LAST:event_fNumOrdenKeyTyped

    private void fSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fSaldoKeyTyped
        teclas.numeros(evt);
    }//GEN-LAST:event_fSaldoKeyTyped

    private void cEstadoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstadoOrdenActionPerformed

        orden.accionCombobox(cEstadoOrden, fSaldo);
    }//GEN-LAST:event_cEstadoOrdenActionPerformed

    private void JBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarMActionPerformed
        orden.ActualizarLista(jBuscar, jListEncontrados);
    }//GEN-LAST:event_JBuscarMActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed

        orden.agregar(fTotal, fSubTotal, fIva0, fIva12, fCantidad, fServicio, fPrecio, fId, tableOrden, fNombreApellido, fNombreEmpresa, fNumOrden, cEstadoOrden, fSaldo);
    }//GEN-LAST:event_jAgregarActionPerformed

    private void fEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEliminarActionPerformed
        orden.Eliminar(tableOrden);

    }//GEN-LAST:event_fEliminarActionPerformed

    private void fGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fGuardarActionPerformed

        orden.Guardar(cEstadoOrden, fSubTotal, fSaldo, fTotal, fNombreEmpresa, fNombreApellido, fFechaOrden, fNumOrden, tableOrden);
        orden.generarNumero(fNumOrden);
    }//GEN-LAST:event_fGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro JBuscarM;
    private javax.swing.JComboBox cEstadoOrden;
    private javax.swing.JTextField fCantidad;
    private rsbuttom.RSButtonMetro fEliminar;
    private javax.swing.JTextField fFechaOrden;
    private rsbuttom.RSButtonMetro fGuardar;
    private javax.swing.JTextField fId;
    private javax.swing.JTextField fIva0;
    private javax.swing.JTextField fIva12;
    private javax.swing.JTextField fNombreApellido;
    private javax.swing.JTextField fNombreEmpresa;
    private javax.swing.JTextField fNumOrden;
    private javax.swing.JTextField fPrecio;
    private javax.swing.JTextField fSaldo;
    private javax.swing.JTextField fServicio;
    private javax.swing.JTextField fSubTotal;
    private javax.swing.JTextField fTotal;
    private rsbuttom.RSButtonMetro jAgregar;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListEncontrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableOrden;
    // End of variables declaration//GEN-END:variables

    private void numeros(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}