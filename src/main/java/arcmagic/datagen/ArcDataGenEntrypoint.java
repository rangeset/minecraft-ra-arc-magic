package arcmagic.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ArcDataGenEntrypoint implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
//        ArcItems.initialize();
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ArcModelProvider::new);
    }
}
