public class Runner {
    public static void main(String[] args) {
        TurkceString turkceString= new TurkceString("Benim adım Yağmur.");
        char karakter = turkceString.karakterAl(4);
        System.out.println("Girilen indexteki karakter: " + karakter);
        int index= turkceString.indexBul('y');
        System.out.println("Girilen harfin indexi: " +index);
        String altIfade= turkceString.altIfade(11,17);
        System.out.println("Girilen aralıktaki alt ifade: "+altIfade);

    }
}
