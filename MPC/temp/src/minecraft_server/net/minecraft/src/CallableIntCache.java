package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.CrashReport;
import net.minecraft.src.IntCache;

class CallableIntCache implements Callable {

   // $FF: synthetic field
   final CrashReport field_85084_a;


   CallableIntCache(CrashReport p_i6804_1_) {
      this.field_85084_a = p_i6804_1_;
   }

   public String func_85083_a() {
      return IntCache.func_85144_b();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_85083_a();
   }
}
