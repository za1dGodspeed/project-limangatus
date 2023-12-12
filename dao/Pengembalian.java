/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "pengembalian")
@NamedQueries({
    @NamedQuery(name = "Pengembalian.findAll", query = "SELECT p FROM Pengembalian p"),
    @NamedQuery(name = "Pengembalian.findByIdPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.idPengembalian = :idPengembalian"),
    @NamedQuery(name = "Pengembalian.findByTanggalPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.tanggalPengembalian = :tanggalPengembalian"),
    @NamedQuery(name = "Pengembalian.findByDendaPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.dendaPengembalian = :dendaPengembalian"),
    @NamedQuery(name = "Pengembalian.findByIdPeminjaman", query = "SELECT p FROM Pengembalian p WHERE p.idPeminjaman = :idPeminjaman")})
public class Pengembalian implements Serializable {

    @OneToMany(mappedBy = "idPengembalian")
    private Collection<DetailPengembalian> detailPengembalianCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengembalian")
    private String idPengembalian;
    @Column(name = "tanggal_pengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalPengembalian;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "denda_pengembalian")
    private Double dendaPengembalian;
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @JoinColumn(name = "nim", referencedColumnName = "nim")
    @ManyToOne
    private Mahasiswa nim;
    @JoinColumn(name = "id_pengembalian", referencedColumnName = "id_peminjaman", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Peminjaman peminjaman;

    public Pengembalian() {
    }

    public Pengembalian(String idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public String getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(String idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Double getDendaPengembalian() {
        return dendaPengembalian;
    }

    public void setDendaPengembalian(Double dendaPengembalian) {
        this.dendaPengembalian = dendaPengembalian;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Mahasiswa getNim() {
        return nim;
    }

    public void setNim(Mahasiswa nim) {
        this.nim = nim;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPengembalian != null ? idPengembalian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengembalian)) {
            return false;
        }
        Pengembalian other = (Pengembalian) object;
        if ((this.idPengembalian == null && other.idPengembalian != null) || (this.idPengembalian != null && !this.idPengembalian.equals(other.idPengembalian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Pengembalian[ idPengembalian=" + idPengembalian + " ]";
    }

    public Collection<DetailPengembalian> getDetailPengembalianCollection() {
        return detailPengembalianCollection;
    }

    public void setDetailPengembalianCollection(Collection<DetailPengembalian> detailPengembalianCollection) {
        this.detailPengembalianCollection = detailPengembalianCollection;
    }
    
}
