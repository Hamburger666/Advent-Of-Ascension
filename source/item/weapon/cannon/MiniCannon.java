package net.tslat.aoa3.item.weapon.cannon;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.EnchantmentsRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.projectiles.cannon.EntityMiniGreenBall;
import net.tslat.aoa3.entity.projectiles.gun.BaseBullet;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.utils.ItemUtil;

import javax.annotation.Nullable;

public class MiniCannon extends BaseCannon {
	public MiniCannon(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(dmg, durability, firingDelayTicks, recoil);
		setTranslationKey("MiniCannon");
		setRegistryName("aoa3:mini_cannon");
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return SoundsRegister.LOWER_CANNON_FIRE;
	}

	@Override
	public BaseBullet findAndConsumeAmmo(EntityPlayer player, ItemStack gunStack, EnumHand hand) {
		if (ItemUtil.findInventoryItem(player, new ItemStack(ItemRegister.CANNONBALL), true, 1 + EnchantmentHelper.getEnchantmentLevel(EnchantmentsRegister.GREED, gunStack)))
			return new EntityMiniGreenBall(player, (BaseGun)gunStack.getItem(), hand, 120, 0);

		return null;
	}
}
