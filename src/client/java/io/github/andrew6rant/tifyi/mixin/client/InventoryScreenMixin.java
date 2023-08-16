package io.github.andrew6rant.tifyi.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.recipebook.RecipeBookWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.andrew6rant.tifyi.config.Config.*;

@Environment(EnvType.CLIENT)
@Mixin(InventoryScreen.class)
public abstract class InventoryScreenMixin extends AbstractInventoryScreen<PlayerScreenHandler> {
    @Shadow @Final private RecipeBookWidget recipeBook;

    @Shadow private boolean mouseDown;

    public InventoryScreenMixin(PlayerScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
        super(screenHandler, playerInventory, text);
    }

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    public void tifyi$moveCraftingTextXYOnInit(PlayerEntity player, CallbackInfo ci) {
        this.titleX = craftingTextX;
        this.titleY = craftingTextY;
    }

    @ModifyConstant(method = "drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V",
            constant = @Constant(intValue = 30, ordinal = 0))
    public int tifyi$changePlayerRenderSize(int constant) {
        return playerRenderSize;
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

    @ModifyArg(method = "init()V", index = 8, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/widget/TexturedButtonWidget;<init>(IIIIIIILnet/minecraft/util/Identifier;Lnet/minecraft/client/gui/widget/ButtonWidget$PressAction;)V"))
    private ButtonWidget.PressAction tifyi$modifyRecipeBookXY(ButtonWidget.PressAction action) {
        return (buttonWidget) -> {
            this.recipeBook.toggleOpen();
            this.x = this.recipeBook.findLeftEdge(this.width, this.backgroundWidth);
            buttonWidget.setPosition(this.x + recipeBookX, this.height / 2 - recipeBookY);
            this.mouseDown = true;
        };
    }

    @ModifyConstant(method = "init()V", constant = @Constant(intValue = 104))
    private int tifyi$moveRecipeBookX(int constant) {
        return recipeBookX;
    }

    @ModifyConstant(method = "init()V", constant = @Constant(intValue = 22, ordinal = 0))
    private int tifyi$moveRecipeBookY(int constant) {
        return recipeBookY;
    }

}
