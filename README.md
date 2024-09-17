## Deskripsi Tugas
Pada tugas Pemrograman Berbasis Objek (PBO) pertemuan 1 ini yaitu mengimplementasikan konsep inheritance dengan extends dan set get. Pada proyek ini saya mengimplementasikan mereka dalam satu package yang terhubung dengan baik.

# Inheritance (pewarisan)
Inheritance adalah konsep dalam OOP yang memungkinkan sebuah class `(subclass)` mewarisi atribut dan metode dari class lain `(superclass)`. Ini memungkinkan Anda untuk mendefinisikan hierarki class yang lebih kompleks dan menghindari pengulangan kode.
1. Superclass: Class yang diwarisi.
2. Subclass: Class yang mewarisi dari superclass.

# Extends 
Extends digunakan untuk menyatakan bahwa sebuah class adalah subclass dari class lain. Dengan extends, subclass mewarisi semua anggota (atribut dan metode) dari superclass.
Sintaks : `class Subclass extends Superclass { ... }`

## Contoh dari Inheritance dan Extends
<pre>
  public class makhlukHidup {
    private String nama;

  public class hewan extends makhlukHidup {
    private int jumlahKaki;
    private String alatGerak;

  public class tumbuhan extends makhlukHidup {
    private String warnaDaun;
    private String tipeAkar;
</pre>
Dalam contoh kode tersebut, **inheritance** dan **`extends`** digunakan untuk membangun hierarki class dengan `makhlukHidup` sebagai superclass dan `hewan` serta `tumbuhan` sebagai subclass. Class `makhlukHidup` memiliki atribut private `nama`, yang diwarisi oleh kedua subclass. Class `hewan` mewarisi `nama` dari `makhlukHidup` dan menambahkan atribut `jumlahKaki` serta `alatGerak`, sedangkan class `tumbuhan` juga mewarisi `nama` dan menambahkan atribut `warnaDaun` dan `tipeAkar`. Penggunaan `extends` di sini memungkinkan subclass `hewan` dan `tumbuhan` untuk menggunakan dan memperluas fitur dari superclass `makhlukHidup`.

# Setter dan Getter
Getter dan Setter adalah metode yang digunakan untuk mengakses dan mengubah `nilai atribut private` dari sebuah class. Ini adalah cara untuk `memberikan kontrol akses` dan `validasi data`.
1. `Getter`: Metode yang digunakan untuk mendapatkan nilai dari atribut private.
2. `Setter`: Metode yang digunakan untuk menetapkan nilai pada atribut private.

## Contoh dari Setter dan Getter
<pre>
  public class tumbuhan extends makhlukHidup {
    private String warnaDaun;
    private String tipeAkar;

    public String getWarnaDaun() {
        return warnaDaun;
    }

    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }

    public String getTipeAkar() {
        return tipeAkar;
    }

    public void setTipeAkar(String tipeAkar) {
        this.tipeAkar = tipeAkar;
    }
}
</pre>
Dalam contoh kode tersebut, class `tumbuhan` memiliki dua atribut private, yaitu `warnaDaun` dan `tipeAkar`, yang diakses dan dimodifikasi melalui metode getter dan setter. Metode `getWarnaDaun()` dan `getTipeAkar()` adalah getter yang digunakan untuk mengambil nilai dari atribut `warnaDaun` dan `tipeAkar`, sedangkan metode `setWarnaDaun(String warnaDaun)` dan `setTipeAkar(String tipeAkar)` adalah setter yang digunakan untuk menetapkan nilai pada atribut tersebut. Penggunaan getter dan setter memungkinkan enkapsulasi, yaitu kontrol akses terhadap atribut private dari luar class, serta memungkinkan validasi atau logika tambahan saat nilai diubah.

Semoga penjelasan diatas dapat membantu memahami materi dalam tugas pertemuan 1 mata kuliah Pemrograman Berorientasi Objek ini.
