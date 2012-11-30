package net.minecraft.src;

import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.IEntityMultiPart;
import net.minecraft.src.NBTTagCompound;

public class EntityDragonPart extends Entity {

   public final IEntityMultiPart field_70259_a;
   public final String field_70258_b;


   public EntityDragonPart(IEntityMultiPart p_i5012_1_, String p_i5012_2_, float p_i5012_3_, float p_i5012_4_) {
      super(p_i5012_1_.func_82194_d());
      this.func_70105_a(p_i5012_3_, p_i5012_4_);
      this.field_70259_a = p_i5012_1_;
      this.field_70258_b = p_i5012_2_;
   }

   protected void func_70088_a() {}

   protected void func_70037_a(NBTTagCompound p_70037_1_) {}

   protected void func_70014_b(NBTTagCompound p_70014_1_) {}

   public boolean func_70067_L() {
      return true;
   }

   public boolean func_70097_a(DamageSource p_70097_1_, int p_70097_2_) {
      return this.func_85032_ar()?false:this.field_70259_a.func_70965_a(this, p_70097_1_, p_70097_2_);
   }

   public boolean func_70028_i(Entity p_70028_1_) {
      return this == p_70028_1_ || this.field_70259_a == p_70028_1_;
   }
}
