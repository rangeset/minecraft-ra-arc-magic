package arcmagic.spell;

public class ArcSpell {
    private final int type;
    private final float power;
    private final int attributes;
    
    public ArcSpell(int type, float power, int attributes) {
        this.type = type;
        this.power = power;
        this.attributes = attributes;
    }

    public int getType() {
        return type;
    }

    public float getPower() {
        return power;
    }

    public int getAttributes() {
        return attributes;
    }
}
