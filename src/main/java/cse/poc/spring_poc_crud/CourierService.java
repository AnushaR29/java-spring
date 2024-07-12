package cse.poc.spring_poc_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {
    @Autowired
    CourierRemote remote;

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Courier> implementFindAll(){
        return remote.findAll();
    }

    public Courier implementSave(Courier courier){
        return remote.save(courier);
    }
}
