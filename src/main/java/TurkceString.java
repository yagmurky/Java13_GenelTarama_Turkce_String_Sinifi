public class TurkceString {
    private String ifade;


    public TurkceString(String ifade) {
        this.ifade = ifade;
    }


    public char karakterAl (int index) {
        if (index>=0 && index < ifade.length()){
            return ifade.charAt(index);
        }
        else {
            System.out.println("Geçersiz bir giriş yaptınız.");
            return '\0';
        }
    }

    public int indexBul (char karakter) {
        return ifade.toLowerCase().indexOf(Character.toLowerCase(karakter));
    }

    public String altIfade(int baslangic, int bitis) {
        if (baslangic >= 0 && bitis <= ifade.length() && baslangic <= bitis) {
            return ifade.substring(baslangic, bitis);
        } else {
            System.out.println("Geçersiz başlangıç veya bitiş indeksi.");
            return "";
        }
    }
}
