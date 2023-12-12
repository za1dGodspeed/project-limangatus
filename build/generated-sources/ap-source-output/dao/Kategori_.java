package dao;

import dao.Buku;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Kategori.class)
public class Kategori_ { 

    public static volatile SingularAttribute<Kategori, String> idKategori;
    public static volatile SingularAttribute<Kategori, String> namaKategori;
    public static volatile CollectionAttribute<Kategori, Buku> bukuCollection;

}