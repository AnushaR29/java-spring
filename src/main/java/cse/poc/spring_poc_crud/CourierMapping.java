package cse.poc.spring_poc_crud;

import jakarta.annotation.PostConstruct;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Order")
public class CourierMapping {

    @Autowired
    private CourierService service;

    @PutMapping("/")
    public Courier progress(@RequestBody Courier courier){
        return service.implementSave(courier);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }

    @GetMapping("/")
    public List<Courier> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public Courier ab(@RequestBody Courier courier){
        return service.implementSave(courier);
    }
}

//    private List<Courier> Order = new ArrayList<>();
//
//    @PostConstruct
//    public void Service() {
//        Order.add(new Courier(1, "Barani", "Phone", "Salem", 8667059279l, 15000, "Tansit", "Flipkart"));
//        Order.add(new Courier(2, "Anusha", "Laptop", "Salem", 6374011886l, 25000, "Transit", "Amazon"));
//        Order.add(new Courier(3, "Bavana", "Shoes", "Salem", 8765432456l, 500, "Delivered", "Meesho"));
//    }
//
//    @GetMapping("/")
//    public List<Courier> viewAll() {
//        return Order;
//    }
//
//    @PostMapping("/add")
//    public Courier addCourier(@RequestBody Courier adds) {
//        Order.add(adds);
//        return adds;
//    }
//
//    @PutMapping("/status/{id}")
//    public String StatusUpdate(@PathVariable("id") int id, @RequestBody String newStatus) {
//        for (Courier courier : Order) {
//            if (courier.getParcelId() == id) {
//                courier.setItemStatus(newStatus);
//                return "The Status has been updated";
//            }
//        }
//        return id + "not found";
//    }
//}
//
//
//    @GetMapping("/{ExecutiveName}")
//    public List<Courier> viewItemsByExecutive(@PathVariable String ExecutiveName) {
//        return Order.stream().filter((obj) -> {
//            return obj.getExecutiveName() = ExecutiveName;
//        }).collect(Collectors.toList());
//    }
//
//    @GetMapping("/{ReceiverAddress}")
//    public List<Courier> viewItemsByAddress(@PathVariable String receiverAddress) {
//        return Order.stream().filter((obj)-> {
//            return obj.getreceiverAddress() = receiverAddress;
//        }).collect(Collectors.toList());
//    }
//
//    @GetMapping("/{ReceiverName}")
//    public List<Courier> viewItemsByReceiver(@PathVariable String receiverName) {
//        return Order.stream().filter((obj) -> {
//            return obj.getreceiverName() = receiverName;
//        }).collect(Collectors.toList());
//
//    }
//}
