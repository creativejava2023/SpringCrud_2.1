package com.javatpoint.SpringCrud_21.Repository;

import com.javatpoint.SpringCrud_21.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {
}
