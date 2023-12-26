package uz.ahmadillo02.librarytaskapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.ahmadillo02.librarytaskapp.entity.Book;
import uz.ahmadillo02.librarytaskapp.service.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {


    private final BookService bookService;


    @PostMapping("/saveBook")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/getBookByName/{name}")
    public List<Book> findByBookName(@PathVariable String name) {
        return bookService.findBooksByName(name);
    }


   @GetMapping("/getBookAuthorName/{name}")
    public List<Book> findAuthorName(@PathVariable String name) {
        return bookService.findBooksByName(name);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteByIdBook(@PathVariable Long id) {
        return bookService.deleteBookById(id);
    }

}
