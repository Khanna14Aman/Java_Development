package JPAProject.JobPost.Service;

import JPAProject.JobPost.Repository.JobRepo;
import JPAProject.JobPost.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    List<JobPost> jobs =
            new ArrayList<>(List.of(
                    new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL","API")),
                    new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow","API")),
                    new JobPost(3, "Frontend Developer", "Create API amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS","API")),
                    new JobPost(4, "Network Engineer", "Design and API maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                    new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

            ));
    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.save(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.findAll();


    }


    public JobPost getJob(int jobId) {
        return repo.findById(jobId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void loadData() {
        repo.saveAll(jobs);
    }

    public List<JobPost> getJobByKeyword(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
