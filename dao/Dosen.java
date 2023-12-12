/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "dosen")
@NamedQueries({
    @NamedQuery(name = "Dosen.findAll", query = "SELECT d FROM Dosen d"),
    @NamedQuery(name = "Dosen.findByNidn", query = "SELECT d FROM Dosen d WHERE d.nidn = :nidn"),
    @NamedQuery(name = "Dosen.findByNamaDosen", query = "SELECT d FROM Dosen d WHERE d.namaDosen = :namaDosen"),
    @NamedQuery(name = "Dosen.findByEmail", query = "SELECT d FROM Dosen d WHERE d.email = :email"),
    @NamedQuery(name = "Dosen.findByNoTelp", query = "SELECT d FROM Dosen d WHERE d.noTelp = :noTelp"),
    @NamedQuery(name = "Dosen.findByTanggalBergabung", query = "SELECT d FROM Dosen d WHERE d.tanggalBergabung = :tanggalBergabung")})
public class Dosen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nidn")
    private String nidn;
    @Column(name = "nama_dosen")
    private String namaDosen;
    @Column(name = "email")
    private String email;
    @Column(name = "no_telp")
    private String noTelp;
    @Column(name = "tanggal_bergabung")
    @Temporal(TemporalType.DATE)
    private Date tanggalBergabung;
    @JoinColumn(name = "id_cred", referencedColumnName = "id_cred")
    @ManyToOne
    private Credentials idCred;

    public Dosen() {
    }

    public Dosen(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Date getTanggalBergabung() {
        return tanggalBergabung;
    }

    public void setTanggalBergabung(Date tanggalBergabung) {
        this.tanggalBergabung = tanggalBergabung;
    }

    public Credentials getIdCred() {
        return idCred;
    }

    public void setIdCred(Credentials idCred) {
        this.idCred = idCred;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidn != null ? nidn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosen)) {
            return false;
        }
        Dosen other = (Dosen) object;
        if ((this.nidn == null && other.nidn != null) || (this.nidn != null && !this.nidn.equals(other.nidn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Dosen[ nidn=" + nidn + " ]";
    }
    
}
