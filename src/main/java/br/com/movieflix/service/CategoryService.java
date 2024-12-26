package br.com.movieflix.service;

import br.com.movieflix.entity.Category;
import br.com.movieflix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
