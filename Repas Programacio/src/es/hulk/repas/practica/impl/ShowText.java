package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class ShowText extends Practica1 {

    public static void showText() {
        try {
            if (text.toLowerCase() == null) {
                System.out.println("No s'ha introduit cap text");
            } else {
                System.out.println("El text es: " + text);
            }
        } catch (NullPointerException exception) {
            System.err.println("Error: " + exception);
        }
    }

}
