package fr.hellobryan.tutorialmod.block;

import ca.weblite.objc.Proxy;
import fr.hellobryan.tutorialmod.TutorialMod;
import fr.hellobryan.tutorialmod.block.custom.CucumberPlantBlock;
import fr.hellobryan.tutorialmod.block.custom.SpeedyBlock;
import fr.hellobryan.tutorialmod.item.ModCreativeModeTab;
import fr.hellobryan.tutorialmod.item.ModItems;
import fr.hellobryan.tutorialmod.item.custom.ModFlammableRotatedBlock;
import fr.hellobryan.tutorialmod.world.features.tree.EbonyTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);


    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);


    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB, "tooltip.tutorialmod.block.speedy_block");




    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> CITRINE_FENCE = registerBlock("citrine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_FENCE_GATE = registerBlock("citrine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_WALL = registerBlock("citrine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);


    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion())
            , ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));

    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD))
            , ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new ModFlammableRotatedBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }, ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            }, ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock( new EbonyTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.TUTORIAL_TAB);


    public static final RegistryObject<Block> CUCUMBER_PLANT = registerBlockWithoutBlockItem("cucumber_plant",
            () -> new CucumberPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name,block);

    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });

    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
