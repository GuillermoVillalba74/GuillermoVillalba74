/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tour.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tour.entity.Attractions;
import tour.entity.Files;
import tour.entity.Product;
import tour.entity.Promotions;
import tour.entity.User;

/**
 *
 * @author sistemas
 */
public class App {

	public Product getTheMostCostly(List<Product> products) {
		Product costly = products.get(0);
		for (Product p : products)
			if (p.compare(p, costly) > 0)
				costly = p;
		return costly;
	}

	public Product calcProductToSuggest(List<Product> products, User user) {
		List<Product> offers = List.copyOf(products);
		offers.removeIf(offert -> !offert.hasQuota() && !offert.avaiableFor(user));
		return getTheMostCostly(offers);
	}

	public static void main(String[] args) {
		List<Attractions> attractions = loadAttractions();
		List<Promotions> promos = loadPromotions();
		List<User> users = loadUsers();

	}

}
