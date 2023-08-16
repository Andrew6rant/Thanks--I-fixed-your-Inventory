package io.github.andrew6rant.tifyi.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class Config extends MidnightConfig {
    @Comment(centered = true) public static Comment immediate;
    @Entry(min = -1000, max = 1000) public static int playerRenderX = 52;
    @Entry(min = -1000, max = 1000) public static int playerRenderY = 72;
    @Entry(min = -1000, max = 1000) public static int playerRenderSize = 30;

    @Entry(min = -1000, max = 1000) public static int craftingTextX = 97;
    @Entry(min = -1000, max = 1000) public static int craftingTextY = 6;

    @Entry(min = -1000, max = 1000) public static int recipeBookX = 104;
    @Entry(min = -1000, max = 1000) public static int recipeBookY = 22;


    @Entry(width = 9) public static String slotHighlightColorAARRGGBB = "#80FFFFFF";
    @Comment(centered = true) public static Comment reloadWorld;
    @Comment(centered = true) public static Comment reloadExplanation;
    @Entry(min = -1000, max = 1000) public static int offhandSlotX = 80;
    @Entry(min = -1000, max = 1000) public static int offhandSlotY = 62;
    @Entry(min = -1000, max = 1000) public static int craftingResultSlotX = 152;
    @Entry(min = -1000, max = 1000) public static int craftingResultSlotY = 27;
    @Entry(min = -1000, max = 1000) public static int craftingInputSlotsX = 98;
    @Entry(min = -1000, max = 1000) public static int craftingInputSlotsY = 17;
}
