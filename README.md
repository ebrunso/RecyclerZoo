# RecyclerZoo
Zoo homepage with access to ListView and RecyclerView


Create an app which is a directory for all the animals in a zoo.
1. Activity one: Make a homepage for zoo information
2. Activity two: ListView with list of all the categories.
3. Activity three: RecyclerView with a list of all the animals in that category
4. Activity four: Detail of that animal selected from the list. It should have the detail of that animal and play a sound of that animal.


Compile all files, the first activity that will greet you is the Zoo Homepage, click "Enter the Zoo" to go to the animal classification page, then select which animal classification you would like to see from the list: Amphibian, Fish, Reptile, Mammal, Bird.

![Zoo Homepage](https://raw.githubusercontent.com/ebrunso/RecyclerZoo/master/Zoowelcome.png)

![Animal Classification](https://raw.githubusercontent.com/ebrunso/RecyclerZoo/master/ZooAnimalClassifification.png)

1. What is the difference in recyclerView and listView?
	**RecyclerView - Utilizes Lazy Loading, newer than Listview, requires a layout manager and an adapter. RecyclerView scrolls through items and only populates as the user scrolls the screen down. Loads +2 list members on the top and bottom of the screen.**
	
	**listView - original listView for android. Utilizes eager loading to load all list items at the same time, which can cause the app to time out. itemClickListener is implemented by default.**

2. Define lazy loading.
	**Lazy Loading will initialize values when value is first called upon, but not at program initialization.**


3. What is an item decorator in RecyclerViews?
	**An Item Decorator is used in RecyclerView to draw dividers between objects on the list. It is capable of drawing on all 4 sides of an item.**

4. What is the View Holder Pattern?
	**View Holder Pattern is a design pattern used in RecyclerView to help speed up rendering of the Listview. It does not need to perform a lookup for new objects added to the RecyclerView.**

5. How do you implement a item touch helper for the RecyclerView?
	**abstract class TouchHelper : ItemTouchHelper.Callback**
