package cse.poc.spring_poc_crud;

import org.springframework.web.bind.annotation.*;

//back end router:accept the request and process
@RequestMapping("/BasicRest1")
@RestController
public class BasicRest1
{
  private String[] industryVerticals={
          "Banking","Logistics","Health","Transport"
  };
@DeleteMapping("/remove/{index}")
    public String invalidate(@PathVariable("index") int index){
        String response = industryVerticals[index]+" has deleted";
        industryVerticals[index]=null;
        return response;
    }
@GetMapping("/particular/{index}")
  public String getoneIndustry(@PathVariable("index") int index){
      return industryVerticals[index];
  }
@GetMapping("/industries")
  public String[] getIndustry() {
        return industryVerticals;
  }
}
