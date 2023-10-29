public class MarvelVerseFactory implements VerseFactory{
    public MarvelVerseFactory(){
        System.out.println("Creating verse factory for Marvel...");
    }
    public Hero createHero(){
        System.out.println("Creating a Marvel Hero...");
        return new MarvelHero();
    }
    public Villain createEnemy(){
        System.out.println("Creating a Marvel Villain...");
        return new MarvelVillain();
    }

    @Override
    public Weapon createWeapon() {
        System.out.println("Creating a Marvel Weapon...");
        return new MarvelWeapon();
    }
}
