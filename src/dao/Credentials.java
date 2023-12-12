/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "credentials")
@NamedQueries({
    @NamedQuery(name = "Credentials.findAll", query = "SELECT c FROM Credentials c"),
    @NamedQuery(name = "Credentials.findByUsername", query = "SELECT c FROM Credentials c WHERE c.username = :username"),
    @NamedQuery(name = "Credentials.findByPassword", query = "SELECT c FROM Credentials c WHERE c.password = :password"),
    @NamedQuery(name = "Credentials.findByRoles", query = "SELECT c FROM Credentials c WHERE c.roles = :roles"),
    @NamedQuery(name = "Credentials.findByIdCred", query = "SELECT c FROM Credentials c WHERE c.idCred = :idCred")})
public class Credentials implements Serializable {

    @OneToMany(mappedBy = "idCred")
    private Collection<Mahasiswa> mahasiswaCollection;
    @OneToMany(mappedBy = "idCred")
    private Collection<Dosen> dosenCollection;
    @OneToMany(mappedBy = "idCred")
    private Collection<Admin> adminCollection;
    @OneToMany(mappedBy = "idCred")
    private Collection<Peminjaman> peminjamanCollection;

    @Column(name = "roles")
    private String roles;

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cred")
    private Integer idCred;

    public Credentials() {
    }

    public Credentials(Integer idCred) {
        this.idCred = idCred;
    }

    public Credentials(Integer idCred, String username, String password) {
        this.idCred = idCred;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getIdCred() {
        return idCred;
    }

    public void setIdCred(Integer idCred) {
        this.idCred = idCred;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCred != null ? idCred.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credentials)) {
            return false;
        }
        Credentials other = (Credentials) object;
        if ((this.idCred == null && other.idCred != null) || (this.idCred != null && !this.idCred.equals(other.idCred))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Credentials[ idCred=" + idCred + " ]";
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Collection<Mahasiswa> getMahasiswaCollection() {
        return mahasiswaCollection;
    }

    public void setMahasiswaCollection(Collection<Mahasiswa> mahasiswaCollection) {
        this.mahasiswaCollection = mahasiswaCollection;
    }

    public Collection<Dosen> getDosenCollection() {
        return dosenCollection;
    }

    public void setDosenCollection(Collection<Dosen> dosenCollection) {
        this.dosenCollection = dosenCollection;
    }

    public Collection<Admin> getAdminCollection() {
        return adminCollection;
    }

    public void setAdminCollection(Collection<Admin> adminCollection) {
        this.adminCollection = adminCollection;
    }

    public Collection<Peminjaman> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<Peminjaman> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }
    
}
