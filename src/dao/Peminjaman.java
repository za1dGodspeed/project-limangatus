/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.idPeminjaman = :idPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPengembalian", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPengembalian = :tanggalPengembalian"),
    @NamedQuery(name = "Peminjaman.findByTotalPinjam", query = "SELECT p FROM Peminjaman p WHERE p.totalPinjam = :totalPinjam"),
    @NamedQuery(name = "Peminjaman.findByStatusPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.statusPeminjaman = :statusPeminjaman")})
public class Peminjaman implements Serializable {

    @OneToMany(mappedBy = "idPeminjaman")
    private Collection<DetailPeminjaman> detailPeminjamanCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @Column(name = "tanggal_peminjaman")
    @Temporal(TemporalType.DATE)
        private Date tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalPengembalian;
    @Column(name = "total_pinjam")
    private Integer totalPinjam;
    @Column(name = "status_peminjaman")
    private String statusPeminjaman;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "peminjaman")
    private Pengembalian pengembalian;
    @JoinColumn(name = "id_cred", referencedColumnName = "id_cred")
    @ManyToOne
    private Credentials idCred;
    @JoinColumn(name = "nim", referencedColumnName = "nim")
    @ManyToOne
    private Mahasiswa nim;

    public Peminjaman() {
    }

    public Peminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getTanggalPeminjaman() {
        if (tanggalPeminjaman != null) {
            // Specify the desired date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
            return dateFormat.format(tanggalPeminjaman);
        } else {
            return null; // Or an empty string, depending on your requirements
        }
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        try {
            // Assuming "tanggal" is the String date in the format you are using
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(tanggalPeminjaman);
            this.tanggalPeminjaman = parsedDate;
        } catch (ParseException e) {
            // Handle the parsing exception according to your requirements
            e.printStackTrace();
        }
    }

    public String getTanggalPengembalian() {
        if (tanggalPengembalian != null) {
            // Specify the desired date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
            return dateFormat.format(tanggalPengembalian);
        } else {
            return null; // Or an empty string, depending on your requirements
        }
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        try {
            // Assuming "tanggal" is the String date in the format you are using
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(tanggalPengembalian);
            this.tanggalPengembalian = parsedDate;
        } catch (ParseException e) {
            // Handle the parsing exception according to your requirements
            e.printStackTrace();
        }
    }

    public Integer getTotalPinjam() {
        return totalPinjam;
    }

    public void setTotalPinjam(Integer totalPinjam) {
        this.totalPinjam = totalPinjam;
    }

    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }

    public Pengembalian getPengembalian() {
        return pengembalian;
    }

    public void setPengembalian(Pengembalian pengembalian) {
        this.pengembalian = pengembalian;
    }

    public Credentials getIdCred() {
        return idCred;
    }

    public void setIdCred(Credentials idCred) {
        this.idCred = idCred;
    }

    public Mahasiswa getNim() {
        return nim;
    }

    public void setNim(Mahasiswa nim) {
        this.nim = nim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeminjaman != null ? idPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.idPeminjaman == null && other.idPeminjaman != null) || (this.idPeminjaman != null && !this.idPeminjaman.equals(other.idPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Peminjaman[ idPeminjaman=" + idPeminjaman + " ]";
    }

    public Collection<DetailPeminjaman> getDetailPeminjamanCollection() {
        return detailPeminjamanCollection;
    }

    public void setDetailPeminjamanCollection(Collection<DetailPeminjaman> detailPeminjamanCollection) {
        this.detailPeminjamanCollection = detailPeminjamanCollection;
    }

}
