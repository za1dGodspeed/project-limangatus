/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import dao.Kategori;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THINKPAD
 */
public class FormKategori extends javax.swing.JPanel {

    /**
     * Creates new form FormPeminjaman
     */
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
    EntityManager em = emf.createEntityManager();

    public FormKategori() {
        initComponents();
        setOpaque(false);
        setTableModel();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTanggalBergabung = new model.DateChooser();
        dateTanggalKembali = new model.DateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelMain = new com.raven.swing.RoundPanel();
        panelView = new com.raven.swing.RoundPanel();
        buttonTambahView = new model.Button();
        jLabelDataPeminjamanBukuView = new javax.swing.JLabel();
        jScrollPaneDataKategoriBukuView = new javax.swing.JScrollPane();
        jTableDataKategoriBukuView = new javax.swing.JTable();
        buttonHapusView = new model.Button();
        buttonBatalView = new model.Button();
        jComboBoxCari = new javax.swing.JComboBox<>();
        textFieldCari = new javax.swing.JTextField();
        panelAdd = new com.raven.swing.RoundPanel();
        buttonSimpanAdd = new model.Button();
        buttonBatalAdd = new model.Button();
        jLabelTambahDataKategoriBukuAdd = new javax.swing.JLabel();
        jLabelIdMahasiswa = new javax.swing.JLabel();
        textFieldNamaKategori = new model.TextField();
        jLabelIdMahasiswa1 = new javax.swing.JLabel();
        textFieldIdKategori = new model.TextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(55, 55, 55));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(55, 55, 55));

        buttonTambahView.setBackground(new java.awt.Color(31, 85, 20));
        buttonTambahView.setForeground(new java.awt.Color(228, 229, 241));
        buttonTambahView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah20x20.png"))); // NOI18N
        buttonTambahView.setText("Tambah");
        buttonTambahView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahViewActionPerformed(evt);
            }
        });

        jLabelDataPeminjamanBukuView.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelDataPeminjamanBukuView.setForeground(new java.awt.Color(242, 242, 242));
        jLabelDataPeminjamanBukuView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kategori20x20.png"))); // NOI18N
        jLabelDataPeminjamanBukuView.setText("Data Kategori Buku");

        jTableDataKategoriBukuView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDataKategoriBukuView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataKategoriBukuViewMouseClicked(evt);
            }
        });
        jScrollPaneDataKategoriBukuView.setViewportView(jTableDataKategoriBukuView);

        buttonHapusView.setBackground(new java.awt.Color(31, 85, 20));
        buttonHapusView.setForeground(new java.awt.Color(228, 229, 241));
        buttonHapusView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hapus20x20.png"))); // NOI18N
        buttonHapusView.setText("Hapus");
        buttonHapusView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusViewActionPerformed(evt);
            }
        });

        buttonBatalView.setBackground(new java.awt.Color(31, 85, 20));
        buttonBatalView.setForeground(new java.awt.Color(228, 229, 241));
        buttonBatalView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/batal20x20.png"))); // NOI18N
        buttonBatalView.setText("Batal");
        buttonBatalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalViewActionPerformed(evt);
            }
        });

        jComboBoxCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama" }));
        jComboBoxCari.setKeySelectionManager(null);
        jComboBoxCari.setName(""); // NOI18N

        textFieldCari.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldCari.setToolTipText("");
        textFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldCariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDataKategoriBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(jLabelDataPeminjamanBukuView)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(buttonTambahView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapusView, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatalView, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataPeminjamanBukuView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonTambahView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonHapusView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonBatalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDataKategoriBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(55, 55, 55));

        buttonSimpanAdd.setBackground(new java.awt.Color(31, 85, 20));
        buttonSimpanAdd.setForeground(new java.awt.Color(228, 229, 241));
        buttonSimpanAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan20x20.png"))); // NOI18N
        buttonSimpanAdd.setText("Simpan");
        buttonSimpanAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanAddActionPerformed(evt);
            }
        });

        buttonBatalAdd.setBackground(new java.awt.Color(31, 85, 20));
        buttonBatalAdd.setForeground(new java.awt.Color(228, 229, 241));
        buttonBatalAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/batal20x20.png"))); // NOI18N
        buttonBatalAdd.setText("Batal");
        buttonBatalAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalAddActionPerformed(evt);
            }
        });

        jLabelTambahDataKategoriBukuAdd.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelTambahDataKategoriBukuAdd.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTambahDataKategoriBukuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kategori20x20.png"))); // NOI18N
        jLabelTambahDataKategoriBukuAdd.setText("Tambah Data Kategori Buku");

        jLabelIdMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelIdMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelIdMahasiswa.setText("ID Kategori");

        textFieldNamaKategori.setToolTipText("");

        jLabelIdMahasiswa1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelIdMahasiswa1.setForeground(new java.awt.Color(242, 242, 242));
        jLabelIdMahasiswa1.setText("Nama Kategori");

        textFieldIdKategori.setEditable(false);
        textFieldIdKategori.setToolTipText("");
        textFieldIdKategori.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelAddLayout.createSequentialGroup()
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelIdMahasiswa1)
                                .addComponent(jLabelIdMahasiswa))
                            .addGap(0, 755, Short.MAX_VALUE))
                        .addComponent(textFieldNamaKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldIdKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelTambahDataKategoriBukuAdd)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(buttonSimpanAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTambahDataKategoriBukuAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpanAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelIdMahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdMahasiswa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNamaKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahViewActionPerformed
        // TODO add your handling code here:
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();

        textFieldIdKategori.setText(setIdKategori());
        textFieldNamaKategori.grabFocus();
        if (buttonTambahView.getText().equals("Ubah")) {
            dataTabel();
            buttonSimpanAdd.setText("Perbarui");
        }
    }//GEN-LAST:event_buttonTambahViewActionPerformed

    private void buttonBatalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalAddActionPerformed
        // TODO add your handling code here:
//        panelMain.removeAll();
//        panelMain.repaint();
//        panelMain.revalidate();
//
//        panelMain.add(panelView);
//        panelMain.repaint();
//        panelMain.revalidate();
        showPanel();
        loadData();
    }//GEN-LAST:event_buttonBatalAddActionPerformed

    private void textFieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCariKeyReleased
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_textFieldCariKeyReleased

    private void buttonHapusViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusViewActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_buttonHapusViewActionPerformed

    private void buttonBatalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalViewActionPerformed
        // TODO add your handling code here:
        showPanel();
        loadData();
    }//GEN-LAST:event_buttonBatalViewActionPerformed

    private void jTableDataKategoriBukuViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataKategoriBukuViewMouseClicked
        // TODO add your handling code here:
        if (buttonTambahView.getText().equals("Tambah")) {
            buttonTambahView.setText("Ubah");
            buttonTambahView.setIcon(new ImageIcon(getClass().getResource("/assets/update20x20.png")));
            buttonHapusView.setVisible(true);
            buttonBatalView.setVisible(true);
        }
    }//GEN-LAST:event_jTableDataKategoriBukuViewMouseClicked

    private void buttonSimpanAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanAddActionPerformed
        // TODO add your handling code here:
        if (buttonSimpanAdd.getText().equals("Tambah")) {
            buttonSimpanAdd.setText("Simpan");
        } else if (buttonSimpanAdd.getText().equals("Simpan")) {
            insertData();
        } else if (buttonSimpanAdd.getText().equals("Perbarui")) {
            updateData();
        }
    }//GEN-LAST:event_buttonSimpanAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Button buttonBatalAdd;
    private model.Button buttonBatalView;
    private javax.swing.ButtonGroup buttonGroup1;
    private model.Button buttonHapusView;
    private model.Button buttonSimpanAdd;
    private model.Button buttonTambahView;
    private model.DateChooser dateTanggalBergabung;
    private model.DateChooser dateTanggalKembali;
    private javax.swing.JComboBox<String> jComboBoxCari;
    private javax.swing.JLabel jLabelDataPeminjamanBukuView;
    private javax.swing.JLabel jLabelIdMahasiswa;
    private javax.swing.JLabel jLabelIdMahasiswa1;
    private javax.swing.JLabel jLabelTambahDataKategoriBukuAdd;
    private javax.swing.JScrollPane jScrollPaneDataKategoriBukuView;
    private javax.swing.JTable jTableDataKategoriBukuView;
    private com.raven.swing.RoundPanel panelAdd;
    private com.raven.swing.RoundPanel panelMain;
    private com.raven.swing.RoundPanel panelView;
    private javax.swing.JTextField textFieldCari;
    private model.TextField textFieldIdKategori;
    private model.TextField textFieldNamaKategori;
    // End of variables declaration//GEN-END:variables

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Kategori> cq = cb.createQuery(Kategori.class);

        Root<Kategori> mhs = cq.from(Kategori.class);

        cq.multiselect(mhs.get("idKategori"), mhs.get("namaKategori"));
        CriteriaQuery<Kategori> select = cq.select(mhs);
        TypedQuery<Kategori> q = em.createQuery(select);
        List<Kategori> list = q.getResultList();

        for (Kategori m : list) {
            model.addRow(new Object[]{
                m.getIdKategori(),
                m.getNamaKategori(),});
        }
        em.getTransaction().commit();
    }

    private void insertData() {
        String idKategori = textFieldIdKategori.getText();
        String namaKategori = textFieldNamaKategori.getText();

        if (idKategori.isEmpty() || namaKategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validNama()) {
            return;
        }
        
        em.getTransaction().begin();
        Kategori simpanKategori = new Kategori();
        simpanKategori.setIdKategori(idKategori);
        simpanKategori.setNamaKategori(namaKategori);
        em.persist(simpanKategori);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Penyimpanan Data Berhasil");
        resetForm();
        loadData();
        showPanel();
    }

    private void updateData() {
        String idKategori = textFieldIdKategori.getText();
        String namaKategori = textFieldNamaKategori.getText();

        if (idKategori.isEmpty() || namaKategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        em.getTransaction().begin();
        Kategori updateKategori = em.find(Kategori.class, idKategori);
        updateKategori.setIdKategori(idKategori);
        updateKategori.setNamaKategori(namaKategori);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Pembaruan Data Berhasil");
        resetForm();
        loadData();
        showPanel();
    }

    private void hapusData() {
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            em.getTransaction().begin();
            for (int i = 0; i < jTableDataKategoriBukuView.getSelectedRowCount(); i++) {
                String selectedRows = jTableDataKategoriBukuView.getModel().getValueAt(i, 0).toString();
                Kategori hapusKategori = em.find(Kategori.class, selectedRows);
                em.remove(hapusKategori);
            }
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Penghapusan Data Berhasil", "", JOptionPane.INFORMATION_MESSAGE);
            resetForm();
            loadData();
            showPanel();
        } else if (confirm == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Penghapusan Data Gagal", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cariData() {
        String[] valueModel = {"idKategori", "namaKategori"};

        DefaultTableModel model = (DefaultTableModel) jTableDataKategoriBukuView.getModel();
        model.setRowCount(0);

        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        AbstractQuery<Kategori> cq = cb.createQuery(Kategori.class);

        Root<Kategori> Kategori = cq.from(Kategori.class);
        cq.where(cb.like(cb.upper(Kategori.get(valueModel[jComboBoxCari.getSelectedIndex()])), "%" + textFieldCari.getText().toUpperCase() + "%"));
//        cq.where(cb.equal(Kategori.get(valueModel[jComboBoxCari.getSelectedIndex()]), jTextFieldCari.getText()));
        CriteriaQuery<Kategori> select = ((CriteriaQuery<Kategori>) cq).select(Kategori);
        TypedQuery<Kategori> q = em.createQuery(select);
        List<Kategori> list = q.getResultList();

        for (Kategori m : list) {
            model.addRow(new Object[]{
                m.getIdKategori(),
                m.getNamaKategori()
            });
        }

        em.getTransaction().commit();
    }

    private String setIdKategori() {
        String urutan = null;

        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<String> cq = cb.createQuery(String.class);
        Root<Kategori> mhsRoot = cq.from(Kategori.class);

        cq.select(mhsRoot.get("idKategori"));
        cq.where(cb.like(mhsRoot.get("idKategori"), "KTG%")); //KTG05
        cq.orderBy(cb.asc(mhsRoot.get("idKategori")));

        TypedQuery<String> query = em.createQuery(cq);
        query.setMaxResults(1);

        try {
            String lastNim = query.getSingleResult();
            int nomor = Integer.parseInt(lastNim.substring(lastNim.length() - 2)) + 1; // KTG06
            urutan = "KTG" + String.format("%02d", nomor);
        } catch (NoResultException e) {
            urutan = "KTG" + "01";
        }

        em.getTransaction().commit();
        return urutan;
    }

    private boolean validNama() {
        boolean valid = false;
        String idKategori = textFieldIdKategori.getText();
        String namaKategori = textFieldNamaKategori.getText();

        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<String> cq = cb.createQuery(String.class);
        Root<Kategori> mhsRoot = cq.from(Kategori.class);

        cq.select(mhsRoot.get("idKategori"));
        cq.where(cb.and(cb.like(mhsRoot.get("idKategori"), idKategori), cb.like(mhsRoot.get("namaKategori"), namaKategori))); //KTG05
        cq.orderBy(cb.desc(mhsRoot.get("idKategori")));

        TypedQuery<String> query = em.createQuery(cq);
        query.setMaxResults(1);

        try {
            JOptionPane.showMessageDialog(this, 
                    "Nama kategori sudah ada\nSilahkan input nama kategori yang berbeda",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        } catch (NoResultException e) {
            valid = true;
        }
        em.getTransaction().commit();
        return valid;
    }

    private void loadData() {
        getData((DefaultTableModel) jTableDataKategoriBukuView.getModel());
        buttonHapusView.setVisible(false);
        buttonBatalView.setVisible(false);

    }

    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) jTableDataKategoriBukuView.getModel();
        model.setColumnCount(0);
        model.addColumn("ID Kategori");
        model.addColumn("Nama Kategori");
    }

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FormKategori());
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void resetForm() {
        textFieldIdKategori.setText("");
        textFieldNamaKategori.setText("");
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);

        int row = jTableDataKategoriBukuView.getSelectedRow();
        jLabelTambahDataKategoriBukuAdd.setText("Perbarui Data Kategori Buku");

        textFieldIdKategori.setEnabled(false);

        textFieldIdKategori.setText(jTableDataKategoriBukuView.getValueAt(row, 0).toString());
        textFieldNamaKategori.setText(jTableDataKategoriBukuView.getValueAt(row, 1).toString());
    }

}