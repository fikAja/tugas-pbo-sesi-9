public class EqualsString {
    public static void main(String[]args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "Hello";
        System.out.println("outputnya adalah : " + string1.equals(string2));
        System.out.println("outputnya adalah : " + string1.equals(string3));
    }
}

// output :
// hasilnya : true
// hasilnya : false
