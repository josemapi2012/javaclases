public class mayus {
    public static void main(String[] args)
    {
        String a = "Mucho Texto De Prueba";
        String sMayus = a.toUpperCase();
        String sMinus = a.toLowerCase();

        System.out.println("Original: "+a);
        System.out.println("Mayusculas: "+sMayus);
        System.out.println("Minusculas: "+sMinus);
    }
}