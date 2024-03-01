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

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DFFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
