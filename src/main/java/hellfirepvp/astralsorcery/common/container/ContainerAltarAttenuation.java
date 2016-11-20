package hellfirepvp.astralsorcery.common.container;

import hellfirepvp.astralsorcery.common.tile.TileAltar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: ContainerAltarAttenuation
 * Created by HellFirePvP
 * Date: 16.10.2016 / 17:18
 */
public class ContainerAltarAttenuation extends ContainerAltarBase {

    public ContainerAltarAttenuation(InventoryPlayer playerInv, TileAltar tileAltar) {
        super(playerInv, tileAltar);
    }

    @Override
    void bindAltarInventory() {
        for (int xx = 0; xx < 3; xx++) {
            addSlotToContainer(new Slot(tileAltar,     xx, 102 + xx * 18, 29));
            addSlotToContainer(new Slot(tileAltar, 3 + xx, 102 + xx * 18, 47));
            addSlotToContainer(new Slot(tileAltar, 6 + xx, 102 + xx * 18, 65));
        }
        addSlotToContainer(new Slot(tileAltar,  9, 84,  11));
        addSlotToContainer(new Slot(tileAltar, 10, 156, 11));
        addSlotToContainer(new Slot(tileAltar, 11, 84,  83));
        addSlotToContainer(new Slot(tileAltar, 12, 156, 83));
    }

    @Override
    void bindPlayerInventory() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(this.playerInv, j + i * 9 + 9, 48 + j * 18, 120 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(this.playerInv, i, 48 + i * 18, 178));
        }
    }

}