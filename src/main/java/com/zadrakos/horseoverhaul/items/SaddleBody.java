package com.zadrakos.horseoverhaul.items;

import com.zadrakos.horseoverhaul.HorseOverhaul;
import net.minecraft.item.Item;

public class SaddleBody extends Item {

    public SaddleBody() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(HorseOverhaul.setup.itemGroup));
        setRegistryName("saddlebody");
    }
}
