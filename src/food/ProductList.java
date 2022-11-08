package food;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public ProductList() {
    }

    public void addProduct(Product product) {
        product = parse(product);

        if (products.contains(product)) {
            throw new ProductDoubleException("Продукт уже добавлен в список!");
        }

        products.add(product);
    }

    public void markAsBought(Product product) {
        product = parse(product);
        if (products.contains(product)) {
            product.setIsBought(true);
        } else {
            System.out.println("В данном списке отсутствует " + product);
        }
    }

    public void removeProduct(Product product) {
        product = parse(product);
        if (products.contains(product)) {
            products.remove(product);
        } else {
            System.out.println("В данном списке отсутствует " + product);
        }
    }

    private static Product parse(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Укажите продукт!");
        } else {
            return product;
        }
    }

    private StringBuilder printProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product).append("\n");
        }
        return sb;
    }

    @Override
    public String toString() {
        return "Список продуктов:\n" + printProducts();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
