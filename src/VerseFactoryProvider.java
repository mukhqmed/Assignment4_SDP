import java.util.Scanner;
public class VerseFactoryProvider {
        public static VerseFactory createFactory() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a universe (Marvel/DC):");
            String universe = scanner.nextLine();
            if (universe.equalsIgnoreCase("Marvel")) {
                return new MarvelVerseFactory();
            } else if (universe.equalsIgnoreCase("DC")) {
                return new DCVerseFactory();
            } else {
                throw new IllegalArgumentException("Invalid universe");
            }
        }
    }

