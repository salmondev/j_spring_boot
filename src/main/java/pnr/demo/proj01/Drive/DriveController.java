package pnr.demo.proj01.Drive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriveController{
    @RequestMapping("/drive")
    public String index(){
        return "Drive page";
    }
}