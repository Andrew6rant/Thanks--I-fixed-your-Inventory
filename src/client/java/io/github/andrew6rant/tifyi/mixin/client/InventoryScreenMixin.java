package io.github.andrew6rant.tifyi.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static io.github.andrew6rant.tifyi.config.Config.playerRenderX;
import static io.github.andrew6rant.tifyi.config.Config.playerRenderY;

@Environment(EnvType.CLIENT)
@Mixin(InventoryScreen.class)
public abstract class InventoryScreenMixin extends AbstractInventoryScreen<PlayerScreenHandler> {
    public InventoryScreenMixin(PlayerScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
        super(screenHandler, playerInventory, text);
    }

    @ModifyConstant(method = "drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V",
            constant = @Constant(intValue = 51, ordinal = 0))
    public int tifyi$movePlayerRenderX(int constant) {
        return playerRenderX;
    }

    @ModifyConstant(method = "drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V",
            constant = @Constant(intValue = 75, ordinal = 0))
    public int tifyi$movePlayerRenderY(int constant) {
        return playerRenderY;
    }

}
