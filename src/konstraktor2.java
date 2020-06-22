public class konstraktor2 {
    private String kodebarang;
    private String namabarang;
    private short jumlah;
    private double harga;

    public konstraktor2() {
    }

    public konstraktor2(String kodebarang, String namabarang) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
    }

    public konstraktor2(String kodebarang, String namabarang,
                        short jumlah, double harga) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public static void main(String[] args){
        konstraktor2 obj2 = new konstraktor2("1029376", "Mesin Fotocopy");

        System.out.print(obj2.kodebarang+" : "+obj2.namabarang);
    }
}
