package operation;

import java.util.List;

import model.ProductPojo;

public interface Operation {
	void productInsert(ProductPojo pojo);
	void productUpdate(ProductPojo pojo);
	void productDelete(ProductPojo pojo);
	List<ProductPojo> showProduct();
}
