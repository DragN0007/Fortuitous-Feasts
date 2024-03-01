package com.dragn0007.dffeasts.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DFFItemGroup {

    public static final CreativeModeTab CROP_GROUP = new CreativeModeTab("cropmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DFFItems.CRANBERRIES.get());
        }
    };

    public static final CreativeModeTab FOOD_GROUP = new CreativeModeTab("foodmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DFFItems.GRAPEFRUIT.get());
        }
    };

    public static final CreativeModeTab DECOR_GROUP = new CreativeModeTab("decormodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DFFItems.RED_GRAPES.get());
        }
    };


}
