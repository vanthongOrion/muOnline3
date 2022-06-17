import java.util.ArrayList;

public class Character {
    private String name;
    private String type;
    private int level;
    private int remainPoint;
    private HealthPoint hp;
    private ManaPoint mp;

    private ArrayList<Skill> skills;
    private ArrayList<Weapon> weapons;
    private ArrayList<Point> points;
    private Damage damage;


    public Character(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;

        skills = new ArrayList<Skill>();
        weapons = new ArrayList<Weapon>();

        this.remainPoint = aSignPoint(level);

        this.points = new ArrayList<Point>();
        points.add(new Point("str"));
        points.add(new Point("ag"));
        points.add(new Point("en"));
        points.add(new Point("sta"));
        points.add(new Point("mn"));

        this.damage = new Damage();

        this.hp = new HealthPoint();
        hp.setHp(aSignHp(type,level));

        this.mp = new ManaPoint();
        mp.setMp(aSignMp(type,level));
    }

    public int aSignHp(String type, int level) {
        return switch (type) {
            case "DK" ->
                    (int) (( 0 +(level * 0.6))+(level * 0.6) * ((getDetailPoint("ag") * 1.1) + (getDetailPoint("en") * 7.6) + (getDetailPoint("sta") * 4.6) + (getDetailPoint("str") * 7.1) + (getDetailPoint("mn") * 3.5)));
            case "DW" ->
                    (int) ((0 + (level * 0.5))+(level * 0.5) * (getDetailPoint("ag") * 0.5 + (getDetailPoint("en") * 3.6) + (getDetailPoint("sta") * 1.2) + (getDetailPoint("str") * 5.6) + (getDetailPoint("mn") * 5.5)));
            case "DL" ->
                    (int) ((0 + (level * 0.6))+(level * 0.6) * ((getDetailPoint("ag") * 1.1) + (getDetailPoint("en") * 6.5) + (getDetailPoint("sta") * 3.1) + (getDetailPoint("str") * 6.7) + (getDetailPoint("mn") * 3.6)));
            case "EF" ->
                    (int) ((0 + (level * 0.4))+(level * 0.4) * ((getDetailPoint("ag") * 0.5) + (getDetailPoint("en") * 3.4) + (getDetailPoint("sta") * 0.7) + (getDetailPoint("str") * 5.1) + (getDetailPoint("mn") * 3.1)));
            case "MG" ->
                    (int) ((0 + (level * 0.6))+ (level * 0.6) * ((getDetailPoint("ag") * 0.9) + (getDetailPoint("en") * 6.1) + (getDetailPoint("sta") * 2.6) + (getDetailPoint("str") * 6.1) + (getDetailPoint("mn") * 3.7)));
            default -> -1;
        };
    }
    public int aSignMp(String type, int level) {
        return switch (type) {
            case "DK" ->
                    (int) (( 50 +(level * 0.6))+(level * 0.1) * ((getDetailPoint("ag") * 0.9) + (getDetailPoint("en") * 3.1) + (getDetailPoint("sta") * 1.2) + (getDetailPoint("str") * 0.5) + (getDetailPoint("mn") * 3.5)));
            case "DW" ->
                    (int) (( 50 + (level * 5.1))+(level * 0.9) * ((getDetailPoint("ag") * 5.1) + (getDetailPoint("en") * 6.7) + (getDetailPoint("sta") * 3.5) + (getDetailPoint("str") * 3.1) + (getDetailPoint("mn") * 9.1)));
            case "DL" ->
                    (int) (( 50 + (level * 2.5))+(level * 0.2) * ((getDetailPoint("ag") * 2.2) + (getDetailPoint("en") * 4.1) + (getDetailPoint("sta") * 2.0) + (getDetailPoint("str") * 1.2) + (getDetailPoint("mn") * 4.5)));
            case "EF" ->
                    (int) (( 50 + (level * 2.7))+(level * 0.3) * ((getDetailPoint("ag") * 3.5) + (getDetailPoint("en") * 4.5) + (getDetailPoint("sta") * 2.1) + (getDetailPoint("str") * 1.5) + (getDetailPoint("mn") * 5.1)));
            case "MG" ->
                    (int) (( 50 + (level * 3.7))+ (level * 0.6) * ((getDetailPoint("ag") * 4.1) + (getDetailPoint("en") * 5.6) + (getDetailPoint("sta") * 2.9) + (getDetailPoint("str") * 2.1) + (getDetailPoint("mn") * 7.5)));
            default -> -1;
        };
    }

    public int aSignPoint(int level){
        if(level==1) return 100;
        else if (level<=100) return (int) (100*level*2.5);
        else if (level<=200) return (int) (100*level*3.9);
        else if (level<=300) return (int) (100*level*5.1);
        else return (int) (100*level*7.5);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }


    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public HealthPoint getHp() {
        return hp;
    }


    public ArrayList<Point> getPoints() {
        return points;
    }

    public boolean increasePoint(String type, int amount){
        if(amount>remainPoint) return false;
        else {
            for(Point point:this.points)
                if(point.getType()==type) {
                    point.setPoint(amount);
                    damage.increaseDamage(this.getType(),type,amount);
                    this.hp.addHp( aSignHp(this.getType(),this.getLevel()));
                    this.mp.addMp(aSignMp(this.getType(),this.getLevel()));
                    this.remainPoint -= amount;
                    return true;
                }
        }
        return false;
    }

    public Damage getDamage() {
        return damage;
    }

    public int getDetailPoint(String type){
        for(Point point:points){
            if(point.getType()==type) return point.getPoint();
        }
        return -1;
    }




    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", remainPoint=" + remainPoint +
                ", hp=" + hp.getHp() +
                ", mp=" + mp.getMp() +
                ", points=" + points +
                ", damage=" + damage.getPointDamage() +
                '}';
    }
}
