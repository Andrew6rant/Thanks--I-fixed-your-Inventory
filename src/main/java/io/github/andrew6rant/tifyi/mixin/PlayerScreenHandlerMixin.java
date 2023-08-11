package io.github.andrew6rant.tifyi.mixin;

import net.minecraft.screen.PlayerScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import static io.github.andrew6rant.tifyi.config.Config.*;

@Mixin(PlayerScreenHandler.class)
public class PlayerScreenHandlerMixin {

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
            constant = @Constant(intValue = 98, ordinal = 0))
    public int tifyi$moveCraftingInputSlotX(int constant) {
        return craftingInputSlotsX;
    }

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
            constant = @Constant(intValue = 18, ordinal = 1))
    public int tifyi$moveCraftingInputSlotY(int constant) {
        return craftingInputSlotsY;
    }

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
            constant = @Constant(intValue = 154, ordinal = 0))
    public int tifyi$moveCraftingResultSlotX(int constant) {
        return craftingResultSlotX;
    }

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
            constant = @Constant(intValue = 28, ordinal = 0))
    public int tifyi$moveCraftingResultSlotY(int constant) {
        return craftingResultSlotY;
    }

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
    constant = @Constant(intValue = 77, ordinal = 0))
    public int tifyi$moveOffhandSlotX(int constant) {
        return offhandSlotX;
    }

    @ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerInventory;ZLnet/minecraft/entity/player/PlayerEntity;)V",
            constant = @Constant(intValue = 62, ordinal = 0))
    public int tifyi$moveOffhandSlotY(int constant) {
        return offhandSlotY;
    }
}
