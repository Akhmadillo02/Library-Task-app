package uz.ahmadillo02.librarytaskapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.ahmadillo02.librarytaskapp.entity.Book;
import uz.ahmadillo02.librarytaskapp.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public String  addBook(Book book) {
         bookRepository.save(book);
         return "add book";
    }


    public List<Book> findBooksByName(String name) {
        return bookRepository.findByName(name);
    }


    public List<Book> findBooksByAuthorName(String authorName) {
        return bookRepository.findByNameAfter(authorName);
    }


    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
        return "delete book";
    }
}
