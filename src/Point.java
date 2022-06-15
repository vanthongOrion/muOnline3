public class Point {
    private int strength;
    private int agility;
    private int energy;
    private int stamina;
    private int mana;
    private int totalPoint;
    private int remainPoint;

    public Point(int totalPoint, int strength, int agility, int energy, int stamina, int mana) {
        this.totalPoint = totalPoint;
        this.strength = strength;
        this.agility = agility;
        this.energy = energy;
        this.stamina = stamina;
        this.mana = mana;
        this.remainPoint = totalPoint - (strength + agility + energy + stamina + mana);
    }

    public Point(int totalPoint) {
        this(totalPoint, 0, 0, 0, 0, 0);
        this.remainPoint = totalPoint;
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

