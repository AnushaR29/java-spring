package cse.poc.spring_poc_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// back end router: accept the request and process
@RequestMapping("/BasicRest2")
@RestController
public class BasicRest2 {

    private List<String> industryVerticals=new ArrayList<>();

    @PostConstruct
    // invoke as soon as controller initiated by executing app
    public void initialize(){
        industryVerticals.add("Banking");
        industryVerticals.add("Health");
        industryVerticals.add("Logistics");
        industryVerticals.add("Travels");
        industryVerticals.add("Insurance");
    }

    @PutMapping("/change/{index}")
    public String modify(@PathVariable("index") int index,@RequestBody String alternate){
        industryVerticals.set(index,alternate);
        return alternate+" has replaced at "+index;
    }

    @PostMapping("/client")
    public String agree(@RequestBody String newIndustry){
        industryVerticals.add(newIndustry);
        return newIndustry+" has considered as new client";
    }

    @DeleteMapping("/remove/{index}")
    public String invalidate(@PathVariable("index") int index){
        String response = industryVerticals.get(index)+" has deleted";
        industryVerticals.remove(index);
        return response;
    }

    @GetMapping("/particular/{index}")
    public String getOneIndustry(@PathVariable("index") int index){
        return industryVerticals.get(index);
    }

    @GetMapping("/industries")
    public List<String> getIndustries(){
        return industryVerticals;
    }
}
