package es.hulk.repas.practica;

public class CountChars extends Practica1 {

    private static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int maxchars = chars.length;

    public static void returnCountedChars() {
        int counter = 0;
        int maxText = string.length();
        for (int i = 0; i < maxText; i++) {
            for (int j = 0; j < maxchars; j++) {
                if (string.charAt(i) == chars[j]) {
                    counter++;
                }
            }
        }
        System.out.println("La frase te un total " + counter + " lletres");

        Practica1.display();
    }

}
