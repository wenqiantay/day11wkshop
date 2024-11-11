package vttp.ssf.day11workshop.Controller;

 import java.io.File;
 import java.util.Random;

 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 @RequestMapping(path = {"/","/index.html"})
 public class ImageController {

    @GetMapping()
    public String imageNames(Model model) {
        File files = new File("src/main/resources/static/images");
        String[] imageNames = files.list();
        Random rand = new Random();
        int index = rand.nextInt(imageNames.length);
        
        model.addAttribute("imageNames", "/images/"+imageNames[index]);
        return "index";
        
     }

    
 }
