package Pro.sky.CartItem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Scope("session")
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final Map<Long, List<Long>> shoppingCarts = new HashMap<>();

    @Override
    public void addItem(Long clientId, Long itemId) {
        shoppingCarts.computeIfAbsent(clientId, k -> new ArrayList<>()).add(itemId);
    }

    @Override
    public List<Long> getItems(Long clientId) {
        return shoppingCarts.getOrDefault(clientId, new ArrayList<>());
    }
}