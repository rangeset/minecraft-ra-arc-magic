package arcmagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static arcmagic.item.ArcItems.*;

public final class ArcItemGroups {
    public static final ItemGroup ARCMAGIC_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ASTRALITE))
            .displayName(Text.translatable("itemGroup.arcmagic.arcmagic_group"))
            .entries((context, entries) -> {
                entries.add(SPIRITWOOD);
                entries.add(ORICHALCUM);
                entries.add(DARKSTEEL);
                entries.add(ADAMANTITE);
                entries.add(MITHRIL);
                entries.add(ORISTARALLOY);
                entries.add(VOIDSTEEL);
                entries.add(STELLAMITHRIL);
                entries.add(ARCANITEADAMANTITE);
                entries.add(ASTRALITE);
                entries.add(WOODEN_STAFF);
                entries.add(STONE_STAFF);
                entries.add(COPPER_STAFF);
                entries.add(SPIRITWOOD_STAFF);
                entries.add(IRON_STAFF);
                entries.add(ORICHALCUM_STAFF);
                entries.add(GOLD_STAFF);
                entries.add(AMETHYST_STAFF);
                entries.add(DARKSTEEL_STAFF);
                entries.add(ADAMANTITE_STAFF);
                entries.add(MITHRIL_STAFF);
                entries.add(DIAMOND_STAFF);
                entries.add(NETHERITE_STAFF);
                entries.add(ORISTARALLOY_STAFF);
                entries.add(VOIDSTEEL_STAFF);
                entries.add(STELLAMITHRIL_STAFF);
                entries.add(ARCANITEADAMANTITE_STAFF);
                entries.add(ASTRALITE_STAFF);
            })
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("arcmagic", "arcmagic_group"), ARCMAGIC_GROUP);
    }
}