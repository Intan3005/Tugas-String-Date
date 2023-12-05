public class StringMethod {
    public static void main(String[] args) {
        String text1 = "Aku suka";
        String text2 = "Baca Novel";
        String text3 = "ketika";
        String text4 = "Saya senggang";
        // String text3 = text2.toUpperCase();
        // String text4 = text1.trim();
        // Date date = new Date();

        // String str =String.format("Current date/Time: %tc", date);
        // system.out.printf(str);
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("length text\t= "+text1.length());
        System.out.println("compareTo\t="+text1.compareTo(text2));
        System.out.println("sebelum trim\t="+text1+text2);
        System.out.println("setelah trim\t"+text1.trim()+text2);
        System.out.println("equals\t\t="+text1.equals(text2));
        System.out.println("equalsIgnoreCase="+text1.equalsIgnoreCase(text2));
        System.out.println("toUpperCase\t="+text1.toUpperCase());
        System.out.println("toLowerCase\t="+text1.toLowerCase());
        System.out.println("toLowerCase\t="+text3.toLowerCase());
        System.out.println("concat\t\t="+text4.concat(text3));
    }
}
