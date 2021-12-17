package juuxel.adorn.block

import juuxel.adorn.block.entity.AdornBlockEntityType
import juuxel.adorn.block.entity.DrawerBlockEntity
import juuxel.adorn.block.entity.KitchenCupboardBlockEntity
import juuxel.adorn.block.entity.ShelfBlockEntity
import juuxel.adorn.block.entity.TradingStationBlockEntity
import juuxel.adorn.platform.PlatformBridges
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.math.BlockPos

object AdornBlockEntities {
    @JvmField
    val BLOCK_ENTITIES = PlatformBridges.registrarFactory.blockEntity()

    /* ktlint-disable max-line-length */
    val SHELF: BlockEntityType<ShelfBlockEntity> by register("shelf", ::ShelfBlockEntity, ShelfBlock::class.java)
    val DRAWER: BlockEntityType<DrawerBlockEntity> by register("drawer", ::DrawerBlockEntity, DrawerBlock::class.java)
    val KITCHEN_CUPBOARD: BlockEntityType<KitchenCupboardBlockEntity> by register("kitchen_cupboard", ::KitchenCupboardBlockEntity, KitchenCupboardBlock::class.java)
    val TRADING_STATION: BlockEntityType<TradingStationBlockEntity> by register("trading_station", ::TradingStationBlockEntity, TradingStationBlock::class.java)
    /* ktlint-enable max-line-length */

    private fun <E : BlockEntity> register(name: String, factory: (BlockPos, BlockState) -> E, blockClass: Class<out Block>) =
        BLOCK_ENTITIES.register(name) { AdornBlockEntityType(factory, blockClass::isInstance) }

    fun init() {}
}
