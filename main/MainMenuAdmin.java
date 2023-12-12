/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.raven.swing.ButtonMenu;
import config.EventMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.Icon;
import javax.swing.JLabel;
import model.ScrollBarCustom;
import net.miginfocom.swing.MigLayout;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
//import panel.PanelTransaksiBuku;

/**
 *
 * @author THINKPAD
 */
public class MainMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private EventMenu event;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
    EntityManager em = emf.createEntityManager();

    public MainMenuAdmin(String np, String r) {
        initComponents();
//        setOpaque(false);
        showForm(new FormHomepage());
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(130, 130, 130, 100));
        jLabelNamaPengguna.setText(np);
        jLabelRoles.setText(r);
        scrollPaneSidebar.setVerticalScrollBar(sb);
        isiPanelSidebar.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
        ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("assets/logo-48x48.png"));
        setIconImage(logoIcon.getImage());
        EventMenu event = new EventMenu() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    System.out.println("Homepage");
                    showForm(new FormHomepage());
                } else if (index == 1) {
                    System.out.println("Form Mahasiswa");
                    showForm(new FormMahasiswa());
                } else if (index == 2) {
                    System.out.println("Form Data Buku");
                    showForm(new FormDataBuku());
                } else if (index == 3) {
                    System.out.println("Form Kategori");
                    showForm(new FormKategori());
                } else if (index == 4) {
                    System.out.println("Form Peminjaman");
                    showForm(new FormPeminjaman());
                } else if (index == 5) {
                    System.out.println("Form Pengembalian");
                    showForm(new FormPengembalian());
                } else if (index == 6) {
                    System.out.println("Form Laporan Peminjaman");
//                    showForm(new FormLaporanPeminjaman());
                    em.getTransaction().begin();
                    String reportPath = "src/main/ReportBuku.jrxml";
                    JasperReport jasperReport;
                    try {
                        jasperReport = JasperCompileManager.compileReport(reportPath);
                        JasperPrint print = JasperFillManager.fillReport(jasperReport, null, em.unwrap(java.sql.Connection.class));
                        em.getTransaction().commit();
                        JasperViewer viewer = new JasperViewer(print, false);
                        viewer.setVisible(true);
                    } catch (JRException ex) {
                        Logger.getLogger(MainMenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (index == 7) {
                    System.out.println("Form Laporan Pengembalian");
//                    showForm(new FormLaporanPengembalian());
                } else if (index == 8) {
                    System.out.println("Logout user" + jLabelNamaPengguna.getText() + "as" + jLabelRoles.getText());
                    dispose();
                }
            }
        };

        initMenu(event);
//        new Menu(String username, String password).setVisible(true);
    }

    public void initMenu(EventMenu event) {
        this.event = event;
        addMenu(new ImageIcon(getClass().getResource("/assets/homepage20x20.png")), "Homepage", 0);
        addMenu(new ImageIcon(getClass().getResource("/assets/mahasiswa20x20.png")), "Mahasiswa", 1);
        addMenu(new ImageIcon(getClass().getResource("/assets/buku20x20.png")), "Daftar Buku", 2);
        addMenu(new ImageIcon(getClass().getResource("/assets/kategori20x20.png")), "Kategori", 3);
        addMenu(new ImageIcon(getClass().getResource("/assets/pinjambuku20x20.png")), "Peminjaman", 4);
        addMenu(new ImageIcon(getClass().getResource("/assets/kembalibuku20x20.png")), "Pengembalian", 5);
        addMenu(new ImageIcon(getClass().getResource("/assets/laporanpinjam20x20.png")), "Laporan Peminjaman", 6);
        addMenu(new ImageIcon(getClass().getResource("/assets/laporankembali20x20.png")), "Laporan Pengembalian", 7);
        addEmpty();
        addMenu(new ImageIcon(getClass().getResource("/assets/logout20x20.png")), "Logout", 8);
    }

    public void addEmpty() {
        isiPanelSidebar.add(new JLabel(), "push");
    }

    public void addMenu(Icon icon, String text, int index) {
        ButtonMenu menu = new ButtonMenu();
        menu.setIcon(icon);
        menu.setText(" " + text);
        isiPanelSidebar.add(menu);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.selected(index);
                setSelected(menu);
            }
        });
    }

    private void setSelected(ButtonMenu menu) {
        for (Component com : isiPanelSidebar.getComponents()) {
            if (com instanceof ButtonMenu) {
                ButtonMenu b = (ButtonMenu) com;
                b.setSelected(false);
            }
        }
        menu.setSelected(true);
    }

    public void showForm(Component com) {
        panelForm.removeAll();
        panelForm.add(com);
        panelForm.revalidate();
        panelForm.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradienBackground = new model.PanelGradiente();
        panelForm = new javax.swing.JPanel();
        panelCredentials = new com.raven.swing.RoundPanel();
        fotoProfil = new com.raven.swing.ImageAvatar();
        jLabelNamaPengguna = new javax.swing.JLabel();
        jLabelRoles = new javax.swing.JLabel();
        panelSidebar = new com.raven.swing.RoundPanel();
        scrollPaneSidebar = new javax.swing.JScrollPane();
        isiPanelSidebar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Limangatus");
        setMinimumSize(new java.awt.Dimension(224, 575));

        panelGradienBackground.setColorPrimario(new java.awt.Color(89, 119, 87));
        panelGradienBackground.setColorSecundario(new java.awt.Color(72, 94, 80));

        panelForm.setToolTipText("");
        panelForm.setOpaque(false);
        panelForm.setLayout(new java.awt.BorderLayout());

        panelCredentials.setBackground(new java.awt.Color(55, 55, 55));

        fotoProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.jpg"))); // NOI18N

        jLabelNamaPengguna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNamaPengguna.setForeground(new java.awt.Color(171, 213, 171));
        jLabelNamaPengguna.setText("Nama Pengguna");

        jLabelRoles.setForeground(new java.awt.Color(171, 213, 171));
        jLabelRoles.setText("Roles");

        javax.swing.GroupLayout panelCredentialsLayout = new javax.swing.GroupLayout(panelCredentials);
        panelCredentials.setLayout(panelCredentialsLayout);
        panelCredentialsLayout.setHorizontalGroup(
            panelCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCredentialsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNamaPengguna)
                    .addComponent(jLabelRoles))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCredentialsLayout.setVerticalGroup(
            panelCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCredentialsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCredentialsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelNamaPengguna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelSidebar.setBackground(new java.awt.Color(55, 55, 55));

        scrollPaneSidebar.setBorder(null);

        isiPanelSidebar.setBackground(new java.awt.Color(55, 55, 55));

        javax.swing.GroupLayout isiPanelSidebarLayout = new javax.swing.GroupLayout(isiPanelSidebar);
        isiPanelSidebar.setLayout(isiPanelSidebarLayout);
        isiPanelSidebarLayout.setHorizontalGroup(
            isiPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        isiPanelSidebarLayout.setVerticalGroup(
            isiPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        scrollPaneSidebar.setViewportView(isiPanelSidebar);

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneSidebar)
                .addContainerGap())
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneSidebar)
                .addContainerGap())
        );

        panelGradienBackground.setLayer(panelForm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradienBackground.setLayer(panelCredentials, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradienBackground.setLayer(panelSidebar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradienBackgroundLayout = new javax.swing.GroupLayout(panelGradienBackground);
        panelGradienBackground.setLayout(panelGradienBackgroundLayout);
        panelGradienBackgroundLayout.setHorizontalGroup(
            panelGradienBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradienBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradienBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCredentials, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGradienBackgroundLayout.setVerticalGroup(
            panelGradienBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradienBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradienBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradienBackgroundLayout.createSequentialGroup()
                        .addComponent(panelCredentials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradienBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdmin("Nama Pengguna", "Peran").setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ImageAvatar fotoProfil;
    private javax.swing.JPanel isiPanelSidebar;
    private javax.swing.JLabel jLabelNamaPengguna;
    private javax.swing.JLabel jLabelRoles;
    private com.raven.swing.RoundPanel panelCredentials;
    private javax.swing.JPanel panelForm;
    private model.PanelGradiente panelGradienBackground;
    private com.raven.swing.RoundPanel panelSidebar;
    private javax.swing.JScrollPane scrollPaneSidebar;
    // End of variables declaration//GEN-END:variables
}
