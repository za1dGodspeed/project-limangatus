/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import dao.Buku;
import dao.Kategori;
import dao.Mahasiswa;
import dao.Peminjaman;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THINKPAD
 */
public class FormPeminjaman extends javax.swing.JPanel {

    /**
     * Creates new form FormPeminjaman
     */
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
    EntityManager em = emf.createEntityManager();
    private Mahasiswa idMhs;
    private Buku idBuku;

    public FormPeminjaman() {
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

        dateTanggalPinjam = new model.DateChooser();
        dateTanggalKembali = new model.DateChooser();
        panelMain = new com.raven.swing.RoundPanel();
        panelView = new com.raven.swing.RoundPanel();
        buttonTambahView1 = new model.Button();
        jLabelDataPeminjamanBukuView = new javax.swing.JLabel();
        jScrollPaneDataPeminjamanBukuView = new javax.swing.JScrollPane();
        jTableDataPeminjamanBukuView = new javax.swing.JTable();
        panelAdd = new com.raven.swing.RoundPanel();
        buttonTambahAdd = new model.Button();
        buttonBatalAdd = new model.Button();
        jLabelIdPeminjaman = new javax.swing.JLabel();
        textFieldIdPeminjaman = new model.TextField();
        jLabelTambahDataPeminjamanBukuAdd = new javax.swing.JLabel();
        textFieldIdMahasiswa = new model.TextField();
        jLabelIdMahasiswa = new javax.swing.JLabel();
        jLabelNamaMahasiswa = new javax.swing.JLabel();
        textFieldTanggalPinjam = new model.TextField();
        jLabelTanggalPinjam = new javax.swing.JLabel();
        textFieldTanggalKembali = new model.TextField();
        jLabelTanggalKembali = new javax.swing.JLabel();
        textFieldNama = new model.TextField();
        textFieldEmail = new model.TextField();
        textFieldTelepon = new model.TextField();
        jLabelEmailMahasiswa = new javax.swing.JLabel();
        jLabelTeleponMahasiswa = new javax.swing.JLabel();
        buttonDialogIdMahasiswa = new model.Button();
        textFieldPenerbit = new model.TextField();
        jLabelPenerbit = new javax.swing.JLabel();
        textFieldPengarang = new model.TextField();
        jLabel21 = new javax.swing.JLabel();
        textFieldJudul = new model.TextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldIdBuku = new model.TextField();
        buttonDialogIdBuku = new model.Button();
        jLabel23 = new javax.swing.JLabel();
        textFieldJumlahPinjam = new model.TextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        dateTanggalPinjam.setTextRefernce(textFieldTanggalPinjam);

        dateTanggalKembali.setTextRefernce(textFieldTanggalKembali);

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(55, 55, 55));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(55, 55, 55));

        buttonTambahView1.setBackground(new java.awt.Color(31, 85, 20));
        buttonTambahView1.setForeground(new java.awt.Color(228, 229, 241));
        buttonTambahView1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah20x20.png"))); // NOI18N
        buttonTambahView1.setText("Tambah");
        buttonTambahView1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTambahView1MouseClicked(evt);
            }
        });
        buttonTambahView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahView1ActionPerformed(evt);
            }
        });

        jLabelDataPeminjamanBukuView.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelDataPeminjamanBukuView.setForeground(new java.awt.Color(242, 242, 242));
        jLabelDataPeminjamanBukuView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pinjambuku20x20.png"))); // NOI18N
        jLabelDataPeminjamanBukuView.setText("Data Peminjaman Buku");

        jTableDataPeminjamanBukuView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneDataPeminjamanBukuView.setViewportView(jTableDataPeminjamanBukuView);

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDataPeminjamanBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTambahView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataPeminjamanBukuView))
                        .addGap(0, 625, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataPeminjamanBukuView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTambahView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDataPeminjamanBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(55, 55, 55));

        buttonTambahAdd.setBackground(new java.awt.Color(31, 85, 20));
        buttonTambahAdd.setForeground(new java.awt.Color(228, 229, 241));
        buttonTambahAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan20x20.png"))); // NOI18N
        buttonTambahAdd.setText("Simpan");
        buttonTambahAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahAddActionPerformed(evt);
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

        jLabelIdPeminjaman.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelIdPeminjaman.setForeground(new java.awt.Color(242, 242, 242));
        jLabelIdPeminjaman.setText("ID");

        textFieldIdPeminjaman.setEditable(false);
        textFieldIdPeminjaman.setToolTipText("");
        textFieldIdPeminjaman.setRequestFocusEnabled(false);

        jLabelTambahDataPeminjamanBukuAdd.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelTambahDataPeminjamanBukuAdd.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTambahDataPeminjamanBukuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pinjambuku20x20.png"))); // NOI18N
        jLabelTambahDataPeminjamanBukuAdd.setText("Tambah Data Peminjaman Buku");

        textFieldIdMahasiswa.setEditable(false);
        textFieldIdMahasiswa.setToolTipText("");
        textFieldIdMahasiswa.setRequestFocusEnabled(false);

        jLabelIdMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelIdMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelIdMahasiswa.setText("ID Mahasiswa");

        jLabelNamaMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelNamaMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelNamaMahasiswa.setText("Nama");

        textFieldTanggalPinjam.setEditable(false);
        textFieldTanggalPinjam.setToolTipText("");
        textFieldTanggalPinjam.setRequestFocusEnabled(false);

        jLabelTanggalPinjam.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTanggalPinjam.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTanggalPinjam.setText("Tanggal Pinjam");

        textFieldTanggalKembali.setEditable(false);
        textFieldTanggalKembali.setToolTipText("");
        textFieldTanggalKembali.setRequestFocusEnabled(false);

        jLabelTanggalKembali.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTanggalKembali.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTanggalKembali.setText("Tanggal Kembali");

        textFieldNama.setEditable(false);
        textFieldNama.setToolTipText("");
        textFieldNama.setRequestFocusEnabled(false);
        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        textFieldEmail.setEditable(false);
        textFieldEmail.setToolTipText("");
        textFieldEmail.setRequestFocusEnabled(false);

        textFieldTelepon.setEditable(false);
        textFieldTelepon.setToolTipText("");
        textFieldTelepon.setRequestFocusEnabled(false);

        jLabelEmailMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelEmailMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelEmailMahasiswa.setText("Email");

        jLabelTeleponMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTeleponMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTeleponMahasiswa.setText("Telepon");

        buttonDialogIdMahasiswa.setBackground(new java.awt.Color(31, 85, 20));
        buttonDialogIdMahasiswa.setForeground(new java.awt.Color(228, 229, 241));
        buttonDialogIdMahasiswa.setText("...");
        buttonDialogIdMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDialogIdMahasiswaActionPerformed(evt);
            }
        });

        textFieldPenerbit.setEditable(false);
        textFieldPenerbit.setToolTipText("");
        textFieldPenerbit.setRequestFocusEnabled(false);
        textFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPenerbitActionPerformed(evt);
            }
        });

        jLabelPenerbit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelPenerbit.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPenerbit.setText("Tahun Terbit");

        textFieldPengarang.setEditable(false);
        textFieldPengarang.setToolTipText("");
        textFieldPengarang.setRequestFocusEnabled(false);

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(242, 242, 242));
        jLabel21.setText("Penerbit");

        textFieldJudul.setEditable(false);
        textFieldJudul.setToolTipText("");
        textFieldJudul.setRequestFocusEnabled(false);
        textFieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldJudulActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(242, 242, 242));
        jLabel22.setText("Judul");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("ID Buku");

        textFieldIdBuku.setEditable(false);
        textFieldIdBuku.setToolTipText("");
        textFieldIdBuku.setRequestFocusEnabled(false);

        buttonDialogIdBuku.setBackground(new java.awt.Color(31, 85, 20));
        buttonDialogIdBuku.setForeground(new java.awt.Color(228, 229, 241));
        buttonDialogIdBuku.setText("...");
        buttonDialogIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDialogIdBukuActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(242, 242, 242));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book64x64.png"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));

        textFieldJumlahPinjam.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(242, 242, 242));
        jLabel24.setText("Jumlah");

        jLabel25.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(242, 242, 242));
        jLabel25.setText("Total Pinjam");

        jLabel26.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(242, 242, 242));
        jLabel26.setText("Total");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdMahasiswa)
                            .addComponent(jLabelNamaMahasiswa)
                            .addComponent(jLabelEmailMahasiswa)
                            .addComponent(jLabelTeleponMahasiswa))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(textFieldIdMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDialogIdMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabelPenerbit))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(textFieldIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDialogIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldJumlahPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25)))))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabelIdPeminjaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTanggalPinjam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTanggalKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTambahDataPeminjamanBukuAdd)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(buttonTambahAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBatalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTambahDataPeminjamanBukuAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambahAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdPeminjaman)
                    .addComponent(textFieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTanggalPinjam)
                    .addComponent(textFieldTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTanggalKembali)
                    .addComponent(textFieldTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdMahasiswa)
                            .addComponent(textFieldIdMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDialogIdMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamaMahasiswa)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmailMahasiswa))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTeleponMahasiswa)))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textFieldIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDialogIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(textFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(0, 0, 0)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPenerbit)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addComponent(textFieldJumlahPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void textFieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldJudulActionPerformed

    private void buttonTambahView1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahView1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTambahView1MouseClicked

    private void buttonTambahView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahView1ActionPerformed
        // TODO add your handling code here:
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        textFieldIdPeminjaman.setText(setIdPeminjaman());
    }//GEN-LAST:event_buttonTambahView1ActionPerformed

    private void buttonBatalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalAddActionPerformed
        // TODO add your handling code here:
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelView);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_buttonBatalAddActionPerformed

    private void buttonTambahAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahAddActionPerformed
        // TODO add your handling code here:
        insertData();
    }//GEN-LAST:event_buttonTambahAddActionPerformed

    private void buttonDialogIdMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDialogIdMahasiswaActionPerformed
        // TODO add your handling code here:
        boolean closable = true;
        DataMahasiswa dataMahasiswa = new DataMahasiswa(null, closable);
        dataMahasiswa.setVisible(true);

        textFieldIdMahasiswa.setText(dataMahasiswa.nim);
        textFieldEmail.setText(dataMahasiswa.email);
        textFieldNama.setText(dataMahasiswa.nama);
        textFieldTelepon.setText(dataMahasiswa.telepon);
    }//GEN-LAST:event_buttonDialogIdMahasiswaActionPerformed

    private void buttonDialogIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDialogIdBukuActionPerformed
        // TODO add your handling code here:
        boolean closable = true;
        DataBuku buku = new DataBuku(null, closable);
        buku.setVisible(true);

        textFieldIdBuku.setText(buku.isbn);
        textFieldJudul.setText(buku.judul_buku);
        textFieldPengarang.setText(buku.penerbit);
        textFieldPenerbit.setText(buku.tahun_terbit);
    }//GEN-LAST:event_buttonDialogIdBukuActionPerformed

    private void textFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPenerbitActionPerformed
    private String setIdPeminjaman() {
        String urutan = null;

        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<String> cq = cb.createQuery(String.class);
        Root<Peminjaman> mhsRoot = cq.from(Peminjaman.class);

        cq.select(mhsRoot.get("idPeminjaman"));
        cq.where(cb.like(mhsRoot.get("idPeminjaman"), "PMJ%")); //KTG05
        cq.orderBy(cb.asc(mhsRoot.get("idPeminjaman")));

        TypedQuery<String> query = em.createQuery(cq);
        query.setMaxResults(1);

        try {
            String lastNim = query.getSingleResult();
            int nomor = Integer.parseInt(lastNim.substring(lastNim.length() - 2)) + 1; // KTG06
            urutan = "PMJ" + String.format("%02d", nomor);
        } catch (NoResultException e) {
            urutan = "PMJ" + "01";
        }

        em.getTransaction().commit();
        return urutan;
    }

    public void insertData() {
        Mahasiswa idMahasiswa = this.idMhs;
//        Buku idBuku = this.idBuku;
//
        if (textFieldIdPeminjaman.getText().isEmpty() || textFieldTanggalPinjam.getText().isEmpty() || textFieldTanggalKembali.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        em.getTransaction().begin();
        Peminjaman simpanPeminjaman = new Peminjaman();
        simpanPeminjaman.setIdPeminjaman(textFieldIdPeminjaman.getText());
        simpanPeminjaman.setTanggalPeminjaman(textFieldTanggalPinjam.getText());
        simpanPeminjaman.setTanggalPengembalian(textFieldTanggalKembali.getText());
        simpanPeminjaman.setNim(idMahasiswa);
//        simpanPeminjaman.setIdBuku(idBuku);
        em.persist(simpanPeminjaman);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Penyimpanan Data Berhasil");
        resetForm();
        loadData();
        showPanel();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Button buttonBatalAdd;
    private model.Button buttonDialogIdBuku;
    private model.Button buttonDialogIdMahasiswa;
    private model.Button buttonTambahAdd;
    private model.Button buttonTambahView1;
    private model.DateChooser dateTanggalKembali;
    private model.DateChooser dateTanggalPinjam;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataPeminjamanBukuView;
    private javax.swing.JLabel jLabelEmailMahasiswa;
    private javax.swing.JLabel jLabelIdMahasiswa;
    private javax.swing.JLabel jLabelIdPeminjaman;
    private javax.swing.JLabel jLabelNamaMahasiswa;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelTambahDataPeminjamanBukuAdd;
    private javax.swing.JLabel jLabelTanggalKembali;
    private javax.swing.JLabel jLabelTanggalPinjam;
    private javax.swing.JLabel jLabelTeleponMahasiswa;
    private javax.swing.JScrollPane jScrollPaneDataPeminjamanBukuView;
    private javax.swing.JTable jTableDataPeminjamanBukuView;
    private com.raven.swing.RoundPanel panelAdd;
    private com.raven.swing.RoundPanel panelMain;
    private com.raven.swing.RoundPanel panelView;
    private model.TextField textFieldEmail;
    private model.TextField textFieldIdBuku;
    private model.TextField textFieldIdMahasiswa;
    private model.TextField textFieldIdPeminjaman;
    private model.TextField textFieldJudul;
    private model.TextField textFieldJumlahPinjam;
    private model.TextField textFieldNama;
    private model.TextField textFieldPenerbit;
    private model.TextField textFieldPengarang;
    private model.TextField textFieldTanggalKembali;
    private model.TextField textFieldTanggalPinjam;
    private model.TextField textFieldTelepon;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        panelMain.removeAll();
        panelMain.add(new FormPeminjaman());
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void showPanel() {
        textFieldIdBuku.setText("");
        textFieldJudul.setText("");
        textFieldPenerbit.setText("");
        textFieldPengarang.setText("");

    }

    private void loadData() {
        getData((DefaultTableModel) jTableDataPeminjamanBukuView.getModel());
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<Peminjaman> bukuRoot = cq.from(Peminjaman.class);
        Join<Peminjaman, Mahasiswa> kategoriJoin = bukuRoot.join("nim", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("idPeminjaman"),
                bukuRoot.get("tanggalPeminjaman"),
                bukuRoot.get("tanggalPengembalian"),
                kategoriJoin.get("nim")
        );

        TypedQuery<Object[]> query = em.createQuery(cq);
        List<Object[]> resultList = query.getResultList();
        for (Object[] row : resultList) {

            model.addRow(new Object[]{
                row[0], // isbn
                row[1], // judulBuku
                row[2], // penerbit
                row[3] // tahunTerbit
            });
        }
        em.getTransaction().commit();
    }

    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) jTableDataPeminjamanBukuView.getModel();
        model.setColumnCount(0);
        model.addColumn("ISBN");
        model.addColumn("Judul Buku");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
    }

    
}