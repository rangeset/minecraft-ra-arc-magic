package arcmagic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static arcmagic.item.ArcItems.*;

public class ArcModelProvider extends FabricModelProvider {
    public ArcModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SPIRITWOOD, Models.GENERATED);
        itemModelGenerator.register(ORICHALCUM, Models.GENERATED);
        itemModelGenerator.register(DARKSTEEL, Models.GENERATED);
        itemModelGenerator.register(ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ORISTARALLOY, Models.GENERATED);
        itemModelGenerator.register(VOIDSTEEL, Models.GENERATED);
        itemModelGenerator.register(STELLAMITHRIL, Models.GENERATED);
        itemModelGenerator.register(ARCANITEADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ASTRALITE, Models.GENERATED);
    }
}
