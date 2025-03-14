package net.mc121.hide_names_fabric.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Mixin that prevents player nametags from rendering.
 *
 * @author Mateusz Podeszwa
 */
@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin {

    /**
     * Cancels rendering of player nametags.
     */
    @Inject(
            method = "renderLabelIfPresent",
            at = @At("HEAD"),
            cancellable = true
    )
    private void hidePlayerNametags(Entity entity, Text text, MatrixStack matrices,
                                    VertexConsumerProvider vertexConsumers, int light, float distance,
                                    CallbackInfo ci) {
        if (entity instanceof PlayerEntity) {
            ci.cancel();
        }
    }
}