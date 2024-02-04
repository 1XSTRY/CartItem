package Pro.sky.CartItem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartItem {

	public static void main(String[] args) {
		SpringApplication.run(CartItem.class, args);
	}
	private Long itemId;

	public CartItem(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return itemId;
	}
}
