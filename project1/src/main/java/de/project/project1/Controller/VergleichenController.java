package de.project.project1.Controller;
import de.project.project1.Vergleichen;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VergleichenController {

    @PostMapping("/Vergleichen")
    public String[] addZahl(@RequestBody int eingabe){
        return Vergleichen.getListe(eingabe);
    }
}
