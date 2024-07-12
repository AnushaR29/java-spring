package cse.poc.spring_poc_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping ("/Management")
@RestController
public class HackathonManagement {
    private List<String> Participants = new ArrayList<>();

    @PostConstruct
    public void enrollment() {
        Participants.add("Aarthi");
        Participants.add("Anisha");
        Participants.add("Anusha");
        Participants.add("Brindha");
    }

    @PutMapping("/change/{index}")
    public String modify(@PathVariable("index") int index, @RequestBody String alternate) {
        Participants.set(index, alternate);
        return alternate + " has replaced at " + index;
    }

    @PostMapping("/student")
    public String agree(@RequestBody String newParticipants) {
        Participants.add(newParticipants);
        return newParticipants + " has considered as new student";
    }
    @GetMapping("/particular/{index}")
    public String getOneStudent(@PathVariable("index") int index){
        return Participants.get(index);
    }

    @GetMapping("/students")
    public List<String> getStudents() {
        return Participants;
    }

    @DeleteMapping("remove/{Participant}")
    public String invalidate (@PathVariable ("Participant") String participants){
        Participants.remove(Participants);
        return participants+" has been removed from the event";
    }
}

