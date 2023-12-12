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
@Table(name = "admin")
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByNiad", query = "SELECT a FROM Admin a WHERE a.niad = :niad"),
    @NamedQuery(name = "Admin.findByNamaAdmin", query = "SELECT a FROM Admin a WHERE a.namaAdmin = :namaAdmin"),
    @NamedQuery(name = "Admin.findByEmail", query = "SELECT a FROM Admin a WHERE a.email = :email")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "niad")
    private String niad;
    @Column(name = "nama_admin")
    private String namaAdmin;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "id_cred", referencedColumnName = "id_cred")
    @ManyToOne
    private Credentials idCred;

    public Admin() {
    }

    public Admin(String niad) {
        this.niad = niad;
    }

    public String getNiad() {
        return niad;
    }

    public void setNiad(String niad) {
        this.niad = niad;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (niad != null ? niad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.niad == null && other.niad != null) || (this.niad != null && !this.niad.equals(other.niad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Admin[ niad=" + niad + " ]";
    }
    
}
