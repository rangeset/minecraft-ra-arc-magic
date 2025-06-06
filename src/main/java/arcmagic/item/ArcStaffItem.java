package arcmagic.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArcStaffItem extends Item {
    private final ArcMaterial material;
    public ArcStaffItem(ArcMaterial material) {
        super(new Settings().maxDamage(material.durability()).fireproof());
        this.material = material;
    }
    public ArcMaterial getMaterial() {
        return material;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
    @Override
    public boolean isDamageable() {
        return material.durability() > 0;
    }
}
