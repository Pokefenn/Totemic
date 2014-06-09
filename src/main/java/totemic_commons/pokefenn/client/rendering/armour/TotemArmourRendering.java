package totemic_commons.pokefenn.client.rendering.armour;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;

/**
 * Created by Pokefenn.
 * Licensed under MIT (If this is one of my Mods)
 */
public class TotemArmourRendering extends ModelBiped
{
    ModelRenderer maskEye2;
    ModelRenderer maskStrap1;
    ModelRenderer maskEye3;
    ModelRenderer maskEye1;
    ModelRenderer maskTop2;
    ModelRenderer maskTop1;
    ModelRenderer maskBottom1;
    ModelRenderer maskMouth;
    ModelRenderer maskBottom4;
    ModelRenderer maskBottom3;
    ModelRenderer maskBottom2;
    ModelRenderer maskStrap3;
    ModelRenderer maskStrap2;
    ModelRenderer boot1;
    ModelRenderer boot3;
    ModelRenderer boot2;
    ModelRenderer boot4;
    ModelRenderer boot5;
    ModelRenderer boot6;
    ModelRenderer skirt1;
    ModelRenderer skirt2;
    ModelRenderer skirt3;
    ModelRenderer skirt4;
    ModelRenderer skirtLeaf1;
    ModelRenderer skirtLeaf2;
    ModelRenderer plate1;
    ModelRenderer plate2;
    ModelRenderer plate3;
    ModelRenderer plate4;

    public TotemArmourRendering(float f)
    {
        super(f, 0, 64, 64);
    }

    public TotemArmourRendering()
    {
        textureWidth = 64;
        textureHeight = 64;

        maskEye2 = new ModelRenderer(this, 0, 0);
        maskEye2.addBox(0F, 0F, 0F, 2, 1, 1);
        maskEye2.setRotationPoint(0, 0, 0);
        maskEye2.setTextureSize(64, 64);
        maskEye2.mirror = true;
        setRotation(maskEye2, 0F, 0F, 0F);
        maskStrap1 = new ModelRenderer(this, 0, 0);
        maskStrap1.addBox(0F, 0F, 0F, 1, 1, 8);
        maskStrap1.setRotationPoint(0, 0, 0);
        maskStrap1.setTextureSize(64, 64);
        maskStrap1.mirror = true;
        setRotation(maskStrap1, 0F, 0F, 0F);
        maskEye3 = new ModelRenderer(this, 0, 0);
        maskEye3.addBox(0F, 0F, 0F, 2, 1, 1);
        maskEye3.setRotationPoint(0, 0, 0);
        maskEye3.setTextureSize(64, 64);
        maskEye3.mirror = true;
        setRotation(maskEye3, 0F, 0F, 0F);
        maskEye1 = new ModelRenderer(this, 0, 0);
        maskEye1.addBox(0F, 0F, 0F, 2, 3, 1);
        maskEye1.setRotationPoint(0, 0, 0F);
        maskEye1.setTextureSize(64, 64);
        maskEye1.mirror = true;
        setRotation(maskEye1, 0F, 0F, 0F);
        maskTop2 = new ModelRenderer(this, 0, 0);
        maskTop2.addBox(0F, 0F, 0F, 8, 1, 1);
        maskTop2.setRotationPoint(0, 0, 0);
        maskTop2.setTextureSize(64, 64);
        maskTop2.mirror = true;
        setRotation(maskTop2, 0F, 0F, 0F);
        maskTop1 = new ModelRenderer(this, 0, 0);
        maskTop1.addBox(0F, 0F, 0F, 10, 3, 1);
        maskTop1.setRotationPoint(0, 0, 0);
        maskTop1.setTextureSize(64, 64);
        maskTop1.mirror = true;
        setRotation(maskTop1, 0F, 0F, 0F);
        maskBottom1 = new ModelRenderer(this, 0, 0);
        maskBottom1.addBox(0F, 0F, 0F, 10, 3, 1);
        maskBottom1.setRotationPoint(0, 0, 0);
        maskBottom1.setTextureSize(64, 64);
        maskBottom1.mirror = true;
        setRotation(maskBottom1, 0F, 0F, 0F);
        maskMouth = new ModelRenderer(this, 0, 0);
        maskMouth.addBox(0F, 0F, 0F, 6, 1, 1);
        maskMouth.setRotationPoint(0, 0, 0);
        maskMouth.setTextureSize(64, 64);
        maskMouth.mirror = true;
        setRotation(maskMouth, 0F, 0F, 0F);
        maskBottom4 = new ModelRenderer(this, 0, 0);
        maskBottom4.addBox(0F, 0F, 0F, 2, 5, 1);
        maskBottom4.setRotationPoint(0, 0, 0);
        maskBottom4.setTextureSize(64, 64);
        maskBottom4.mirror = true;
        setRotation(maskBottom4, 0F, 0F, 0F);
        maskBottom3 = new ModelRenderer(this, 0, 0);
        maskBottom3.addBox(0F, 0F, 0F, 2, 5, 1);
        maskBottom3.setRotationPoint(0, 0, 0);
        maskBottom3.setTextureSize(64, 64);
        maskBottom3.mirror = true;
        setRotation(maskBottom3, 0F, 0F, 0F);
        maskBottom2 = new ModelRenderer(this, 0, 0);
        maskBottom2.addBox(0F, 0F, 0F, 8, 2, 1);
        maskBottom2.setRotationPoint(0, 0, 0);
        maskBottom2.setTextureSize(64, 64);
        maskBottom2.mirror = true;
        setRotation(maskBottom2, 0F, 0F, 0F);
        maskStrap3 = new ModelRenderer(this, 0, 0);
        maskStrap3.addBox(0F, 0F, 0F, 1, 1, 8);
        maskStrap3.setRotationPoint(0, 0, 0);
        maskStrap3.setTextureSize(64, 64);
        maskStrap3.mirror = true;
        setRotation(maskStrap3, 0F, 0F, 0F);
        maskStrap2 = new ModelRenderer(this, 0, 0);
        maskStrap2.addBox(0F, 0F, 0F, 8, 1, 1);
        maskStrap2.setRotationPoint(0, 0, 0);
        maskStrap2.setTextureSize(64, 64);
        maskStrap2.mirror = true;
        setRotation(maskStrap2, 0F, 0F, 0F);
        boot1 = new ModelRenderer(this, 0, 0);
        boot1.addBox(0F, 0F, 0F, 4, 5, 0);
        boot1.setRotationPoint(0, 0, 0);
        boot1.setTextureSize(64, 64);
        boot1.mirror = true;
        setRotation(boot1, 0F, 0F, 0F);
        boot3 = new ModelRenderer(this, 0, 0);
        boot3.addBox(0F, 0F, 0F, 4, 5, 0);
        boot3.setRotationPoint(0F, 19F, 2F);
        boot3.setTextureSize(64, 64);
        boot3.mirror = true;
        setRotation(boot3, 0F, 0F, 0F);
        boot2 = new ModelRenderer(this, 0, 0);
        boot2.addBox(0F, 0F, 0F, 4, 5, 0);
        boot2.setRotationPoint(0, 0, 0);
        boot2.setTextureSize(64, 64);
        boot2.mirror = true;
        setRotation(boot2, 0F, 0F, 0F);
        boot4 = new ModelRenderer(this, 0, 0);
        boot4.addBox(0F, 0F, 0F, 4, 5, 0);
        boot4.setRotationPoint(0, 0, 0);
        boot4.setTextureSize(64, 64);
        boot4.mirror = true;
        setRotation(boot4, 0F, 0F, 0F);
        boot5 = new ModelRenderer(this, 0, 0);
        boot5.addBox(0F, 0F, 0F, 0, 5, 4);
        boot5.setRotationPoint(0, 0, 0F);
        boot5.setTextureSize(64, 64);
        boot5.mirror = true;
        setRotation(boot5, 0F, 0F, 0F);
        boot6 = new ModelRenderer(this, 0, 0);
        boot6.addBox(0F, 0F, 0F, 0, 5, 4);
        boot6.setRotationPoint(0, 0, 0);
        boot6.setTextureSize(64, 64);
        boot6.mirror = true;
        setRotation(boot6, 0F, 0F, 0F);
        skirt1 = new ModelRenderer(this, 0, 0);
        skirt1.addBox(0F, 0F, 0F, 8, 2, 1);
        skirt1.setRotationPoint(0, 0, 0);
        skirt1.setTextureSize(64, 64);
        skirt1.mirror = true;
        setRotation(skirt1, 0F, 0F, 0F);
        skirt2 = new ModelRenderer(this, 0, 0);
        skirt2.addBox(0F, 0F, 0F, 1, 2, 6);
        skirt2.setRotationPoint(0, 0, 0);
        skirt2.setTextureSize(64, 64);
        skirt2.mirror = true;
        setRotation(skirt2, 0F, 0F, 0F);
        skirt3 = new ModelRenderer(this, 0, 0);
        skirt3.addBox(0F, 0F, 0F, 1, 2, 6);
        skirt3.setRotationPoint(0, 0, 0);
        skirt3.setTextureSize(64, 64);
        skirt3.mirror = true;
        setRotation(skirt3, 0F, 0F, 0F);
        skirt4 = new ModelRenderer(this, 0, 0);
        skirt4.addBox(0F, 0F, 0F, 8, 2, 1);
        skirt4.setRotationPoint(0, 0, 0);
        skirt4.setTextureSize(64, 64);
        skirt4.mirror = true;
        setRotation(skirt4, 0F, 0F, 0F);
        skirtLeaf1 = new ModelRenderer(this, 0, 0);
        skirtLeaf1.addBox(0F, 0F, 0F, 8, 5, 0);
        skirtLeaf1.setRotationPoint(0, 0, 0);
        skirtLeaf1.setTextureSize(64, 64);
        skirtLeaf1.mirror = true;
        setRotation(skirtLeaf1, 0F, 0F, 0F);
        skirtLeaf2 = new ModelRenderer(this, 0, 0);
        skirtLeaf2.addBox(0F, 0F, 0F, 8, 5, 0);
        skirtLeaf2.setRotationPoint(0, 0, 0);
        skirtLeaf2.setTextureSize(64, 64);
        skirtLeaf2.mirror = true;
        setRotation(skirtLeaf2, 0F, 0F, 0F);
        plate1 = new ModelRenderer(this, 0, 0);
        plate1.addBox(0F, 0F, 0F, 8, 7, 1);
        plate1.setRotationPoint(0, 0, 0);
        plate1.setTextureSize(64, 64);
        plate1.mirror = true;
        setRotation(plate1, 0F, 0F, 0F);
        plate2 = new ModelRenderer(this, 0, 0);
        plate2.addBox(0F, 0F, 0F, 8, 7, 1);
        plate2.setRotationPoint(0, 0, 0);
        plate2.setTextureSize(64, 64);
        plate2.mirror = true;
        setRotation(plate2, 0F, 0F, 0F);
        plate3 = new ModelRenderer(this, 0, 0);
        plate3.addBox(0F, 0F, 0F, 1, 7, 4);
        plate3.setRotationPoint(0, 0, 0);
        plate3.setTextureSize(64, 64);
        plate3.mirror = true;
        setRotation(plate3, 0F, 0F, 0F);
        plate4 = new ModelRenderer(this, 0, 0);
        plate4.addBox(0F, 0F, 0F, 1, 7, 4);
        plate4.setRotationPoint(0, 0, 0);
        plate4.setTextureSize(64, 64);
        plate4.mirror = true;
        setRotation(plate4, 0F, 0F, 0F);

        this.bipedRightLeg.addChild(boot1);
        this.bipedLeftLeg.addChild(boot2);
        this.bipedLeftLeg.addChild(boot3);
        this.bipedRightLeg.addChild(boot4);
        this.bipedLeftLeg.addChild(boot5);
        this.bipedRightLeg.addChild(boot6);
        this.bipedBody.addChild(skirt1);
        this.bipedBody.addChild(skirt2);
        this.bipedBody.addChild(skirt3);
        this.bipedBody.addChild(skirt4);
        this.bipedBody.addChild(skirtLeaf1);
        this.bipedBody.addChild(skirtLeaf2);
        this.bipedBody.addChild(plate1);
        this.bipedBody.addChild(plate2);
        this.bipedBody.addChild(plate3);
        this.bipedBody.addChild(plate4);
        this.bipedHead.addChild(maskBottom1);
        this.bipedHead.addChild(maskBottom2);
        this.bipedHead.addChild(maskBottom3);
        this.bipedHead.addChild(maskBottom4);
        this.bipedHead.addChild(maskEye1);
        this.bipedHead.addChild(maskEye2);
        this.bipedHead.addChild(maskEye3);
        this.bipedHead.addChild(maskMouth);
        this.bipedHead.addChild(maskStrap1);
        this.bipedHead.addChild(maskStrap2);
        this.bipedHead.addChild(maskStrap3);
        this.bipedHead.addChild(maskTop1);
        this.bipedHead.addChild(maskTop2);

    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        maskEye2.render(f5);
        maskStrap1.render(f5);
        maskEye3.render(f5);
        maskEye1.render(f5);
        maskTop2.render(f5);
        maskTop1.render(f5);
        maskBottom1.render(f5);
        maskMouth.render(f5);
        maskBottom4.render(f5);
        maskBottom3.render(f5);
        maskBottom2.render(f5);
        maskStrap3.render(f5);
        maskStrap2.render(f5);
        boot1.render(f5);
        boot3.render(f5);
        boot2.render(f5);
        boot4.render(f5);
        boot5.render(f5);
        boot6.render(f5);
        skirt1.render(f5);
        skirt2.render(f5);
        skirt3.render(f5);
        skirt4.render(f5);
        skirtLeaf1.render(f5);
        skirtLeaf2.render(f5);
        plate1.render(f5);
        plate2.render(f5);
        plate3.render(f5);
        plate4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}