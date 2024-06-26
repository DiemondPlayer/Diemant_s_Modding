package net.diemond_player.diemants_test.item.custom;

import net.diemond_player.diemants_test.item.ModItems;
import net.diemond_player.diemants_test.sound.ModSounds;
import net.diemond_player.diemants_test.util.InventoryUtil;
import net.diemond_player.diemants_test.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class MetalDetectorItem extends Item {

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for (int i=0; i<=positionClicked.getY()+64; i++){
                BlockState blockstate = context.getWorld().getBlockState(positionClicked.down(i));
                Block block = blockstate.getBlock();

                if(isValuableBlock(blockstate)){
                    outputValuableCoordinates(positionClicked.down(i), player, block);
                    foundBlock = true;
                    context.getWorld().playSound(null, positionClicked, ModSounds.METAL_DETECTOR_FOUND_ORE,
                            SoundCategory.BLOCKS, 0.5f, 1f);

                    if(InventoryUtil.hasPlayerStackInInventory(player, ModItems.DATA_TABLET)){
                        addNbtDataToDataTablet(player, positionClicked.down(i), block);
                    }

                    break;
                }



            }

            if(!foundBlock) {
                player.sendMessage(Text.translatable("item.diemants_test.metal_detector.no_valuables"));
            }

        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void addNbtDataToDataTablet(PlayerEntity player, BlockPos position, Block block) {
        ItemStack dataTabletStack = player.getInventory().getStack(InventoryUtil.getFirstInventoryIndex(player, ModItems.DATA_TABLET));

        NbtCompound nbtData = new NbtCompound();
        nbtData.putString("diemants_test.last_valuable_found", "Valuable Found: " + block.getName().getString() + " at ( " +
                position.getX() + " " + position.getY() + " " + position.getZ() + " )");
        dataTabletStack.setNbt(nbtData);
    }

    private void outputValuableCoordinates(BlockPos position, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Valuable Found: " + block.getName().getString() + " at ( " +
                position.getX() + " " + position.getY() + " " + position.getZ() + " )"));
    }

    private boolean isValuableBlock(BlockState blockstate) {
        return blockstate.isIn(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS);
    }
}
