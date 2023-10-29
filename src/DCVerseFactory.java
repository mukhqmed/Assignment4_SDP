public class DCVerseFactory implements VerseFactory{
    public DCVerseFactory(){
        System.out.println("Creating a verse factory for Marvel...");
    }
    public Hero createHero(){
        System.out.println("Creating a DC Hero...");
        return new DCHero();
    }
    public Villain createEnemy(){
        System.out.println("Creating a DC Villain...");
        return new DCVillain();
    }

    @Override
    public Weapon createWeapon() {
        System.out.println("Creating a DC Weapon...");
        return new DCWeapon();
    }
}
