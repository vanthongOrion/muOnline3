import java.util.ArrayList;

public class Character {
    private String name;
    private String type;
    private int level;

    private Point point;
    private HealthPoint hp;
    private ManaPoint mp;
    private Damage damagePoint;
    private Defense defensePoint;
    private ArrayList<Skill> skills;
    private ArrayList<Weapon> weapons;
    private ArrayList<Test> points;
    private Test2 damage;


    public Character(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;

        this.point = new Point(level);
        this.hp = new HealthPoint(type,level,point);
        this.mp = new ManaPoint(type,level,point);
        skills = new ArrayList<Skill>();
        weapons = new ArrayList<Weapon>();
        this.damagePoint = new Damage(type, level, this.point);
        this.defensePoint = new Defense(type, level, this.point);
        points = new ArrayList<Test>();
        points.add(new Test("str"));
        points.add(new Test("ag"));
        points.add(new Test("en"));
        points.add(new Test("sta"));
        points.add(new Test("mn"));
        this.damage = new Test2();
    }

//    public Character(String name, String type) {
//        this(name, type, 1, new Point(100));
//    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public Point getPoint() {
        return point;
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

    public ManaPoint getMp() {
        return mp;
    }

    public ArrayList<Test> getPoints() {
        return points;
    }

    public void increasePoint(String type, int amount){
        for(Test point:this.points)
            if(point.getType()==type)
                point.setPoint(amount);
                damage.increaseDamage(this.getType(),type,amount);
    }

    public Test2 getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", point=" + point.toString() +
                ", hp=" + hp.getHp() +
                ", mp=" + mp.getMp() +
                ", damagePoint=" + damage.getPointDamage() +
                ", defensePoint=" + defensePoint.getDefensePoint() +
                ", skills=" + skills +
                ", weapons=" + weapons +
                '}';
    }
}
