package lumien.randomthings.Container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerSoundRecorder extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer var1) {
        return true;
    }
}
