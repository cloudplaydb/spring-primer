package com.spring.mvc.controller;

import com.spring.mvc.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("books")
public class SimpleBookController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        Book book = null;
        if (id == 42) {
            book = new Book();
            book.setId(id);
            book.setAuthor("Shakespeare");
            book.setTitle("Othello");
        }
        return book;
    }
}
