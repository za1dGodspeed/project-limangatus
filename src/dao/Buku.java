/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "buku")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Buku.findByJudulBuku", query = "SELECT b FROM Buku b WHERE b.judulBuku = :judulBuku"),
    @NamedQuery(name = "Buku.findByTahunTerbit", query = "SELECT b FROM Buku b WHERE b.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit")})
public class Buku implements Serializable {

    @Lob
    @Column(name = "gambar")
    private byte[] gambar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isbn")
    private Collection<Temp> tempCollection;
    @OneToMany(mappedBy = "isbn")
    private Collection<DetailPeminjaman> detailPeminjamanCollection;
    @OneToMany(mappedBy = "isbn")
    private Collection<DetailPengembalian> detailPengembalianCollection;

    @Column(name = "stok")
    private Integer stok;
    @JoinColumn(name = "id_kategori", referencedColumnName = "id_kategori")
    @ManyToOne
    private Kategori idKategori;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "penerbit")
    private String penerbit;

    public Buku() {
    }

    public Buku(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectlimangatus.Buku[ isbn=" + isbn + " ]";
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }


    public Kategori getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(Kategori idKategori) {
        this.idKategori = idKategori;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public Collection<Temp> getTempCollection() {
        return tempCollection;
    }

    public void setTempCollection(Collection<Temp> tempCollection) {
        this.tempCollection = tempCollection;
    }

    public Collection<DetailPeminjaman> getDetailPeminjamanCollection() {
        return detailPeminjamanCollection;
    }

    public void setDetailPeminjamanCollection(Collection<DetailPeminjaman> detailPeminjamanCollection) {
        this.detailPeminjamanCollection = detailPeminjamanCollection;
    }

    public Collection<DetailPengembalian> getDetailPengembalianCollection() {
        return detailPengembalianCollection;
    }

    public void setDetailPengembalianCollection(Collection<DetailPengembalian> detailPengembalianCollection) {
        this.detailPengembalianCollection = detailPengembalianCollection;
    }
    
}
