package arcmagic.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ArcItems {
    public static final Item SPIRITWOOD = register("spiritwood", new Item(new Item.Settings()));
    public static final Item ORICHALCUM = register("orichalcum", new Item(new Item.Settings()));
    public static final Item DARKSTEEL = register("darksteel", new Item(new Item.Settings()));
    public static final Item ADAMANTITE = register("adamantite", new Item(new Item.Settings()));
    public static final Item MITHRIL = register("mithril", new Item(new Item.Settings()));
    public static final Item ORISTARALLOY = register("oristaralloy", new Item(new Item.Settings()));
    public static final Item VOIDSTEEL = register("voidsteel", new Item(new Item.Settings()));
    public static final Item STELLAMITHRIL = register("stellamithril", new Item(new Item.Settings()));
    public static final Item ARCANITEADAMANTITE = register("arcaniteadamantite", new Item(new Item.Settings()));
    public static final Item ASTRALITE = register("astralite", new Item(new Item.Settings()));
/*
    public static final Item WOODEN_STAFF = register("wooden_staff", new Item(new Item.Settings().maxDamage(50)));
    public static final Item STONE_STAFF = register("stone_staff", new Item(new Item.Settings().maxDamage(100)));
    public static final Item COPPER_STAFF = register("copper_staff", new Item(new Item.Settings().maxDamage(120)));
    public static final Item SPIRITWOOD_STAFF = register("spiritwood_staff", new Item(new Item.Settings().maxDamage(100)));
    public static final Item IRON_STAFF = register("iron_staff", new Item(new Item.Settings().maxDamage(200)));
    public static final Item ORICHALCUM_STAFF = register("orichalcum_staff", new Item(new Item.Settings().maxDamage(150)));
    public static final Item GOLD_STAFF = register("gold_staff", new Item(new Item.Settings().maxDamage(40)));
    public static final Item AMETHYST_STAFF = register("amethyst_staff", new Item(new Item.Settings().maxDamage(150)));
    public static final Item DARKSTEEL_STAFF = register("darksteel_staff", new Item(new Item.Settings().maxDamage(500)));
    public static final Item ADAMANTITE_STAFF = register("adamantite_staff", new Item(new Item.Settings().maxDamage(700)));
    public static final Item MITHRIL_STAFF = register("mithril_staff", new Item(new Item.Settings().maxDamage(300)));
    public static final Item DIAMOND_STAFF = register("diamond_staff", new Item(new Item.Settings().maxDamage(1561)));
    public static final Item NETHERITE_STAFF = register("netherite_staff", new Item(new Item.Settings().maxDamage(2031)));
    public static final Item ORISTAR_ALLOY_STAFF = register("oristar_alloy_staff", new Item(new Item.Settings().maxDamage(600)));
    public static final Item VOIDSTEEL_STAFF = register("voidsteel_staff", new Item(new Item.Settings().maxDamage(900)));
    public static final Item STELLAMITHRIL_STAFF = register("stellamithril_staff", new Item(new Item.Settings().maxDamage(500)));
    public static final Item ARCANITE_ADAMANTITE_STAFF = register("arcanite_adamantite_staff", new Item(new Item.Settings().maxDamage(1000)));
    public static final Item ASTRALITE_STAFF = register("astralite_staff", new Item(new Item.Settings().maxDamage(2048)));
*/
    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, new Identifier("arcmagic", path), item);
    }

    public static void initialize() {}
}