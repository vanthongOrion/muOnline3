public class Point {
    private int strength;
    private int agility;
    private int energy;
    private int stamina;
    private int mana;
    private int remainPoint;

    public Point(int level) {
        this.remainPoint = aSignPoint(level);
    }

    public int aSignPoint(int level){
        if(level==1) return 100;
        else if (level<=100) return (int) (100*level*2.5);
        else if (level<=200) return (int) (100*level*3.9);
        else if (level<=300) return (int) (100*level*5.1);
        else return (int) (100*level*7.5);
    }

    public void setAllPoint(double strengthPer,double agilityPer,double energyPer,double staminaPer,double manaPer){
        double remainPer = 1.0;
        this.setStrength((int)(this.remainPoint * strengthPer));
        remainPer -= strengthPer ;
        remainPoint -= getStrength();
        this.setAgility((int) (this.remainPoint * agilityPer));
        remainPer -= agilityPer;
        remainPoint -= getAgility();
        this.setEnergy((int) (this.remainPoint * energyPer));
        remainPer -= energyPer;
        remainPoint -= getEnergy();
       this.setStamina((int) (this.remainPoint * staminaPer));
        remainPer -= staminaPer;
        remainPoint -= getStamina();
       this.setMana((int) (this.remainPoint * manaPer));
        remainPer -= manaPer;
        remainPoint -= getMana();

    }

    public boolean increaseStrength(int amount) {
        if (remainPoint < amount) return false;
        else {
            this.strength += amount;

            this.remainPoint -= amount;
            return true;
        }
    }

    public boolean increaseAgility(int amount) {
        if (remainPoint < amount) return false;
        else {
            this.agility += amount;
            this.remainPoint -= amount;
            return true;
        }
    }

    public boolean increaseEnergy(int amount) {
        if (remainPoint < amount) return false;
        else {
            this.energy += amount;
            this.remainPoint -= amount;
            return true;
        }
    }

    public boolean increaseStamina(int amount) {
        if (remainPoint < amount) return false;
        else {
            this.stamina += amount;
            this.remainPoint -= amount;
            return true;
        }
    }

    public boolean increaseMana(int amount) {
        if (remainPoint < amount) return false;
        else {
            this.mana += amount;
            this.remainPoint -= amount;
            return true;
        }
    }

    public boolean decreaseStrength(int amount) {
        if (this.strength < amount) return false;
        else {
            this.strength -= amount;
            this.remainPoint += amount;
            return true;
        }
    }

    public boolean decreaseAgility(int amount) {
        if (agility < amount) return false;
        else {
            this.agility -= amount;
            this.remainPoint += amount;
            return true;
        }
    }

    public boolean decreaseEnergy(int amount) {
        if (this.energy < amount) return false;
        else
            this.energy -= amount;
        this.remainPoint += amount;
        return true;
    }

    public boolean decreaseStamina(int amount) {
        if (this.stamina < amount) return false;
        else
            this.stamina -= amount;
        this.remainPoint += amount;
        return true;
    }

    public boolean decreaseMana(int amount) {
        if (this.mana < amount) return false;
        else
            this.mana -= amount;
        this.remainPoint += amount;
        return true;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getEnergy() {
        return energy;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Point{" +
                "strength=" + this.strength +
                ", agility=" + this.agility +
                ", energy=" + this.energy +
                ", stamina=" + this.stamina +
                ", mana=" + this.mana +
                ", RemainPoint=" + this.remainPoint +
                '}';
    }
}

