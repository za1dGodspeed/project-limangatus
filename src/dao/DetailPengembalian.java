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
@Table(name = "detail_pengembalian")
@NamedQueries({
    @NamedQuery(name = "DetailPengembalian.findAll", query = "SELECT d FROM DetailPengembalian d"),
    @NamedQuery(name = "DetailPengembalian.findByJumlahDenda", query = "SELECT d FROM DetailPengembalian d WHERE d.jumlahDenda = :jumlahDenda"),
    @NamedQuery(name = "DetailPengembalian.findByPkDetailPengembalian", query = "SELECT d FROM DetailPengembalian d WHERE d.pkDetailPengembalian = :pkDetailPengembalian")})
public class DetailPengembalian implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "jumlah_denda")
    private Double jumlahDenda;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_detail_pengembalian")
    private String pkDetailPengembalian;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private Buku isbn;
    @JoinColumn(name = "id_pengembalian", referencedColumnName = "id_pengembalian")
    @ManyToOne
    private Pengembalian idPengembalian;

    public DetailPengembalian() {
    }

    public DetailPengembalian(String pkDetailPengembalian) {
        this.pkDetailPengembalian = pkDetailPengembalian;
    }

    public Double getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(Double jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }

    public String getPkDetailPengembalian() {
        return pkDetailPengembalian;
    }

    public void setPkDetailPengembalian(String pkDetailPengembalian) {
        this.pkDetailPengembalian = pkDetailPengembalian;
    }

    public Buku getIsbn() {
        return isbn;
    }

    public void setIsbn(Buku isbn) {
        this.isbn = isbn;
    }

    public Pengembalian getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(Pengembalian idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkDetailPengembalian != null ? pkDetailPengembalian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPengembalian)) {
            return false;
        }
        DetailPengembalian other = (DetailPengembalian) object;
        if ((this.pkDetailPengembalian == null && other.pkDetailPengembalian != null) || (this.pkDetailPengembalian != null && !this.pkDetailPengembalian.equals(other.pkDetailPengembalian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.DetailPengembalian[ pkDetailPengembalian=" + pkDetailPengembalian + " ]";
    }
    
}
