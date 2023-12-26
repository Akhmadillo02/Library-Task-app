package uz.ahmadillo02.librarytaskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.ahmadillo02.librarytaskapp.entity.Author;
import uz.ahmadillo02.librarytaskapp.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.name = :name")
    List<Book> findByName(@Param("name") String name);

    @Query("SELECT a FROM Author a WHERE a.name = :name")
    List<Book> findByNameAfter(@Param("name") String name);

}
