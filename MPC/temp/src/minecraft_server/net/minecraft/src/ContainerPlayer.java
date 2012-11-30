package net.minecraft.src;

import net.minecraft.src.Container;
import net.minecraft.src.CraftingManager;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryCraftResult;
import net.minecraft.src.InventoryCrafting;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;
import net.minecraft.src.SlotArmor;
import net.minecraft.src.SlotCrafting;

public class ContainerPlayer extends Container {

   public InventoryCrafting field_75181_e = new InventoryCrafting(this, 2, 2);
   public IInventory field_75179_f = new InventoryCraftResult();
   public boolean field_75180_g = false;
   private final EntityPlayer field_82862_h;


   public ContainerPlayer(InventoryPlayer p_i5077_1_, boolean p_i5077_2_, EntityPlayer p_i5077_3_) {
      this.field_75180_g = p_i5077_2_;
      this.field_82862_h = p_i5077_3_;
      this.func_75146_a(new SlotCrafting(p_i5077_1_.field_70458_d, this.field_75181_e, this.field_75179_f, 0, 144, 36));

      int var4;
      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         for(var5 = 0; var5 < 2; ++var5) {
            this.func_75146_a(new Slot(this.field_75181_e, var5 + var4 * 2, 88 + var5 * 18, 26 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 4; ++var4) {
         this.func_75146_a(new SlotArmor(this, p_i5077_1_, p_i5077_1_.func_70302_i_() - 1 - var4, 8, 8 + var4 * 18, var4));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.func_75146_a(new Slot(p_i5077_1_, var5 + (var4 + 1) * 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.func_75146_a(new Slot(p_i5077_1_, var4, 8 + var4 * 18, 142));
      }

      this.func_75130_a(this.field_75181_e);
   }

   public void func_75130_a(IInventory p_75130_1_) {
      this.field_75179_f.func_70299_a(0, CraftingManager.func_77594_a().func_82787_a(this.field_75181_e, this.field_82862_h.field_70170_p));
   }

   public void func_75134_a(EntityPlayer p_75134_1_) {
      super.func_75134_a(p_75134_1_);

      for(int var2 = 0; var2 < 4; ++var2) {
         ItemStack var3 = this.field_75181_e.func_70304_b(var2);
         if(var3 != null) {
            p_75134_1_.func_71021_b(var3);
         }
      }

      this.field_75179_f.func_70299_a(0, (ItemStack)null);
   }

   public boolean func_75145_c(EntityPlayer p_75145_1_) {
      return true;
   }

   public ItemStack func_82846_b(EntityPlayer p_82846_1_, int p_82846_2_) {
      ItemStack var3 = null;
      Slot var4 = (Slot)this.field_75151_b.get(p_82846_2_);
      if(var4 != null && var4.func_75216_d()) {
         ItemStack var5 = var4.func_75211_c();
         var3 = var5.func_77946_l();
         if(p_82846_2_ == 0) {
            if(!this.func_75135_a(var5, 9, 45, true)) {
               return null;
            }

            var4.func_75220_a(var5, var3);
         } else if(p_82846_2_ >= 1 && p_82846_2_ < 5) {
            if(!this.func_75135_a(var5, 9, 45, false)) {
               return null;
            }
         } else if(p_82846_2_ >= 5 && p_82846_2_ < 9) {
            if(!this.func_75135_a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var3.func_77973_b() instanceof ItemArmor && !((Slot)this.field_75151_b.get(5 + ((ItemArmor)var3.func_77973_b()).field_77881_a)).func_75216_d()) {
            int var6 = 5 + ((ItemArmor)var3.func_77973_b()).field_77881_a;
            if(!this.func_75135_a(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if(p_82846_2_ >= 9 && p_82846_2_ < 36) {
            if(!this.func_75135_a(var5, 36, 45, false)) {
               return null;
            }
         } else if(p_82846_2_ >= 36 && p_82846_2_ < 45) {
            if(!this.func_75135_a(var5, 9, 36, false)) {
               return null;
            }
         } else if(!this.func_75135_a(var5, 9, 45, false)) {
            return null;
         }

         if(var5.field_77994_a == 0) {
            var4.func_75215_d((ItemStack)null);
         } else {
            var4.func_75218_e();
         }

         if(var5.field_77994_a == var3.field_77994_a) {
            return null;
         }

         var4.func_82870_a(p_82846_1_, var5);
      }

      return var3;
   }
}
