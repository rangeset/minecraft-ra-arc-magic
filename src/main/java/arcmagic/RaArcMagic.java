package arcmagic;

import net.fabricmc.api.ModInitializer;

import arcmagic.item.ArcItemGroups;
import arcmagic.item.ArcItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaArcMagic implements ModInitializer {
	public static final String MOD_ID = "arcmagic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ArcItems.initialize();
		ArcItemGroups.initialize();
	}
}