package dao;

import dao.Credentials;
import dao.DetailPeminjaman;
import dao.Mahasiswa;
import dao.Pengembalian;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Peminjaman.class)
public class Peminjaman_ { 

    public static volatile SingularAttribute<Peminjaman, Date> tanggalPengembalian;
    public static volatile SingularAttribute<Peminjaman, Pengembalian> pengembalian;
    public static volatile SingularAttribute<Peminjaman, Mahasiswa> nim;
    public static volatile SingularAttribute<Peminjaman, Credentials> idCred;
    public static volatile SingularAttribute<Peminjaman, Integer> totalPinjam;
    public static volatile CollectionAttribute<Peminjaman, DetailPeminjaman> detailPeminjamanCollection;
    public static volatile SingularAttribute<Peminjaman, String> statusPeminjaman;
    public static volatile SingularAttribute<Peminjaman, Date> tanggalPeminjaman;
    public static volatile SingularAttribute<Peminjaman, String> idPeminjaman;

}