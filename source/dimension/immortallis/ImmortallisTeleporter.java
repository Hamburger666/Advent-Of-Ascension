package net.tslat.aoa3.dimension.immortallis;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.tslat.aoa3.block.functional.portal.PortalBlock;
import net.tslat.aoa3.capabilities.providers.AdventPlayerProvider;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.dimension.AoATeleporter;
import net.tslat.aoa3.library.misc.PortalCoordinatesContainer;
import net.tslat.aoa3.utils.ConfigurationUtil;
import net.tslat.aoa3.utils.player.PlayerDataManager;
import net.tslat.aoa3.utils.player.PlayerUtil;

import java.util.HashMap;

public class ImmortallisTeleporter extends AoATeleporter {
	private static final HashMap<Long, BlockPos> cachedPortalMap = new HashMap<Long, BlockPos>();

	public ImmortallisTeleporter(WorldServer world) {
		super(world);
	}

	@Override
	public HashMap<Long, BlockPos> getCachedPortalMap() {
		return cachedPortalMap;
	}

	@Override
	public BlockPos findExistingPortal(World world, Entity entity) {
		if (world.provider.getDimension() == ConfigurationUtil.MainConfig.dimensionIds.immortallis) {
			if (entity.hasCapability(AdventPlayerProvider.ADVENT_PLAYER, null)) {
				PlayerDataManager plData = PlayerUtil.getAdventPlayer((EntityPlayer)entity);
				PortalCoordinatesContainer portalLoc = new PortalCoordinatesContainer(world.provider.getDimension(), entity.posX, entity.posY, entity.posZ);

				plData.setPortalReturnLocation(entity.world.provider.getDimension(), portalLoc);
			}

			return new BlockPos(-5, 20, 3);
		}

		return super.findExistingPortal(world, entity);
	}

	@Override
	public BlockPos makePortal(World world, Entity entity, BlockPos pos) {
		return pos;
	}

	@Override
	public PortalBlock getPortalBlock() {
		return BlockRegister.IMMORTALLIS_PORTAL;
	}

	@Override
	public Block getBorderBlock() {
		return BlockRegister.ARCHAIC_TILES;
	}
}
