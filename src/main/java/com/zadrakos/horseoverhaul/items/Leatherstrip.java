package com.zadrakos.horseoverhaul.items;

import com.zadrakos.horseoverhaul.HorseOverhaul;
import net.minecraft.item.Item;

public class Leatherstrip extends Item {

    public Leatherstrip() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(HorseOverhaul.setup.itemGroup));
        setRegistryName("leatherstrip");
    }
}
