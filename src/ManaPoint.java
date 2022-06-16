public class ManaPoint {
    private final int mp;

    public ManaPoint(String type,int level,Point points){
        this.mp = aSignMp(type,level,points);
    }

    public int aSignMp(String type, int level,Point points){
        return switch (type) {
            case "DK" ->
                    (int) ((100+(level * 0.3)) +((level * 0.3) * ((points.getAgility() * 0.9) + (points.getEnergy() * 0.5) + (points.getStamina() * 0.2) + (points.getStrength() * 0.1) + (points.getMana() * 4.5))));
            case "DW" ->
                    (int) ((100+(level * 0.9)) + ((level * 0.9) * ((points.getAgility() * 1.7 )+ (points.getEnergy() * 2.2) + (points.getStamina() * 1.5) + (points.getStrength() * 1.1) + (points.getMana() * 7.9))));
            case "DL" ->
                    (int) ((100+(level * 0.4)) + ((level * 0.4)* ((points.getAgility() * 0.9) + (points.getEnergy() * 1.1) + (points.getStamina() * 0.5) + (points.getStrength() * 0.4) + (points.getMana() * 5.4))));
            case "EF" ->
                    (int) ((100+(level * 0.5)) + ((level * 0.5) * ((points.getAgility() * 1.1) + (points.getEnergy() * 1.4) + (points.getStamina() * 0.9) + (points.getStrength() * 0.5) + (points.getMana() * 5.5))));
            case "MG" ->
                    (int) ((100+(level * 0.8)) + ((level * 0.8)* ((points.getAgility() * 1.5) + (points.getEnergy() * 1.9) + (points.getStamina() * 1.3) + (points.getStrength() * 0.9) + (points.getMana() * 6.9))));
            default -> -1;
        };
    }

    public int getMp() {
        return mp;
    }
}
