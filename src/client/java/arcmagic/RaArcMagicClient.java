package arcmagic;

import arcmagic.item.ArcStaffItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class RaArcMagicClient implements ClientModInitializer {
	private static KeyBinding SWITCH_STAFF_MODE;
	private static KeyBinding SWITCH_STAFF_CONF;
	@Override
	public void onInitializeClient() {
		SWITCH_STAFF_MODE = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.arcmagic.switch_staff_mode",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_G,
				"category.categories.arcmagic"
		));
		SWITCH_STAFF_CONF = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.arcmagic.switch_staff_conf",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_H,
				"category.categories.arcmagic"
		));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (SWITCH_STAFF_MODE.wasPressed()) {
				if (ArcStaffItem.notCharge()) {
					assert client.player != null;
					client.player.sendMessage(Text.translatable(ArcStaffItem.changeMode() ? "message.arcmagic.mode.instant" : "message.arcmagic.mode.charge"), true);
				}
			}

			while (SWITCH_STAFF_CONF.wasPressed()) {
				if (ArcStaffItem.notCharge()) {
					// TODO Open Configure Page
				}
			}
		});
	}
}