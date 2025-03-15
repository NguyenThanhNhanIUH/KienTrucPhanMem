package compositePattern;

import java.util.List;

class Table implements ProductComponent {
	private List<ProductComponent> products;

	public Table(List<ProductComponent> products) {
		this.products = products;
	}

	@Override
	public void showProperty() {
		for (ProductComponent product : products) {
			product.showProperty();
		}
	}

	@Override
	public int totalPrice() {
		int total = 0;
		for (ProductComponent product : products) {
			total += product.totalPrice();
		}
		return total;
	}
}
