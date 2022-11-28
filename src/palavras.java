public class palavras {
    public static String merge(String p1, String p2)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < p1.length() || i < p2.length(); i++) {

            if (i < p1.length())
                result.append(p1.charAt(i));

            if (i < p2.length())
                result.append(p2.charAt(i));
        }

        return result.toString();
    }


    public static void main(String[] args)
    {
        String p1 = "Lucas";
        String p2 = "Maia";
        System.out.println(merge(p1, p2));
    }

}
