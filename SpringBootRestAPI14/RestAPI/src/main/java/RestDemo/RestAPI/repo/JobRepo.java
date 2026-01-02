package RestDemo.RestAPI.repo;

import RestDemo.RestAPI.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {


    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),


            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),


            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),


            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);

    }


    public JobPost getJob(int jobId) {
        JobPost jobPost = null;
        for(JobPost jobPosts: jobs){
            if(jobPosts.getPostId() == jobId){
                jobPost = jobPosts;
            }
        }
        return jobPost;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1: jobs){
            if(jobPost1.getPostId() == jobPost.getPostId()){
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
                jobPost1.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJob(int postId) {
        int ind = 0;
        for(int i=0;i<jobs.size();i++){
            if(jobs.get(i).getPostId() == postId){
                ind = i;
                break;
            }
        }
        jobs.remove(ind);
    }
}