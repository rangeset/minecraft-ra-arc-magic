package arcmagic.datagen;

import arcmagic.item.ArcItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ArcRecipeProvider extends FabricRecipeProvider {
    public ArcRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArcItems.WOODEN_STAFF)
                .pattern("  A")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.DARK_OAK_LOG)
                .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG),
                        FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
                .offerTo(exporter);
    }
}
