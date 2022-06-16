public class HealthPoint {
    private final int hp;

    public HealthPoint(String type,int level,Point points){
        this.hp = aSignHp(type,level,points);
    }

    public int aSignHp(String type, int level,Point points){
        return switch (type) {
            case "DK" ->
                    (int) ((100 +(level * 0.6))+(level * 0.6) * ((points.getAgility() * 1.1) + (points.getEnergy() * 7.6) + (points.getStamina() * 4.6) + (points.getStrength() * 7.1) + (points.getMana() * 3.5)));
            case "DW" ->
                    (int) ((100 + (level * 0.5))+(level * 0.5) * (points.getAgility() * 0.5 + (points.getEnergy() * 3.6) + (points.getStamina() * 1.2) + (points.getStrength() * 5.6) + (points.getMana() * 5.5)));
            case "DL" ->
                    (int) ((100 + (level * 0.6))+(level * 0.6) * ((points.getAgility() * 1.1) + (points.getEnergy() * 6.5) + (points.getStamina() * 3.1) + (points.getStrength() * 6.7) + (points.getMana() * 3.6)));
            case "EF" ->
                    (int) ((100 + (level * 0.4))+(level * 0.4) * (((points.getAgility() * 0.5)) + (points.getEnergy() * 3.4) + (points.getStamina() * 0.7) + (points.getStrength() * 5.1) + (points.getMana() * 3.1)));
            case "MG" ->
                    (int) ((100 + (level * 0.6))+ (level * 0.6) * (((points.getAgility() * 0.9)) + (points.getEnergy() * 6.1) + (points.getStamina() * 2.6) + (points.getStrength() * 6.1) + (points.getMana() * 3.7)));
            default -> -1;
        };
    }

    public int getHp() {
        return hp;
    }
}
