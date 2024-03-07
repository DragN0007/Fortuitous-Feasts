package com.dragn0007.dffeasts.datagen.biglooter;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.crop.BellPepperBlock;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

public class DFFBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(DFFBlocks.PIXEL_PLACER_CONTAINER.get());

        this.dropSelf(DFFBlocks.ORANGE_LOG.get());
        this.dropSelf(DFFBlocks.ORANGE_PLANKS.get());
        this.dropSelf(DFFBlocks.ORANGE_SLAB.get());
        this.dropSelf(DFFBlocks.ORANGE_STAIRS.get());
        this.dropOther(DFFBlocks.ORANGE_SAPLING.get(), DFFItems.ORANGE_SEEDS.get());

        this.dropSelf(DFFBlocks.COCONUT_LOG.get());
        this.dropSelf(DFFBlocks.COCONUT_PLANKS.get());
        this.dropSelf(DFFBlocks.COCONUT_SLAB.get());
        this.dropSelf(DFFBlocks.COCONUT_STAIRS.get());
        this.dropOther(DFFBlocks.COCONUT_SAPLING.get(), DFFItems.COCONUT.get());

        this.dropSelf(DFFBlocks.GRAPEFRUIT_LOG.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_PLANKS.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_SLAB.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_STAIRS.get());
        this.dropOther(DFFBlocks.GRAPEFRUIT_SAPLING.get(), DFFItems.GRAPEFRUIT_SEEDS.get());

        this.dropSelf(DFFBlocks.MANGO_LOG.get());
        this.dropSelf(DFFBlocks.MANGO_PLANKS.get());
        this.dropSelf(DFFBlocks.MANGO_SLAB.get());
        this.dropSelf(DFFBlocks.MANGO_STAIRS.get());
        this.dropOther(DFFBlocks.MANGO_SAPLING.get(), DFFItems.MANGO_SEED.get());

        this.dropSelf(DFFBlocks.POMEGRANATE_LOG.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_PLANKS.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_SLAB.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_STAIRS.get());
        this.dropOther(DFFBlocks.POMEGRANATE_SAPLING.get(), DFFItems.POMEGRANATE_SEEDS.get());

        this.dropSelf(DFFBlocks.CHERRY_LOG.get());
        this.dropSelf(DFFBlocks.CHERRY_PLANKS.get());
        this.dropSelf(DFFBlocks.CHERRY_SLAB.get());
        this.dropSelf(DFFBlocks.CHERRY_STAIRS.get());
        this.dropOther(DFFBlocks.CHERRY_SAPLING.get(), DFFItems.CHERRY_PIT.get());

        this.dropSelf(DFFBlocks.LYCHEE_LOG.get());
        this.dropSelf(DFFBlocks.LYCHEE_PLANKS.get());
        this.dropSelf(DFFBlocks.LYCHEE_SLAB.get());
        this.dropSelf(DFFBlocks.LYCHEE_STAIRS.get());
        this.dropOther(DFFBlocks.LYCHEE_SAPLING.get(), DFFItems.LYCHEE_SEED.get());

        this.dropSelf(DFFBlocks.KIWI_LOG.get());
        this.dropSelf(DFFBlocks.KIWI_PLANKS.get());
        this.dropSelf(DFFBlocks.KIWI_SLAB.get());
        this.dropSelf(DFFBlocks.KIWI_STAIRS.get());
        this.dropOther(DFFBlocks.KIWI_SAPLING.get(), DFFItems.KIWI_SEEDS.get());

        this.dropSelf(DFFBlocks.PEAR_LOG.get());
        this.dropSelf(DFFBlocks.PEAR_PLANKS.get());
        this.dropSelf(DFFBlocks.PEAR_SLAB.get());
        this.dropSelf(DFFBlocks.PEAR_STAIRS.get());
        this.dropOther(DFFBlocks.PEAR_SAPLING.get(), DFFItems.PEAR_SEEDS.get());

        this.dropSelf(DFFBlocks.AVOCADO_LOG.get());
        this.dropSelf(DFFBlocks.AVOCADO_PLANKS.get());
        this.dropSelf(DFFBlocks.AVOCADO_SLAB.get());
        this.dropSelf(DFFBlocks.AVOCADO_STAIRS.get());
        this.dropOther(DFFBlocks.AVOCADO_SAPLING.get(), DFFItems.AVOCADO_PIT.get());


        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.BELL_PEPPER_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.BELL_PEPPER_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (DFFItems.BELL_PEPPER.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder1).add(LootItem.lootTableItem
                (DFFItems.BELL_PEPPER.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.JALEPENO_PEPPER_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.JALEPENO_PEPPER_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.JALEPENO_PEPPER.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                        (DFFItems.JALEPENO_PEPPER.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CHILI_PEPPER_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CHILI_PEPPER_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CHILI_PEPPER.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder3).add(LootItem.lootTableItem
                        (DFFItems.CHILI_PEPPER.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CRANBERRY_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CRANBERRY_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CRANBERRIES.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder4).add(LootItem.lootTableItem
                        (DFFItems.CRANBERRIES.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

                LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.ONION_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.ONION_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.ONION.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder5).add(LootItem.lootTableItem
                        (DFFItems.ONION.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.GARLIC_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.GARLIC_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.GARLIC.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder6).add(LootItem.lootTableItem
                        (DFFItems.GARLIC.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

                LootItemCondition.Builder lootitemcondition$builder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.RADISH_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.RADISH_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.RADISH.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder7).add(LootItem.lootTableItem
                        (DFFItems.RADISH.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

                LootItemCondition.Builder lootitemcondition$builder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.TOMATO_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.TOMATO_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.TOMATO.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder8).add(LootItem.lootTableItem
                        (DFFItems.TOMATO.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.RED_GRAPE_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.RED_GRAPE_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.RED_GRAPES.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder9).add(LootItem.lootTableItem
                        (DFFItems.RED_GRAPES.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.PURPLE_GRAPE_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.PURPLE_GRAPE_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.PURPLE_GRAPES.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder10).add(LootItem.lootTableItem
                        (DFFItems.PURPLE_GRAPES.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.WHITE_GRAPE_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.WHITE_GRAPE_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.WHITE_GRAPES.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder11).add(LootItem.lootTableItem
                        (DFFItems.WHITE_GRAPES.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.OREGANO_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.OREGANO_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.OREGANO.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder12).add(LootItem.lootTableItem
                        (DFFItems.OREGANO.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.MINT_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.MINT_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.MINT.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder13).add(LootItem.lootTableItem
                        (DFFItems.MINT.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.ROSEMARY_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.ROSEMARY_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.ROSEMARY.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder14).add(LootItem.lootTableItem
                        (DFFItems.ROSEMARY.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CILANTRO_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CILANTRO_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CILANTRO.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder15).add(LootItem.lootTableItem
                        (DFFItems.CILANTRO.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.BRUSSELS_SPROUTS_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.BRUSSELS_SPROUTS_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.BRUSSELS_SPROUTS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder16).add(LootItem.lootTableItem
                        (DFFItems.BRUSSELS_SPROUTS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.BLACK_BEAN_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.BLACK_BEAN_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.BLACK_BEANS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder17).add(LootItem.lootTableItem
                        (DFFItems.BLACK_BEANS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder18 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.BUTTERNUT_SQUASH_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.BUTTERNUT_SQUASH_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.BUTTERNUT_SQUASH.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder18).add(LootItem.lootTableItem
                        (DFFItems.BUTTERNUT_SQUASH.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder19 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CELERY_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CELERY_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CELERY.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder19).add(LootItem.lootTableItem
                        (DFFItems.CELERY.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder20 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CORN_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CORN_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CORN.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder20).add(LootItem.lootTableItem
                        (DFFItems.CORN.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder21 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.CUCUMBER_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.CUCUMBER_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.CUCUMBER.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder21).add(LootItem.lootTableItem
                        (DFFItems.CUCUMBER.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder22 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.GINGER_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.GINGER_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.GINGER.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder22).add(LootItem.lootTableItem
                        (DFFItems.GINGER.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder23 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.GREEN_BEAN_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.GREEN_BEAN_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.GREEN_BEANS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder23).add(LootItem.lootTableItem
                        (DFFItems.GREEN_BEANS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder24 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.KIDNEY_BEAN_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.KIDNEY_BEAN_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.KIDNEY_BEANS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder24).add(LootItem.lootTableItem
                        (DFFItems.KIDNEY_BEANS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder25 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.PEANUT_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.PEANUT_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.PEANUTS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder25).add(LootItem.lootTableItem
                        (DFFItems.PEANUTS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder26 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.RYE_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.RYE_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.RYE.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder26).add(LootItem.lootTableItem
                        (DFFItems.RYE.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder27 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.SOYBEAN_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.SOYBEAN_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.SOYBEANS.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder27).add(LootItem.lootTableItem
                        (DFFItems.SOYBEANS.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder28 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.STRAWBERRY_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.STRAWBERRY_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.STRAWBERRY.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder28).add(LootItem.lootTableItem
                        (DFFItems.STRAWBERRY.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder29 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.ZUCCHINI_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.ZUCCHINI_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.ZUCCHINI.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder29).add(LootItem.lootTableItem
                        (DFFItems.ZUCCHINI.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder30 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (DFFBlocks.SUGAR_BEET_PLANT.get())  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BellPepperBlock.AGE, 3));    this.add
                (DFFBlocks.SUGAR_BEET_PLANT.get(),   LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (DFFItems.SUGAR_BEET.get())))       .withPool(LootPool.lootPool().when(lootitemcondition$builder30).add(LootItem.lootTableItem
                        (DFFItems.SUGAR_BEET.get())         .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DFFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
