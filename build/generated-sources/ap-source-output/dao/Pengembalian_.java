package dao;

import dao.DetailPengembalian;
import dao.Mahasiswa;
import dao.Peminjaman;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pengembalian.class)
public class Pengembalian_ { 

    public static volatile SingularAttribute<Pengembalian, Date> tanggalPengembalian;
    public static volatile SingularAttribute<Pengembalian, Mahasiswa> nim;
    public static volatile CollectionAttribute<Pengembalian, DetailPengembalian> detailPengembalianCollection;
    public static volatile SingularAttribute<Pengembalian, String> idPengembalian;
    public static volatile SingularAttribute<Pengembalian, Double> dendaPengembalian;
    public static volatile SingularAttribute<Pengembalian, String> idPeminjaman;
    public static volatile SingularAttribute<Pengembalian, Peminjaman> peminjaman;

}