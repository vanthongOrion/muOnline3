public class HealthPoint {
    private int hp;
    private int factor;

    public HealthPoint(){
        this.factor = 1;
        this.hp = 100;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }
    public void addHp(int amount){
        this.hp += amount;
    }

    public int getHp() {
        return hp;
    }

}
