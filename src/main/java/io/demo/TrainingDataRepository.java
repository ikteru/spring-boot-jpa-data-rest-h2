package io.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "trainings", collectionResourceRel = "trainings")
public interface TrainingDataRepository extends PagingAndSortingRepository<Training, Long> {

}
