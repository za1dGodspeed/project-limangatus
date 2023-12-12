/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package main;

import dao.Buku;
import dao.Credentials;
import dao.Kategori;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THINKPAD
 */
public class DataBuku extends javax.swing.JDialog {

    /**
     * Creates new form DataCredentials
     */
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
    EntityManager em = emf.createEntityManager();
    public String isbn;
    public String judul_buku;
    public String penerbit;
    public String tahun_terbit;
    
    
    public DataBuku(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableModel();
        loadData();
    }

    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnCount(0);
        model.addColumn("ISBN");
        model.addColumn("Judul Buku");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Kategori");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<Buku> bukuRoot = cq.from(Buku.class);
        Join<Buku, Kategori> kategoriJoin = bukuRoot.join("idKategori", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judulBuku"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahunTerbit"),
                bukuRoot.get("gambar"),
                kategoriJoin.get("namaKategori")
        );

        TypedQuery<Object[]> query = em.createQuery(cq);
        List<Object[]> resultList = query.getResultList();
        for (Object[] row : resultList) {
            byte[] imageBytes = (byte[]) row[4]; // Assuming the index 4 corresponds to the 'gambar' field
            ImageIcon imageIcon = new ImageIcon(imageBytes);

            model.addRow(new Object[]{
                row[0], // isbn
                row[1], // judulBuku
                row[2], // penerbit
                row[3], // tahunTerbit
                row[5], // kategori
            });
        }
        em.getTransaction().commit();
    }

    private void loadData() {
        getData((DefaultTableModel) jTable1.getModel());

    }

    public void cariData() {
       String[] valueModel = {"isbn", "judulBuku", "penerbit", "tahunTerbit", "namaKategori"};
        if (jComboBoxCari.getSelectedIndex() == 4) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

            Root<Buku> bukuRoot = cq.from(Buku.class);
            Join<Buku, Kategori> kategoriJoin = bukuRoot.join("idKategori", JoinType.INNER);
            cq.where(cb.like(cb.upper(kategoriJoin.get(valueModel[jComboBoxCari.getSelectedIndex()])), "%" + textFieldCari.getText().toUpperCase() + "%"));
            cq.multiselect(
                    bukuRoot.get("isbn"),
                    bukuRoot.get("judulBuku"),
                    bukuRoot.get("penerbit"),
                    bukuRoot.get("tahunTerbit"),
                    bukuRoot.get("gambar"),
                    kategoriJoin.get("namaKategori")
            );

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> resultList = query.getResultList();
            for (Object[] row : resultList) {
                byte[] imageBytes = (byte[]) row[4]; // Assuming the index 4 corresponds to the 'gambar' field
                ImageIcon imageIcon = new ImageIcon(imageBytes);

                model.addRow(new Object[]{
                    row[0], // isbn
                    row[1], // judulBuku
                    row[2], // penerbit
                    row[3], // tahunTerbit
                    row[5], // kategori
                    imageIcon // gambar
                });
            }
            em.getTransaction().commit();
            
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

            Root<Buku> bukuRoot = cq.from(Buku.class);
            Join<Buku, Kategori> kategoriJoin = bukuRoot.join("idKategori", JoinType.INNER);
            cq.where(cb.like(cb.upper(bukuRoot.get(valueModel[jComboBoxCari.getSelectedIndex()])), "%" + textFieldCari.getText().toUpperCase() + "%"));
            cq.multiselect(
                    bukuRoot.get("isbn"),
                    bukuRoot.get("judulBuku"),
                    bukuRoot.get("penerbit"),
                    bukuRoot.get("tahunTerbit"),
                    bukuRoot.get("gambar"),
                    kategoriJoin.get("namaKategori")
            );

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> resultList = query.getResultList();
            for (Object[] row : resultList) {
                byte[] imageBytes = (byte[]) row[4]; // Assuming the index 4 corresponds to the 'gambar' field
                ImageIcon imageIcon = new ImageIcon(imageBytes);

                model.addRow(new Object[]{
                    row[0], // isbn
                    row[1], // judulBuku
                    row[2], // penerbit
                    row[3], // tahunTerbit
                    row[5], // kategori
                    imageIcon // gambar
                });
            }
            em.getTransaction().commit();
        }

    }
    
    private void pilihData() {
        int row = jTable1.getSelectedRow();
        
        this.isbn = jTable1.getValueAt(row, 0).toString();
        this.judul_buku = jTable1.getValueAt(row, 1).toString();
        this.penerbit = jTable1.getValueAt(row, 2).toString();
        this.tahun_terbit = jTable1.getValueAt(row, 3).toString();
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldCari = new javax.swing.JTextField();
        jComboBoxCari = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textFieldCari.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldCari.setToolTipText("");
        textFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldCariKeyReleased(evt);
            }
        });

        jComboBoxCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul", "Penerbit", "Tahun Terbit", "Kategori" }));
        jComboBoxCari.setKeySelectionManager(null);
        jComboBoxCari.setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Data Buku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCariKeyReleased
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_textFieldCariKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        pilihData();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBuku dialog = new DataBuku(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textFieldCari;
    // End of variables declaration//GEN-END:variables
}
