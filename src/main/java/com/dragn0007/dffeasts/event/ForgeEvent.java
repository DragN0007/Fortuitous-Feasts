package com.dragn0007.dffeasts.event;


import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.entity.villager.FeastsFarmer;
import com.dragn0007.dffeasts.item.DFFItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerBiomes(BiomeLoadingEvent event) {
        switch (event.getCategory()) {

            case MESA:
                break;

            case PLAINS:
                break;

            case SWAMP:
                break;

            case TAIGA:
                break;

            case EXTREME_HILLS:
                break;

            case BEACH:
                break;

            case FOREST:
                break;

            case RIVER:
                break;

            case DESERT:
                break;

            case SAVANNA:
                break;

            case JUNGLE:
                break;

            case MOUNTAIN:
                break;

            case ICY:
                break;

            case MUSHROOM:
                break;

            case UNDERGROUND:
                break;

            case OCEAN:
                break;

            case NETHER:
                break;
        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent villagerTradesEvent) {

        //TODO; WILD BERRIES -> COINS TRADES (LVL 1)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RASPBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BLACKBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.WHITE_RASPBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BLUEBERRIES.get(), 4),
                    stack, 10, 8, 0.05F));
        }



        //TODO; CROP BAG TRADES (LVL 2)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFBlocksNoDatagen.CROP_BAG_FRUITS.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 6),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFBlocksNoDatagen.CROP_BAG_VEGGIES.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 6),
                    stack, 10, 8, 0.05F));
        }



        //TODO; CROPS -> COINS TRADES (LVL 3)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BELL_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BLACK_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BUTTERNUT_SQUASH.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BRUSSELS_SPROUTS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CORN.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CRANBERRIES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CHILI_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CELERY.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CUCUMBER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GARLIC.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GREEN_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GINGER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.JALEPENO_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.KIDNEY_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.ONION.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.PURPLE_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.PEANUTS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RED_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RADISH.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RYE.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.STRAWBERRY.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.SOYBEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.TOMATO.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.WHITE_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.ZUCCHINI.get(), 1),
                    stack, 10, 8, 0.05F));
        }



        //TODO; COINS -> VALUABLES TRADES (LVL 4)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.GOLD_INGOT, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 32),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.IRON_INGOT, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 24),
                    stack, 10, 8, 0.05F));
        }



        //TODO; COINS -> VALUABLES TRADES (LVL 5)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 64),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), 48),
                    stack, 10, 8, 0.05F));
        }



    }

}