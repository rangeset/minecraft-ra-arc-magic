package arcmagic.item;

import net.minecraft.item.Item;

public record ArcMaterial(String id, int durability, float magicPower, int enchantablility, Item usedItem) {}