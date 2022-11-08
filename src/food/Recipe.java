package food;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String dishName;
    private final HashMap<Product, Integer> ingredients = new HashMap();

    public Recipe(String dishName) {
        if (dishName == null || dishName.isBlank()) {
            throw new IllegalArgumentException("Недопустимое название!");
        } else {
            this.dishName = dishName;
        }
    }

    public String getDishName() {
        return dishName;
    }

    public void addIngredient(Product product, int amount) {
        if (product == null) {
            throw new IllegalArgumentException("Укажите продукт!");
        }

        if (ingredients.containsKey(product)) {
            throw new ProductDoubleException("Продукт уже добавлен в список!");
        }

        ingredients.put(product, Math.max(amount, 1));
    }

    public float calculateCost() {
        float sum = 0f;
        for (Product product : ingredients.keySet()) {
            sum += product.getPrice() * (float) ingredients.get(product);
        }
        return sum;
    }

    private StringBuilder printIngredients() {
        StringBuilder sb = new StringBuilder();
        for (Product product : ingredients.keySet()) {
            sb.append(product.getName()).append(" - ").append(ingredients.get(product))
                    .append(" шт.\n");
        }
        return sb;
    }

    @Override
    public String toString() {
        return String.format("Рецепт '%s':\n" +
                        "Суммарная стоимость ингредиентов - %.2f руб.\n" +
                        "Ингредиенты:\n" +
                        "%s",
                dishName,
                calculateCost(),
                printIngredients());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(dishName, recipe.dishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName);
    }
}
