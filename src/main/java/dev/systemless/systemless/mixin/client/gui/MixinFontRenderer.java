package dev.systemless.systemless.mixin.client.gui;

import net.minecraft.client.gui.FontRenderer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(FontRenderer.class)
public class MixinFontRenderer {
    /**
     * Changes the text variable to Systemless.
     * @param s Text variable
     * @return Systemless
     */

    @NotNull
    @Contract(pure = true)
    @ModifyVariable(method = "renderString", ordinal = 0, at = @At(value = "HEAD"))
    private String renderSystemlessString(String s) {
        return "ModCore";
    }

    @NotNull
    @Contract(pure = true)
    @ModifyVariable(method = "getStringWidth", ordinal = 0, at = @At(value = "HEAD"))
    private String getSystemlessStringWidth(String s) {
        return "ModCore";
    }
}
