/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Nuha
 */
public class page2 extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    public page2() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(785, 528));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Specialist On:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 80));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 130, 40));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gynecologist");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 260, 60));

        jButton2.setBackground(new java.awt.Color(153, 51, 255));
        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cardiologist");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, 60));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Neurologist");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 260, 60));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Dermatologist");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 260, 60));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Orthopedics");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 260, 60));

        jButton7.setBackground(new java.awt.Color(153, 51, 255));
        jButton7.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Psychiatrist");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 260, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/fggf.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fr);
            
            bw.write(" der");
            bw.close();
            
        }
        catch(Exception e){
            
        }
        String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
        new page6().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            try (BufferedWriter bw = new BufferedWriter(fr)) {
                bw.write(" gy");
            }
            
        }
        catch(Exception e){
            
        }
                String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
      
        new page6().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fr);
            
            bw.write(" car");
            bw.close();
            
        }
        catch(Exception e){
            
        }
        String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
        new page6().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fr);
            
            bw.write(" neu");
            bw.close();
            
        }
        catch(Exception e){
            
        }
               String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
        new page6().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new page3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fr);
            
            bw.write(" psy");
            bw.close();
            
        }
        catch(Exception e){
            
        }
                String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
        new page6().setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            FileWriter fr = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fr);
            
            bw.write(" or");
            bw.close();
            
        }
        catch(Exception e){
            
        }
                String area = null;
        String doc = null;
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                area = sc.next();
                doc = sc.next();
            }
            sc.close();
            
        }
        catch(Exception s){ }
        
        try{
            BufferedReader br;
            try (FileReader fr = new FileReader("output.txt")) {
                br = new BufferedReader(fr);
                try (FileWriter fw = new FileWriter("final.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
                    String line;
                    while((line = br.readLine())!=null){
                        String [] str = line.split(" ");
                        if((area.compareTo(str[0])==0) &&(doc.compareTo(str[1])==0)){
                        bw.write(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        bw.newLine();
                        System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]);
                        
                        }
                        
                        
                        
                        
                    }                  }
            }
            br.close();
            
            
        }
        catch(Exception k){}
        new page6().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
