package arcmagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ArcItemGroups {
    public static final ItemGroup ARCMAGIC_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ArcItems.ASTRALITE))
            .displayName(Text.translatable("itemGroup.arcmagic.arcmagic_group"))
            .entries((context, entries) -> {
                entries.add(ArcItems.SPIRITWOOD);
                entries.add(ArcItems.ORICHALCUM);
                entries.add(ArcItems.DARKSTEEL);
                entries.add(ArcItems.ADAMANTITE);
                entries.add(ArcItems.MITHRIL);
                entries.add(ArcItems.ORISTARALLOY);
                entries.add(ArcItems.VOIDSTEEL);
                entries.add(ArcItems.STELLAMITHRIL);
                entries.add(ArcItems.ARCANITEADAMANTITE);
                entries.add(ArcItems.ASTRALITE);
            })
            .build();
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("tutorial", "test_group"), ARCMAGIC_GROUP);
    }
}
