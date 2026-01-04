package JPAProject.JobPost.Controller;

import JPAProject.JobPost.Service.JobService;
import JPAProject.JobPost.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(originPatterns = "http://localhost:3000/")
public class HomeController{
    @Autowired
    private JobService service;

    @PostMapping("jobPost")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());

    }

//    @PostMapping(path = "jobPost", consumes = {"application/xml"}) // This method will only work if data is sent in the form of xml else postman will get error.
//    @ResponseBody
//    public JobPost addJobXml(@RequestBody JobPost jobPost) {
//        service.addJob(jobPost);
//        return service.getJob(jobPost.getPostId());
//
//    }

    @ResponseBody
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        System.out.println("JobPost");
        return service.getAllJobs();
    }

    @ResponseBody
    @GetMapping("/jobPost/{postID}")
    public JobPost getJobPost(@PathVariable("postID") int jobId){
        System.out.println(service.getJob(jobId));
        return service.getJob(jobId);
    }

    @ResponseBody
    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @ResponseBody
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @ResponseBody
    @GetMapping("load")
    public String loadingData(){
        service.loadData();
        return "Data Loaded";
    }

    @ResponseBody
    @GetMapping("jobPost/keyword/{keyword}")
    public List<JobPost> getJobByKeyword(@PathVariable("keyword") String keyword){
        return service.getJobByKeyword(keyword);
    }

//    @ResponseBody
//    @GetMapping(path = "jobPosts", produces = {"application/json"})  // This will only return json format data, if postman is asking for any other type of data then that will get 406 error.
//    public List<JobPost> getAllJobsjson() {
//        System.out.println("JobPostjson");
//        return service.getAllJobs();
//    }
}
