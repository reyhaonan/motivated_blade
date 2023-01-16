package net;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.items.CheeseBurger;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MotivatedBlade implements ModInitializer {

  public static final CheeseBurger cheeseBurger = new CheeseBurger(new FabricItemSettings());

  @Override
  public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("motivated_blade", "cheese_burger"), cheeseBurger);

  }

}
