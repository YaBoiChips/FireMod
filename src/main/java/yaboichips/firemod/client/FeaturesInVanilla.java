package yaboichips.firemod.client;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import yaboichips.firemod.Firemod;

@Mod.EventBusSubscriber(modid = Firemod.MODID)
public class FeaturesInVanilla {
    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();
        Biome.Category category = event.getCategory();
        if (biome == null) return;
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if (category.equals(Biome.Category.PLAINS) || category.equals(Biome.Category.TAIGA) || category.equals(Biome.Category.EXTREME_HILLS) || category.equals(Biome.Category.JUNGLE) || category.equals(Biome.Category.MESA)
        || (category.equals(Biome.Category.SAVANNA) || (category.equals(Biome.Category.ICY) || (category.equals(Biome.Category.THEEND) || (category.equals(Biome.Category.BEACH) || (category.equals(Biome.Category.FOREST)
                || (category.equals(Biome.Category.DESERT) || (category.equals(Biome.Category.RIVER) || (category.equals(Biome.Category.SWAMP)|| (category.equals(Biome.Category.MUSHROOM))))))))))) {
            generation.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.FIRE);
        }
    }
}
