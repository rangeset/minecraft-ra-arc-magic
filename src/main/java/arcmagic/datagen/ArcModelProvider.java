package arcmagic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import java.util.List;

import static arcmagic.item.ArcItems.*;

public class ArcModelProvider extends FabricModelProvider {
    public ArcModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        final List<Item> items = List.of(
                WOODEN_STAFF,
                STONE_STAFF,
                COPPER_STAFF,
                SPIRITWOOD_STAFF,
                IRON_STAFF,
                ORICHALCUM_STAFF,
                GOLD_STAFF,
                AMETHYST_STAFF,
                DARKSTEEL_STAFF,
                ADAMANTITE_STAFF,
                MITHRIL_STAFF,
                DIAMOND_STAFF,
                NETHERITE_STAFF,
                ORISTARALLOY_STAFF,
                VOIDSTEEL_STAFF,
                STELLAMITHRIL_STAFF,
                ARCANITEADAMANTITE_STAFF,
                ASTRALITE_STAFF,

                SPIRITWOOD,
                ORICHALCUM,
                DARKSTEEL,
                ADAMANTITE,
                MITHRIL,
                ORISTARALLOY,
                VOIDSTEEL,
                STELLAMITHRIL,
                ARCANITEADAMANTITE,
                ASTRALITE
        );

        for (Item item: items) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}
