package dao;

import dao.Buku;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Temp.class)
public class Temp_ { 

    public static volatile SingularAttribute<Temp, Integer> jumlahPinjam;
    public static volatile SingularAttribute<Temp, String> tahunTerbit;
    public static volatile SingularAttribute<Temp, String> penerbit;
    public static volatile SingularAttribute<Temp, String> pkTemp;
    public static volatile SingularAttribute<Temp, Buku> isbn;
    public static volatile SingularAttribute<Temp, String> judulBuku;
    public static volatile SingularAttribute<Temp, String> statusPinjam;

}