/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import DB.ingresos_Egresos;
import PDF.Pdf;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author JERICOTH
 */
public class Principal extends javax.swing.JFrame {
      
    public Principal(String UA) {
         ingresos_Egresos a = new ingresos_Egresos();
         initComponents();
         usuario_activo.setText(UA);
         Cefectivo.setText(a.cantidad_Cuenta(UA, "Efectivo"));
         Cahorro.setText(a.cantidad_Cuenta(UA, "Ahorros"));
         Cbanco.setText(a.cantidad_Cuenta(UA, "Banco"));
         setIconImage(new ImageIcon(getClass().getResource("/Ventanas/pictures/c1.png")).getImage());
      
        
       
           

    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Cefectivo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cahorro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cbanco = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnActualizarGrafica = new javax.swing.JButton();
        pizarra = new javax.swing.JPanel();
        btnIngreso = new javax.swing.JButton();
        btnEgreso = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        usuario_activo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnConfigurarcuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EFECTIVO $");

        Cefectivo.setBackground(new java.awt.Color(0, 0, 0));
        Cefectivo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cefectivo.setText("0000000000");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AHORROS  $");

        Cahorro.setBackground(new java.awt.Color(0, 0, 0));
        Cahorro.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cahorro.setText("0000000000");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BANCO      $");

        Cbanco.setBackground(new java.awt.Color(0, 0, 0));
        Cbanco.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cbanco.setText("0000000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cbanco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cefectivo)
                    .addComponent(jLabel8)
                    .addComponent(Cahorro)
                    .addComponent(jLabel9)
                    .addComponent(Cbanco))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187), 3));

        btnActualizarGrafica.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarGrafica.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnActualizarGrafica.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/pictures/c2.png"))); // NOI18N
        btnActualizarGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnActualizarGrafica.setBorderPainted(false);
        btnActualizarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarGraficaActionPerformed(evt);
            }
        });

        pizarra.setBackground(new java.awt.Color(0, 102, 102));
        pizarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pizarraLayout = new javax.swing.GroupLayout(pizarra);
        pizarra.setLayout(pizarraLayout);
        pizarraLayout.setHorizontalGroup(
            pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        pizarraLayout.setVerticalGroup(
            pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnActualizarGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnIngreso.setBackground(new java.awt.Color(0, 102, 102));
        btnIngreso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso.setText("INGRESO");
        btnIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIngreso.setBorderPainted(false);
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        btnEgreso.setBackground(new java.awt.Color(0, 102, 102));
        btnEgreso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEgreso.setForeground(new java.awt.Color(255, 255, 255));
        btnEgreso.setText("EGRESO");
        btnEgreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEgreso.setBorderPainted(false);
        btnEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresoActionPerformed(evt);
            }
        });

        btnPDF.setBackground(new java.awt.Color(0, 102, 102));
        btnPDF.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("PDF");
        btnPDF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPDF.setBorderPainted(false);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USUARIO: ");

        usuario_activo.setBackground(new java.awt.Color(0, 0, 0));
        usuario_activo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        usuario_activo.setText("0000000000");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/pictures/c3.png"))); // NOI18N

        btnCerrarSesion.setBackground(new java.awt.Color(0, 102, 102));
        btnCerrarSesion.setForeground(new java.awt.Color(0, 102, 102));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/pictures/c4.png"))); // NOI18N
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnConfigurarcuenta.setBackground(new java.awt.Color(0, 102, 102));
        btnConfigurarcuenta.setForeground(new java.awt.Color(0, 102, 102));
        btnConfigurarcuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/pictures/c6.png"))); // NOI18N
        btnConfigurarcuenta.setBorderPainted(false);
        btnConfigurarcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarcuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(166, 166, 166)
                .addComponent(btnConfigurarcuenta))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(usuario_activo)))
                    .addComponent(btnConfigurarcuenta)
                    .addComponent(btnCerrarSesion))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
       String U = usuario_activo.getText();
       String A = Cahorro.getText();
       String E = Cefectivo.getText();
       String B = Cbanco.getText();
       
        Ingreso i = new Ingreso(U,A,E,B);
        i.setVisible(true);
        dispose();
        i.setTitle("Ingreso");
        i.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresoActionPerformed
       String U = usuario_activo.getText();
       String A = Cahorro.getText();
       String E = Cefectivo.getText();
       String B = Cbanco.getText();
       
        Egreso i = new Egreso(U,A,E,B);
        i.setVisible(true);
        dispose();
        i.setTitle("Egreso");
        i.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEgresoActionPerformed

    private void btnActualizarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarGraficaActionPerformed
       Graphics lapiz = pizarra.getGraphics();
       ingresos_Egresos IE = new ingresos_Egresos();
       String u=usuario_activo.getText();
// Variables de la gráfica
int comidas = IE.gastos_tipo(u, "Comidas"), 
        compras = IE.gastos_tipo(u, "Compras"), 
        viviendas = IE.gastos_tipo(u, "Viviendas"), 
        transportes = IE.gastos_tipo(u, "Transporte"), 
        vehiculos = IE.gastos_tipo(u, "Vehiculos"), 
        vidaentretenimiento = IE.gastos_tipo(u, "Vida y Entretenimiento"), 
        comunicaciones = IE.gastos_tipo(u, "Comunicaciones"), 
        gastosfinancieros = IE.gastos_tipo(u, "Gastos financieros"), 
        otros = IE.gastos_tipo(u, "Otros");























//De aqui para abajo no se modifica

int suma = comidas + compras + viviendas + transportes + vehiculos + vidaentretenimiento + comunicaciones + gastosfinancieros  + otros;
 
// Cálculo de los grados para cada segmento
int grados1 = comidas * 360 / suma;
int grados2 = compras * 360 / suma;
int grados3 = viviendas * 360 / suma;
int grados4 = transportes * 360 / suma;
int grados5 = vehiculos * 360 / suma;
int grados6 = vidaentretenimiento * 360 / suma;
int grados7 = comunicaciones * 360 / suma;
int grados8 = gastosfinancieros * 360 / suma;
int grados9 = otros * 360 / suma;

// Dibujado de la gráfica de pastel

//lapiz.fillArc(int x, int y, WIDTH, HEIGHT, NORMAL,bolean_raised );
lapiz.setColor(Color.red);
lapiz.fillArc(280, 60, 230, 230,0, grados1);
lapiz.fillRect(100, 40, 20, 20);
lapiz.drawString("Comidas", 135, 55);

lapiz.setColor(Color.blue);
lapiz.fillArc(280, 60, 230, 230, grados1, grados2);
lapiz.fillRect(100, 70, 20, 20);
lapiz.drawString("Compras", 135, 85);

lapiz.setColor(Color.green);
lapiz.fillArc(280, 60, 230, 230, grados1 + grados2, grados3);
lapiz.fillRect(100, 100, 20, 20);
lapiz.drawString("Viviendas", 135, 115);

lapiz.setColor(Color.yellow);
lapiz.fillArc(280, 60, 230, 230, grados1 + grados2 + grados3, grados4);
lapiz.fillRect(100, 130, 20, 20);
lapiz.drawString("Transportes", 135, 145);

lapiz.setColor(Color.black);
lapiz.fillArc(280, 60, 230, 230, grados1 + grados2 + grados3 + grados4, grados5);
lapiz.fillRect(100, 160, 20, 20);
lapiz.drawString("Vehículos", 135, 175);

lapiz.setColor(Color.cyan);
lapiz.fillArc(280, 60, 230, 230, grados1 + grados2 + grados3 + grados4 + grados5, grados6);
lapiz.fillRect(550, 40, 20, 20);
lapiz.drawString("Vida y Entretenimiento", 585, 55);

lapiz.setColor(Color.pink);
lapiz.fillArc(280, 60, 230, 230, grados1 + grados2 + grados3 + grados4 + grados5 + grados6, grados7);
lapiz.fillRect(550, 70, 20, 20);
lapiz.drawString("Comunicaciones", 585, 85);

lapiz.setColor(Color.gray);
lapiz.fillArc(280, 60, 230, 230,grados1 + grados2 + grados3 + grados4 + grados5 + grados6 + grados7, grados8);
lapiz.fillRect(550, 100, 20, 20);
lapiz.drawString("Gastos Financieros", 585, 115);

lapiz.setColor(Color.magenta);
lapiz.fillArc(280, 60, 230, 230,grados1 + grados2 + grados3 + grados4 + grados5 + grados6 + grados7 + grados8, grados9);
lapiz.fillRect(550, 130, 20, 20);
lapiz.drawString("Otros", 585, 145);
    }//GEN-LAST:event_btnActualizarGraficaActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        Pdf p = new Pdf();
        p.reporte_PDF(usuario_activo.getText());
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
             Login v = new Login ();
             v.setVisible(true);
             dispose();
             v.setTitle("Inciar Sesion");
             v.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnConfigurarcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarcuentaActionPerformed
             Cuenta v= new Cuenta (usuario_activo.getText());
             dispose();
             v.setVisible(true);
             v.setTitle("Configuracion de usuario");
             v.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConfigurarcuentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       String UA="0000000000";
        Principal v= new Principal (UA);
        
        v.setVisible(true);
             v.setTitle("Finanzas");
             v.setLocationRelativeTo(null);
        
   /*     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    */}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cahorro;
    private javax.swing.JLabel Cbanco;
    private javax.swing.JLabel Cefectivo;
    private javax.swing.JButton btnActualizarGrafica;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfigurarcuenta;
    private javax.swing.JButton btnEgreso;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pizarra;
    private javax.swing.JLabel usuario_activo;
    // End of variables declaration//GEN-END:variables
}
