public class Damage {
    private int damagePoint;

    public Damage(String type, int level, Point points) {
        this.damagePoint = aSignDamagePoint(type, level, points);
    }

    public int aSignDamagePoint(String type, int level, Point points) {
        return switch (type) {
            case "DK" ->
                    (int) ((level * 0.9) * ((points.getAgility() * 1.5) + (points.getEnergy() * 2.2) + (points.getStamina() * 0.4) + (points.getStrength() * 3.1) + (points.getMana() * 0.5)));
            case "DW" ->
                    (int) ((level * 0.5) * (points.getAgility() + (points.getEnergy() * 1.2) + (points.getStamina() * 0.1) + (points.getStrength() * 0.5) + (points.getMana() * 2.5)));
            case "DL" ->
                    (int) ((level * 0.7) * ((points.getAgility() * 1.1) + (points.getEnergy() * 2.1) + (points.getStamina() * 0.5) + (points.getStrength() * 2.0) + (points.getMana() * 1.1)));
            case "EF" ->
                    (int) ((level * 0.3) * ((points.getAgility() * 0.9) + (points.getEnergy() * 0.8) + (points.getStamina() * 0.1) + (points.getStrength() * 1.1) + (points.getMana() * 1.7)));
            case "MG" ->
                    (int) ((level * 0.6) * ((points.getAgility() * 1.7) + (points.getEnergy() * 1.5) + (points.getStamina() * 0.1) + (points.getStrength() * 1.5) + (points.getMana() * 2.2)));
            default -> -1;
        };
    }

    public int getDamagePoint() {
        return damagePoint;
    }
}
