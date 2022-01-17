package maxhyper.dttconstruct;

import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesTConstruct.MOD_ID)
public class DynamicTreesTConstruct
{
    public static final String MOD_ID = "dttconstruct";

    public DynamicTreesTConstruct() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);

        RegistryHandler.setup(MOD_ID);

        DTTConstructRegistries.setup();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
//        if (DTConfigs.REPLACE_NYLIUM_FUNGI.get()) {
//            replaceNyliumFungiFeatures();
//        }
    }

//    public static void replaceNyliumFungiFeatures() {
//        TreeRegistry.findSpecies(new ResourceLocation(MOD_ID, "bloodshroom")).getSapling().ifPresent(bloodSapling ->
//                replaceFeatureConfigs(((WeightedBlockStateProvider) Features.Configs.WARPED_FOREST_CONFIG.stateProvider), bloodSapling));
//    }
//
//    private static void replaceFeatureConfigs(WeightedBlockStateProvider featureConfig, Block sapling) {
//        for (final WeightedList.Entry<BlockState> entry : featureConfig.weightedList.entries) {
//            if (entry.data.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tconstruct", "blood_slime_sapling"))) {
//                entry.data = sapling.defaultBlockState();
//            }
//        }
//    }

}