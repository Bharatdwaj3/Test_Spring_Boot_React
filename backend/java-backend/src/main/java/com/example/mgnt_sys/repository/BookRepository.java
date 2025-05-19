package com.example.mgnt_sys.repository;

import com.example.mgnt_sys.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
    
}
