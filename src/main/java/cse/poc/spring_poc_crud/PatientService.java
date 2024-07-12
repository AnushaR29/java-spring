package cse.poc.spring_poc_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRemote remote;

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Patient> implementFindAll(){
        return remote.findAll();
    }

    public Patient implementSave(Patient patient){
        return remote.save(patient);
    }
}

