package arcmagic.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ArcStaffItem extends Item {
    private final ArcMaterial material;
    private static boolean staffMode = true;
    private static boolean charge = false;

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
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (!world.isClient) {
            if (staffMode) {
                if (player.getItemCooldownManager().isCoolingDown(this)) {
                    return TypedActionResult.pass(stack);
                }
                System.out.println("111\n\n\n\n");// TODO 施法
                TagKey<Item> staffTag = TagKey.of(RegistryKeys.ITEM, new Identifier("arcmagic", "staff_items"));
                Registries.ITEM.iterateEntries(staffTag).forEach(entry -> {
                    player.getItemCooldownManager().set(entry.value(), 10);
                });
                stack.damage(1, player, p -> p.sendToolBreakStatus(hand));
                return TypedActionResult.success(stack);
            }
        }
        return TypedActionResult.pass(stack);
    }

    public static boolean changeMode() {
        staffMode = !staffMode;
        return staffMode;
    }
    public static boolean notCharge() {
        return !charge;
    }

    private boolean isMagicArray(LivingEntity entity) {
        return false;// TODO 判断是否为法阵
    }
}
