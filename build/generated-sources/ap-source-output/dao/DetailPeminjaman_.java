package dao;

import dao.Buku;
import dao.Peminjaman;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetailPeminjaman.class)
public class DetailPeminjaman_ { 

    public static volatile SingularAttribute<DetailPeminjaman, String> statusPengembalian;
    public static volatile SingularAttribute<DetailPeminjaman, Buku> isbn;
    public static volatile SingularAttribute<DetailPeminjaman, String> pkDetailPeminjaman;
    public static volatile SingularAttribute<DetailPeminjaman, Peminjaman> idPeminjaman;

}