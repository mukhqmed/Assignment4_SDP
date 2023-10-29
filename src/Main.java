public class Main {
    public static void main(String[] args) {
        VerseFactory factory = VerseFactoryProvider.createFactory();
        Hero hero = factory.createHero();
        Villain enemy = factory.createEnemy();
        Weapon weapon = factory.createWeapon();
        hero.display();
        enemy.display();
        weapon.display();
    }
}