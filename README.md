# recipe
A recipe sharing and discovery platform. Users can create accounts, post their own recipes,
browse and search for recipes from other users, and save recipes to their own personal collection. 
The platform could also include features such as recipe recommendations based on ingredients,
the ability to scale recipe servings, and a shopping list generator for ingredients.

Entities:

User: represents a user of the platform.
Recipe: represents a recipe on the platform.
Ingredient: represents an ingredient used in a recipe.
Category: represents a category that a recipe can be classified under (e.g. "desserts", "vegetarian").
Comment: represents a comment made by a user on a recipe.
Rating: represents a rating given by a user to a recipe.

Relationships:

User creates Recipe: a user can create and upload a recipe to the platform.
Recipe has Ingredient: a recipe is made up of one or more ingredients.
Recipe belongs to Category: a recipe can be classified under one or more categories.
User writes Comment: a user can write a comment on a recipe.
User rates Recipe: a user can rate a recipe on a scale (e.g. 1 to 5 stars).
Recipe has Comment: a recipe can have one or more comments.
Recipe has Rating: a recipe can have one or more ratings.






Documentation 
Spring Boot DataSource Bean : solve it by make tables name start by small letter and check the relationship betwen tables
