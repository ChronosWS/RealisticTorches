package com.chaosthedude.realistictorches.blocks;

import com.chaosthedude.realistictorches.RealisticTorches;
import com.chaosthedude.realistictorches.blocks.te.TEMovingLightSource;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMovingLightSource extends BlockAir implements ITileEntityProvider {

	public static final String NAME = "MovingLightSource";

	public BlockMovingLightSource() {
		super();
		setUnlocalizedName(RealisticTorches.MODID + "_" + NAME);
		setTickRandomly(false);
		setLightLevel(0.9F);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TEMovingLightSource();
	}
}