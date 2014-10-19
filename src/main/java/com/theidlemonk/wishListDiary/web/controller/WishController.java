package com.theidlemonk.wishListDiary.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.theidlemonk.wishListDiary.domain.Wish;
import com.theidlemonk.wishListDiary.services.WishService;

@Controller
@RequestMapping(value = "/wish")
public class WishController {

	@Autowired
	private WishService wishService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(@ModelAttribute("wish") Wish wish,
			@ModelAttribute("message") String message) {
		return new ModelAndView("wish/add", "wish", new Wish());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPost(@ModelAttribute("wish") Wish wish,
			final RedirectAttributes redirectAttrs) {
		if (wishContainsAppleProducts(wish.getName())) {
			redirectAttrs.addFlashAttribute("message", "Apple stuff really!!!");
		}
		wishService.addWish(wish);
		redirectAttrs.addFlashAttribute("newWishItemMessage", wish.getName()
				+ " has been added to your wish list.");
		return "redirect:/wish/view";
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView view() {
		List<Wish> wishes = new ArrayList<Wish>(wishService.getWishes());
		return new ModelAndView("wish/view", "wishes", wishes);
	}

	private boolean wishContainsAppleProducts(String wishName) {
		String[] appleProductMatches = new String[] { "apple", "iphone",
				"ipad", "mac", "ipod" };
		for (String item : appleProductMatches) {
			if (wishName.toLowerCase().contains(item)) {
				return true;
			}
		}
		return false;
	}

}
