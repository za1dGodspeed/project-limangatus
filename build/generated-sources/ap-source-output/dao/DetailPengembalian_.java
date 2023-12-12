package dao;

import dao.Buku;
import dao.Pengembalian;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetailPengembalian.class)
public class DetailPengembalian_ { 

    public static volatile SingularAttribute<DetailPengembalian, String> pkDetailPengembalian;
    public static volatile SingularAttribute<DetailPengembalian, Pengembalian> idPengembalian;
    public static volatile SingularAttribute<DetailPengembalian, Buku> isbn;
    public static volatile SingularAttribute<DetailPengembalian, Double> jumlahDenda;

}