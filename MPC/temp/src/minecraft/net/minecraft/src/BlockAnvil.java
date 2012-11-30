package net.minecraft.src;

import java.util.List;
import net.minecraft.src.BlockSand;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityFallingSand;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class BlockAnvil extends BlockSand {

   public static final String[] field_82522_a = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
   public int field_82521_b = 0;


   protected BlockAnvil(int p_i5098_1_) {
      super(p_i5098_1_, 215, Material.field_82717_g);
      this.func_71868_h(0);
      this.func_71849_a(CreativeTabs.field_78031_c);
   }

   public boolean func_71886_c() {
      return false;
   }

   public boolean func_71926_d() {
      return false;
   }

   public int func_71858_a(int p_71858_1_, int p_71858_2_) {
      if(this.field_82521_b == 3 && p_71858_1_ == 1) {
         int var3 = p_71858_2_ >> 2;
         switch(var3) {
         case 1:
            return this.field_72059_bZ + 1;
         case 2:
            return this.field_72059_bZ + 16 + 1;
         default:
            return this.field_72059_bZ + 16;
         }
      } else {
         return this.field_72059_bZ;
      }
   }

   public int func_71851_a(int p_71851_1_) {
      return super.func_71851_a(p_71851_1_);
   }

   public void func_71860_a(World p_71860_1_, int p_71860_2_, int p_71860_3_, int p_71860_4_, EntityLiving p_71860_5_) {
      int var6 = MathHelper.func_76128_c((double)(p_71860_5_.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      int var7 = p_71860_1_.func_72805_g(p_71860_2_, p_71860_3_, p_71860_4_) >> 2;
      ++var6;
      var6 %= 4;
      if(var6 == 0) {
         p_71860_1_.func_72921_c(p_71860_2_, p_71860_3_, p_71860_4_, 2 | var7 << 2);
      }

      if(var6 == 1) {
         p_71860_1_.func_72921_c(p_71860_2_, p_71860_3_, p_71860_4_, 3 | var7 << 2);
      }

      if(var6 == 2) {
         p_71860_1_.func_72921_c(p_71860_2_, p_71860_3_, p_71860_4_, 0 | var7 << 2);
      }

      if(var6 == 3) {
         p_71860_1_.func_72921_c(p_71860_2_, p_71860_3_, p_71860_4_, 1 | var7 << 2);
      }

   }

   public boolean func_71903_a(World p_71903_1_, int p_71903_2_, int p_71903_3_, int p_71903_4_, EntityPlayer p_71903_5_, int p_71903_6_, float p_71903_7_, float p_71903_8_, float p_71903_9_) {
      if(p_71903_1_.field_72995_K) {
         return true;
      } else {
         p_71903_5_.func_82244_d(p_71903_2_, p_71903_3_, p_71903_4_);
         return true;
      }
   }

   public int func_71857_b() {
      return 35;
   }

   public int func_71899_b(int p_71899_1_) {
      return p_71899_1_ >> 2;
   }

   public void func_71902_a(IBlockAccess p_71902_1_, int p_71902_2_, int p_71902_3_, int p_71902_4_) {
      int var5 = p_71902_1_.func_72805_g(p_71902_2_, p_71902_3_, p_71902_4_) & 3;
      if(var5 != 3 && var5 != 1) {
         this.func_71905_a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
      } else {
         this.func_71905_a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
      }

   }

   public void func_71879_a(int p_71879_1_, CreativeTabs p_71879_2_, List p_71879_3_) {
      p_71879_3_.add(new ItemStack(p_71879_1_, 1, 0));
      p_71879_3_.add(new ItemStack(p_71879_1_, 1, 1));
      p_71879_3_.add(new ItemStack(p_71879_1_, 1, 2));
   }

   protected void func_82520_a(EntityFallingSand p_82520_1_) {
      p_82520_1_.func_82154_e(true);
   }

   public void func_82519_a_(World p_82519_1_, int p_82519_2_, int p_82519_3_, int p_82519_4_, int p_82519_5_) {
      p_82519_1_.func_72926_e(1022, p_82519_2_, p_82519_3_, p_82519_4_, 0);
   }

   public boolean func_71877_c(IBlockAccess p_71877_1_, int p_71877_2_, int p_71877_3_, int p_71877_4_, int p_71877_5_) {
      return true;
   }

}
