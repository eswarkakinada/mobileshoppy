/*package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

public class AdminController {

	@Autowired
	private Category category;

	@Autowired
	private Product product;

	@Autowired
	private Supplier supplier;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private SupplierDAO supplierDAO;

	@RequestMapping("/manageCategories")
	public ModelAndView Categories() {
		ModelAndView mv = new ModelAndView("/home");// /home will change to asur home page name
		mv.addObject("Category", category);
		mv.addObject("isAdminClickedCategories", "true");
		mv.addObject("CategoryList", categoryDAO.list());
		return mv;
	}

	@RequestMapping("/manageProducts")
	public ModelAndView Products() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("Product", product);
		mv.addObject("isAdminClickedProducts", "true");
		mv.addObject("ProductList", productDAO.list());
		return mv;
	}

	@RequestMapping("/manageSuppliers")
	public ModelAndView Suppliers() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("Supplier", supplier);
		mv.addObject("isAdminClickedSuppliers", "true");
		mv.addObject("SupplierList", supplierDAO.list());
		return mv;
	}

}
*/