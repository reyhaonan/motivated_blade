package net;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.items.CheeseBurger;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MotivatedBlade implements ModInitializer {

  public static final CheeseBurger cheeseBurger = new CheeseBurger(
      new FabricItemSettings().group(ItemGroup.FOOD)
          .food(new FoodComponent.Builder().hunger(16).saturationModifier(0.3f)
              .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(9), 200), 0.2f).build()));

  @Override
  public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("motivated_blade", "cheese_burger"), cheeseBurger);

  }

}
