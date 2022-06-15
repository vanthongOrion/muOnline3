import java.util.ArrayList;

public class Character {
    private final String name;
    private final String type;
    private final int level;

    private final Point point;
    private final HealthPoint hp;
    private final ManaPoint mp;
    private Damage damagePoint;
    private Defense defensePoint;
    private final ArrayList<Skill> skills;
    private final ArrayList<Weapon> weapons;


    public Character(String name, String type, int level, Point point) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.point = point;

        this.hp = new HealthPoint(type,level,point);
        this.mp = new ManaPoint(type,level,point);
        skills = new ArrayList<Skill>();
        weapons = new ArrayList<Weapon>();
        this.damagePoint = new Damage(type, level, point);
        this.defensePoint = new Defense(type, level, point);
    }

    public Character(String name, String type) {
        this(name, type, 1, new Point(100));
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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", point=" + point.toString() +
                ", hp=" + hp.getHp() +
                ", mp=" + mp.getMp() +
                ", damagePoint=" + damagePoint.getDamagePoint() +
                ", defensePoint=" + defensePoint.getDefensePoint() +
                ", skills=" + skills +
                ", weapons=" + weapons +
                '}';
    }
}
