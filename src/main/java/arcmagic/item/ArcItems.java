package arcmagic.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static arcmagic.item.ArcMaterialList.*;

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

    public static final Item WOODEN_STAFF = register("wooden_staff", new ArcStaffItem(ARC_WOOD));
    public static final Item STONE_STAFF = register("stone_staff", new ArcStaffItem(ARC_STONE));
    public static final Item COPPER_STAFF = register("copper_staff", new ArcStaffItem(ARC_COPPER));
    public static final Item SPIRITWOOD_STAFF = register("spiritwood_staff", new ArcStaffItem(ARC_SPIRITWOOD));
    public static final Item IRON_STAFF = register("iron_staff", new ArcStaffItem(ARC_IRON));
    public static final Item ORICHALCUM_STAFF = register("orichalcum_staff", new ArcStaffItem(ARC_ORICHALCUM));
    public static final Item GOLD_STAFF = register("gold_staff", new ArcStaffItem(ARC_GOLD));
    public static final Item AMETHYST_STAFF = register("amethyst_staff", new ArcStaffItem(ARC_AMETHYST));
    public static final Item DARKSTEEL_STAFF = register("darksteel_staff", new ArcStaffItem(ARC_DARKSTEEL));
    public static final Item ADAMANTITE_STAFF = register("adamantite_staff", new ArcStaffItem(ARC_ADAMANTITE));
    public static final Item MITHRIL_STAFF = register("mithril_staff", new ArcStaffItem(ARC_MITHRIL));
    public static final Item DIAMOND_STAFF = register("diamond_staff", new ArcStaffItem(ARC_DIAMOND));
    public static final Item NETHERITE_STAFF = register("netherite_staff", new ArcStaffItem(ARC_NETHERITE));
    public static final Item ORISTARALLOY_STAFF = register("oristaralloy_staff", new ArcStaffItem(ARC_ORISTARALLOY));
    public static final Item VOIDSTEEL_STAFF = register("voidsteel_staff", new ArcStaffItem(ARC_VOIDSTEEL));
    public static final Item STELLAMITHRIL_STAFF = register("stellamithril_staff", new ArcStaffItem(ARC_STELLAMITHRIL));
    public static final Item ARCANITE_ADAMANTITE_STAFF = register("arcaniteadamantite_staff", new ArcStaffItem(ARC_ARCANITEADAMANTITE));
    public static final Item ASTRALITE_STAFF = register("astralite_staff", new ArcStaffItem(ARC_ASTRALITE));

    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, new Identifier("arcmagic", path), item);
    }

    public static void initialize() {}
}