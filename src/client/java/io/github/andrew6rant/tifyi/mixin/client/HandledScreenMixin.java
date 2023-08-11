package io.github.andrew6rant.tifyi.mixin.client;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static io.github.andrew6rant.tifyi.config.Config.slotHighlightColorAARRGGBB;

@Mixin(HandledScreen.class)
public class HandledScreenMixin {
    @ModifyConstant(method = "drawSlotHighlight(Lnet/minecraft/client/gui/DrawContext;III)V",
            constant = {@Constant(intValue = -2130706433, ordinal = 0), @Constant(intValue = -2130706433, ordinal = 1)})
    private static int tifyi$changeSlotHighlightColor(int constant) {
        return (int)Long.parseUnsignedLong(slotHighlightColorAARRGGBB.substring(1), 16);
    }
}
