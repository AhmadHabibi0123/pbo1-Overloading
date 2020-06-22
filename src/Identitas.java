public class Identitas {

        private String nama;
        private String jenisKelamin;
        private String umur;
        private double tinggiBadan;
        private double beratBadan;

        public void setIdentitas(String nama){
            this.nama = nama;
        }
        public void setIdentitas(String nama, String jenisKelamin){
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
        }
        public void setIdentitas(String nama, String jenisKelamin, String umur){
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.umur = umur;
        }
        public void setIdentitas(String nama, String jenisKelamin, String umur, double tinggiBadan){
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.umur = umur;
            this.tinggiBadan = tinggiBadan;
        }
        public void setIdentitas(String nama, String jenisKelamin, String umur, double tinggiBadan, double beratBadan) {
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.umur = umur;
            this.tinggiBadan = tinggiBadan;
            this.beratBadan = beratBadan;
        }

        public void cetakIdentitas(){
            System.out.println("Nama           : "+nama);
            System.out.println("Jenis Kelamin  : "+jenisKelamin);
            System.out.println("Umur           : "+umur);
            System.out.println("Tinggi Badan   : "+tinggiBadan);
            System.out.println("Berat Badan    : "+beratBadan);
            System.out.println();
        }
    }