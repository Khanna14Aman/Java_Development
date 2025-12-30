package SpringBootProject.Project.Controller;

import SpringBootProject.Project.Service.JobService;
import SpringBootProject.Project.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController{
    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String homePage(){
        System.out.println("Home method called");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addJobs";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";

    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model m){
        System.out.println("View All Jobs Called");
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts", jobs);

        return "viewAllJobs";
    }
}
