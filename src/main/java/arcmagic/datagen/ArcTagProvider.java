package arcmagic.datagen;

import arcmagic.RaArcMagic;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ArcTagProvider extends FabricTagProvider<Item> {
    public static final TagKey<Item> STAFF_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(RaArcMagic.MOD_ID, "staff_items"));
    public ArcTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        for (Item item:ArcModelProvider.staff_items) {
            getOrCreateTagBuilder(STAFF_ITEMS).add(item);
        }
    }
}
