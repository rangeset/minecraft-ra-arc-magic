package org.rangeset;

import net.minecraft.item.Item;

public class ArcMaterial {
    private final String id;
    private final int durability;
    private final float magicPower;
    private final int enchantablility;
    private final Item usedItem;

    public ArcMaterial(String id, int durability, float magicPower, int enchantablility, Item usedItem) {
        this.id = id;
        this.durability = durability;
        this.magicPower = magicPower;
        this.enchantablility = enchantablility;
        this.usedItem = usedItem;
    }

    public String getId() {return id;}
    public int getDurability() {return durability;}
    public float getMagicPower() {return magicPower;}
    public int getEnchantablility() {return enchantablility;}

    public Item getUsedItem() {
        return usedItem;
    }
}