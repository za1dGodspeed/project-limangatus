/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

/**
 *
 * @author THINKPAD
 */
public class FormPengembalian extends javax.swing.JPanel {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPengembalian() {
        initComponents();
        setOpaque(false);
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
        jLabelDataPeminjamanBukuView2 = new javax.swing.JLabel();
        jScrollPaneDataDetailPeminjamanBukuView = new javax.swing.JScrollPane();
        jTableDataPeminjamanBukuView2 = new javax.swing.JTable();
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
        jLabel23 = new javax.swing.JLabel();
        textFieldJumlahPinjam = new model.TextField();
        jLabel24 = new javax.swing.JLabel();
        jLabelTeleponMahasiswa1 = new javax.swing.JLabel();
        textFieldTelepon1 = new model.TextField();

        dateTanggalPinjam.setTextRefernce(textFieldTanggalPinjam);

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
        jLabelDataPeminjamanBukuView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kembalibuku20x20.png"))); // NOI18N
        jLabelDataPeminjamanBukuView.setText("Data Pengembalian Buku");

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

        jLabelDataPeminjamanBukuView2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelDataPeminjamanBukuView2.setForeground(new java.awt.Color(242, 242, 242));
        jLabelDataPeminjamanBukuView2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kembalibuku20x20.png"))); // NOI18N
        jLabelDataPeminjamanBukuView2.setText("Data Detail Pengembalian Buku");

        jTableDataPeminjamanBukuView2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneDataDetailPeminjamanBukuView.setViewportView(jTableDataPeminjamanBukuView2);

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
                            .addComponent(jLabelDataPeminjamanBukuView)
                            .addComponent(jLabelDataPeminjamanBukuView2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneDataDetailPeminjamanBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
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
                .addComponent(jScrollPaneDataPeminjamanBukuView, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDataPeminjamanBukuView2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDataDetailPeminjamanBukuView, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabelIdPeminjaman.setText("ID Pengembalian");

        textFieldIdPeminjaman.setEditable(false);
        textFieldIdPeminjaman.setToolTipText("");
        textFieldIdPeminjaman.setRequestFocusEnabled(false);

        jLabelTambahDataPeminjamanBukuAdd.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelTambahDataPeminjamanBukuAdd.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTambahDataPeminjamanBukuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kembalibuku20x20.png"))); // NOI18N
        jLabelTambahDataPeminjamanBukuAdd.setText("Tambah Data Pengembalian Buku");

        textFieldIdMahasiswa.setEditable(false);
        textFieldIdMahasiswa.setToolTipText("");
        textFieldIdMahasiswa.setRequestFocusEnabled(false);

        jLabelIdMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelIdMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelIdMahasiswa.setText("Peminjaman");

        jLabelNamaMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelNamaMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelNamaMahasiswa.setText("Tanggal Pinjam");

        textFieldTanggalPinjam.setEditable(false);
        textFieldTanggalPinjam.setToolTipText("");
        textFieldTanggalPinjam.setRequestFocusEnabled(false);

        jLabelTanggalPinjam.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTanggalPinjam.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTanggalPinjam.setText("Tanggal Hari Ini");

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
        jLabelEmailMahasiswa.setText("Tanggal Kembali");

        jLabelTeleponMahasiswa.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTeleponMahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTeleponMahasiswa.setText("ID Anggota");

        buttonDialogIdMahasiswa.setBackground(new java.awt.Color(31, 85, 20));
        buttonDialogIdMahasiswa.setForeground(new java.awt.Color(228, 229, 241));
        buttonDialogIdMahasiswa.setText("...");

        textFieldPenerbit.setEditable(false);
        textFieldPenerbit.setToolTipText("");
        textFieldPenerbit.setRequestFocusEnabled(false);

        jLabelPenerbit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelPenerbit.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPenerbit.setText("Penerbit");

        textFieldPengarang.setEditable(false);
        textFieldPengarang.setToolTipText("");
        textFieldPengarang.setRequestFocusEnabled(false);

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(242, 242, 242));
        jLabel21.setText("Pengarang");

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

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(242, 242, 242));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book64x64.png"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));

        textFieldJumlahPinjam.setToolTipText("");
        textFieldJumlahPinjam.setRequestFocusEnabled(false);
        textFieldJumlahPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldJumlahPinjamActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(242, 242, 242));
        jLabel24.setText("Denda");

        jLabelTeleponMahasiswa1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelTeleponMahasiswa1.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTeleponMahasiswa1.setText("Nama Anggota");

        textFieldTelepon1.setEditable(false);
        textFieldTelepon1.setToolTipText("");
        textFieldTelepon1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTambahDataPeminjamanBukuAdd)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(buttonTambahAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBatalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIdMahasiswa)
                                    .addComponent(jLabelNamaMahasiswa)
                                    .addComponent(jLabelEmailMahasiswa)
                                    .addComponent(jLabelTeleponMahasiswa)
                                    .addComponent(jLabelTeleponMahasiswa1))
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(textFieldIdMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDialogIdMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldTelepon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabelIdPeminjaman)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldIdPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabelTanggalPinjam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTanggalPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPenerbit, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPengarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldIdBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(0, 0, 0)))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldJumlahPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
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
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdPeminjaman)
                            .addComponent(textFieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(jLabelTeleponMahasiswa))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldTelepon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTeleponMahasiswa1)))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTanggalPinjam)
                            .addComponent(textFieldTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textFieldIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldJumlahPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))))
                .addContainerGap(171, Short.MAX_VALUE))
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
    }//GEN-LAST:event_buttonTambahAddActionPerformed

    private void textFieldJumlahPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldJumlahPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldJumlahPinjamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Button buttonBatalAdd;
    private model.Button buttonDialogIdMahasiswa;
    private model.Button buttonTambahAdd;
    private model.Button buttonTambahView1;
    private model.DateChooser dateTanggalKembali;
    private model.DateChooser dateTanggalPinjam;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataPeminjamanBukuView;
    private javax.swing.JLabel jLabelDataPeminjamanBukuView2;
    private javax.swing.JLabel jLabelEmailMahasiswa;
    private javax.swing.JLabel jLabelIdMahasiswa;
    private javax.swing.JLabel jLabelIdPeminjaman;
    private javax.swing.JLabel jLabelNamaMahasiswa;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelTambahDataPeminjamanBukuAdd;
    private javax.swing.JLabel jLabelTanggalPinjam;
    private javax.swing.JLabel jLabelTeleponMahasiswa;
    private javax.swing.JLabel jLabelTeleponMahasiswa1;
    private javax.swing.JScrollPane jScrollPaneDataDetailPeminjamanBukuView;
    private javax.swing.JScrollPane jScrollPaneDataPeminjamanBukuView;
    private javax.swing.JTable jTableDataPeminjamanBukuView;
    private javax.swing.JTable jTableDataPeminjamanBukuView2;
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
    private model.TextField textFieldTanggalPinjam;
    private model.TextField textFieldTelepon;
    private model.TextField textFieldTelepon1;
    // End of variables declaration//GEN-END:variables
}
