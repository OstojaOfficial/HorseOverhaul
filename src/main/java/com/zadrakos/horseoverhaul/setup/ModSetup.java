package com.zadrakos.horseoverhaul.setup;

import com.zadrakos.horseoverhaul.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("horseoverhaul") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SADDLEBODY);
        }
    };

    public void init() {

    }
}
