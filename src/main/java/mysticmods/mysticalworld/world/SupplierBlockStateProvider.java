package mysticmods.mysticalworld.world;

import com.mojang.serialization.Codec;
import mysticmods.mysticalworld.init.ModFeatures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;
import noobanidus.libs.noobutil.types.LazyStateSupplier;
import noobanidus.libs.noobutil.world.gen.provider.AbstractSupplierBlockStateProvider;

import javax.annotation.Nullable;
import java.util.List;

public class SupplierBlockStateProvider extends AbstractSupplierBlockStateProvider {
  public static final Codec<SupplierBlockStateProvider> CODEC = codecBuilder(SupplierBlockStateProvider::new);

  public SupplierBlockStateProvider(String namespace, String path) {
    super(namespace, path);
  }

  public SupplierBlockStateProvider(String namespace, String path, @Nullable List<LazyStateSupplier.PropertyPair> pairs) {
    super(namespace, path, pairs);
  }

  public SupplierBlockStateProvider(ResourceLocation key) {
    super(key);
  }

  public SupplierBlockStateProvider(ResourceLocation key, @Nullable List<LazyStateSupplier.PropertyPair> pairs) {
    super(key, pairs);
  }

  @Override
  protected BlockStateProviderType<?> getProviderType() {
    return ModFeatures.SUPPLIER_STATE_PROVIDER.get();
  }
}
