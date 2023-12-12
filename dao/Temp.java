/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "temp")
@NamedQueries({
    @NamedQuery(name = "Temp.findAll", query = "SELECT t FROM Temp t"),
    @NamedQuery(name = "Temp.findByJudulBuku", query = "SELECT t FROM Temp t WHERE t.judulBuku = :judulBuku"),
    @NamedQuery(name = "Temp.findByTahunTerbit", query = "SELECT t FROM Temp t WHERE t.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Temp.findByPenerbit", query = "SELECT t FROM Temp t WHERE t.penerbit = :penerbit"),
    @NamedQuery(name = "Temp.findByJumlahPinjam", query = "SELECT t FROM Temp t WHERE t.jumlahPinjam = :jumlahPinjam"),
    @NamedQuery(name = "Temp.findByStatusPinjam", query = "SELECT t FROM Temp t WHERE t.statusPinjam = :statusPinjam"),
    @NamedQuery(name = "Temp.findByPkTemp", query = "SELECT t FROM Temp t WHERE t.pkTemp = :pkTemp")})
public class Temp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "jumlah_pinjam")
    private Integer jumlahPinjam;
    @Column(name = "status_pinjam")
    private String statusPinjam;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_temp")
    private String pkTemp;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne(optional = false)
    private Buku isbn;

    public Temp() {
    }

    public Temp(String pkTemp) {
        this.pkTemp = pkTemp;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Integer getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(Integer jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public String getStatusPinjam() {
        return statusPinjam;
    }

    public void setStatusPinjam(String statusPinjam) {
        this.statusPinjam = statusPinjam;
    }

    public String getPkTemp() {
        return pkTemp;
    }

    public void setPkTemp(String pkTemp) {
        this.pkTemp = pkTemp;
    }

    public Buku getIsbn() {
        return isbn;
    }

    public void setIsbn(Buku isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkTemp != null ? pkTemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temp)) {
            return false;
        }
        Temp other = (Temp) object;
        if ((this.pkTemp == null && other.pkTemp != null) || (this.pkTemp != null && !this.pkTemp.equals(other.pkTemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Temp[ pkTemp=" + pkTemp + " ]";
    }
    
}
