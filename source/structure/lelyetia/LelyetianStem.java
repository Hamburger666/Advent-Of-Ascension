package net.tslat.aoa3.structure.lelyetia;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class LelyetianStem extends AoAStructure {
	public LelyetianStem() {
		super("LelyetianStem");
	}
	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		int y = 0;

		while (y <= 14) {
			if (world.getBlockState(basePos.add(0, y, 0)).getBlock() == Blocks.AIR) {
				addBlock(world, basePos, 0, y, 0, BlockRegister.LELYETIAN_STEM.getDefaultState());
				y++;
			}
			else {
				break;
			}

			if (rand.nextInt(6) == 0)
				break;
		}

		addBlock(world, basePos, 0, y, 0, BlockRegister.LELYETIAN_STEM_CAP.getDefaultState());
	}
}
