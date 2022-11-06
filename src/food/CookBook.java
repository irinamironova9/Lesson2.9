package food;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CookBook {
    private final Set<Recipe> recipes = new HashSet<>();

    public CookBook() {
    }

    public void addRecipe(Recipe recipe) {
        if (recipe == null) {
            throw new IllegalArgumentException("Укажите рецепт!");
        }

        if (recipes.contains(recipe)) {
            throw new RecipeDoubleException("Рецепт уже добавлен в список!");
        }

        recipes.add(recipe);
    }

    public void addRecipe(String recipe) {
        if (recipe == null || recipe.isBlank()) {
            throw new IllegalArgumentException("Недопустимое название!");
        }

        for (Recipe r : recipes) {
            if (Objects.equals(r.getDishName(), recipe)) {
                throw new RecipeDoubleException("Рецепт уже добавлен в список!");
            }
        }

        recipes.add(new Recipe(recipe));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Recipe recipe : recipes) {
            sb.append(recipe.getDishName()).append('\n');
        }
        return "Книга рецептов:\n" + sb;
    }
}
