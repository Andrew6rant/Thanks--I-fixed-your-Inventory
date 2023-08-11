package io.github.andrew6rant.tifyi.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class Config extends MidnightConfig {
    @Comment(centered = true) public static Comment immediate;
    @Entry(min = -1000, max = 1000) public static int playerRenderX = 52;
    @Entry(min = -1000, max = 1000) public static int playerRenderY = 72;
    @Entry(width = 9) public static String slotHighlightColorAARRGGBB = "#80FFFFFF";
    @Comment(centered = true) public static Comment reloadWorld;
    @Entry(min = -1000, max = 1000) public static int offhandSlotX = 80;
    @Entry(min = -1000, max = 1000) public static int offhandSlotY = 62;
    @Entry(min = -1000, max = 1000) public static int craftingResultSlotX = 152;
    @Entry(min = -1000, max = 1000) public static int craftingResultSlotY = 27;
    @Entry(min = -1000, max = 1000) public static int craftingInputSlotsX = 98;
    @Entry(min = -1000, max = 1000) public static int craftingInputSlotsY = 17;
}
