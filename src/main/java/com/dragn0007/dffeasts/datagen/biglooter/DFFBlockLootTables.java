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

        this.dropOther(DFFBlocks.WILD_ROSEMARY.get(), DFFItems.ROSEMARY.get());
        this.dropOther(DFFBlocks.WILD_OREGANO.get(), DFFItems.OREGANO.get());
        this.dropOther(DFFBlocks.WILD_MINT.get(), DFFItems.MINT.get());
        this.dropOther(DFFBlocks.WILD_CILANTRO.get(), DFFItems.CILANTRO.get());

        this.dropOther(DFFBlocks.WILD_BELL_PEPPER_PLANT.get(), DFFItems.BELL_PEPPER.get());
        this.dropOther(DFFBlocks.WILD_BLACK_BEAN_PLANT.get(), DFFItems.BLACK_BEANS.get());
        this.dropOther(DFFBlocks.WILD_BRUSSELS_SPROUTS_PLANT.get(), DFFItems.BRUSSELS_SPROUTS.get());
        this.dropOther(DFFBlocks.WILD_CORN_PLANT.get(), DFFItems.CORN.get());
        this.dropOther(DFFBlocks.WILD_CELERY_PLANT.get(), DFFItems.CELERY.get());
        this.dropOther(DFFBlocks.WILD_CHILI_PEPPER_PLANT.get(), DFFItems.CHILI_PEPPER.get());
        this.dropOther(DFFBlocks.WILD_BUTTERNUT_SQUASH_PLANT.get(), DFFItems.BUTTERNUT_SQUASH.get());
        this.dropOther(DFFBlocks.WILD_CUCUMBER_PLANT.get(), DFFItems.CUCUMBER.get());
        this.dropOther(DFFBlocks.WILD_CRANBERRY_PLANT.get(), DFFItems.CRANBERRIES.get());
        this.dropOther(DFFBlocks.WILD_GARLIC_PLANT.get(), DFFItems.GARLIC.get());
        this.dropOther(DFFBlocks.WILD_GINGER_PLANT.get(), DFFItems.GINGER.get());
        this.dropOther(DFFBlocks.WILD_GREEN_BEAN_PLANT.get(), DFFItems.GREEN_BEANS.get());
        this.dropOther(DFFBlocks.WILD_PURPLE_GRAPE_PLANT.get(), DFFItems.PURPLE_GRAPES.get());
        this.dropOther(DFFBlocks.WILD_RED_GRAPE_PLANT.get(), DFFItems.RED_GRAPES.get());
        this.dropOther(DFFBlocks.WILD_JALEPENO_PEPPER_PLANT.get(), DFFItems.JALEPENO_PEPPER.get());
        this.dropOther(DFFBlocks.WILD_KIDNEY_BEAN_PLANT.get(), DFFItems.KIDNEY_BEANS.get());
        this.dropOther(DFFBlocks.WILD_ONION_PLANT.get(), DFFItems.ONION.get());
        this.dropOther(DFFBlocks.WILD_PEANUT_PLANT.get(), DFFItems.PEANUTS.get());
        this.dropOther(DFFBlocks.WILD_RADISH_PLANT.get(), DFFItems.RADISH.get());
        this.dropOther(DFFBlocks.WILD_RYE_PLANT.get(), DFFItems.RYE.get());
        this.dropOther(DFFBlocks.WILD_SOYBEAN_PLANT.get(), DFFItems.SOYBEANS.get());
        this.dropOther(DFFBlocks.WILD_SUGAR_BEET_PLANT.get(), DFFItems.SUGAR_BEET.get());
        this.dropOther(DFFBlocks.WILD_STRAWBERRY_PLANT.get(), DFFItems.STRAWBERRY.get());
        this.dropOther(DFFBlocks.WILD_TOMATO_PLANT.get(), DFFItems.TOMATO.get());
        this.dropOther(DFFBlocks.WILD_WHITE_GRAPE_PLANT.get(), DFFItems.WHITE_GRAPES.get());
        this.dropOther(DFFBlocks.WILD_ZUCCHINI_PLANT.get(), DFFItems.ZUCCHINI.get());


        this.dropSelf(DFFBlocks.ORANGE_LOG.get());
        this.dropSelf(DFFBlocks.ORANGE_PLANKS.get());
        this.dropSelf(DFFBlocks.ORANGE_SLAB.get());
        this.dropSelf(DFFBlocks.ORANGE_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_ORANGE_SAPLING.get(), DFFItems.ORANGE_SEEDS.get());
        this.dropSelf(DFFBlocks.ORANGE_FENCE.get());
        this.dropSelf(DFFBlocks.ORANGE_FENCE_GATE.get());
        this.add(DFFBlocks.ORANGE_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.ORANGE_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.COCONUT_LOG.get());
        this.dropSelf(DFFBlocks.COCONUT_PLANKS.get());
        this.dropSelf(DFFBlocks.COCONUT_SLAB.get());
        this.dropSelf(DFFBlocks.COCONUT_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_COCONUT_SAPLING.get(), DFFItems.COCONUT.get());
        this.dropSelf(DFFBlocks.COCONUT_FENCE.get());
        this.dropSelf(DFFBlocks.COCONUT_FENCE_GATE.get());
        this.add(DFFBlocks.COCONUT_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.COCONUT_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.GRAPEFRUIT_LOG.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_PLANKS.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_SLAB.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get(), DFFItems.GRAPEFRUIT_SEEDS.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_FENCE.get());
        this.dropSelf(DFFBlocks.GRAPEFRUIT_FENCE_GATE.get());
        this.add(DFFBlocks.GRAPEFRUIT_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.GRAPEFRUIT_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.MANGO_LOG.get());
        this.dropSelf(DFFBlocks.MANGO_PLANKS.get());
        this.dropSelf(DFFBlocks.MANGO_SLAB.get());
        this.dropSelf(DFFBlocks.MANGO_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_MANGO_SAPLING.get(), DFFItems.MANGO_SEED.get());
        this.dropSelf(DFFBlocks.MANGO_FENCE.get());
        this.dropSelf(DFFBlocks.MANGO_FENCE_GATE.get());
        this.add(DFFBlocks.MANGO_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.MANGO_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.POMEGRANATE_LOG.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_PLANKS.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_SLAB.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_POMEGRANATE_SAPLING.get(), DFFItems.POMEGRANATE_SEEDS.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_FENCE.get());
        this.dropSelf(DFFBlocks.POMEGRANATE_FENCE_GATE.get());
        this.add(DFFBlocks.POMEGRANATE_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.POMEGRANATE_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.CHERRY_LOG.get());
        this.dropSelf(DFFBlocks.CHERRY_PLANKS.get());
        this.dropSelf(DFFBlocks.CHERRY_SLAB.get());
        this.dropSelf(DFFBlocks.CHERRY_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_CHERRY_SAPLING.get(), DFFItems.CHERRY_PIT.get());
        this.dropSelf(DFFBlocks.CHERRY_FENCE.get());
        this.dropSelf(DFFBlocks.CHERRY_FENCE_GATE.get());
        this.add(DFFBlocks.CHERRY_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.CHERRY_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.LYCHEE_LOG.get());
        this.dropSelf(DFFBlocks.LYCHEE_PLANKS.get());
        this.dropSelf(DFFBlocks.LYCHEE_SLAB.get());
        this.dropSelf(DFFBlocks.LYCHEE_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_LYCHEE_SAPLING.get(), DFFItems.LYCHEE_SEED.get());
        this.dropSelf(DFFBlocks.LYCHEE_FENCE.get());
        this.dropSelf(DFFBlocks.LYCHEE_FENCE_GATE.get());
        this.add(DFFBlocks.LYCHEE_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.LYCHEE_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.KIWI_LOG.get());
        this.dropSelf(DFFBlocks.KIWI_PLANKS.get());
        this.dropSelf(DFFBlocks.KIWI_SLAB.get());
        this.dropSelf(DFFBlocks.KIWI_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_KIWI_SAPLING.get(), DFFItems.KIWI_SEEDS.get());
        this.dropSelf(DFFBlocks.KIWI_FENCE.get());
        this.dropSelf(DFFBlocks.KIWI_FENCE_GATE.get());
        this.add(DFFBlocks.KIWI_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.KIWI_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.PEAR_LOG.get());
        this.dropSelf(DFFBlocks.PEAR_PLANKS.get());
        this.dropSelf(DFFBlocks.PEAR_SLAB.get());
        this.dropSelf(DFFBlocks.PEAR_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_PEAR_SAPLING.get(), DFFItems.PEAR_SEEDS.get());
        this.dropSelf(DFFBlocks.PEAR_FENCE.get());
        this.dropSelf(DFFBlocks.PEAR_FENCE_GATE.get());
        this.add(DFFBlocks.PEAR_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.PEAR_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.AVOCADO_LOG.get());
        this.dropSelf(DFFBlocks.AVOCADO_PLANKS.get());
        this.dropSelf(DFFBlocks.AVOCADO_SLAB.get());
        this.dropSelf(DFFBlocks.AVOCADO_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_AVOCADO_SAPLING.get(), DFFItems.AVOCADO_PIT.get());
        this.dropSelf(DFFBlocks.AVOCADO_FENCE.get());
        this.dropSelf(DFFBlocks.AVOCADO_FENCE_GATE.get());
        this.add(DFFBlocks.AVOCADO_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.AVOCADO_TRAPDOOR.get());

        //Update 1.5
        this.dropSelf(DFFBlocks.BANANA_LOG.get());
        this.dropSelf(DFFBlocks.BANANA_PLANKS.get());
        this.dropSelf(DFFBlocks.BANANA_SLAB.get());
        this.dropSelf(DFFBlocks.BANANA_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_BANANA_SAPLING.get(), DFFItems.BANANA_SEEDS.get());
        this.dropSelf(DFFBlocks.BANANA_FENCE.get());
        this.dropSelf(DFFBlocks.BANANA_FENCE_GATE.get());
        this.add(DFFBlocks.BANANA_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.BANANA_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.DRAGONFRUIT_LOG.get());
        this.dropSelf(DFFBlocks.DRAGONFRUIT_PLANKS.get());
        this.dropSelf(DFFBlocks.DRAGONFRUIT_SLAB.get());
        this.dropSelf(DFFBlocks.DRAGONFRUIT_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_DRAGONFRUIT_SAPLING.get(), DFFItems.DRAGONFRUIT_SEEDS.get());
        this.dropSelf(DFFBlocks.DRAGONFRUIT_FENCE.get());
        this.dropSelf(DFFBlocks.DRAGONFRUIT_FENCE_GATE.get());
        this.add(DFFBlocks.DRAGONFRUIT_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.DRAGONFRUIT_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.PASSIONFRUIT_LOG.get());
        this.dropSelf(DFFBlocks.PASSIONFRUIT_PLANKS.get());
        this.dropSelf(DFFBlocks.PASSIONFRUIT_SLAB.get());
        this.dropSelf(DFFBlocks.PASSIONFRUIT_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_PASSIONFRUIT_SAPLING.get(), DFFItems.PASSIONFRUIT_SEEDS.get());
        this.dropSelf(DFFBlocks.PASSIONFRUIT_FENCE.get());
        this.dropSelf(DFFBlocks.PASSIONFRUIT_FENCE_GATE.get());
        this.add(DFFBlocks.PASSIONFRUIT_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.PASSIONFRUIT_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.CASHEW_LOG.get());
        this.dropSelf(DFFBlocks.CASHEW_PLANKS.get());
        this.dropSelf(DFFBlocks.CASHEW_SLAB.get());
        this.dropSelf(DFFBlocks.CASHEW_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_CASHEW_SAPLING.get(), DFFItems.CASHEWS.get());
        this.dropSelf(DFFBlocks.CASHEW_FENCE.get());
        this.dropSelf(DFFBlocks.CASHEW_FENCE_GATE.get());
        this.add(DFFBlocks.CASHEW_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.CASHEW_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.WALNUT_LOG.get());
        this.dropSelf(DFFBlocks.WALNUT_PLANKS.get());
        this.dropSelf(DFFBlocks.WALNUT_SLAB.get());
        this.dropSelf(DFFBlocks.WALNUT_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_WALNUT_SAPLING.get(), DFFItems.WALNUT.get());
        this.dropSelf(DFFBlocks.WALNUT_FENCE.get());
        this.dropSelf(DFFBlocks.WALNUT_FENCE_GATE.get());
        this.add(DFFBlocks.WALNUT_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.WALNUT_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.ALMOND_LOG.get());
        this.dropSelf(DFFBlocks.ALMOND_PLANKS.get());
        this.dropSelf(DFFBlocks.ALMOND_SLAB.get());
        this.dropSelf(DFFBlocks.ALMOND_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_ALMOND_SAPLING.get(), DFFItems.ALMONDS.get());
        this.dropSelf(DFFBlocks.ALMOND_FENCE.get());
        this.dropSelf(DFFBlocks.ALMOND_FENCE_GATE.get());
        this.add(DFFBlocks.ALMOND_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.ALMOND_TRAPDOOR.get());

        this.dropSelf(DFFBlocks.OLIVE_LOG.get());
        this.dropSelf(DFFBlocks.OLIVE_PLANKS.get());
        this.dropSelf(DFFBlocks.OLIVE_SLAB.get());
        this.dropSelf(DFFBlocks.OLIVE_STAIRS.get());
        this.dropOther(DFFBlocks.DFF_OLIVE_SAPLING.get(), DFFItems.OLIVES.get());
        this.dropSelf(DFFBlocks.OLIVE_FENCE.get());
        this.dropSelf(DFFBlocks.OLIVE_FENCE_GATE.get());
        this.add(DFFBlocks.OLIVE_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(DFFBlocks.OLIVE_TRAPDOOR.get());


        //1.0
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
