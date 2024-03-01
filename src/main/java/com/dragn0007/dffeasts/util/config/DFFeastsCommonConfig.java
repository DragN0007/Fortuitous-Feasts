package com.dragn0007.dffeasts.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DFFeastsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;







    static {
        BUILDER.push("Configs for Medieval Embroidery!");







        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
