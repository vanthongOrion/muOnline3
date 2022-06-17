public class ManaPoint {
    private int mp;
    private int factor;

    public ManaPoint(){
        this.mp = 50;
        this.factor = 1;
    }

    public void addMp(int amount){
        this.mp += amount;
    }
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
