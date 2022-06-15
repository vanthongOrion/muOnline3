public class Defense {
    private int defensePoint;

    public Defense(String type, int level, Point points) {
        this.defensePoint = aSignDefensePoint(type, level, points);
    }

    public int aSignDefensePoint(String type, int level, Point points) {
        return switch (type) {
            case "DK" ->
                    (int) ((level * 0.7) * ((points.getAgility() * 0.5) + (points.getEnergy() * 0.4) + (points.getStamina() * 1.1) + (points.getStrength() * 1.7) + (points.getMana() * 0.1)));
            case "DW" ->
                    (int) ((level * 0.4) * ((points.getAgility() * 0.01) + (points.getEnergy() * 0.1) + (points.getStamina() * 0.5) + (points.getStrength() * 0.2) + (points.getMana() * 0.1)));
            case "DL" ->
                    (int) ((level * 0.6) * ((points.getAgility() * 0.4) + (points.getEnergy() * 0.4) + (points.getStamina() * 0.9) + (points.getStrength() * 1.4) + (points.getMana() * 0.1)));
            case "EF" ->
                    (int) ((level * 0.4) * ((points.getAgility() * 0.01) + (points.getEnergy() * 0.1) + (points.getStamina() * 0.4) + (points.getStrength() * 0.2) + (points.getMana() * 0.1)));
            case "MG" ->
                    (int) ((level * 0.5) * ((points.getAgility() * 0.2) + (points.getEnergy() * 0.3) + (points.getStamina() * 0.7) + (points.getStrength() * 1.1) + (points.getMana() * 0.1)));
            default -> -1;
        };
    }

    public int getDefensePoint() {
        return defensePoint;
    }
}
