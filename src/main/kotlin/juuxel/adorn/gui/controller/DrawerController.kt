package juuxel.adorn.gui.controller

import io.github.cottonmc.cotton.gui.client.BackgroundPainter
import juuxel.adorn.lib.ModGuis
import juuxel.adorn.util.color
import net.minecraft.container.BlockContext
import net.minecraft.entity.player.PlayerInventory

class DrawerController(syncId: Int, playerInv: PlayerInventory, context: BlockContext) : BaseInvController(
    ModGuis.DRAWER,
    syncId,
    playerInv,
    context,
    5, 3
) {
    override fun addPainters() {
        rootPanel.setBackgroundPainter(BackgroundPainter.createColorful(color(0xD9CEB2)))
    }
}
