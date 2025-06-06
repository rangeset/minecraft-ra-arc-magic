package arcmagic.item;

import net.minecraft.entity.LivingEntity;
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
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient) {
            stack.damage(isMagicArray(target)?1:3, attacker, p -> p.sendToolBreakStatus(attacker.getActiveHand()));
        }
        return super.postHit(stack, target, attacker);
    }

    private boolean isMagicArray(LivingEntity entity) {
        return false;// TODO 判断是否为法阵
    }
}
