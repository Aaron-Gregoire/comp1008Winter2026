package wk9;

public class SuperHero extends Human{

    private String superPower, heroName;
    public double scarinessLevel;


    public SuperHero(){}

    public SuperHero(String name, double power, int speed,
                     double height, int age, String superPower,
                     String heroName, double scarinessLevel) {
        super(name, power, speed, height, age);
        this.superPower = superPower;
        this.heroName = heroName;
        this.scarinessLevel = scarinessLevel;
    }

    public SuperHero(String name, double power, int speed, double height, int age ){
        super(name, power, speed, height, age);
    }
    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getSpeed(){
        return 2 * super.getSpeed();
    }

    public String toString(){


        return super.toString()
                .replace("Human", "SuperHero")
                .replace("}", "")
                +", Heroname=" + heroName + ", SuperPower=" + superPower +
                ", scarinessLevel= " + scarinessLevel + "}";
    }
}
