package com.bdev.librarymarch27.controllers;

import com.bdev.librarymarch27.models.dtos.SaveBookDTO;
import com.bdev.librarymarch27.models.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
// a specific controller to a specific path
@RequestMapping("/library")
public class LibraryController {
    private static List<Book> library = new ArrayList<>();

    // must be in a static structure to be able to be accessed by the static method
    static {
        library.add(new Book("0261102303", "Lord of the Rings"));
        library.add(new Book("0007441428", "Game of Thrones"));
        library.add(new Book("0747581088", "Harry Potter and the Half-Blood Prince"));
        library.add(new Book("1401248195", "Watchmen"));
        library.add(new Book("030788743X", "Ready player one"));
        library.add(new Book("843760494X", "Cien Años de Soledad"));
        library.add(new Book("0553804367", "A Briefer History of Time"));
        library.add(new Book("0505050505", "Vivan las monas chinas"));
    }

    // create controller
    //@RequestMapping(value = "/all", method = RequestMethod.GET)
    @GetMapping("/all")
    public String getBookList(Model model) {
        model.addAttribute("books", library);
        return "book-list";
    }

    @GetMapping("/")
    public String getMain(Model model){
        String time = Calendar.getInstance().getTime().toString();
        model.addAttribute("time", time);
        return "main";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute SaveBookDTO bookInfo){
        System.out.println(bookInfo);

        Book newBook = new Book(bookInfo.getIsbn(), bookInfo.getTitle());
        library.add(newBook);

        return "redirect:/library/";
    }
}
