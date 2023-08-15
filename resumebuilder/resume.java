package resumebuilder;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class resume extends javax.swing.JFrame {

    public resume() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        cv = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        location = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resume builder by suraj");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(150, 50));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(null);

        cv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cv.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        cv.setMinimumSize(new java.awt.Dimension(78, 28));
        cv.setText("RESUME");
        cv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(cv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 897, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("PERSONAL INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(11, 52, 314, 50);

        jLabel2.setText("first name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(11, 105, 66, 18);

        jLabel4.setText("Surname :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(11, 138, 58, 18);

        jLabel5.setText("Address line 1 :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 90, 18);

        jLabel6.setText("Address line 2 :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 220, 90, 33);

        jLabel7.setText("post code :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 270, 66, 18);

        jLabel8.setText("Nationality :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 320, 69, 18);

        jLabel9.setText("date of birth :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 370, 84, 18);

        jLabel10.setText("contact :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 420, 84, 18);

        jLabel11.setText("email :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 460, 48, 18);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(212, 102, 190, 24);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(212, 138, 190, 24);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(212, 180, 190, 24);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 220, 190, 24);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 270, 190, 24);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 310, 190, 24);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(210, 360, 190, 24);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(210, 410, 190, 24);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(210, 460, 190, 24);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("SKILLS");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(455, 52, 161, 50);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(455, 102, 126, 24);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(599, 102, 110, 24);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(455, 138, 126, 24);

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(777, 6, 48, 18);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("WORK EXPERIENCE");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(455, 210, 232, 50);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(599, 138, 110, 24);

        jLabel16.setText("company name :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(455, 281, 110, 18);

        jLabel17.setText("work done :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(455, 323, 87, 18);

        jLabel18.setText("Company name :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(455, 356, 110, 18);

        jLabel19.setText("work done :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(455, 398, 110, 18);

        jLabel20.setText("Company name :");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(455, 443, 110, 18);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(455, 614, 48, 0);

        jLabel22.setText("Work done :");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(455, 482, 99, 18);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15);
        jTextField15.setBounds(583, 278, 276, 24);
        getContentPane().add(jTextField16);
        jTextField16.setBounds(583, 320, 276, 24);
        getContentPane().add(jTextField17);
        jTextField17.setBounds(583, 356, 276, 24);
        getContentPane().add(jTextField18);
        jTextField18.setBounds(583, 398, 276, 24);
        getContentPane().add(jTextField19);
        jTextField19.setBounds(583, 440, 276, 24);
        getContentPane().add(jTextField20);
        jTextField20.setBounds(583, 482, 276, 24);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("QUALIFICATION");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 530, 304, 52);

        jLabel23.setText("COLLEGE/UNIVERSITY :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 590, 168, 18);

        jLabel24.setText("TITLE OF QUALIFICATION A :");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 630, 180, 18);

        jLabel25.setText("TITLE OF QUALIFICATION B :");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(20, 670, 190, 18);
        getContentPane().add(jTextField21);
        jTextField21.setBounds(220, 580, 310, 24);
        getContentPane().add(jTextField22);
        jTextField22.setBounds(220, 620, 310, 24);
        getContentPane().add(jTextField23);
        jTextField23.setBounds(220, 660, 310, 24);

        jButton1.setText("GENERATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 530, 130, 30);

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(710, 570, 130, 30);

        jButton4.setText("Image");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(770, 190, 72, 24);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(730, 40, 150, 130);
        getContentPane().add(location);
        location.setBounds(480, 190, 240, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvActionPerformed

    }//GEN-LAST:event_cvActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            private Object panel_print;
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47, 0.47);

                jButton1.print(g2);

                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = job.printDialog();
        if (ok) {
            try {

                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser =new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image","jpg","png");
        fileChooser.addChoosableFileFilter(filter);
        int rs = fileChooser.showSaveDialog(null);
        if(rs==JFileChooser.APPROVE_OPTION){
            File selectedImage=fileChooser.getSelectedFile();
            location.setText(selectedImage.getAbsolutePath());
            jLabel26.setIcon(resize(location.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public ImageIcon resize(String path){
        ImageIcon myImg = new ImageIcon(path);
        Image image = myImg.getImage();
        Image newImage = image.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(newImage);
        return finalImage;
    }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextField1.setText(null);
       jTextField2.setText(null);
       jTextField3.setText(null);
       jTextField4.setText(null);
       jTextField5.setText(null);
       jTextField6.setText(null);
       jTextField7.setText(null);
       jTextField8.setText(null);
       jTextField9.setText(null);
       jTextField10.setText(null);
       jTextField11.setText(null);
       jTextField12.setText(null);
       jTextField14.setText(null);
       jTextField15.setText(null);
       jTextField16.setText(null);
       jTextField17.setText(null);
       jTextField18.setText(null);
       jTextField20.setText(null);
       jTextField21.setText(null);
       jTextField2.setText(null);
       jTextField23.setText(null);
       jLabel26.setIcon(null);
       
         
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resume().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField cv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel location;
    // End of variables declaration//GEN-END:variables
}
