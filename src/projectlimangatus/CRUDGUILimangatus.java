/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectlimangatus;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JFileChooser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author THINKPAD
 */
public class CRUDGUILimangatus extends javax.swing.JFrame {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
    EntityManager em = emf.createEntityManager();
    Connection konz = em.unwrap(java.sql.Connection.class);

    /**
     * Creates new form GUISederhana
     */
    public CRUDGUILimangatus() {
        initComponents();
        tampilanTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelKodeProdi = new javax.swing.JLabel();
        jLabelNamaProdi = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelJenjang = new javax.swing.JLabel();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jLabelNamaKaprodi = new javax.swing.JLabel();
        jTextFieldNamaPenerbit = new javax.swing.JTextField();
        jLabelJudul = new javax.swing.JLabel();
        jButtonReport = new javax.swing.JButton();
        jButtonUploadCSV = new javax.swing.JButton();
        jLabelNamaFile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelKodeProdi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelKodeProdi.setText("ISBN");

        jLabelNamaProdi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNamaProdi.setText("Judul Buku");

        jTextFieldJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBukuActionPerformed(evt);
            }
        });

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabelJenjang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJenjang.setText("Tahun Terbit");

        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });

        jLabelNamaKaprodi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNamaKaprodi.setText("Penerbit");

        jTextFieldNamaPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaPenerbitActionPerformed(evt);
            }
        });

        jLabelJudul.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJudul.setText("Data Buku");
        jLabelJudul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonReport.setText("Report");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jButtonUploadCSV.setText("Upload CSV");
        jButtonUploadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadCSVActionPerformed(evt);
            }
        });

        jLabelNamaFile.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelNamaFile.setText("File not found...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNamaProdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKodeProdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJenjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNamaKaprodi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldISBN)
                            .addComponent(jTextFieldJudulBuku)
                            .addComponent(jTextFieldTahunTerbit)
                            .addComponent(jTextFieldNamaPenerbit)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNamaFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUploadCSV))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSimpan)
                                    .addComponent(jButtonHapus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKodeProdi)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamaProdi)
                            .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJenjang)
                            .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamaKaprodi)
                            .addComponent(jTextFieldNamaPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUploadCSV)
                            .addComponent(jLabelNamaFile))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBukuActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        em.getTransaction().begin();
        Buku updateBuku = em.find(Buku.class, jTextFieldISBN.getText());
        updateBuku.setIsbn(jTextFieldISBN.getText());
        updateBuku.setJudulBuku(jTextFieldJudulBuku.getText());
        updateBuku.setTahunTerbit(jTextFieldTahunTerbit.getText());
        updateBuku.setPenerbit(jTextFieldNamaPenerbit.getText());
        em.getTransaction().commit();
        tampilanTabel();
        kosongkanTextField();
        JOptionPane.showMessageDialog(null, "Perbaruan Data Berhasil");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    private void jTextFieldNamaPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaPenerbitActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        em.getTransaction().begin();
        for (int i = 0; i < jTable2.getSelectedRowCount(); i++) {
            String selectedRows = jTable2.getModel().getValueAt(i, 0).toString();
            Buku hapusBook = em.find(Buku.class, selectedRows);
            em.remove(hapusBook);
        }
        em.getTransaction().commit();
        tampilanTabel();
        kosongkanTextField();
        JOptionPane.showMessageDialog(rootPane, "Penghapusan Data Berhasil");
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        em.getTransaction().begin();
        Buku simpanBuku = new Buku();
        simpanBuku.setIsbn(jTextFieldISBN.getText());
        simpanBuku.setJudulBuku(jTextFieldJudulBuku.getText());
        simpanBuku.setTahunTerbit(jTextFieldTahunTerbit.getText());
        simpanBuku.setPenerbit(jTextFieldNamaPenerbit.getText());
        em.persist(simpanBuku);
        em.getTransaction().commit();
        tampilanTabel();
        kosongkanTextField();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        String tabel_klik = jTable2.getModel().getValueAt(row, 0).toString();
        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        AbstractQuery<Buku> cq = cb.createQuery(Buku.class);

        Root<Buku> buku = cq.from(Buku.class);

        cq.where(cb.equal(buku.get("isbn"), tabel_klik));
        CriteriaQuery<Buku> select = ((CriteriaQuery<Buku>) cq).select(buku);
        TypedQuery<Buku> q = em.createQuery(select);
        List<Buku> list = q.getResultList();

        for (Buku b : list) {
            jTextFieldISBN.setText(b.getIsbn());
            jTextFieldJudulBuku.setText(b.getJudulBuku());
            jTextFieldTahunTerbit.setText(b.getTahunTerbit());
            jTextFieldNamaPenerbit.setText(b.getPenerbit());
        }

        em.getTransaction().commit();

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        // TODO add your handling code here:
        try {
            em.getTransaction().begin();
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("ReportLimangatus.jasper"), null, em.unwrap(java.sql.Connection.class));
            JasperViewer.viewReport(jp, false);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonReportActionPerformed

    private void jButtonUploadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadCSVActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser filechooser = new JFileChooser();
            int i = filechooser.showOpenDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = filechooser.getSelectedFile();
                String filepath = f.getPath();
                String fi = f.getName();
                jLabelNamaFile.setText(fi);
                InputStreamReader isr = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(isr);
                em.getTransaction().begin();
                for (CSVRecord csvRecord : csvParser) {
                    Buku csvSimpanBuku = new Buku();
                    csvSimpanBuku.setIsbn(csvRecord.get(0));
                    csvSimpanBuku.setJudulBuku(csvRecord.get(1));
                    csvSimpanBuku.setTahunTerbit(csvRecord.get(2));
                    csvSimpanBuku.setPenerbit(csvRecord.get(3));
                    em.persist(csvSimpanBuku);
                }
                em.getTransaction().commit();
                tampilanTabel();
                kosongkanTextField();
                JOptionPane.showMessageDialog(null, "Upload CSV Berhasil");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonUploadCSVActionPerformed

    private void tampilanTabel() {
        // membuat tampilan model tabel
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);

        Root<Buku> buku = cq.from(Buku.class);

        cq.multiselect(buku.get("isbn"), buku.get("judulBuku"), buku.get("tahunTerbit"), buku.get("penerbit"));
        CriteriaQuery<Buku> select = cq.select(buku);
        TypedQuery<Buku> q = em.createQuery(select);
        List<Buku> list = q.getResultList();

        for (Buku b : list) {
            model.addRow(new Object[]{b.getIsbn(), b.getJudulBuku(), b.getTahunTerbit(), b.getPenerbit()});
        }

        em.getTransaction().commit();

    }

    private void kosongkanTextField() {
        jTextFieldISBN.setText(null);
        jTextFieldJudulBuku.setText(null);
        jTextFieldTahunTerbit.setText(null);
        jTextFieldNamaPenerbit.setText(null);
//        jLabelNamaFile.setText("File not found...");
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
            java.util.logging.Logger.getLogger(CRUDGUILimangatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDGUILimangatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDGUILimangatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDGUILimangatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDGUILimangatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUploadCSV;
    private javax.swing.JLabel jLabelJenjang;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelKodeProdi;
    private javax.swing.JLabel jLabelNamaFile;
    private javax.swing.JLabel jLabelNamaKaprodi;
    private javax.swing.JLabel jLabelNamaProdi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldNamaPenerbit;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
