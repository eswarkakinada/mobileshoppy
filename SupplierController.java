/*package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierController {

	private SupplierDAO supplierDAO;
	@Autowired
	private Supplier supplier;

	@Autowired
	public void setSupplierDAO(SupplierDAO ps) {

		this.supplierDAO = ps;
	}

	@RequestMapping(value = "/suppler", method = RequestMethod.GET)
	public String listSuppliers(Model model) {

		model.addAttribute("supplier", new Supplier());
		model.addAttribute("supplierList", this.supplierDAO.list());

		return "supplier";
	}

	// For add and update supplier both

	@RequestMapping(value = "/supplier/add", method = RequestMethod.POST)

	public String addSupplier(@ModelAttribute("supplier") Supplier supplier) {

		supplierDAO.save(supplier);
		// return "supplier";//see once its correct or not
		return "redirect:/suppplier";
	}

	@RequestMapping("supplier/remove/{id}")
	public String removeSupplier(@PathVariable("id") String id) throws Exception {

		supplier = supplierDAO.get(id);

		ModelAndView mv = new ModelAndView("supplier");

		if (supplier == null) {
			mv.addObject("error messaege", "could not delete the supplier");
		} else {
			supplierDAO.delete(supplier);
		}
		
		 * try { supplierDAO.delete( id); model.addAttribute("Message",
		 * "Successefully Added"); } catch (Exception e) {
		 * model.addAttribute("message", e.getMessage()); e.printStackTrace(); }
		 
		return "redirect:/suppliers";
	}

	@RequestMapping("supplier/edit/{id}")
	public String editSupplier(@PathVariable("id") String id, ModelMap model) {

		System.out.println("edit supplier");
		model.addAttribute("supplier", this.supplierDAO.get(id));
		model.addAttribute("listSuppliers", this.supplierDAO.list());

		return "supplier";

	}

}
*/