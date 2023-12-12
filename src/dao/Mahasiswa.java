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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author THINKPAD
 */
@Entity
@Table(name = "mahasiswa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByNamaMahasiswa", query = "SELECT m FROM Mahasiswa m WHERE m.namaMahasiswa = :namaMahasiswa"),
    @NamedQuery(name = "Mahasiswa.findByEmail", query = "SELECT m FROM Mahasiswa m WHERE m.email = :email"),
    @NamedQuery(name = "Mahasiswa.findByNoTelp", query = "SELECT m FROM Mahasiswa m WHERE m.noTelp = :noTelp"),
    @NamedQuery(name = "Mahasiswa.findByTanggalBergabung", query = "SELECT m FROM Mahasiswa m WHERE m.tanggalBergabung = :tanggalBergabung"),
    @NamedQuery(name = "Mahasiswa.findByJenisKelamin", query = "SELECT m FROM Mahasiswa m WHERE m.jenisKelamin = :jenisKelamin")})
public class Mahasiswa implements Serializable {

    @OneToMany(mappedBy = "nim")
    private Collection<Peminjaman> peminjamanCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama_mahasiswa")
    private String namaMahasiswa;
    @Column(name = "email")
    private String email;
    @Column(name = "no_telp")
    private String noTelp;
    @Column(name = "tanggal_bergabung")
    @Temporal(TemporalType.DATE)
    private Date tanggalBergabung;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @JoinColumn(name = "id_cred", referencedColumnName = "id_cred")
    @ManyToOne
    private Credentials idCred;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
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

    public String getTanggalBergabung() {
        if (tanggalBergabung != null) {
            // Specify the desired date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
            return dateFormat.format(tanggalBergabung);
        } else {
            return null; // Or an empty string, depending on your requirements
        }
    }

    public void setTanggalBergabung(String tanggalBergabung) {
        try {
            // Assuming "tanggal" is the String date in the format you are using
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(tanggalBergabung);
            this.tanggalBergabung = parsedDate;
        } catch (ParseException e) {
            // Handle the parsing exception according to your requirements
            e.printStackTrace();
        }
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
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
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Mahasiswa[ nim=" + nim + " ]";
    }

    public Collection<Peminjaman> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<Peminjaman> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }

}
