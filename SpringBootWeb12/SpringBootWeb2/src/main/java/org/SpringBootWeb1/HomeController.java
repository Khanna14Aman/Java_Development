package org.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("/alien")
    public String homeAlienPage(){
        System.out.println("Home method called");
        return "Alien";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result=num1+num2;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }


//    @RequestMapping("add")
//    public String add( int num1, @RequestParam("num2") int numm, HttpSession session) {
//
//
//        int result=num1+numm;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }


//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
//
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//
//        return "result";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        int result = num1 + num2;
        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

    @ModelAttribute("course")
    public String course(){
        return "Spring boot";
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
//        Alien alien=new Alien();
//        alien.setAid(aid);
////        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");

//        return mv;
        return "result";
    }

}
