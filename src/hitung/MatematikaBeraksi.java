package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika fatimah = new Matematika(8,8);
        
        System.out.println("Hasil penjumlahan:" +fatimah.setPenjumlahan());
        System.out.println("Hasil pengurangan:" +fatimah.setPengurangan());
        System.out.println("Hasil perkalian:" +fatimah.setPerkalian());
        System.out.println("Hasil pembagian:" +fatimah.setPembagian());
    }
}
