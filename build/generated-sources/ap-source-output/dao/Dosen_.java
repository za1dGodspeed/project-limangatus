package dao;

import dao.Credentials;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Dosen.class)
public class Dosen_ { 

    public static volatile SingularAttribute<Dosen, String> namaDosen;
    public static volatile SingularAttribute<Dosen, String> nidn;
    public static volatile SingularAttribute<Dosen, Credentials> idCred;
    public static volatile SingularAttribute<Dosen, String> email;
    public static volatile SingularAttribute<Dosen, String> noTelp;
    public static volatile SingularAttribute<Dosen, Date> tanggalBergabung;

}