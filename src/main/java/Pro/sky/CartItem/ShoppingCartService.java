package Pro.sky.CartItem;

import java.util.List;

public interface ShoppingCartService {
    void addItem(Long clientId, Long itemId);

    List<Long> getItems(Long clientId);
}
