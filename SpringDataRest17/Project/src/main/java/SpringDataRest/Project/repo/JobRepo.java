package SpringDataRest.Project.repo;

import SpringDataRest.Project.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost, Integer> {

}
