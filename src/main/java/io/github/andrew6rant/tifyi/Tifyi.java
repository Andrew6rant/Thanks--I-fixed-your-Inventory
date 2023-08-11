package io.github.andrew6rant.tifyi;

import eu.midnightdust.lib.config.MidnightConfig;
import io.github.andrew6rant.tifyi.config.Config;
import net.fabricmc.api.ModInitializer;

public class Tifyi implements ModInitializer {

	@Override
	public void onInitialize() {
		MidnightConfig.init("tifyi", Config.class);
	}
}