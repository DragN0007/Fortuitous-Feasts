package com.dragn0007.dffeasts.event;


import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.entity.villager.FeastsFarmer;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.config.DFFeastsCommonConfig;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    //Right-Click Harvest Crops
    @SubscribeEvent
    public static void onBlockUse(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getWorld();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        InteractionHand hand = event.getHand();
        Player player = event.getPlayer();
        player.swing(hand);
        ItemStack itemStack = player.getItemInHand(hand);

        if(state.getBlock() instanceof CropBlock cropBlock && level instanceof ServerLevel serverLevel) {
            IntegerProperty property = cropBlock.getAgeProperty();
            int maxAge = cropBlock.getMaxAge();

            if(itemStack.isEmpty() && state.getValue(property) == maxAge) {
                level.setBlockAndUpdate(pos, state.setValue(property, 0));

                cropBlock.getDrops(state, serverLevel, pos, null).forEach(stack -> {
                    serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                });

                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent villagerTradesEvent) {

        //TODO; WILD BERRIES -> COINS TRADES (LVL 1)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.BERRY_PRICE.get());
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RASPBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.BERRY_PRICE.get());
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BLACKBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.BERRY_PRICE.get());
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.WHITE_RASPBERRY.get(), 4),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.BERRY_PRICE.get());
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
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_BAG_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFBlocksNoDatagen.CROP_BAG_VEGGIES.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_BAG_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }



        //TODO; CROPS -> COINS TRADES (LVL 3)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BELL_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BLACK_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BUTTERNUT_SQUASH.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.BRUSSELS_SPROUTS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CORN.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CRANBERRIES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CHILI_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CELERY.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CUCUMBER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GARLIC.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GREEN_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.GINGER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.JALEPENO_PEPPER.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.KIDNEY_BEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.ONION.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.PURPLE_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.PEANUTS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RED_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RADISH.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.RYE.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.STRAWBERRY.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.SOYBEANS.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.TOMATO.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.WHITE_GRAPES.get(), 1),
                    stack, 10, 8, 0.05F));
        }
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.CROP_PRICE.get());
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.ZUCCHINI.get(), 1),
                    stack, 10, 8, 0.05F));
        }



        //TODO; COINS -> VALUABLES TRADES (LVL 4)
        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.IRON_INGOT, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.IRON_INGOT_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.GOLD_INGOT, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.GOLD_INGOT_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }



        //TODO; COINS -> VALUABLES TRADES (LVL 5)

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.EMERALD_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }

        if (villagerTradesEvent.getType() == FeastsFarmer.FEASTS_FARMER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(DFFItems.CROP_COIN.get(), DFFeastsCommonConfig.DIAMOND_PRICE.get()),
                    stack, 10, 8, 0.05F));
        }



    }

}