package dao;

import dao.DetailPeminjaman;
import dao.DetailPengembalian;
import dao.Kategori;
import dao.Temp;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-13T04:21:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Buku.class)
public class Buku_ { 

    public static volatile SingularAttribute<Buku, Kategori> idKategori;
    public static volatile CollectionAttribute<Buku, DetailPengembalian> detailPengembalianCollection;
    public static volatile SingularAttribute<Buku, String> tahunTerbit;
    public static volatile SingularAttribute<Buku, String> penerbit;
    public static volatile SingularAttribute<Buku, String> isbn;
    public static volatile CollectionAttribute<Buku, Temp> tempCollection;
    public static volatile CollectionAttribute<Buku, DetailPeminjaman> detailPeminjamanCollection;
    public static volatile SingularAttribute<Buku, String> judulBuku;
    public static volatile SingularAttribute<Buku, Integer> stok;
    public static volatile SingularAttribute<Buku, byte[]> gambar;

}