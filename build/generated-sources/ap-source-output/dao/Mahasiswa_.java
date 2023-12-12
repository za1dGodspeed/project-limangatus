package dao;

import dao.Credentials;
import dao.Peminjaman;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Mahasiswa.class)
public class Mahasiswa_ { 

    public static volatile CollectionAttribute<Mahasiswa, Peminjaman> peminjamanCollection;
    public static volatile SingularAttribute<Mahasiswa, String> nim;
    public static volatile SingularAttribute<Mahasiswa, Credentials> idCred;
    public static volatile SingularAttribute<Mahasiswa, String> jenisKelamin;
    public static volatile SingularAttribute<Mahasiswa, String> email;
    public static volatile SingularAttribute<Mahasiswa, String> noTelp;
    public static volatile SingularAttribute<Mahasiswa, Date> tanggalBergabung;
    public static volatile SingularAttribute<Mahasiswa, String> namaMahasiswa;

}