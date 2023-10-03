package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;

/**
 * @author cleberson
 */
public interface AuthorService {
    Iterable<Author> findAll();
}
