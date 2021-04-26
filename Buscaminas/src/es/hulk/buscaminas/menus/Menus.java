package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.tauler.Tauler;
import es.hulk.buscaminas.utils.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

import static es.hulk.buscaminas.menus.MenuType.*;

public class Menus extends Tauler {

    private String menu;
    private static int option;
    private static final Scanner scanner = new Scanner(System.in);

    public Menus(int column, int row) {
        super(column, row);
    }

    public static void printMenus(MenuType type) {
        if (type == MAINMENU) {
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
        }

        if (option == 4) {
            type = CUSTOM;
        }

        switch (type) {
            case MAINMENU:
                switch (option) {
                    case 1:
                        setTauler(new Caselles[8][8]);
                        printTauler();
                        break;
                    case 2:
                        setTauler(new Caselles[16][16]);
                        printTauler();
                        break;
                    case 3:
                        setTauler(new Caselles[40][40]);
                        printTauler();
                        break;
                }
                break;
            case CUSTOM:
                Utilities.logNewLine("");
                System.out.println("Tablero personalitzat");
                Utilities.logNewLine("");

                Utilities.log("Trii un numero de files: "); int x = scanner.nextInt();
                Utilities.log("Trii un numero de columnes: "); int y = scanner.nextInt();

                setTauler(new Caselles[x][y]);
                printTauler();
                break;
            case INGAME:
                Utilities.logNewLine("");
                Utilities.logNewLine("");
                Utilities.logNewLine("");
                break;
            case FINSIHED:
                Utilities.logNewLine("");
                Utilities.logNewLine("FINISHED Type");
                Utilities.logNewLine("");
        }
    }

    public static void printTitol() {
        Utilities.logNewLine("  ____  _    _  _____  _____          __  __ _____ _   _           _____ ");
        Utilities.logNewLine(" |  _ \\| |  | |/ ____|/ ____|   /\\   |  \\/  |_   _| \\ | |   /\\    / ____|");
        Utilities.logNewLine(" | |_) | |  | | (___ | |       /  \\  | \\  / | | | |  \\| |  /  \\  | (___  ");
        Utilities.logNewLine(" |  _ <| |  | |\\___ \\| |      / /\\ \\ | |\\/| | | | | . ` | / /\\ \\  \\___ \\ ");
        Utilities.logNewLine(" | |_) | |__| |____) | |____ / ____ \\| |  | |_| |_| |\\  |/ ____ \\ ____) |");
        Utilities.logNewLine(" |____/ \\____/|_____/ \\_____/_/    \\_\\_|  |_|_____|_| \\_/_/    \\_\\_____/ ");
        Utilities.logNewLine("                                                                         ");
    }

    public static void display() {
        try {
            printTitol();
            Utilities.logNewLine("Trii una de les seguents opcions");
            Utilities.logNewLine("");
            Utilities.logNewLine("1 - Principiant ");
            Utilities.logNewLine("2 - Normal");
            Utilities.logNewLine("3 - Dificil");
            Utilities.logNewLine("4 - Personalitzat");
            Utilities.logNewLine("");
            Utilities.log("Trii una de les opcions: ");
            printMenus(MAINMENU);
        } catch (InputMismatchException exception) {
            display();
        }

    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}