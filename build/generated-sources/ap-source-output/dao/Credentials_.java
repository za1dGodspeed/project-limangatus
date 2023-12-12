package dao;

import dao.Admin;
import dao.Dosen;
import dao.Mahasiswa;
import dao.Peminjaman;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Credentials.class)
public class Credentials_ { 

    public static volatile CollectionAttribute<Credentials, Dosen> dosenCollection;
    public static volatile CollectionAttribute<Credentials, Peminjaman> peminjamanCollection;
    public static volatile SingularAttribute<Credentials, String> password;
    public static volatile CollectionAttribute<Credentials, Admin> adminCollection;
    public static volatile SingularAttribute<Credentials, String> roles;
    public static volatile SingularAttribute<Credentials, Integer> idCred;
    public static volatile CollectionAttribute<Credentials, Mahasiswa> mahasiswaCollection;
    public static volatile SingularAttribute<Credentials, String> username;

}