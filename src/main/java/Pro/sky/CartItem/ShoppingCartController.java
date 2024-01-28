package Pro.sky.CartItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/add")
    public void addItem(@RequestParam Long clientId, @RequestParam Long itemId) {
        shoppingCartService.addItem(clientId, itemId);
    }

    @GetMapping("/get")
    public List<Long> getItems(@RequestParam Long clientId) {
        return shoppingCartService.getItems(clientId);
    }
}