public class StringMethods {
    public static void main(String[] args) {
        String name ="Roshan";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.replace("Ro", "Bhu"));
        System.out.println(name.replace('R', 'P'));
        System.out.println(name.substring(1, 5));
        System.out.println(name.substring(0));
        System.out.println(name.startsWith("Rs"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("n", 3));
        System.out.println(name.lastIndexOf("o"));
        System.out.println(name.equals("roshan"));
        System.out.println(name.equalsIgnoreCase("roshan"));
    }
    
}
