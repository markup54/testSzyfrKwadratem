public class Kryptograf {
    public static String szyfruj(String slowo){

        String szyfr="";
        if (slowo == "")
            return szyfr;
        int pierwiastek = 1;
        int dlugosc = slowo.length();
        while (pierwiastek*pierwiastek<dlugosc){
            pierwiastek++;
        }
        while (pierwiastek*pierwiastek>slowo.length()){
            slowo = slowo+" ";
        }
        for (int i = 0; i < pierwiastek; i++) {
            for(int k=i ; k< slowo.length();k=k+pierwiastek){
                szyfr = szyfr + slowo.charAt(k);
            }
        }
        szyfr = szyfr.trim();
        return szyfr;
    }
}
