/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan01;

/**
 *
 * @author IT GRC
 */
public class utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // CONTOH AMFIBI
        amfibi katak = new amfibi();
        katak.setNama("Katak");
        katak.setJumlahKaki(4);
        katak.setAlatGerak("melompat");
        katak.setMetamorfosis(true);
        katak.setHidupDiAirDanDarat(true);
        katak.setTipeKulit("lembap dan licin");

        System.out.println("Amfibi : " + katak.getNama());
        katak.bernapas();
        katak.tumbuh();
        katak.berkembangBiak();
        System.out.println("Jumlah kaki katak ada " + katak.getJumlahKaki());
        System.out.println("Alat gerak katak yaitu " + katak.getAlatGerak());
        System.out.println("Metamorfosis : " + katak.isMetamorfosis());
        System.out.println("Hidup di air dan darat : " + katak.isHidupDiAirDanDarat());
        System.out.println("Katak memiliki tipe kulit yang " + katak.getTipeKulit());
        System.out.println();

        // CONTOH PISCES
        pisces arwana = new pisces();
        arwana.setNama("Arwana");
        arwana.setJumlahKaki(0);
        arwana.setAlatGerak("berenang");
        arwana.setTipeInsang("lembar insang");
        arwana.setJenisSisik("sisik besar dan keras");
        arwana.setMemilikiSirip(true);

        System.out.println("Pisces : " + arwana.getNama());
        arwana.bernapas();
        arwana.tumbuh();
        arwana.berkembangBiak();
        System.out.println("Jumlah kaki arwana ada " + arwana.getJumlahKaki());
        System.out.println("Alat Gerak arwana yaitu dengan cara " + arwana.getAlatGerak());
        System.out.println("Arwana memiliki tipe insang yaitu " + arwana.getTipeInsang());
        System.out.println("Jenis sisik dari ikan arwana adalah " + arwana.getJenisSisik());
        System.out.println("Memiliki sirip : " + arwana.isMemilikiSirip());
        System.out.println();

        // CONTOH AVES
        aves elang = new aves();
        elang.setNama("Elang");
        elang.setJumlahKaki(2);
        elang.setAlatGerak("terbang");
        elang.setBisaTerbang(true);
        elang.setTipeParuh("tajam");
        elang.setTipeBulu("halus dan tahan air");

        System.out.println("Aves : " + elang.getNama());
        elang.bernapas();
        elang.tumbuh();
        elang.berkembangBiak();
        System.out.println("Jumlah kaki burung elang adalah " + elang.getJumlahKaki());
        System.out.println("Alat gerak burung elang yaitu dengan cara " + elang.getAlatGerak());
        System.out.println("Bisa terbang : " + elang.isBisaTerbang());
        System.out.println("Burung elang memiliki tipe paruh yang " + elang.getTipeParuh());
        System.out.println("Burung elang juga memiliki tipe bulu yang " + elang.getTipeBulu());
        System.out.println();

        // CONTOH MAMALIA
        mamalia gajah = new mamalia();
        gajah.setNama("Gajah");
        gajah.setJumlahKaki(4);
        gajah.setAlatGerak("berjalan");
        gajah.setJenisBulu("sedikit berbulu");
        gajah.setMelahirkanAnak(true);
        gajah.setTipeGigi("gigi geraham besar");

        System.out.println("Mamalia : " + gajah.getNama());
        gajah.bernapas();
        gajah.tumbuh();
        gajah.berkembangBiak();
        System.out.println("Jumlah kaki pada gajah adalah " + gajah.getJumlahKaki());
        System.out.println("Alat Geraknya adalah " + gajah.getAlatGerak());
        System.out.println("Jenis bulu dari gajah ini yaitu " + gajah.getJenisBulu());
        System.out.println("Melahirkan anak : " + gajah.isMelahirkanAnak());
        System.out.println("Gajah memiliki tipe gigi yaitu " + gajah.getTipeGigi());
        System.out.println();

        // CONTOH REPTIL
        reptil ular = new reptil();
        ular.setNama("Ular");
        ular.setJumlahKaki(0);
        ular.setAlatGerak("melata");
        ular.setBertelur(true);
        ular.setJenisSisik("sisik keras");
        ular.setTipeKulit("kering dan bersisik");

        System.out.println("Reptil : " + ular.getNama());
        ular.bernapas();
        ular.tumbuh();
        ular.berkembangBiak();
        System.out.println("Jumlah kaki pada ular adalah " + ular.getJumlahKaki());
        System.out.println("Ular memiliki alat gerak yaitu dengan cara " + ular.getAlatGerak());
        System.out.println("Bertelur : " + ular.isBertelur());
        System.out.println("Jenis sisik pada ular yaitu " + ular.getJenisSisik());
        System.out.println("Ular memiliki tipe kulit yang " + ular.getTipeKulit());
        System.out.println();
        
         // CONTOH DIKOTIL
        dikotil kacang = new dikotil();
        kacang.setNama("Kacang");
        kacang.setWarnaDaun("hijau");
        kacang.setTipeAkar("taproot");
        kacang.setBentukDaun("menjari");
        kacang.setJumlahKotiledon(2);
        kacang.setPolaAkar("berakar tunggang");
        
        System.out.println("Dikotil : " + kacang.getNama());
        kacang.bernapas();
        kacang.tumbuh();
        kacang.berkembangBiak();
        System.out.println("Kacang memiliki warna daun yang berwarna " + kacang.getWarnaDaun());
        System.out.println("Tipe akar dari kacang yaitu " + kacang.getTipeAkar());
        System.out.println("Bentuk daunnya adalah " + kacang.getBentukDaun());
        System.out.println("Jumlah kotiledon : " + kacang.getJumlahKotiledon());
        System.out.println("Kacang memiliki pola akar yaitu " + kacang.getPolaAkar());
        System.out.println();
        
        // CONTOH MONOKOYIL
        monokotil jagung = new monokotil();
        jagung.setNama("Jagung");
        jagung.setWarnaDaun("hijau Muda");
        jagung.setTipeAkar("Serabut");
        jagung.setJumlahTulangDaun(3);
        jagung.setJumlahKotiledon(1);
        jagung.setSusunanBunga("tersusun melingkar");

        System.out.println("Monokotil : " + jagung.getNama());
        jagung.bernapas();
        jagung.tumbuh();
        jagung.berkembangBiak();
        System.out.println("Jagung memiliki warna daun yang berwarna " + jagung.getWarnaDaun());
        System.out.println("Tipe akar dari jagung yaitu " + jagung.getTipeAkar());
        System.out.println("Jumlah tulang daun pada jagung ada " + jagung.getJumlahTulangDaun());
        System.out.println("Jumlah kotiledon : " + jagung.getJumlahKotiledon());
        System.out.println("Susunan bunga pada jagung yaitu " + jagung.getSusunanBunga());
        System.out.println();
    }
    }
    

