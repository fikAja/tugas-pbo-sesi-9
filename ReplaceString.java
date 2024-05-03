public class ReplaceString {
    public static void main(String [] args){
        String String1 = "Hello How Are You";
        String GantiKarakter = String1.replace('H','T');
        String GantiKalimat = String1.replace( "HELLO","Good Morning");
        System.out.println(" untuk replace karakter : " + GantiKarakter);
        System.out.println(" untuk replace kalimat : " + GantiKalimat);
    }
}
