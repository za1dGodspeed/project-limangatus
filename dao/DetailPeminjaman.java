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
@Table(name = "detail_peminjaman")
@NamedQueries({
    @NamedQuery(name = "DetailPeminjaman.findAll", query = "SELECT d FROM DetailPeminjaman d"),
    @NamedQuery(name = "DetailPeminjaman.findByStatusPengembalian", query = "SELECT d FROM DetailPeminjaman d WHERE d.statusPengembalian = :statusPengembalian"),
    @NamedQuery(name = "DetailPeminjaman.findByPkDetailPeminjaman", query = "SELECT d FROM DetailPeminjaman d WHERE d.pkDetailPeminjaman = :pkDetailPeminjaman")})
public class DetailPeminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "status_pengembalian")
    private String statusPengembalian;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_detail_peminjaman")
    private String pkDetailPeminjaman;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private Buku isbn;
    @JoinColumn(name = "id_peminjaman", referencedColumnName = "id_peminjaman")
    @ManyToOne
    private Peminjaman idPeminjaman;

    public DetailPeminjaman() {
    }

    public DetailPeminjaman(String pkDetailPeminjaman) {
        this.pkDetailPeminjaman = pkDetailPeminjaman;
    }

    public String getStatusPengembalian() {
        return statusPengembalian;
    }

    public void setStatusPengembalian(String statusPengembalian) {
        this.statusPengembalian = statusPengembalian;
    }

    public String getPkDetailPeminjaman() {
        return pkDetailPeminjaman;
    }

    public void setPkDetailPeminjaman(String pkDetailPeminjaman) {
        this.pkDetailPeminjaman = pkDetailPeminjaman;
    }

    public Buku getIsbn() {
        return isbn;
    }

    public void setIsbn(Buku isbn) {
        this.isbn = isbn;
    }

    public Peminjaman getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(Peminjaman idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkDetailPeminjaman != null ? pkDetailPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPeminjaman)) {
            return false;
        }
        DetailPeminjaman other = (DetailPeminjaman) object;
        if ((this.pkDetailPeminjaman == null && other.pkDetailPeminjaman != null) || (this.pkDetailPeminjaman != null && !this.pkDetailPeminjaman.equals(other.pkDetailPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.DetailPeminjaman[ pkDetailPeminjaman=" + pkDetailPeminjaman + " ]";
    }
    
}
