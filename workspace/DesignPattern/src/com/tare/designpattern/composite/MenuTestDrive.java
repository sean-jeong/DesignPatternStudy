package com.tare.designpattern.composite;

public class MenuTestDrive {

	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "breakfast menu");
		MenuComponent dinerMenu = new Menu("Object restrunt menu", "diner menu");
		MenuComponent cafeMenu = new Menu("Cafe menu", "lunch menu");
		MenuComponent dessertMenu = new Menu("Dessert menu", "enjoy dessert menu");

		MenuComponent allMenus = new Menu("Whole Menu", "Whole Menu");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		// add MenuItem...
		dinerMenu.add(new MenuItem("Pasta", "Marinara Sauce Spagetti. Give some bread", true, 3.89));

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("Apple Pie", "with on Crusty Vanila Icecream", true, 1.59));

		// add MenuItem...

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
