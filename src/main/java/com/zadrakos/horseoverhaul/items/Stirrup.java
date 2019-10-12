package com.zadrakos.horseoverhaul.items;

import com.zadrakos.horseoverhaul.HorseOverhaul;
import net.minecraft.item.Item;

public class Stirrup extends Item {

    public Stirrup() {
        super(new Item.Properties()
                .maxStackSize(4)
                .group(HorseOverhaul.setup.itemGroup));
        setRegistryName("stirrup");
    }
}
