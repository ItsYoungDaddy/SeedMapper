package dev.xpple.seedmapper.util.render;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;

public abstract class Shape {
    int deathTime;
    protected Vec3d prevPos;

    public void tick() {
    }

    public abstract void render(MatrixStack matrixStack, VertexConsumerProvider.Immediate vertexConsumerProvider, float delta);

    public abstract Vec3d getPos();

}
