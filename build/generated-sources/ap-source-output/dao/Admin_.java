package dao;

import dao.Credentials;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, String> namaAdmin;
    public static volatile SingularAttribute<Admin, Credentials> idCred;
    public static volatile SingularAttribute<Admin, String> niad;
    public static volatile SingularAttribute<Admin, String> email;

}