package fr.hellobryan.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties MAGICAL_CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(10)
            .saturationMod(6F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 100000, 4),1).meat().build();

}
